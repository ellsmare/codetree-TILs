//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //19 * 19 단 입력x
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        /*
        1 * 1 = 1 / 1 * 2 = 2 
        1 * 3 = 3 / 1 * 4 = 4 
        ............. 
        1 * 17 = 17 / 1 * 18 = 18 
        1 * 19 = 19 
        2 * 1 = 2 / 2 * 2 = 4 
        ............. 
        19 * 17 = 323 / 19 * 18 = 342 
        19 * 19 = 361
        */
   
        for (int i = 1; i <20; i++) {
            for (int j = 1; j <20; j++) {
                if (j % 2 == 0 || j==19) {
                    System.out.println( i + " * " + j + " = "+ (i*j));
                }
                else {
                    System.out.print( i + " * " + j + " = "+ (i*j)+" / ");

                }    
            }     
        }
    }
}