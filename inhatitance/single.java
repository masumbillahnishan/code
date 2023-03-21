

class bird{
    void eat(){
        System.out.println("seed,corn");
    }
}

class tiya extends bird{
    void color(){
        System.out.println("green and red");
    }
}

public class single{
    public static void main(String args[]) {
        tiya t=new tiya();
        t.color();
        t.eat();
        
    }
    
}
