abstract class shape{
   abstract void draw();
}
class circle extends shape{
    void draw(){
        System.out.println("circle");
    }
}

class squre extends shape{
    void draw(){
        System.out.println("squre");
    }
}

public class abs {
    public static void main(String[] args) {
        shape obj=new circle();
        obj.draw();
    }
}
