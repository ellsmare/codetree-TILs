import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 총 m번에 걸쳐 n값 제공 
        // 1 ≤ m ≤ 100, 1 ≤ n ≤ 100  
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
                
        for(int i=0;i<m; i++){ //m=3
            int n = sc.nextInt(); 
            int cnt=0;
            //System.out.println(n); //1 26 3 

            while(n!=1){
                if(n%2==0){
                    //짝수 %2
                    n=(n/2);
                    cnt+=1;
                }
                else{
                    //홀수 *3
                    n=(n*3)+1;
                    cnt+=1;
                }
            }
            System.out.println(cnt);  
        }
    }
}