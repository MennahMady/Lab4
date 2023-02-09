public class TestCompileTime {
    public TestCompileTime() {
    }

    public static void main(String args[]) {
        if (Debug.DEBUG) {
            System.err.println("Debug is turned on");
            TestCompileTime t = new TestCompileTime();
            int[] numbers = new int[4];
            for (int i = 0; i < 4; i++) {
                numbers[i] = i;
                System.out.println("DEBUG_STATEMENT: number[" + i + "]=" + i);
            }
        } else {
            System.out.println("Debug is turned off");
        }

        int[] numbers = new int[4];
        for (int i = 0; i < 4; i++) {
            numbers[i] = i;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
    }
}
