import java.util.Scanner;

public class honeycomb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int n=1;
		if(num==1)System.out.println(num);
		else {
		for(int i=2;;i++) {
         n=n+6*(i-1);
     
         if(num<=n) {System.out.println(i);break;}
		}
		}
	}

}
