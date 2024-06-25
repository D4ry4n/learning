public class Matrixspiral {
    public static void main(String[] arg){
        int[][] matrix ={{1,5,2,3,4},{5,7,6,7,1},{8,9,6,3,7},{1,8,5,7,9},{3,8,9,7,3}};
        MatrixSpiral(matrix);
    }

    public static void MatrixSpiral(int[][] matrix){
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while(true){
            if(left > right){break;}

            for(int i = left; i <= right; i++){
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            if(top > bottom){break;}
            for(int i = top; i <= bottom; i++){
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if(left > right){break;}
            for(int i = right; i >= left; i--){
                System.out.print(matrix[bottom][i] + " ");
            }
            bottom--;

            if(top > bottom){break;}
            for(int i = bottom; i >= top; i--){
                System.out.print(matrix[i][left] + " ");
            }
            left++;
        }
    }
}
