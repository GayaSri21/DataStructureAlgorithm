package gaya.base;

public class wealth {
    public static void main(String[] args) {
        int[][] accs = {{3, 4, 5},
                {6, 7, 8},
                {3, 1, 2}};
        System.out.println(tot(accs));
        System.out.println();

    }

    static int tot(int[][] accs) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int row = 0; row < accs.length; row++) {
            for (int col = 0; col < accs[row].length; col++) {
                sum += accs[row][col];
            }
                if (sum > ans) {
                    ans = sum;

                }
            }
            return ans;

        }


    }
