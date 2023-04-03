import java.io.File;
import java.io.FileWriter;

public class task_10 {
    // 2 Создать файл file.txt. Если файл уже создан, ничего делать не надо. 
    // Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            FileWriter f2 = new FileWriter(file);
            for (int i = 0; i < 100; i++) {
                f2.write("TEXT" + '\n');
            }
            f2.close();
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            System.out.println("Файл создан!");
        }
    }
}