import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a,b,c,sum;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sum=a+b+c;
        System.out.println(sum);
        System.out.println(sum/3);
        System.out.println(sum-sum/3);
        
                        
    }
}