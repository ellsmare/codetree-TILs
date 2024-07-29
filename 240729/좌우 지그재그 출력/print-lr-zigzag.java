import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =0; 
        int cnt_odd=0;
        

        for (int i = 0; i < n; i++) {
            if(i%2==0){
                //짝수 
                for (int j = 0; j < n; j++) {                 
                    cnt++;                  
                    System.out.print(cnt);
                    System.out.print(" ");  
                    cnt_odd=cnt;   
                }  
                System.out.println();  

            }
            else{
                 //홀수 
                 

                for (int j = n; j >0; j--) {                 
                    cnt++;                  
                    System.out.print(j+cnt_odd);
                    System.out.print(" ");     
                } 
                System.out.println();            
            }   
                   
        }
    }
}