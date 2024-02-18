import java.util.*;
public class fibonacci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=fibo(i);
            
        }
        System.out.println(sum);
    }
    private static int fibo(int n){
        if(n<0){
            return -1;
        }
        if(n==0||n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
