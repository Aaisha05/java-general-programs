import java.util.*;
public class factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=calfact(n);
        System.out.println(fact);
    }
    private static int calfact(int n){
        if(n<0){
            return -1;
        }
        if(n==0||n==1){
            return 1;
        }
        return n*calfact(n-1);
    }
}
