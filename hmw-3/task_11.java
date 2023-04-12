import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task_11 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]
        List<Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            arr.add(i, rnd.nextInt(100));
        }
        System.out.println(arr);
        List<Integer> result = removeEvenNumber(arr);
        System.out.println(result);
        
    }
    
    static List<Integer> removeEvenNumber(List<Integer> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }
        return numbers;
    }
    
    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
        for (int i = 0; i < strings.size(); i++) {
            try {
                Integer.parseInt(strings.get(i));
                strings.remove(i);

            } catch (NumberFormatException e) {
            
            }
        }
        
    }
}
