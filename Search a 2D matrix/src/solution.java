public class solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = -1;

        for (int i = 0; i < matrix.length; i++) {
            if (target <= matrix[i][matrix[0].length - 1]) {
                if (target == matrix[i][matrix[0].length - 1]) {
                    return true;
                } else {
                    row = i;
                    System.out.println("Target may exist in row: " + row);
                    break;
                }
            }
        }
        if (row == -1) {
            System.out.println("Target does not exist");
            return false;
        }

        int low = 0;
        int high = matrix[0].length - 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (target < matrix[row][mid]) {
                System.out.println("going left");
                high = mid - 1;
            } else if (target > matrix[row][mid]) {
                System.out.println("going right");
                low = mid + 1;
            } else {
                System.out.println("target found !!!");
                return true;
            }
        }
        System.out.println("target not found.");
        return false;
    }

}