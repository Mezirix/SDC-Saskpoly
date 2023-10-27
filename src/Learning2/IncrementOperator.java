package Learning2;

public class IncrementOperator {
    public static void main(String[] args) {


//        double a = 6.5;
//        a += a + 1;
//        System.out.println(a);
//        a = 6;
//        a /= 2;
//        System.out.println(a);

        int a = 6;
        int b = a++;

        System.out.println(a);
        System.out.println(b);
        a = 6;
        b = ++a;
        System.out.println(a);
        System.out.println(b);
    }
}
