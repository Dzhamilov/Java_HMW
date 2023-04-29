import java.util.Deque;
import java.util.LinkedList;

public class task_13 {
    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println(isCorrectParentheses("[]{<()[]<>>}")); // true
    }
    
    /**
     * Дана последовательность скобочек. Проверить, что она является корректной.
     */
    static boolean isCorrectParentheses(String parentheses) {
        Deque<Character> charDeque = new LinkedList<>();
        for (char tmpChar : parentheses.toCharArray()) {
            if (Character.isMirrored(tmpChar))
                if (Character.isMirrored(tmpChar + 2)) // значит левая
                    charDeque.addFirst(tmpChar);
                else charDeque.addLast(tmpChar);
        }
        if (charDeque.size() % 2 != 0) return false;
        for (int i = 0; i < charDeque.size() / 2; i++) {
            if ((charDeque.removeLast() - charDeque.removeFirst()) != 2) return true;
        }
        return true;

        // TODO: 07.04.2023 Вписать решение!
        // Нужно завести маппинг скобочек либо ( -> ), либо ) -> ( и так для каждой пары
        // Нужно использовать Deque.
        // Открывающуюся скобку вносим в Deque (insertFirst)
        // Если встретилась закрывающаяся скобка, то (Deque#pollFirst) и сравниваем ее с встретившейся
        
    }
}
