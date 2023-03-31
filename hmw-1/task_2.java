public class task_2 {
    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x > 0) {
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        System.out.println(isPositive(2));
    }
}
