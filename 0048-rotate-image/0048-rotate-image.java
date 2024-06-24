class Solution {
    public void rotate(int[][] matrix) {
    transpose(matrix);
    reverse(matrix);
    }
    public void transpose(int[][] arr){
    int row = arr.length;
    int column = arr[0].length;
    for(int i=0;i<row;i++){
        for(int j=0;j<i;j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i]=temp;
        }
    }
    }
    public void reverse(int[][] arr){
    int row = arr.length;
    int column = arr[0].length;
    for(int i=0;i<row;i++){
        for(int j=0;j<column/2;j++){
            int temp = arr[i][j];
            arr[i][j] = arr[i][column-1-j];
            arr[i][column-1-j]=temp;
        }
    }
    }
}