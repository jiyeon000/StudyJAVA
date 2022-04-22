
public class OperatorEx28 {

    public static void main(String[] args) {
        int x = 0xAB;
        int y= 0xF;

        System.out.printf("x = %#X \t\t%s%n",x, toBinaryString(x));
        System.out.printf("y = %#X \t\t%s%n",y, toBinaryString(y));
        System.out.printf("%#X | %#X = %#X \t%s%n", x,y,x|y, toBinaryString(x|y));
        System.out.printf("%#X & %#X = %#X \t%s%n", x,y,x&y, toBinaryString(x&y));
        System.out.printf("%#X ^ %#X = %#X \t%s%n", x,y,x^y, toBinaryString(x^y));
        System.out.printf("%#X ^ %#X ^ %#X = %#X \t%s%n", x,y, y,x^y^y, toBinaryString(x^y^y));

        byte p = 10;
        byte n = -10;

        System.out.printf("p = %d\t%s%n", p, toBinaryString(p));
        System.out.printf("~p = %d\t%s%n", ~p, toBinaryString(~p));
        System.out.printf("~p+1 = %d\t%s%n", ~p+1, toBinaryString(~p+1));
        System.out.printf("~~p = %d\t%s%n", ~~p, toBinaryString(~~p));

        System.out.println();
        System.out.printf("n = %d%n", p, toBinaryString(n));
        System.out.printf("~(n-1) = %d%n", p, toBinaryString(~(n-1)));


        int dec = 1234;
        int hex = 0xABCD;
        int mask = 0xF;

        System.out.printf("hex=%X%n", hex);
        System.out.printf("%X%n",hex&mask);

        hex = hex >>4;
        System.out.printf("%X%n",hex&mask);
        hex = hex >>4;
        System.out.printf("%X%n",hex&mask);
        hex = hex >>4;
        System.out.printf("%X%n",hex&mask);


        int a,  b, c;
        int absA, absB, absC;
        char SignA, SignB, SignC;

        a = 10;
        b = -5;
        c = 0;

        absA = a >= 0 ? a: -a;
        absB = b >= 0 ? b: -b;
        absC = c >= 0 ? c: -c;

        SignA = a > 0 ? '+' :(a==0 ? ' ': '-');
        SignB = b > 0 ? '+' :(b==0 ? ' ': '-');
        SignC = c > 0 ? '+' :(c==0 ? ' ': '-');

        System.out.printf("a=%c%d%n", SignA,absA);
        System.out.printf("b=%c%d%n", SignB,absB);
        System.out.printf("c=%c%d%n", SignC,absC);

    }

    static String toBinaryString(int x){
        String zero = "000000000000000000000000000000000000000000000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);
    }

}
