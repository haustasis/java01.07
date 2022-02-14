package n1exercici2;

public class Tricicle extends Vehicle {

    @Override
    public void circula(){
        System.out.println("Circula amb 3 rodes");
    }

    @Deprecated
    public void start(){
        System.out.println("Està en marxa");
    }

}
