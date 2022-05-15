public class Test {
    public static void main(String[] args) {

        // N value to use
        int n = 3;
        generateMagicSquare(n, 1);
    }
    public static void generateMagicSquare(int n, int rotate) {
        int[][] mat = new int[n][n];
        int next = 1;
        int count = n * n;

        int i = ((n) / 2);

        int j = 0;

        mat[i][j] = next++;

        while (next <= count) {
            i++;
            j--;

            if (j < 0 && i >= n) {
                i--;
                j += 2;

                if (mat[i][j] == 0) {
                    mat[i][j] = next++;
                } else {
                    i--;
                    j += 2;
                }
            } else if (j < 0) {

                j = n - 1;
                if (mat[i][j] == 0) {
                    mat[i][j] = next++;
                } else {
                    i--;
                    j += 2;
                }
            } else if (i >= n) {
                i = 0;
                if (mat[i][j] == 0) {
                    mat[i][j] = next++;
                } else {
                    i--;
                    j += 2;
                }
            } else {
                if (mat[i][j] != 0) {
                    i -= 2;
                    j += 3;
                } else {
                    mat[i][j] = next++;
                }
            }

        }

        for (int k = 0; k < 1;) {
            if(rotate == 1) {rotateArray90(mat);break;}
            if(rotate == 2) {rotateArray180(mat);break;}
            if(rotate == 3) {rotateArray270(mat);break;}
            else {rotateArray0(mat);break;}}

    }
    public static void rotateArray0(int[][] mat) {
        for (int[] row : mat) {
            for (int x : row) {System.out.print(x + " ");}
            System.out.println("");
        }
    }

    public static void rotateArray90(int[][] mat) {
        for (int[] row : mat) {
            for (int x : row) {System.out.print(x + " ");}
            System.out.println("");
        }
    }

    public static void rotateArray180(int[][] mat) {
        for (int[] row : mat) {
            for (int x : row) {System.out.print(x + " ");}
            System.out.println("");
        }
    }

    public static void rotateArray270(int[][] mat) {
        for (int[] row : mat) {
            for (int x : row) {System.out.print(x + " ");}
            System.out.println("");
        }
    }

}
