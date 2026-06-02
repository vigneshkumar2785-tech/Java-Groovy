interface insta{
    void group();
}
interface whatsapp{
    void group();
}
class Whatgram implements insta,whatsapp{

    @Override
    public void group() {
        System.out.println("Whatsapp Group");
    }
}
public class Interface {
    public static void main(String[] args) {

        Whatgram w = new Whatgram();
        w.group();

    }
}
