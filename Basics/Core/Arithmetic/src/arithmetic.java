public class arithmetic {
    public static void main(String[] args) {
        int a = 11;
        int b = 32;
        int c = 22;
        int d = 47;

        int x = a + b;
        int y = a - b;
        int z = d / c;
        int l = d * b;
        int r = d % c;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(r);
        System.out.println(l);

        int postfix = a++;
        System.out.println(postfix);
        System.out.println(a);
        int prefix = ++a;
        System.out.println(prefix);
    }
}
