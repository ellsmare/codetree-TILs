import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a_check = sc.next().charAt(0);
        int a_temp = sc.nextInt();
        
        char b_check = sc.next().charAt(0);
        int b_temp = sc.nextInt();
        
        char c_check = sc.next().charAt(0);
        int c_temp = sc.nextInt();

        
        if(a_check == 'Y' && a_temp>=37){
            if((b_check== 'Y' && b_temp>=37)|| (c_check== 'Y' && c_temp>=37)){
                System.out.println("E");
            }else{
                 System.out.println("N");
            }
           
        }else{
            if((b_check== 'Y' && b_temp>=37) && (c_check== 'Y' && c_temp>=37)){
                System.out.println("E");
            }else{
                 System.out.println("N");
            }

        }
        
     
    }
}