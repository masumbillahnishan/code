

public class pali {
    public static void main(String[] args) {
        int sum=0,i;
        int n=251;
        int temp=n;
        for(i=n;n!=0;n/=10){
            int r;
            r=n%10;
            sum=(sum*10)+r;

        }

        if(temp==sum){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not palindrom");
        }
    }


}
