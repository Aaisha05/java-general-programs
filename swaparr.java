import java.util.*;
public class swaparr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr1[i]=arr1[i]+arr2[i];
            arr2[i]=arr1[i]-arr2[i];
            arr1[i]=arr1[i]-arr2[i];
        }
        System.out.println("array1: "+Arrays.toString(arr1));
        System.out.println("array2: "+Arrays.toString(arr2));

    }
}
