import java.util.*;
public class countevodd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int even_cnt=0;
        int odd_cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even_cnt++;
            }else{
                odd_cnt++;
            }
        }
        System.out.println("even count: "+even_cnt);
        System.out.println(("odd count: "+odd_cnt));
    }
}
