import java.util.Scanner;

public class pr {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number 1:");
        int num1=obj.nextInt();
        System.out.print("Enter the number 2:");
        int num2=obj.nextInt();
        
        int i,j;
       for(j=num1;j<=num2;j++){
        boolean flag=false;
        for(i=2;i<=j/2;i++){
            if(j%i==0){
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println(j+" numbrt is prime");
        }
        else{
            System.out.println(j+" number is not prime");
        }
       }

       

    }
    
}
