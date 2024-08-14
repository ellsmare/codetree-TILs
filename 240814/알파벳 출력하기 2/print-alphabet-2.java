import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 역삼각형 모양 1≤n≤15  65 'A' 90 'Z'
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=65;
   
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                if(i>j){
                    System.out.print("  ");
                }
                else{
                    System.out.print((char)cnt+" ");   
                    cnt++;
                }
                if(cnt>90){
                    cnt=65;
                }
            }   
            System.out.println();   
        }
    }
}