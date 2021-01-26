public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number >= 5) {
            for (int column = 1; column <= number; column++) {
                for (int row = 1; row <= number; row++) {
                    if (row == 1 || // In the first row
                            row == number || // In the last row
                            column == 1 || // In the first column
                            column == number || // In the last column
                            row == column || // When the row number equals the column number
                            column == number - row + 1) { // When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(); // New line for each new row iteration
            }
        } else {
            System.out.println("Invalid Value");
        }
    }

}