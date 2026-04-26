package Pattern2;

public class Task5 {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= 4; i++) {   

            for (int j = 1; j <= n; j++) {

                if (i == 1) {
                    System.out.print("* ");
                }
                else if (j == i || j == n - i + 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}