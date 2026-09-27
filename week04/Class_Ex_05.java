package week04;
class Hello {
    String toWhom = "world";

    Hello() { }
    Hello(String whom) { setWhom(whom); }
    void setWhom(String whom) { toWhom = whom; }
    void sayHello() { System.out.println("hello " + toWhom); }
}
public class Class_Ex_05 {
    static void main(String[] args) {
        Hello h1 = new Hello();
//        Hello h2 = new Hello("홍길동");
//        Hello h3 = new Hello("허균");

        // 클래스 배열 이용하면

        Hello[] harry = new Hello[3];
        harry[0] = h1;
        harry[1] = new Hello("홍길동");
        harry[2] = new Hello("허균");



        h1.sayHello();
        harry[1].sayHello();
        harry[2].sayHello();



    }
}
