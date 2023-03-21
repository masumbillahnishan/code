class A{
    static{
        System.out.println("masum");
    }
    void s(int d){
        System.out.println(d);
    }
}

public class TestDemo {
    static{
        System.out.println("masm");
    }
    static int num=20;
    public static void main(String[] args) {
        A a=new A();
        a.s(2);
        System.out.println(num);
    }
}
