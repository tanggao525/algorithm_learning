package com.tanggao.algorithm.array;

// 螺旋矩阵
public class SpiralMatrix {

    //给定一个正整数 n，生成一个包含 1 到 n^2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。

    /**
     * 思路：坚持循环不变量原则，即一直左闭右开
     */
    // n = 1 一圈，  n = 2 一圈， n = 3 两圈，中间需要填入。。。 共转n/2圈
    public static int[][] generateMatrix(int n) {
        // row行column列,代表当前的起点，从0开始计数
        int row = 0;
        int column = 0;

        // 循环结束的偏移量  (初始为1，左闭右开)
        int offset = 1;

        // 当前的值
        int value = 1;

        // 需要转的圈数
        int circle = n / 2;

        // 生成的肯定是n行n列的矩阵
        int[][] matrix = new int[n][n];

        while (circle > 0) {
            // 上
            for(int j = column; j < n - offset; j++) {
                matrix[row][j] = value;
                value++;
            }
            column = n - offset;

            // 右
            for(int i = row; i < n - offset; i++) {
                matrix[i][column] = value;
                value++;
            }
            row = n - offset;

            // 下
            for (int j = column; j > offset - 1; j--) {
                matrix[row][j] = value;
                value++;
            }
            column = offset - 1;

            // 左
            for(int i = row; i > offset - 1; i--) {
                matrix[i][column] = value;
                value++;
            }
            row = offset - 1;


            row++;
            column++;
            offset++;
            circle--;
        }

        if (n % 2 == 1) {
            matrix[row][column] = value;
        }
        return matrix;
    }

    public static void main(String[] args) {
        generateMatrix(4);
    }
}
