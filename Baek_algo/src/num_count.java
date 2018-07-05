import java.util.Scanner;

public class num_count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int[] num=new int[10];
       String multy=num1*num2*num3+"";
     
       
       for(int i=0;i<multy.length();i++) {
    	   num[multy.charAt(i)-'0']++;
       }
       for(int i=0;i<10;i++) {
    	   System.out.println(num[i]);
       }
       
	}
}
