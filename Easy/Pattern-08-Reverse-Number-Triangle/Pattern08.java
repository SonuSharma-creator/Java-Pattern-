public class Pattern08 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {

            int m = n;
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(m-- + " ");
            }
            System.out.println();
        }
    }
}