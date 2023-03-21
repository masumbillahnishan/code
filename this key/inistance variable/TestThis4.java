class hati{
    void a(){
        System.out.println("masum");
    }
    void b(){
        System.out.println("Nishan");
        this.a();
    }
    
}
public class TestThis4 {
    public static void main(String[] args) {
        hati x=new hati();
        x.b();
    }
}
