import java.util.ArrayList;
import java.util.Iterator;

public class InteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(17);
        a.add(29);
        a.add(8);
        a.add(88);
        a.add(16);
        Iterator<Integer> it = a.iterator();
        while(it.hasNext())
        {
            Integer num = it.next();
//            System.out.println(num);
            if(num == 8)
            {
                it.remove();
            }
        }
        System.out.println(a);
    }
}
