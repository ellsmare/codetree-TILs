import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 역삼각형
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
   
        for (int i = n; i >0; i--) {
                int cnt=0;
            for (int j = n; j >0; j--) {
                
                if(i>j){
                    System.out.print("  ");
                }
                else{
                    System.out.print((i+cnt)+" ");
                    cnt++;
                }
                
            }
            System.out.println();            
                                                                    
        }
    }
}