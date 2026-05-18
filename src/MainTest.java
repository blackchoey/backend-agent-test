public class MainTest {
    private static void assertEquals(int expected, int actual, String message) {
        if (expected != actual) {
            throw new AssertionError(message + " expected=" + expected + " actual=" + actual);
        }
    }

    public static void main(String[] args) {
        assertEquals(-1, Main.binarySearch(new int[]{}, 42), "binarySearch should return -1 for empty input");
        assertEquals(0, Main.binarySearch(new int[]{42}, 42), "binarySearch should find target in a single-element array");
    }
}
