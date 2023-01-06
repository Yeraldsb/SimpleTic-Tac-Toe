import java.util.Arrays;

class ArrayOperations {
    public static int[][][] createCube() {
        // write your code here

        int[][][] threeDimArray = new int[3][3][3];
        int counter = 0;
        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                for (int k = 0; k < threeDimArray[i][j].length; k++) {
                    threeDimArray[i][j][k] = counter;
                    counter++;
                }
            }
            counter = 0;
        }

        return threeDimArray;
    }


}