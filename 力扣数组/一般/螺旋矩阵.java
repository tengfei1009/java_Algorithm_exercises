package 力扣数组.一般;

public class 螺旋矩阵 {
    //这个和入门四的蛇形方阵是同一个题目,但还是很难想象
    public static void main(String[] args) {
        generateMatrix(3);
    }
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1; // 从1开始填充矩阵元素
        int left = 0, right = n - 1, top = 0, bottom = n - 1; // 定义边界

        while (num <= n * n) {
            // 从左到右填充上边界
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++; // 上边界向下移动

            // 从上到下填充右边界
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--; // 右边界向左移动

            // 从右到左填充下边界
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--; // 下边界向上移动

            // 从下到上填充左边界
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++; // 左边界向右移动
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        return matrix;
    }
}
