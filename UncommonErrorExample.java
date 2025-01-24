public class UncommonErrorExample {
    public static void main(String[] args) {
        int[] array = new int[5];
        try {
            array[5] = 10; // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            //Additional handling or logging could be done here
        }
        System.out.println("Program continues after exception handling.");
    }
}