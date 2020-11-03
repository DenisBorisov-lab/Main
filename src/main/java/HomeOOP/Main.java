package HomeOOP;

public class Main {
    public static void main(String[] args) {
        Phone message = new Phone();
        System.out.println(message.model);
        System.out.println(message.number);
        System.out.println(message.weight);
        System.out.println("------------------------------------");
        System.out.println(message.receiveCall("John"));
        System.out.println("Номер: " + message.getNumber());
        System.out.println("------------------------------------");
        System.out.println(message.sendMessage("84956667589"));
    }
}
