//class Tv {
//
//    // TV의 속성(멤버 변수)
//    String color;   // 색상
//    boolean power;  // 전원상태(on/off)
//    int channel;    // 채널
//
//    // TV의 기능(메서드)
//    void power()    {power = !power;}   // TV를 켜거나 끄는 기능을 하는 매서드
//    void channelUp()    {++channel;}    // TV의 채널을 높이는 기능을 하는 매서드
//    void channelDown()  {--channel;}    // TV의 채널을 낮추는 기능을 하는 매서드
//
//}
//
//class TvTest2{
//    public static void main(String[] args) {
//        Tv t1 = new Tv();   // TV인스턴스를 참조하기 위한 변수 t1를 선언
//        Tv t2 = new Tv();   // TV인스턴스를 참조하기 위한 변수 t2를 선언
//        System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
//        System.out.println("t2의 channel값은 "+t2.channel+"입니다.");
//
//        t1.channel = 7;  // Tv인스턴스 t1의 멤버변수 channel의 channel의 값을 7로 한다.
//        System.out.println("t1의 channel값을 "+t1.channel+"로 변경하였습니다.");
//
//        System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
//        System.out.println("t2의 channel값은 "+t2.channel+"입니다.");
//
//    }
//}
