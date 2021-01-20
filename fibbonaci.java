import java.util.Scanner ;
class fibbonaci{ 
public static void main(String args[])  
{    
Scanner jumlah = new Scanner(System.in);
System.out.print("Masukan jumlah angka fibbonacci : ");
int count = jumlah.nextInt();
if (count == 0) {
	count = 10;
}

 int n1=0,n2=1,n3,i;    
 System.out.println("fibbonacci ke-1 = "+n1+"\nfibbonacci ke-2 = "+n2);   
    
 for(i=3;i<=count;++i)  
 {    
  n3=n1+n2;    
  System.out.println("fibbonacci ke-"+i+" = "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  