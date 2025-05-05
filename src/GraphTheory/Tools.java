package GraphTheory;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Set;
import java.awt.Point;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import javax.swing.JPanel;

/**
 * @author Abdalkader_Manaa
 *
 */
public class Tools {

    public static boolean containsValueGreaterLen(int[] arr) {
        return Arrays.stream(arr).anyMatch(value -> value > arr.length - 1);
    }

    public static boolean isCountElementsOddIsEven(int[] arr) {
        return Arrays.stream(arr).filter(value -> value % 2 != 0).count() % 2 == 0;
    }

    public static boolean isContainsNegativeElement(int[] arr) {
        return Arrays.stream(arr).anyMatch(value -> value < 0);
    }

    public static boolean isAllElementsByZero(int[] arr) {
        return Arrays.stream(arr).allMatch(value -> value == 0);
    }

    public static void decrementArrElementsByOne(int[] arr, int count) {

        for (int i = 0; i <= count; i++) {
            arr[i]--;
        }

    }

    public static int clearForm(JPanel pnl, ArrayList<Node> node, ArrayList<Edge> edge) {

        for (Node n : node) {
            pnl.remove(n);
        }

        for (Edge e : edge) {
            pnl.remove(e);
        }

        node.clear();
        edge.clear();
        pnl.repaint();
        return 0;
    }

    public static void drawTextOnPanel(JPanel pnl, String text) {
        Graphics g = pnl.getGraphics();
        g.setColor(new Color(166, 177, 225));
        g.fillRect(0, 0, 200, pnl.getHeight());
        g.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        g.setColor(Color.WHITE);
        g.drawString(text, 25, 32);
    }

