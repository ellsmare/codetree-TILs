import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int ki = sc.nextInt();
        int mom = sc.nextInt();

//1.78*1.78
//27.77
//int bmi = w * 100 * 100 / (h * h);
        int ob = mom*100*100/(ki*ki);
        System.out.println(ob);
        if(ob>=25){
            System.out.print("Obesity");
        }
    }
}