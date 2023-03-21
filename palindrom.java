import java.util.Scanner;

class palindrom{  
    public static void main(String args[]){  
     int i, r,sum=0,temp;    
     Scanner obj=new Scanner(System.in);
     System.out.print("Enter the number:");
     int n=obj.nextInt();
     
     temp=n;    
     for(i=n;n!=0;n=n/10){    
      r=n%10;  
      sum=(sum*10)+r;       
     }    
     if(temp==sum)    
      System.out.println("palindrome number ");    
     else    
      System.out.println("not palindrome");    
   }  
   }  