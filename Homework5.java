/* 
// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;


public class Homework5 {
    public static void main(String[] args) {

        Map<String, String> bookFone = new HashMap<>();    
        bookFone.put("Иванов Е.И.", "2-23-23");
        bookFone.put("Петров С.С.", "3-23-63");
        bookFone.put("Смирнов К.С.", "3 -15-78");
        bookFone.put("Локтев С.Б.", "2-23-89, 2-43-53");
        bookFone.put("Лобимов Д.О.", "3-78-99, 2-29-00");
        bookFone.put("Горшков П.К.", "2-15-13");
        System.out.println(bookFone.get("Иванов И.И."));
        System.out.println(bookFone.get("Лобимов Д.О."));

        addBookFone(bookFone, "Попов Е.Е.", "2-02-45");

        System.out.println(bookFone.get("Попов Е.Е."));

        deleteBookFone(bookFone, "Иванов Е.И.");

        System.out.println(bookFone);
    }

    // Добавить или изменить данные
    public static void addBookFone(Map<String, String> dict, String name, String number){
        dict.put(name, number);
    }
    // Удалить данные
    public static void deleteBookFone(Map<String, String> dict, String name){
        dict.remove(name);
    }
}   */


/* // 2. Пусть дан список сотрудников:Иван Иванов Написать программу, 
// которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Homework5{

    public static void main(String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new FileReader("list.txt"))) {
            BufferedWriter fw = new BufferedWriter(new FileWriter("countList.txt"));
            // StringBuilder sb = new StringBuilder();
            List<String> lineName = new ArrayList();
            String line;
            while ((line = br.readLine()) != null) {
                // sb.append(line + "\n");
                lineName.add(line);
            }
            fw.write("всего людей - ");
            fw.write(lineName.size() + "\n");
            Set<String> uniqueName = new HashSet<String>(lineName);
            fw.write("всего имен - ");
            fw.write(uniqueName.size() + "\n\n");

            List<String> numEqualName = new ArrayList<>();
            for (String temp : uniqueName) {
                int count = 0;
                for (String temp2 : lineName) {
                    if (temp.equals(temp2)) {
                        count++;
                    }
                }
                // String a = String.valueOf(count);
                // String qqq = ar.toString();
                numEqualName.add(count + " - " + temp + "\n");
                numEqualName.sort(null);
                Collections.reverse(numEqualName);
            }
            // System.out.println(numEqualName);
            for (String name : numEqualName) {
                fw.write(name);
            }
            fw.close();

        } catch (Exception e) {
            System.out.println("ошибка!!");
        }

    }
}   */
