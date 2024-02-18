import java.util.*;
public class checkprime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isprime(n)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }

    private static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=(n/2);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

      
    }
}