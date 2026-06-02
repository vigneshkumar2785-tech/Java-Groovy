public class HarryPotter {
    public static void main(String[] args) {
        int num = 1004;
        int last = num %10;
        int first = num / 1000;
        int res = last + first;
        System.out.println(res);
    }
}
