package HomeOOP;

public class Phone {
    String number;
    int weight;
    String model;
    Phone(String number, int weight, String model){
        this.number = number;
        this.weight = weight;
        this.model = model;
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
