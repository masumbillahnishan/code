class overload{
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(int a,double b,int c){
        System.out.println(a+b+c);
    }
    void add(int a,int b,float c){
        System.out.println(a+b+c);
    }
    
}

public class data {
    public static void main(String[] args) {
        overload obj=new overload();
        obj.add(2, 3, 4);
        obj.add(3, 4, 5.7f);
        obj.add(3, 4.5, 5);
    }
}
