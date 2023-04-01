public class task_7 {
    // 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] 
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;

    private static int[] MultiArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] Arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr = MultiArray(Arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); 
        }
    }
}
