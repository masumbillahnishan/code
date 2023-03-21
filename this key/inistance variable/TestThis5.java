class My{
    My(){
        System.out.println("masum");

    }
    My(int a){
        this();
    }
}


public class TestThis5 {
    public static void main(String[] args) {
        My b=new My(10);
        // b.m(10);
    }
}
