

class hati{
    void name(){
        System.out.println("Sarmin");
    }
    void age(){
        System.out.println("22");
    }
}
class montu extends hati{
    void name(){
        System.out.println("MONTU MIYA");
    }
}
public class overridding {
    public static void main(String[] args) {
        montu ob=new montu();
        ob.name();
        ob.age();
    }
}
