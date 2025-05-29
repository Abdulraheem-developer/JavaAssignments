public class ArrayMatrix {
    public static void main(String[] args) {
        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] rotated = new int[3][3]; 

        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                rotated[col][2 - row] = nums[row][col];
            }
        }

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            
        }
    }
}
