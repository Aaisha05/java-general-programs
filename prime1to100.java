import java.util.*;
public class prime1to100{
    public static void main(String args[]){
        for(int i=2;i<=100;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
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
