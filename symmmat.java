import java.util.*;
public class symmmat{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] mat= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        boolean issym=true;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]!=mat[j][i]){
                    issym=false;
                    break;
                }
            }
        }
        if(issym){
            System.out.println("symm");
        }else{
            System.out.println("not sym");
        }
    }
}

