import java.util.Scanner;

public class minMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int gcd=0;
			for(int j=1;j<=Math.min(n1, n2);j++) {
				if(n1%j==0&&n2%j==0)gcd=j;
				
			}
			System.out.println(gcd);
			System.out.println(n1*n2/gcd);



		}
	

}
