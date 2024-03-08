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

        String state;
        int count=0;
        
        if(a_check == 'Y' && a_temp>=37){
            state="A";
            count = count+1;
        }
        if(b_check == 'Y' && b_temp>=37){
            state="A";
            count = count+1;
        }
        if(c_check == 'Y' && c_temp>=37){
            state="A";
            count = count+1;
        }
        
        if((a_check == 'N' && a_temp>=37)||(b_check == 'N' && b_temp>=37)||(c_check == 'N' && c_temp>=37)){
            state ="B";
        }else if((a_check == 'Y' && a_temp<37)||(b_check == 'Y' && b_temp<37)||(c_check == 'Y' && c_temp<37)){
            state ="C";
        }else if((a_check == 'N' && a_temp<37)||(b_check == 'N' && b_temp<37)||(c_check == 'N' && c_temp<37)){
             state ="D";
        }

        if(count>=2){
            System.out.println("E");
        }else{
            System.out.println(count);
            System.out.println("N");
        }
    }
}