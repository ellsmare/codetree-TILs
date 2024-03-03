import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double sum = a+b+c;

        System.out.printf("%.0f\n",sum);
        System.out.printf("%.0f",sum/3);
    }
}