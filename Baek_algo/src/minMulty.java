
/*
����
 
�� �ڿ��� A�� B�� ���ؼ�, A�� ����̸鼭 B�� ����� �ڿ����� A�� B�� �������� �Ѵ�. 
�̷� ����� �߿��� ���� ���� ���� �ּҰ������� �Ѵ�. 
���� ���, 6�� 15�� ������� 30, 60, 90���� ������, �ּ� ������� 30�̴�.

�� �ڿ��� A�� B�� �־����� ��, A�� B�� �ּҰ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
 
ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. 
��° �ٺ��� T���� �ٿ� ���ļ� A�� B�� �־�����. (1 �� A, B �� 45,000)

���
ù° �ٺ��� T���� �ٿ� A�� B�� �ּҰ������ �Է¹��� ������� �� �ٿ� �ϳ��� ����Ѵ�.

���� �Է� 1 ���� 
 3
1 45000
6 10
13 17

���� ��� 1 ���� 
 45000
30
221
*/

import java.util.Scanner;

public class minMulty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int gcd=0;
			for(int j=1;j<=Math.min(n1, n2);j++) {
				if(n1%j==0&&n2%j==0)gcd=j;
				
			}
			
			System.out.println(n1*n2/gcd);



		}
	}

}
