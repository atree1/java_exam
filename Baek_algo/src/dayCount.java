import java.util.Scanner;

public class dayCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		int day=sc.nextInt();
		int[] mon= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String[]days= new String[]{"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int count=0;
		for(int i=1;i<month;i++) {
		count+=mon[i];
		}
		count+=day;

		System.out.println(days[count%7]);
	}

}
