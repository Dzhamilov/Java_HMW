public class task_8 {
    // 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    //   и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    //   Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    //  * * Также заполнить элементы побочной диагонали
    private static int[][] GetDiogonalArray(int size){
        int[][] Arr = new int[size][size];
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                if (i == j) {
                    Arr[i][j] = 1;
                }
                else Arr[i][j] = 0;
                Arr[i][size-1] = 1;
            }
            size--;
        }
        return Arr;
    }

    public static void main(String[] args) {
        int[][] arr = GetDiogonalArray(5);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d", arr[i][j]);
            }
            System.out.println(); 
        }
    }
}
