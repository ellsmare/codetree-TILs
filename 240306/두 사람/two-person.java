import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a_age, b_age;
        char a_gender, b_gender;

        a_age = sc.nextInt();
        a_gender = sc.next().charAt(0);
        b_age = sc.nextInt();
        b_gender = sc.next().charAt(0);

        if((a_age>=19 || b_age>=19) && (a_gender=='M'||b_gender=='M')){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}