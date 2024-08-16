import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        어떤 수 n의 진약수란, n을 나누어 떨어지게 하는 양의 정수 중에서 n이 아닌 수
        n의 진약수의 총합이 n과 같다면, n을 완전수
        28의 진약수로는 1, 2, 4, 7, 14가 있고, 이들의 합은 28이므로, 28은 완전수
        */

        //1≤start≤end≤1000
        
        Scanner sc = new Scanner(System.in); 
        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt=0;
                
        for(int i=start;i<end+1; i++){ //3 이상 30 이하인 완전수는 6, 28
            int sum=0;
            for(int j=1; j<i;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum==i){
                //System.out.println("sum "+sum); 
                //System.out.println("i "+i); 
                
                cnt++;
            }
        }
        System.out.println(cnt); 
    }
}