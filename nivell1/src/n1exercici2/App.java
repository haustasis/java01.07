package n1exercici2;

public class App {

    @SuppressWarnings(value = "deprecation")
    public static void main(String[] args) {

        System.out.println("Cotxe - Child Class from Vehicle");
        Cotxe c1 = new Cotxe();
        c1.fontEnergia();
        System.out.println("--------------");

        System.out.println("Bici - Child Class from Vehicle");
        Bici b1 = new Bici();
        b1.stop();
        System.out.println("--------------");

        System.out.println("Tricicle - Child Class from Vehicle");
        Tricicle t1 = new Tricicle();
        t1.start();

    }
}
