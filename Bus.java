import java.util.Arrays;

public class Bus {
    public int bus(int[] depth, int[][] plans) {
        int niceIndex = -1;

        for (int i = 0; i < plans.length; i++) {
            for (int j = 0; j < depth.length; j++) {
                int h = j;
                Arrays.stream(plans[i]).filter(s -> s > depth[h]).toArray();
            }
        }
        return niceIndex;
    }

    public static void main(String[] args) {
        int[] depth = new int[] { 10, 8, 15 };
        int[][] plans = new int[][] { { 4 }, { 10, 12, 15 }, { 8, 12 } };
        Bus bs = new Bus();
        bs.bus(depth, plans);
    }
}
