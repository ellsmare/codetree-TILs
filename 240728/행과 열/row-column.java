import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 1; j < b+1; j++) {
                System.out.print(j * (i+1));
                System.out.print(" ");

            }
            System.out.println();
        }

    }
}