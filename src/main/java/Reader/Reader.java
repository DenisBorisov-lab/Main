package Reader;

import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Data profile = new Data("Петров Иван Иванович", "0001", "Исторический", "29.05.98", "+792522295234");
        System.out.println("ФИО: " + profile.FIO);
        System.out.println("Номер читательского билета: " + profile.ticket);
        System.out.println("Факультет: " + profile.facult);
        System.out.println("Дата рождения: " + profile.birthday);
        System.out.println("Номер телефона: " + profile.phonenumber);
        System.out.println("-------------------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Выберите функцию [return/take] ");
        String choice = sc.nextLine();
        if (choice.equals("take")) {
            System.out.print("Вы хотите указать книги, которые взял " + profile.FIO + "? [Y/N] ");
            String choose = sc.nextLine();
            if (choose.equals("Y") || choose.equals("y")) {
                System.out.print("Введите книги, которые взял " + profile.FIO + ": ");
                String res = sc.nextLine();
                System.out.println(profile.takeBook(res));
            } else {
                System.out.print("Сколько книг взял " + profile.FIO + ": ");
                int number = sc.nextInt();
                System.out.println(profile.takeBook(number));
            }
        }else{
            System.out.print("Вы хотите указать книги, которые вернул " + profile.FIO + "? [Y/N] ");
            String ch = sc.nextLine();
            if (ch.equals("y") || ch.equals("y")){
                System.out.print("Введите книги, которые верул " + profile.FIO + ": ");
                String res = sc.nextLine();
                System.out.println(profile.returnBook(res));
            }else{
                System.out.print("Введите сколько книг взял " + profile.FIO);
                int res = sc.nextInt();
                System.out.println(profile.returnBook(res));
            }
        }
    }
}
