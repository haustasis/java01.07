package n1exercici2;

public class Bici extends Vehicle {

    @Override
    public void circula(){
        System.out.println("Circula amb 2 rodes");
    }

    @Deprecated
    public void stop(){
        System.out.println("No es mou");
    }

}
