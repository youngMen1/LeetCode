package 数组操作.q54_螺旋矩阵;

import java.util.ArrayList;
import java.util.List;

/**
 * 方向变量模拟路径 o(n)
 */
public class Solution {


    public static void main(String[] args) {
        System.out.println(new Solution().spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    /**
     * 可以将矩阵看成若干层，首先输出最外层的元素，其次输出次外层的元素，直到输出最内层的元素。
     * 定义矩阵的第 kk 层是到最近边界距离为 kk 的所有顶点。
     * 例如，下图矩阵最外层元素都是第 11 层，次外层元素都是第 22 层，剩下的元素都是第 33 层。
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> rs = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return rs;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];

        int i = 0;
        int j = 0;
        int direction = 1;
        while (true) {
            if (i < 0 || j < 0 || i == m || j == n || visited[i][j]) {
                break;
            }
            rs.add(matrix[i][j]);
            visited[i][j] = true;
            switch (direction) {
                case 1:
                    if (j + 1 == n || visited[i][j + 1]) {
                        i++;
                        direction = 2;
                    } else {
                        j++;
                    }
                    break;
                case 2:
                    if (i + 1 == m || visited[i + 1][j]) {
                        j--;
                        direction = 3;
                    } else {
                        i++;
                    }
                    break;
                case 3:
                    if (j == 0 || visited[i][j - 1]) {
                        i--;
                        direction = 4;
                    } else {
                        j--;
                    }
                    break;
                case 4:
                    if (visited[i - 1][j]) {
                        j++;
                        direction = 1;
                    } else {
                        i--;
                    }
                    break;
                default:
                    break;
            }
        }
        return rs;
    }

}
