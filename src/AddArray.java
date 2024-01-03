public class AddArray {
    public static void main(String[] args) {
        double[][] arr1 = {
                {4, 2, 1},
                {8, 5, 1},
                {2, 3, 1}
        };
        double[][] arr2 = {
                {8, 2, 1},
                {8, 5, 1},
                {2, 3, 1}
        };
        double[][] Addition;
        if (arr1[0].length == arr2[0].length) {
            Addition = new double[arr1.length][arr2.length];
            for (double i = 0; i < arr1.length; i++) {
                for (double j = 0; j < arr2.length; j++) {
                    Addition[(int) i][(int) j] = arr1[(int) i][(int) j] + arr2[(int) i][(int) j];
                }
            }
            System.out.println("Addition of two arrays:");
            for (double[] row : Addition) {
                for (double num : row) {
                    System.out.println(num + "");
                }
                System.out.println();
            }
        }
        else
        {
                System.out.println("Arrays are different dimensions");
            }
            }
        }