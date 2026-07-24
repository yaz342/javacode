import java.util.*;

class UndergroundSystem {

    Map<Integer, Object[]> in = new HashMap<>();
    Map<String, int[]> data = new HashMap<>();

    public UndergroundSystem() {}

    public void checkIn(int id, String s, int t) {
        in.put(id, new Object[]{s, t});
    }

    public void checkOut(int id, String s, int t) {
        Object[] x = in.remove(id);
        String key = x[0] + "-" + s;
        int[] a = data.getOrDefault(key, new int[2]);
        a[0] += t - (int)x[1];
        a[1]++;
        data.put(key, a);
    }

    public double getAverageTime(String start, String end) {
        int[] a = data.get(start + "-" + end);
        return (double)a[0] / a[1];
    }
}