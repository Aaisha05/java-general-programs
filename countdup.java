import java.util.*;
public class countdup{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int dupcount=cntdup(arr);
        System.out.println(dupcount);
    }
    private static int cntdup(int[] arr){
        Arrays.sort(arr);
        int dupcount=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                dupcount++;
                while(i<arr.length-1 && arr[i]==arr[i+1]){
                    i++;
                }
            }
        }
        return dupcount;
    }
}