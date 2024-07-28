import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if (i == 0) {
                    System.out.print("* ");
               }  
               else{
                    for (i = 1; i < n; i++) {
                        for (j = 0; j < n; j++) {
                            if(j>=i && j!=(n-1)){
                                System.out.print("  ");
                            }
                            else{
                                System.out.print("* ");  

                            }
                            
                                              
                     
                        }
                System.out.println();
                    
                    }

               }             
            }
            System.out.println();
        }


        // for (i = 0; i < cnt; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*  ");                    
                     
        //         }
        //         System.out.println();
                    
        //     }
            
        }
    }