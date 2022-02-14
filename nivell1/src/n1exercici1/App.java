package n1exercici1;

public class App {

    public static void main(String[] args) {

        System.out.println("Vehicle - Parent Class");
        Vehicle vh1 = new Vehicle();
        vh1.circula();
        System.out.println("--------------");

        System.out.println("Cotxe - Child Class from Vehicle");
        Cotxe c1 = new Cotxe();
        c1.circula();
        System.out.println("--------------");

        System.out.println("Bici - Child Class from Vehicle");
        Bici b1 = new Bici();
        b1.circula();
        System.out.println("--------------");

        System.out.println("Tricicle - Child Class from Vehicle");
        Tricicle t1 = new Tricicle();
        t1.circula();

    }
}
