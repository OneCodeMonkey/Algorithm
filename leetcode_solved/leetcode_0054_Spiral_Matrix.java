import java.util.*;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix.
 * Memory Usage: 38.3 MB, less than 9.24% of Java online submissions for Spiral Matrix.
 */
class SprialMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;

        List<Integer> ret = new ArrayList<>();

        int[][] record = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                record[i][j] = 0;
            }
        }

        int count = 0, direction = 0, i = 0, j = 0;
        ret.add(matrix[i][j]);
        record[i][j] = 1;
        while (count < row * col) {
            switch (direction) {
                case 0:
                    if (j + 1 > col - 1) {
                        if (i + 1 > row - 1 || record[i + 1][j] != 0) {
                            return ret;
                        } else {
                            i++;
                            count++;
                            direction = (direction + 1) % 4;
                            ret.add(matrix[i][j]);
                            record[i][j] = 1;
                        }
                    } else {
                        if (record[i][j + 1] != 0) {
                            if (i + 1 > row - 1 || record[i + 1][j] != 0) {
                                return ret;
                            } else {
                                i++;
                                count++;
                                direction = (direction + 1) % 4;
                                ret.add(matrix[i][j]);
                                record[i][j] = 1;
                            }
                        } else {
                            j++;
                            count++;
                            ret.add(matrix[i][j]);
                            record[i][j] = 1;
                        }
                    }
                    break;
                case 1:
                    if (i + 1 > row - 1) {
                        if (j - 1 < 0 || record[i][j - 1] != 0) {
                            return ret;
                        } else {
                            j--;
                            count++;
                            direction = (direction + 1) % 4;
                            ret.add(matrix[i][j]);
                            record[i][j] = 1;
                        }
                    } else {
                        if (record[i + 1][j] != 0) {
                            if (j - 1 < 0 || record[i][j - 1] != 0) {
                                return ret;
                            } else {
                                j--;
                                count++;
                                direction = (direction + 1) % 4;
                                ret.add(matrix[i][j]);
                                record[i][j] = 1;
                            }
                        } else {
                            i++;
                            count++;
                            ret.add(matrix[i][j]);
                            record[i][j] = 1;
                        }
                    }
                    break;
                case 2:
                    if (j - 1 < 0) {
                        if (i - 1 < 0 || record[i - 1][j] != 0) {
                            return ret;
                        } else {
                            i--;
                            count++;
                            direction = (direction + 1) % 4;
                            ret.add(matrix[i][j]);
                            record[i][j] = 1;
                        }
                    } else {
                        if (record[i][j - 1] != 0) {
                            if (i - 1 < 0 || record[i - 1][j] != 0) {
                                return ret;
                            } else {
                                i--;
                                count++;
                                direction = (direction + 1) % 4;
                                ret.add(matrix[i][j]);
                                record[i][j] = 1;
                            }
                        } else {
                            j--;
                            count++;
                            ret.add(matrix[i][j]);
                            record[i][j] = 1;
                        }
                    }
                    break;
                case 3:
                    if (i - 1 < 0) {
                        if (j + 1 > col - 1 || record[i][j + 1] != 0) {
                            return ret;
                        } else {
                            j++;
                            count++;
                            direction = (direction + 1) % 4;
                            ret.add(matrix[i][j]);
                            record[i][j] = 1;
                        }
                    } else {
                        if (record[i - 1][j] != 0) {
                            if (j + 1 > col - 1 || record[i][j + 1] != 0) {
                                return ret;
                            } else {
                                j++;
                                count++;
                                direction = (direction + 1) % 4;
                                ret.add(matrix[i][j]);
                                record[i][j] = 1;
                            }
                        } else {
                            i--;
                            count++;
                            ret.add(matrix[i][j]);
                            record[i][j] = 1;
                        }
                    }
                    break;
            }
        }

        return ret;
    }
//    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        SprialMatrix sm1 = new SprialMatrix();
//
//        List<Integer> ret = sm1.spiralOrder(matrix);
//        for (int i: ret) {
//            System.out.println(i);
//        }
//
//        int[][] matrix2 = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}
//        };
//
//        List<Integer> ret2 = sm1.spiralOrder(matrix2);
//        for (int i: ret2) {
//            System.out.println(i);
//        }
//    }
}