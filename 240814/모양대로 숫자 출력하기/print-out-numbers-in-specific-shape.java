import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 역삼각형
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=0;
   
        for (int i = n; i >0; i--) {
            for (int j = n; j >0; j--) {
                if(i<j){
                    System.out.print("  ");
                }
                else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();            
                                                                    
        }
    }
}