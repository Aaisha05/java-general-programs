import java.util.*;
public class fibo2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] fib=new int[n];
        if(n<0){
            System.out.println("-1");
        }
        else if(n==0){
            System.out.println("0");
        }
        else if(n==1){
            System.out.println("1");
        }
        else{
            fib[0]=0;
            fib[1]=1;
            int sum=fib[0]+fib[1];
            for(int i=2;i<n;i++){
                fib[i]=fib[i-1]+fib[i-2];
                sum+=fib[i];
            }
            System.out.println(sum);
            System.out.println(fib[n-1]);
        }

    }
}