    public static void mergeSort(int[] array) {

        if (array.length < 2) {
            return;
        }

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] >= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static int[][] createNebgersArray(int[] arr) {

        int[][] arrNeighbors = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length && arr[i] > 0; j++) {
                if (arr[j] > 0) {
                    arrNeighbors[i][j] = arrNeighbors[j][i] = 1;
                    arr[i]--;
                    arr[j]--;
                }
            }
        }
        return arrNeighbors;
    }

    public static void addEdges(JPanel pnl, List<Node> nodes, List<Edge> edge, int[][] arrNeighbors) {

        for (int i = 0; i < arrNeighbors.length; i++) {
            for (int j = i + 1; j < arrNeighbors.length; j++) {
                if (arrNeighbors[i][j] == 1) {

                    Edge tempEdge = new Edge(nodes.get(i), nodes.get(j));
                    tempEdge.setLocation(
                            Math.min(nodes.get(i).getX(), nodes.get(j).getX()),
                            Math.min(nodes.get(i).getY(), nodes.get(j).getY()));

                    pnl.add(tempEdge);
                    edge.add(tempEdge);
                    pnl.repaint();
                }
            }
        }
    }

    public static void addNodes(JPanel pnl, ArrayList<Node> node, ArrayList<Edge> edge, int indexNode, Point[] arrPoints) {

        for (Point p : arrPoints) {
            Node tempNode = new Node(p.x, p.y, ++indexNode);
            tempNode.setLocation(p.x, p.y);
            pnl.add(tempNode);
            node.add(tempNode);
            pnl.repaint();
        }
    }

    public static int[][] addColumnByZero(int arr[][]) {

        int temp[][] = new int[arr.length + 1][arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, temp[i], 0, arr.length);
        }
        return temp;
    }

    public static int countCurrentNode(int[][] arrNeighbors) {

        int zeroRowCount = 0;

        for (int i = 0; i < arrNeighbors.length; i++) {
            if (arrNeighbors[i][i] == 0) {
                zeroRowCount++;
            }
        }

        return zeroRowCount;
    }

    public static boolean isInsideBounds(int pointX, int pointY, int minX, int maxX, int minY, int maxY) {
        return pointX > minX && pointX < maxX && pointY > minY && pointY < maxY;
    }

    public static void messageBox(String text) {
        new MessageBox(text).setVisible(true);
    }

    public static Point[] getSquarePoint(int count, int startX, int startY, int spaceX, int spaceY) {
        Point arrPoint[] = new Point[count];

        int x = startX;
        int y = startY;
        for (int i = 0; i < count; i++) {

            arrPoint[i] = new Point(x, y);
            x += spaceX;

            if (i + 1 == (count / 3)) {
                x = startX;
                y = startY + spaceY;
            }
            if (i + 1 == (2 * count) / 3) {
                x = startX;
                y = startY + 2 * spaceY;
            }
        }
        return arrPoint;

    }

    public static Point[] getCirclePoint(int count, int radius, int startX, int startY) {

        Point arrPoint[] = new Point[count];

        for (int i = 0, angle = 0; i < count; i++, angle += 360 / count) {
            double radians = Math.toRadians(angle);
            arrPoint[i] = new Point(
                    startX + (int) (radius * Math.cos(radians)),
                    startY + (int) (radius * Math.sin(radians)));
        }

        return arrPoint;
    }

    public static Point[] getRandomPoint(int count, int minX, int maxX, int minY, int maxY) {

        Point[] arrPoint = new Point[count];
        for (int i = 0; i < count; i++) {
            arrPoint[i] = new Point(
                    new Random().nextInt(maxX - minX + 1) + minX,
                    new Random().nextInt(maxY - minY + 1) + minY);
        }

        return arrPoint;
    }

    public static Point[] getRandomPointBySpace(int count, int minX, int maxX, int minY, int maxY, int spaceX, int spaceY) {

        Set<Point> set = new HashSet<>();
        while (set.size() < count) {

            Point p = new Point(
                    new Random().nextInt(maxX - minX + 1) + minX,
                    new Random().nextInt(maxY - minY + 1) + minY);

            if (set.stream().allMatch(e
                    -> Math.abs(e.x - p.x) >= spaceX
                    && Math.abs(e.y - p.y) >= spaceY)) {
                set.add(p);
            }
        }

        return set.toArray(Point[]::new);
    }

    public static String[] DFS(int[][] arrNebgers, int start) {

        ArrayList<String> steps = new ArrayList<>();
        boolean[] visited = new boolean[arrNebgers.length];

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(start - 1);
        visited[start - 1] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            steps.add("visited node: " + (node + 1));

            for (int i = 0; i < arrNebgers.length; i++) {
                if (arrNebgers[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        return steps.toArray(String[]::new);
    }

    public static String[] BFS(int[][] arrNebgers, int start) {

        ArrayList<String> steps = new ArrayList<>();
        boolean[] visited = new boolean[arrNebgers.length];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start - 1);
        visited[start - 1] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            steps.add("visited node: " + (node + 1));

            for (int i = 0; i < arrNebgers.length; i++) {
                if (arrNebgers[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        return steps.toArray(String[]::new);
    }

    public static int returnSelectedNode(ArrayList<Node> nodes) {
        long selectedCount = nodes.stream().filter(n -> n.isSelected).count();

        if (selectedCount == 0) {
            messageBox("Please select a Starting Node!");
            return -1;
        } else if (selectedCount > 1) {
            messageBox("Please select Only One Node!");
            return -1;
        }

        return nodes.stream().filter(n -> n.isSelected).findFirst().map(n -> n.indexNode).orElse(-1);
    }

    public static int findMissingIndex(ArrayList<Node> nodes) {

        Set<Integer> indices = new HashSet<>();

        for (Node node : nodes) {
            indices.add(node.indexNode);
        }

        for (int i = 1; i <= nodes.size(); i++) {
            if (!indices.contains(i)) {
                return i;
            }
        }

        return nodes.size() + 1;
    }

    public static boolean isCompleteGraph(int[][] arrNeighbors) {

        int count = 0;
        int n = countCurrentNode(arrNeighbors);

        for (int i = 0; i < arrNeighbors.length; i++) {
            for (int j = i + 1; j < arrNeighbors.length; j++) {
                count += arrNeighbors[i][j];
            }
        }

        return n * (n - 1) == 2 * count;
    }

    public static boolean isRegularGraph(int[][] arrNeighbors) {

        int degree = -1;

        for (int i = 0; i < arrNeighbors.length; i++) {
            int currentDegree = 0;

            if (arrNeighbors[i][i] == -1) {
                continue;
            }
            for (int j = 0; j < arrNeighbors.length; j++) {
                currentDegree += arrNeighbors[i][j];
            }

            if (degree == -1) {
                degree = currentDegree;
            }

            if (currentDegree != degree) {
                return false;
            }
        }

        return true;
    }

    public static int isEulerianGraph(int[][] arrNeighbors) {

        int startDFS = 0;
        for (int i = 0; i < arrNeighbors.length; i++) {
            if (arrNeighbors[i][i] == 0) {
                startDFS = i;
                break;
            }
        }

        if (DFS(arrNeighbors, startDFS + 1).length != countCurrentNode(arrNeighbors)) {
            return 0;
        }

        int oddDegree = 0;
        for (int[] arrNeighbor : arrNeighbors) {
            int degree = 0;
            for (int j = 0; j < arrNeighbors.length; j++) {
                if (arrNeighbor[j] != -1) {
                    degree += arrNeighbor[j];
                }
            }
            if (degree % 2 != 0) {
                oddDegree++;
            }
        }

        return switch (oddDegree) {
            case 0 ->
                1;
            case 2 ->
                2;
            default ->
                0;
        };
    }

    public static int[] PruferSequence(int[][] graph) {
        int n = countCurrentNode(graph);
        int edgeCount = 0;

        int[] degree = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                degree[i] += graph[i][j];
                if (graph[i][j] == 1) {
                    edgeCount++;
                }
            }
        }

        if (edgeCount / 2 != n - 1) {
            Tools.messageBox("Graph has a Cycle or is Disconnected!");
            return new int[0];
        }

        int[] pruferSequence = new int[n - 2];

        for (int i = 0; i < n - 2; i++) {

            int leaf = -1;
            for (int j = 0; j < n; j++) {
                if (degree[j] == 1) {
                    leaf = j;
                    break;
                }
            }

            for (int j = 0; j < n; j++) {
                if (graph[leaf][j] == 1 && degree[j] > 0) {
                    pruferSequence[i] = j + 1;
                    degree[leaf]--;
                    degree[j]--;
                    break;
                }
            }
        }

        return pruferSequence;
    }

    public static int[] convertStringToArray(String str) {

        str = str.replaceAll("\\[", "").replaceAll("\\]", "");

        String[] stringNumbers = str.split(",");

        int[] numbers = new int[stringNumbers.length];

        for (int i = 0; i < stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i].trim());
        }

        return numbers;
    }
}
