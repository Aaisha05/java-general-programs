import java.util.*;
public class kthele{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k");
        int k=sc.nextInt();
        if(k>0 && k<=n){
            System.out.println("element is "+arr[k-1]);
        }else{
            System.out.println("invalid");
        }
    }
}
