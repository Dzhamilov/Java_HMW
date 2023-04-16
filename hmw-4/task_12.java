import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_12 {
    public static void main(String[] args) {
        // Реализовать приложение, которое:
        // Принимает от пользователя и запоминает строки
        // Если пользователь ввел print, то выводим все предыдущие строки в обратном порядке
        // Если введено revert, то удаляем последнюю введеную строку
        // Если введено exit, то завершаем программу
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите строки: ");
        List<String> str = new ArrayList<>();
        while(true){
            String user = sc.nextLine();
            str.add(user);
            if (user.equals("exit")) {
                System.out.println(str);
                break;
            }if (user.equals("revert")) {
                str.remove(str.size() - 1);
                System.out.println(str);
            }else {user.equals("print");
                System.out.println(str);
            }
            
        }
        sc.close();
    }
}