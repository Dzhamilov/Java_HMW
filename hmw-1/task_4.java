public class task_4 {
    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        
        if ((year % 400 == 0) ||
        (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }else return false;
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(2100));
    }
}
