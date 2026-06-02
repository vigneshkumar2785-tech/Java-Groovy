import static java.lang.Long.sum;

class Type
{
    public int calculate(int a, int b)
    {
        return a + b;
    }
    public int calculate(int a,int b, int c)
    {
        return a+b+c;
    }
    public int calculate(int a, int b,int c,int d)
    {
        return a - b - c- d;
    }
    public int calculate(int a, int b,int c, int d, int e)
    {
        return a*b*c*d*e;
    }
}
public class PolyType {
    public static void main(String[] args) {
        Type t = new Type();
        System.out.println(t.calculate(2,5,6,3));
    }
}
