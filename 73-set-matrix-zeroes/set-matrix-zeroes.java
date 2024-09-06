class Solution {
    public void setZeroes(int[][] matrix) {
        //matrix[0][..]= row marking
        //matrix[..][0]=col marking
        int col0=1;
        int n=matrix.length;
        int m=matrix[0].length;
        
        //marking 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j!=0){
                        matrix[0][j]=0;
                    }
                    else{
                        col0=0;
                    }
                }
            }
        }

        // making 0s
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]!=0){
                    if(matrix[0][j]==0 || matrix[i][0]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        
        //for 1st row to be 0
        if(matrix[0][0]==0){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }

        // for 1st col to be 0
        if(col0==0){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }

        
    }
}