class shape {

    public void area() {

        System.out.println(" ");
    }
}
     class circle extends shape
    {
        int r = 16;
        @Override
        public void area(){
        System.out.println(3.14 * r * r);

    }
         }
    class rectangle extends shape
    {
        int l = 12;
        int b = 6;
        @Override
        public void area()
        {
            System.out.println(l * b);
        }
    }
public class Polymorphism {
    public static void main(String[] args) {
        shape s1;
        s1 = new circle();
        s1.area();
    }


}
