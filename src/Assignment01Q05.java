public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0; // from vertex to itself, d=0
        }
        
        int n = m.length;
        int[] distance_from_i = new int[n];
        int[] queue = new int[n];

        for (int k = 0; k < n; k++) {
            distance_from_i[k] = -1;
        }
        distance_from_i[i] = 0;

        int head = 0;
        int tail = 0;
        queue[tail] = i;
        tail++;

        
        while (head < tail) {
            int current = queue[head];
            head++;

            for (int neighbor = 0; neighbor < n; neighbor++) {
                if (m[current][neighbor] == 1 && distance_from_i[neighbor] == -1) {
                    distance_from_i[neighbor] = distance_from_i[current] + 1;
                    if (neighbor == j) {
                        return distance_from_i[neighbor];
                    }
                    queue[tail] = neighbor;
                    tail++;
                }
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}