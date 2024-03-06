import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int a_math, a_en;
        int b_math, b_en;
        
        a_math=sc.nextInt();
        a_en=sc.nextInt();

        b_math=sc.nextInt();
        b_en=sc.nextInt();
        if(a_math>b_math){
            System.out.println("A");
        }else if(a_math==b_math && a_en>b_en){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
    }
}