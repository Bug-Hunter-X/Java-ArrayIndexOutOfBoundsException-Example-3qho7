public class UncommonErrorExampleSolution {
    public static void main(String[] args) {
        int[] array = new int[5];
        try {
            array[5] = 10; // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index out of bounds: " + e.getMessage());
            //Log the exception for debugging purposes
            e.printStackTrace();
            //Consider alternative actions, like using a default value or re-prompting the user.
            //For instance, using a default value if the index is out of bounds
            array[array.length -1] = 10; 

        } finally {
            System.out.println("Program continues after exception handling and finally block.");
        }
    }
}