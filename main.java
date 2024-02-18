import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                
            }
        }
        int max=min+1;
        for(int i=min+1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int profit=max-min;
        System.out.println(profit);
    }
}
