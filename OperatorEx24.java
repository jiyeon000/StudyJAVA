//import java.util.Scanner;
//import java.util.function.DoubleFunction;
//
//public class OperatorEx24 {
//
//    public static void main(String[] args) {
//
//        int x = 0;
//        char ch = ' ';
//
//        x = 15;
//        System.out.printf("x = %2d, 10 < x && x < 20 = %b%n", x, 10 < x && x < 20);
//
//        x = 6;
//        System.out.printf("x = %2d, x%%2==0 || x%%3==0 && x%%6!=0 = %b%n", x, x%2==0 || x%3==0 && x%6!=0);
//        System.out.printf("x = %2d, (x%%2==0 || x%%3==0) && x%%6!=0 = %b%n", x, (x%2==0 || x%3==0) && x%6!=0);
//
//        ch='1';
//        System.out.printf("'ch='%c', '0' <= ch && ch <='9' = %b%n", ch, '0' <= ch && ch <='9');
//
//        ch='a';
//        System.out.printf("'ch='%c', 'a' <= ch && ch <='z' = %b%n", ch, 'a' <= ch && ch <='z');
//
//        ch='A';
//        System.out.printf("'ch='%c', 'A' <= ch && ch <='Z' = %b%n", ch, 'A' <= ch && ch <='Z');
//
//        ch='q';
//        System.out.printf("'ch='%c', ch=='q' || ch =='Q' = %b%n", ch, ch=='q' || ch =='Q');
//
//
//        Scanner scanner = new Scanner(System.in);
//        char ch1 = ' ';
//
//        System.out.printf("문자를 하나 입력하세요.>");
//
//        String input = scanner.nextLine();
//        ch1 = input.charAt(0);
//        if('0'<= ch1 && ch1<= '9') {
//            System.out.printf("입력하신 문자는 숫자입니다.%n");
//        }
//        if(('a'<=ch1 && ch1 <= 'z')||('A'<=ch1 && ch1 <='Z')){
//            System.out.printf("입력하신 문자는 영문자입니다.%n");
//
//        int a = 5;
//        int b = 0;
//
//        System.out.printf("a=%d, b=%d%n", a, b);
//        System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
//        System.out.printf("a=%d, b=%d%n",a,b);
//        System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
//        System.out.printf("a=%d, b=%d%n",a,b);
//
//        boolean n = true;
//        char ch2 = 'C';
//
//        System.out.printf("n = %b%n", n);
//        System.out.printf("!n = %b%n", !n);
//        System.out.printf("!!n = %b%n", !!n);
//        System.out.printf("!!!n = %b%n", !!!n);
//        System.out.println();
//
//        System.out.printf("ch2=%c%n", ch2);
//        System.out.printf("ch2 <'a' || ch2 > 'z'=%b%n", ch2 <'a' || ch2 > 'z');
//        System.out.printf("!(ch2 <'a' || ch2 > 'z')=%b%n",!(ch2 <'a' || ch2 > 'z'));
//        System.out.printf("'a' <= ch2 && ch2 <= 'z'=%b%n", 'a' <= ch2 && ch2 <= 'z');
//    }
//}
