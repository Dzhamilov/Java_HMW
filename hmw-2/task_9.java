public class task_9 {
// 1 Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2, начиная с c1.

// Пример. (n = 6, c1='a', c2='b') -> "ababab"
// (n = 8, c1='x', c2='y') -> "xyxyxyxy"

    static void buildString(int n, char c1, char c2) {
    // TODO: 28.03.2023 Домашнее задание!
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n/2; i++) {
        sb.append(c1);
        sb.append(c2);
    }
    System.out.println(sb);
    }

    public static void main(String[] args) {
        buildString(4, 's', 'a');
    }
}