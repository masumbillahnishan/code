
abstract class shap{
    abstract void draw();
}

class rec extends shap{
    void draw(){
        System.out.println("rectengle");
    }
}
class cir extends shap{
    void draw(){
        System.out.println("circle");
    }
}
class sq extends shap{
    void draw(){
        System.out.println("square");
    }
}
class tri extends shap{
    void draw(){
        System.out.println("triangle");
    }
}
public class abst{
    public static void main(String[] args) {
        shap ob=new tri();
        ob.draw();

        shap ob1=new sq();
        ob1.draw();
    }
}
