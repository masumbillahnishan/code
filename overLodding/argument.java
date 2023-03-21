class overload{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(int a,int b,int c, int d){
        System.out.println(a+b+c+d);
    }
}




public class argument {
    public static void main(String[] args) {
        overload obj=new overload();


        obj.add(2, 3);
        obj.add(2, 3,4);
        obj.add(2, 3,4,5);
    }

    
}
