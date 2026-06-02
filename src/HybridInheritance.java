interface Bike
{
    void ride();
}
interface popular extends Bike{
    void ride() ;
}
interface BMW extends Bike {
      void ride() ;
}
class cycle implements BMW, popular {
    public void ride() {
        System.out.println("Riding BMW");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        cycle c = new cycle();
        c.ride();
    }
}
