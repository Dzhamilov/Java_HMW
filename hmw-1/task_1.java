public class task_1 {
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int sum = a + b;
        if (10 <= sum & sum <= 20) {
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(15, 5));
    }
    
}