public class BinaryTriangle {
    public static void main(String[] args) {
        int rows = 6; // Total rows to print as per your requirement

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop for columns in each row
            for (int j = 1; j <= i; j++) {
                
                // Logic: If (row + column) is even, print 1. Otherwise, print 0.
                // This creates the alternating pattern.
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}