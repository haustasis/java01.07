package n1exercici2;

public class Cotxe extends Vehicle {

    @Override
    public void circula(){
        System.out.println("Circula amb 4 rodes");
    }

    @Deprecated
    public void fontEnergia(){
        System.out.println("Sense energia");
    }

}
