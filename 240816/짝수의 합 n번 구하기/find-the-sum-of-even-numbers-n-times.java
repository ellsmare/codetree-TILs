import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        n번에 걸쳐 두 정수 a, b가 주어졌을 때, a부터 b까지의 짝수를 모두 합한 결과를 출력하는 프로그램을 작성
        첫 번째 줄에 테스트케이스의 수 n, 1 ≤ n ≤ 10
        두 번째 줄 부터 n개의 줄에 걸쳐 한 줄에 두 정수 a, b가 공백 1 ≤ a ≤ b ≤ 100
        각 줄 a이상 b이하의 짝수들의 합을 출력
        */
        
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
                
        for(int i=0;i<n; i++){ // n=3 | 1 10 | 1 20 | 5 30 .... 30 | 110 | 234
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum=0;
            for(int j=a; j<=b;j++){
                if(j%2==0){ //짝수
                    sum+=j;
                }
            }
            System.out.println(sum); 
        }
        
    }
}