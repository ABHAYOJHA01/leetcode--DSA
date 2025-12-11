import java.util.*;

class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        Map<Integer, List<Integer>> rows = new HashMap<>();
        Map<Integer, List<Integer>> cols = new HashMap<>();

       
        for (int[] b : buildings) {
            int x = b[0], y = b[1];
            rows.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
            cols.computeIfAbsent(y, k -> new ArrayList<>()).add(x);
        }

        
        for (List<Integer> list : rows.values()) {
            Collections.sort(list);
        }
        for (List<Integer> list : cols.values()) {
            Collections.sort(list);
        }

        int covered = 0;

        
        for (int[] b : buildings) {
            int x = b[0], y = b[1];

            List<Integer> rowList = rows.get(x);
            List<Integer> colList = cols.get(y);

            int posY = Collections.binarySearch(rowList, y);
            int posX = Collections.binarySearch(colList, x);

            boolean hasLeft = posY > 0;
            boolean hasRight = posY < rowList.size() - 1;

            boolean hasAbove = posX > 0;
            boolean hasBelow = posX < colList.size() - 1;

            if (hasLeft && hasRight && hasAbove && hasBelow) {
                covered++;
            }
        }

        return covered;
    }
}
