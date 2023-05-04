import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Scanner read = new Scanner(System.in);
        Random random = new Random();
        int treasureRow = random.nextInt(5);
        int treasureCol = random.nextInt(5);
        System.out.println("-------------------------");
        System.out.println("----FIND THE TREASURE----");

        for (int vidas = 3; vidas > 0; vidas--) {
            System.out.println("-------------------------");
            System.out.println("-----HERE IS THE MAP-----");
            System.out.println("-------------------------");
            drawMatrix(matrix);
            System.out.println("Enter the Row: ");
            int guessRow = read.nextInt();
            System.out.println("Enter the Colum: ");
            int guessCol = read.nextInt();
            if (guessRow == treasureRow && guessCol == treasureCol){
                System.out.println("Congratulations, you find the treasure!");
                matrix[treasureRow][treasureCol] = 2;
                drawMatrix(matrix);
                return;
            }
            else {
                System.out.println("You didn't find the treasure!");
                matrix[guessRow][guessCol] = 1;
            }
        }
        System.out.println("Game over! You did not find the treasure.");
        matrix[treasureRow][treasureCol] = 2;
        drawMatrix(matrix);
    }
    public static void drawMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("   ");
            for (int col : row) {
                if (col == 0) {
                    System.out.print("[ ] ");
                } else if (col == 1) {
                    System.out.print(" X  ");
                } else {
                    System.out.print(" *  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
