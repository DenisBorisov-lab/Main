package HomeOOP;

public class Phone {
    String number;
    int weight;
    String model;
    Phone(){
        number = "88005553535";
        weight = 12;
        model = "Iphone-12";
    }
    public String receiveCall(String name){
        String mes = "Звонит " + name;
        return mes;
    }
    public String receiveCall(long number){
        return "Звонит " + number;
    }
    public String getNumber(){
        String num = "89254568976";
        return num;
    }
    public String sendMessage(String number){
        String res = "Отправить сообщение: " + number;
        return res;
    }
}
