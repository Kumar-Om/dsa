class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<>();

        arr.add(new ArrayList<>());
        arr.get(0).add(1);

        for(int i=1;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            List<Integer> prerow=arr.get(i-1);
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prerow.get(j-1)+prerow.get(j));
            }
            row.add(1);
            arr.add(row);

        }
        return arr;
        
    }
}