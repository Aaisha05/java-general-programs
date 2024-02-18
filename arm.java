import java.util.*;
public class arm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int orgnum=num;
        int digitcount=0;
        int sum=0;
        while(orgnum!=0){
            orgnum/=10;
            digitcount++;
        }
        orgnum=num;
        while(orgnum!=0){
            int digit=orgnum%10;
            sum+=Math.pow(digit,digitcount);
            orgnum/=10;
        }
        if(sum==num){
            System.out.println("arm");
        }else{
            System.out.println("not arm");
        }
    }
}
