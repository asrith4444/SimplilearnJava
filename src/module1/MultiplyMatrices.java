package module1;

public class MultiplyMatrices 
{
    public static void main(String[] args) 
    {
        int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };
        int[][] product = multiplyMatrices(firstMatrix, secondMatrix, r1, c1, c2);
        displayProduct(product);
    }
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) 
    {
        int[][] product = new int[r1][c2];//2x2
        for(int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c2; j++) 
            {
                for (int k = 0; k < c1; k++) 
                {
                    int i1 = firstMatrix[i][k] * secondMatrix[k][j];//[0][0] * [0][0] --> [0][1]*[1][0]--> [0][2]*[2][0]
                    System.out.println(i1);
                    product[i][j] +=i1;
                    System.out.println("The added mid execution value: "+product[i][j]);
                }
            }
        }
        
        return product;
    }
	public static void displayProduct(int[][] product) 
	{
	        System.out.println("Product of two matrices is: ");
	//        for(int[] row : product) 
//        {
//            for (int column : row) 
//            {
//                System.out.print(column + "    ");
//            }
//            System.out.println();
//        }
                for (int i = 0; i < product.length; i++) {
                for (int j = 0; j < product[i].length; j++) {
                    System.out.print(product[i][j] + "    ");
                }
                System.out.println();
            }
    }
}
