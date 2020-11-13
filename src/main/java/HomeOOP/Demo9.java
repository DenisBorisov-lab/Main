package HomeOOP;

public class Demo9 {
    public static void main(String[] args) {
        //кодоое слово
        long num;

        //исходные буквы для кодирования
        char A = 'A', B = 's';

        //Буквы после декодирования
        char X, Y;

        //вычисление кода
        num = ((int) B << 16) + ((int) A); // [ 0 1 1 0 0 0 0 0 1 1]

        System.out.println("Исходные буквы: " + A + " и " + B);
        System.out.println("Кодовое число:" + num);
        System.out.println("Обраное преобразование:");

        //Декодирование
        Y = (char) (num >> 16);
        X = (char) (num ^ ((int) Y << 16));

        //Выводим на экран полученные значения
        System.out.println(X + " " + Y);
    }

}
