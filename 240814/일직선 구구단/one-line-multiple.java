import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 0 * 0 = 0
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
   
        for (int i = 1; i <n+1; i++) {
            for (int j = 1; j <n+1; j++) {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
            //System.out.println();            
        }
    }
}