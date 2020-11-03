package Reader;

public class Data {
    String FIO;
    String ticket;
    String facult;
    String birthday;
    String phonenumber;
    Data(String FIO, String ticket, String facult, String birthday, String phonenumber){
        this.FIO = FIO;
        this.ticket = ticket;
        this.birthday = birthday;
        this.facult = facult;
        this.phonenumber = phonenumber;
    }
    public String takeBook(String listOfBooks){
        String res = FIO + " взял книги: " + listOfBooks;
        return res;
    }
    public String takeBook(int number) {
        String book = "";
        int m = number % 10;
        if (m == 1 && number!= 11){
            book = "книгу";
        }else if ((m == 2 || m == 3 || m == 4) && (number != 12 || number != 13 || number != 14)) {
            book = "книги";
        }else{
            book = "книг";
        }
        String otvet = FIO + " взял " + number + " " + book;
        return otvet;
    }
    public String returnBook(int number){
        String book = "";
        int m = number % 10;
        if (m == 1 && number!= 11){
            book = "книгу";
        }else if ((m == 2 || m == 3 || m == 4) && (number != 12 || number != 13 || number != 14)) {
            book = "книги";
        }else{
            book = "книг";
        }
        String stri = FIO + " вернул " + number + " " + book;
        return stri;
    }
    public String returnBook(String str){
        String res = FIO + "Вернул книги: " + str;
        return res;
    }
}
