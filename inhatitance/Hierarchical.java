import javax.xml.validation.TypeInfoProvider;

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

class doyel extends bird {
    void color(){
        System.out.println("black");
    }
}

class Hierarchical {
    public static void main(String args[]) {
        doyel d=new doyel();
        tiya t=new tiya();

        t.color();
        d.color();
    }
    
}
