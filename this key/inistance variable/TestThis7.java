class A{
    int roll;
    String name,course;
    float fee;
    A (int roll,String name,String course){
        this.roll=roll;
        this.name=name;
        this.course=course;
    }
    A (int roll,String name,String course,float fee){
       
        this(roll,name,course);
        this.fee=fee;
    }
    void display(){
        System.out.println(roll +name +course +fee);
    }
}

public class TestThis7 {
    public static void main(String[] args) {
        A b=new A(30 ," masum ","java ");
        // A c=new A(31 ," masum billah ","java script ",2000f);
        b.display();
        // c.display();
    }
}
