import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=0;

        for (int i = 0; i < n-cnt; i++) {
            if (i==0){
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
            System.out.println();
            cnt++;
            }

            else{
                for (int j = 0; j < n; j++) {
                    if(i!=0 && j%2!=0){
                        System.out.print("  *");
                    }   
                }  
                System.out.println();

            }
        }
    }
}