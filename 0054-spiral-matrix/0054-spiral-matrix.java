class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;

        int dir=1;

        List<Integer> results=new ArrayList<>();

        while(top<=bottom && left<=right){
            if(dir==1){
                for(int i=left;i<=right;i++){
                    results.add(matrix[top][i]);
                }
                top++;
                dir=2;
            }
            else if(dir==2){
                for(int i=top;i<=bottom;i++){
                    results.add(matrix[i][right]);
                }
                right--;
                dir=3;
            }
            else if(dir==3){
                for(int i=right;i>=left;i--){
                    results.add(matrix[bottom][i]);
                }
                bottom--;
                dir=4;
            }
            else if(dir==4){
                for(int i=bottom;i>=top;i--){
                    results.add(matrix[i][left]);
                }
                left++;
                dir=1;
            }
        }
        return results;
    }
}