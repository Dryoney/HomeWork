import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mass1 = new int[n][n];
        int counter = 1;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i; j++) mass1[i][j] = counter++;
            for (int j = i + 1; j < n - i; j++) mass1[j][n - 1 - i] = counter++;
            for (int j = n - 2 - i; j >= i; j--) mass1[n - 1 - i][j] = counter++;
            for (int j = n - 2 - i; j > i; j--) mass1[j][i] = counter++;
        }
        if (n % 2 == 1)
            mass1[n / 2][n / 2] = counter;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mass1[i][j] + " ");
            }
            System.out.println();
        }
    }
}