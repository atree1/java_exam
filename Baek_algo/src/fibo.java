import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fibo=new int[42];
		fibo[0]=1;
		fibo[1]=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=2;i<42;i++) {
             fibo[i]=fibo[i-1]+fibo[i-2];			
		}
		for(int i=0;i<num;i++) {
			int n=sc.nextInt();
	        	System.out.println(fibo[n]+" "+fibo[n+1]);
		}
		
	}
	
}
