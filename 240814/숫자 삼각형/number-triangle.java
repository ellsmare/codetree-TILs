import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 삼각형
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <i+2; j++) {
                System.out.print(j+" ");
                           
            }
            System.out.println();            
                                                                    
        }
    }
}