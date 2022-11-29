import java.util.Scanner;

public class MainClass {
    public static int XorFunction(int a, int b) {
        if (a == b) {
            return 1;

        } else {
            return 0;
        }

    }


    public static void main(String[] args) {

        int M, N;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number First : ");
        M = sc.nextInt();
        System.out.println("Enter Number Second : ");
        N = sc.nextInt();
        // System.out.println(a+" " + b);

        int j = 0;
        for (int i = 0; i <= M; i++) {
            j = M - i;
            if (XorFunction(i, j) == N) {
                System.out.println("i : " + i + "  j : " + j);
            }


        }


    }


}
