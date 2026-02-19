public class Quiz {
    public static int largestColumn(int[][] nums){
        int biggestCol = -1;
        int biggestSum = -1;

        for(int col = 0; col < nums[0].length; col++){
            int colSum = 0;
            for(int row = 0; row < nums.length; row++){
                colSum += nums[row][col];
            }
            if(colSum > biggestSum) biggestCol = col;
        }
    }
    return biggestCol;
}
