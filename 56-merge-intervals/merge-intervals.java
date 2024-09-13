class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(row -> row[0]));
        List<int[]> list = new ArrayList<>();

        int[] prev = intervals[0];
        for (int i = 0; i < intervals.length; i++) {
            if (prev[1] >= intervals[i][0]) {
                prev[1] = Math.max(prev[1], intervals[i][1]);
            } else {
                list.add(prev);
                prev = intervals[i];
            }
        }
        list.add(prev);

        return list.toArray(new int[list.size()][]);
    }
}