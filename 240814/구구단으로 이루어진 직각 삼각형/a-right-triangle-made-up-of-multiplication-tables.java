import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 구구단 삼각형
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=0;
   
        for (int i = 1; i <n+1; i++) {
            for (int j = 1; j <(n-cnt)+1; j++) {
                if ((i+j) == n+1) {
                    System.out.println(i + " * " + j + " = " + (i*j));
                }
                else {
                    System.out.print(i + " * " + j + " = " + (i*j) +" / ");
                }    
            }   
            cnt++;  
        }
    }
}