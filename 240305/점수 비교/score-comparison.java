import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int aMath=sc.nextInt();
        int aEn=sc.nextInt();
        int bMath=sc.nextInt();
        int bEn=sc.nextInt();
        
        if(aMath>bMath && aEn>bEn){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}