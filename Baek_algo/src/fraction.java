/*
문제
무한히 큰 배열에 다음과 같이 분수들이 적혀있다.

1/1 1/2 1/3 1/4 1/5 … 
2/1 2/2 2/3 2/4 … … 
3/1 3/2 3/3 … … … 
4/1 4/2 … … … … 
5/1 … … … … … 
… … … … … … 
이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 
1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

입력
 
첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.

출력
 
첫째 줄에 분수를 출력한다.
*/
import java.util.Scanner;

public class fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
	
		int cnt = 1, num = 1;
		int x=1,y=1;

		while(input != cnt) {
			if (num % 2 == 1) {
				x++;
				cnt++;
				if (input == cnt)
					break;
				while( x != 1) {
					y++;
					x--;
					cnt++;
					if (input == cnt)
						break;
				}
				num++;
			}

			else {
				y++;
				cnt++;
				if (input == cnt)
					break;
				while (y != 1) {
					x++;
					y--;
					cnt++;
					if (input == cnt)
						break;
				}
				num++;
			}
		}
		System.out.println(y+"/"+ x);
	}


}
