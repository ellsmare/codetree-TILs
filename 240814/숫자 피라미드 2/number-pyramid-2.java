import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 삼각형 연속 cnt
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=1;
   
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print(cnt+" ");
                cnt++;
                             
            }
            System.out.println();            
                                                                    
        }
    }
}