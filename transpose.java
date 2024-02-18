import java.util.*;
public class transpose{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int[][] transpose=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=mat[i][j];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
