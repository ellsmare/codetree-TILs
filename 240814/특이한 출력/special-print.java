import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 1<=n<=9
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
   
        for (int i = 1; i <n+1; i++) {
            for (int j = 1; j <n+1; j++) {
                if ((i+j) % 4 == 0) {
                    System.out.println("(" + i + ", " + j + ") ");
                }
                else {
                    System.out.print("(" + i + ", " + j + ") ");

                }    
            }     
        }
    }
}