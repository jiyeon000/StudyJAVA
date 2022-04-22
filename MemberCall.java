//class MemberCall {
//    static int cv = 20;
//    //    static int cv2 = iv; //에러, 클래스변수는 인스턴스 변수를 사용할 수 없음.
//    static int cv2 = new MemberCall().iv; // 이처럼 객체를 생성해야 사용 가능.
//    int iv = 10;
//    int iv2 = cv;
//
//    static void staticMethod1(){
//        System.out.println(cv);
////        System.out.println(iv); // 에러, 클래스메서드에서 인스턴스변수를 사용 불가
//        MemberCall c = new MemberCall();
//        System.out.println(c.iv); // 객체 생성 후 인스턴스변수의 참조 가능
//    }
//
//    static void staticMethod2() {
//        staticMethod1();
////        intstanceMethod1(); //에러, 클래스 메서드에서는 인스턴스메서드에서 호출 불가
//        MemberCall c = new MemberCall();
//        c.intstanceMethod1(); // 인스턴스를 생성한 후에야 호출 가능
//    }
//
//    void intstanceMethod1() {
//        System.out.println(cv);
//        System.out.println(iv); // 인스턴스메서드에서는 인스턴스변수를 바로 사용 가능
//    }
//
//    void instanceMethod2() { // 인스턴스메서드에서는 인스턴스메서드와 클래스 메서드
//        staticMethod1();    // 모두 인스턴스 생성없이 바로 호출 가능
//        intstanceMethod1();
//    }
//}
