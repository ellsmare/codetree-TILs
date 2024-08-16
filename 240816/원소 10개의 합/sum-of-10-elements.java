import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 배열이라는 것은 여러 원소를 들고있는 묶음
        // 10개의 원소가 주어졌을 때, 주어진 10개의 원소의 합을 출력하는 프로그램을 작성
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[10];
        int sum=0;
        
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.print(sum);
    }
}