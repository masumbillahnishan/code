class a{
    int x;
 final void test(){
    x=7;
 }
}

class b extends a{
    void display(){
        System.out.println(x);
    }

}
public class my{
    public static void main(String[] args) {
        b n=new b();
        n.display();
    }
    
}
