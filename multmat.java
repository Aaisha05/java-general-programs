import java.util.*;
public class multmat{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("first");
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        int[][] mat1=new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("second");
        int col2=sc.nextInt();
        int[][] mat2=new int[col1][col2];
        for(int i=0;i<col1;i++){
            for(int j=0;j<col2;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        int[][] res=new int[row1][col2];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<col1;k++){
                    res[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        System.out.println("result");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        )
    }
}
