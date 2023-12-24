package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Umid", "Abdurahimov", "5 000 000 so'm");
        Xirurg xirurg = new Xirurg("Umid", "Abdurahimov", "5 000 000 so'm");
        Lor lor = new Lor("Umid", "Abdurahimov", "5 000 000 so'm");

        myDoctor.malumotBer();
        xirurg.malumotBer();
        lor.malumotBer();
    }
}
