import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
            
        for(int i=0;i<2*a;i+=2){
            int cnt=11;
            for(int j=0;j<a;j++){      
                                                                            
                System.out.print(i+j+cnt);
                System.out.print(" ");
                cnt++;                                                                                                   
            }
            
        
            System.out.println();
        }
            
    }
}