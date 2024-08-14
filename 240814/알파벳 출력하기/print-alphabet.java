import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 삼각형 모양 1≤n≤15  65 'A'
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=65;
   
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print((char)cnt);   
                cnt++;
            }   
            System.out.println();   
        }
    }
}