import java.util.*;

public class Solution {
    static final long MOD = 1_000_000_007;

    static class FenwickMin {
        int n;
        int[] tree;
        final int INF = Integer.MAX_VALUE;

        FenwickMin(int n) {
            this.n = n;
            tree = new int[n + 1];
            Arrays.fill(tree, INF);
        }

        void update(int i, int v) {
            while (i <= n) {
                tree[i] = Math.min(tree[i], v);
                i += i & -i;
            }
        }

        int queryMin(int i) {
            int res = Integer.MAX_VALUE;
            while (i > 0) {
                res = Math.min(res, tree[i]);
                i -= i & -i;
            }
            return res;
        }
    }

    public int countPermutations(int[] complexity) {
        int n = complexity.length;

        int[] sorted = complexity.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> comp = new HashMap<>();
        int id = 1;
        for (int v : sorted) {
            if (!comp.containsKey(v)) comp.put(v, id++);
        }

        FenwickMin fenw = new FenwickMin(id);

        long ans = 1;

        for (int i = 0; i < n; i++) {
            int c = comp.get(complexity[i]);

            if (i > 0) {
                int minParent = fenw.queryMin(c - 1);
                if (minParent == Integer.MAX_VALUE) return 0;
                ans = (ans * (i - minParent)) % MOD;
            }

            fenw.update(c, i);
        }

        return (int) ans;
    }
}
