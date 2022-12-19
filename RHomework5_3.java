// 3. Написать метод, который переведет число из римского формата записи в арабский. 
// Например, MMXXII = 2022 (правила см. во вложениях к уроку, где ссылка на репозиторий).

public class RHomework5_3 {
    public static void main (String[] args) {
    
        int result = 0;
        int[] decimal = {2000, 1000, 900, 500, 400, 100, 90, 50, 40, 22, 10, 9, 5, 4, 2, 1};
        String[] roman = {"MM","M","CM","D","CD","C","XC","L","XL","XXII","XX","X","IX","V","IV","II","I"};
    
        // Тест 2022
        String test = "MMXXII";
    
        for (int i = 0; i < decimal.length; i++ ) {
            while (test.indexOf(roman[i]) == 0) {
                result += decimal[i];
                test = test.replace(roman[i], "");
            }
        }
        System.out.println("\n");
        System.out.println("Ответ:");
        System.out.println(result);
         
    }
}
