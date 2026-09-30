public class Pattern24 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 4 * n - 3; j++) {

                if (i == 1 && j % 4 == 1 ||
                    i == 2 && (j % 4 == 2 || j % 4 == 0) ||
                    i == 3 && j % 4 == 3 ||
                    i == 4 && (j % 4 == 2 || j % 4 == 0) ||
                    i == 5 && j % 4 == 1) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
