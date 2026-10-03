public class Pattern27 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {

                int min = Math.min(
                        Math.min(i, j),
                        Math.min(2 * n - i, 2 * n - j)
                );

                System.out.print(min + " ");
            }

            System.out.println();
        }
    }
}