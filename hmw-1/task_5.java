public class task_5 {
    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] Arr = createArray(4, 1);
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]); 
        }
        
    }
}

