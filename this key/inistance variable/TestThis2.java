
class masum{
    int id;
    String name;
    float age;
    masum(int id,String name,float age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }
}



public class TestThis2 {
    public static void main(String[] args) {
        masum a1=new masum(29, "masum", 20);
        masum a2=new masum(28, "suzi", 22);
        a1.display();
        a2.display();
    }
}
