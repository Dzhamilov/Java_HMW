public class task_3 {
    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз

        for (int i = 0; i < repeat; i++) {
            System.out.println(source);
        }
    }

    public static void main(String[] args) {
        printString("hello", 3);
    }
}
