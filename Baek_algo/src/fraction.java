/*
����
������ ū �迭�� ������ ���� �м����� �����ִ�.

1/1 1/2 1/3 1/4 1/5 �� 
2/1 2/2 2/3 2/4 �� �� 
3/1 3/2 3/3 �� �� �� 
4/1 4/2 �� �� �� �� 
5/1 �� �� �� �� �� 
�� �� �� �� �� �� 
�̿� ���� ������ �м����� 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> �� �� ���� ������� ������ ���ʴ�� 
1��, 2��, 3��, 4��, 5��, �� �м���� ����.
X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
 
ù° �ٿ� X(1 �� X �� 10,000,000)�� �־�����.

���
 
ù° �ٿ� �м��� ����Ѵ�.
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
