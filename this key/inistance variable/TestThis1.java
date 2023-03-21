

class student{
    int roll;
    String name;
    float fee;
    student(int roll,String name,float fee){
        roll=roll;
        name=name;
        fee=fee;

    }
    void display(){
        System.out.println(roll+" "+name+" "+fee);
    }
}


public class TestThis1 {
    public static void main(String[] args) {
        student s1=new student(4, "masum", 3);
        student s2=new student(3, "masum2", 32);
        s1.display();
        s2.display();

    }

    
}
