import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        배열이라는 것은 여러 원소를 들고있는 묶음
        10개의 원소가 주어졌을 때, 입력받은 문자의 순서를 거꾸로 출력
        char[] arr=new char[10];
        Scanner에서는 nextInt() 처럼 nextChar() 함수가 없다. next().charAt(0)
        */

        Scanner sc = new Scanner(System.in);
        char[] arr=new char[10]; //문자

        //arr[9]='B';
        //System.out.print(arr[9]);

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next().charAt(0);
        }
        //System.out.print(arr[9]);

        for (int j = 9; j >=0; j--) { //10으로 시작해서 계속 에러남
            System.out.print(arr[j]);
        }
        
    }
}