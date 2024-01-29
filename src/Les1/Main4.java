package Les1;
//Напишите метод, который находит самую длинную строку общего
//префикса среди массива строк.
//Если общего префикса нет, вернуть пустую строку ""
public class Main4 {
    public static void main(String[] args) {
        String s = "Добро пожаловать на курс по Java";
        String[] arr_s = s.split(" ");
        String new_s = "";
        for (int i = arr_s.length - 1; i >= 0; i--) {
            new_s += arr_s[i] + " ";
        }
        System.out.println(new_s.trim());
    }
}