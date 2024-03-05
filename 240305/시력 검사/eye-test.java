import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double leftEye = sc.nextDouble();
        double rightEye = sc.nextDouble();

        if(leftEye>=1 && rightEye>=1){
            System.out.println("High");
        }
        else if(leftEye>=0.5 && rightEye>=0.5){
            System.out.println("Middle");
        }
        else{
            System.out.println("Low");
        }
      
    }
}