import java.util.*;
public class wordcount{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] words=input.split("\\s+");
        int wordcnt=words.length;
        System.out.println("ans "+wordcnt);
        
    }

}
