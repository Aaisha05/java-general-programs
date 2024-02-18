import java.util.*;
public class laa{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(ispal(str)){
            System.out.println("pal");
        }
        else{
            System.out.println("not pal");
        }
    }

    private static boolean ispal(String str){
        //String clean=str.replaceAll("[^a-zA-Z0-9]", replacement:"").toLowerCase();
        //String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String clean=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int left=0;
        int right=clean.length()-1;
        while(left<right){
            if(clean.charAt(left)!= clean.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

