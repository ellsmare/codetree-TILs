import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        정수의 약수란, 그 수를 나누었을 때 나머지가 없이 떨어지는 양의 정수
        6의 약수는 1, 2, 3, 6으로 총 네 개
        약수가 정확하게 세 개인 수의 개수를 구하는 프로그램을 작성 
        */

        //1≤start≤end≤1000
        
        Scanner sc = new Scanner(System.in); 
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum=0;
                
        for(int i=start;i<=end; i++){ //1 50...4  
            int cnt=0;
            for(int j=1; j<=i;j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt==3){
                //System.out.println("sum "+sum); 
                //System.out.println("i "+i); 
                sum++;
            }
        }
        System.out.println(sum); 
    }
}