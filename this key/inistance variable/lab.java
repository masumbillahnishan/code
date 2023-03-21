import java.net.Socket;

class student{
    int id=100;
    void test(){
        System.out.println("hellow");
    }
}
class batch extends student{
    int id=220101;
    void test(){
        System.out.println("world");
    }
    void demo(){
        test();
    }
    
    void display(){
        System.out.println(super.id);
        System.out.println(id);
    }
}
public class lab {
    public static void main(String[] args) {
        batch ob=new batch();
        // System.out.println(id);
        ob.demo();
        
    }
}
