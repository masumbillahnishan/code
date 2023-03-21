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

class babytiya extends tiya{
    void age(){
        System.out.println("1days to 30days");
    }
}




public class multilevel {
    public static void main( String args[]) {
        babytiya obj=new babytiya();
        obj.color();
    }
    
}
