import java.util.*;
public class gcd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int gcd=findgcd(num1,num2);
        System.out.println("ans : " +gcd);
    }
    private static int findgcd(int a,int b){
        if(b==0){
            return a;
        }
        return findgcd(b,a%b);
    }
}
