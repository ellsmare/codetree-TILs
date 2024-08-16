import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        1이상 n이하의 소수를 오름차순으로 출력하는 프로그램을 작성
        */

        //1≤n≤100
        
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
                
        for(int i=1;i<=n; i++){//8... 2 3 5 7
            int cnt=0;
            for(int j=1; j<=i;j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt==2){
                //System.out.println("sum "+sum); 
                //System.out.println("i "+i); 
                System.out.print(i+" "); 
            }
        }
        
    }
}