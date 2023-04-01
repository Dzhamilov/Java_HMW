import java.util.Random;

public class task_6 {
    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static int[] getArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            }else array[i] = 0;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0};
        int[] Arr = getArray(arr);
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]); 
        }
        
    }
}
