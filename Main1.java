class A {
    void call() {
        System.out.println("This is the parent Class");
    }
}
class B extends A {
    @Override
    void call() {
        System.out.println("This is the subClass(B) of A");
    }
}
class C extends A {
    @Override
    void call() {
        System.out.println("This is the subClass(C) of A");
    }
}
public class Main1 {
    public static void main(String[] args) {
        A a;

        a = new A();  
        a.call();      

        a = new C();
        a.call();     
    }
}
