import java.util.*;
public class sumrowcol{
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

        System.out.println("row sum");
        for(int i=0;i<row;i++){
            int rowsum=0;
            for(int j=0;j<col;j++){
                rowsum+=mat[i][j];
            }
            System.out.println("sum of row "+(i+1)+" is "+rowsum);
        }

        System.out.println("col sum");
        for(int j=0;j<col;j++){
            int colsum=0;
            for(int i=0;i<row;i++){
                colsum+=mat[i][j];
            }
            System.out.println("sum of col "+(j+1)+" is "+colsum);
        }
    }
}
