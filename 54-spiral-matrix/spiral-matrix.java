class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        int tr=0,br=r-1;
        int lc=0,rc=c-1;
        int total=0;
        List<Integer> a=new ArrayList<>();
        while(total<r*c){
            for(int j=lc;j<=rc&&total<r*c;j++){
                a.add(matrix[tr][j]);
                total++;
            }
            tr++;

            for(int i=tr;i<=br&&total<r*c;i++){
                a.add(matrix[i][rc]);
                total++;
            }
            rc--;

            for(int j=rc;j>=lc&&total<r*c;j--){
                a.add(matrix[br][j]);
                total++;
            }
            br--;

            for(int i=br;i>=tr&&total<r*c;i--){
                a.add(matrix[i][lc]);
                total++;
            }
            lc++;
        }

        return a;
        
    }
}