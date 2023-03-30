public class MultiplicationTables {

    public static void main(String[] args) {
        mu();
    }
    public static void mu() {
        int N;
        int rowNumber;
        System.out.println("\nMultiplication Table\n\n");
        for ( rowNumber = 1; rowNumber <= 12; rowNumber++ ) {
            for ( N = 1; N <= 12; N++ ) {
// print in 4-character columns
                System.out.printf( "%4d", N * rowNumber ); // No carriage return !
            }
            //            System.out.println();
            System.out.println(); // Add a carriage return at end of the line.
        }
    }  // mu
}   // MultiplicationTables
