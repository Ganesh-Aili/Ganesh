import java.util.Scanner;
class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  Scanner sc=new Scanner(System.in);//It is the number variable to be checked for palindrome  
  int n=sc.nextInt();
  temp=n;    
  for(int i=0;i<n;i++){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;  
System.out.println(sum);  
  }    
  if(temp==sum)    
   System.out.println("palindrome number "+sum);    
  else    
   System.out.println("not palindrome");    
}  
}