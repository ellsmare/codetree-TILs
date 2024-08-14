import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 삼각형 1<=n<=100 i*j
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
   
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j <i+1; j++) {
                System.out.print((i*j)+" ");
                             
            }
            System.out.println();            
                                                                    
        }
    }
}