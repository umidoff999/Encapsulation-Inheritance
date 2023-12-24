package Encapsulation;
public class Doctor {
    private String ism;
    private String familiya;
    private String maosh;

    public Doctor(String ism, String familiya, String maosh) {
        this.ism = ism;
        this.familiya = familiya;
        this.maosh = maosh;
    }


    public void malumotBer() {
            System.out.println("Ism: " + ism);
 System.out.println("Familiya: " + familiya);
 System.out.println("Maosh: " + maosh);
}
}

