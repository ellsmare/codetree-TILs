import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // n×n 크기의 정사각형 모양 1≤n≤5  65 'A'
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=65;
   
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print((char)cnt);   
                cnt++;
            }   
            System.out.println();   
        }
    }
}