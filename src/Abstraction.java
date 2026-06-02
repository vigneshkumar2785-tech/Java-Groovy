abstract class Payment {

    abstract void gpay();
    abstract void phonepay();
    abstract void paytm();
    abstract void fampay();
}

class OnlinePayment extends Payment {
    int amount = 1000;
    public void gpay() {
        System.out.println("GPay amount: " + amount);
    }
    public void phonepay() {
        System.out.println("PhonePe amount: " + amount);
    }
    public void paytm() {
        System.out.println("Paytm amount: " + amount);
    }
    public void fampay() {
        System.out.println("FamPay amount: " + amount);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Payment p = new OnlinePayment();
        p.gpay();
        p.phonepay();
        p.paytm();
        p.fampay();
    }
}