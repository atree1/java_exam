import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sosuCnt = 0, cnt = 0;

		for (int i = 1; i <= num2; i++) {
			
			sosuCnt = 0;
           if(i>=num1)
			for (int j = 1; j <= i; j++) {
				if (num2 % j == 0)
					sosuCnt++;
			}

			if (sosuCnt == 2)
				cnt++;
		}
		System.out.print(cnt);
	}

}
