/*
����
�ѱ� ü����ȸ������ ������ ������ ���� ���Ͽ� ���� ���� �ý����� ��ġ��� �Ͽ���.
 �������� 5���� ������ 1������ 10������ ������ ������ �ָ� �ְ����� �������� �ϳ��� ������ ������ ���� �������� �Ͽ���. 
 �̸� �����ϱ� ���ؼ� �ְ����� �������� �� ������ 3�� ������ �ְ����� �������� ���̰�
  4�� �̻� ���� �Ǹ� ���� ������ ���ļ� �ٽ� ������ �ű���� �Ѵ�.
   ������ �����Ͽ� ������ ����ϰų�, ���� ������ ���ļ� �ٽ� ������ �ű���� �ϴ� ��쿡�� ���� ���
   KIN(Keep In Negotiation)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�

�Է��� ù �ٿ��� �׽�Ʈ ���̽��� ���� T(1 �� T �� 10)�� �־�����. 
�� �׽�Ʈ ���̽��� �� �ٿ� �ټ� ������ �� ���� �ټ� ���� ���� Ni(1 �� Ni �� 10, i = 1, 2, ..., 5)��
 �ϳ��� ������ ���̿� �ΰ� �־�����.

���

�� �׽�Ʈ ���̽��� ���ؼ� ������ �� �پ� ����Ѵ�. ���� ���� ������ ���ļ� �ٽ� ������ �ű���� �ϴ� ��쿡��
 ���� ��� KIN�� ����Ѵ�.

���� �Է� 1 ���� 
 4
10 8 5 7 9
10 9 10 9 5
10 3 5 9 10
1 2 3 6 9

���� ��� 1 ���� 
 24
28
KIN
KIN
*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[][] score=new int[num][5];
		String[] s=new String[num];
		for(int i=0;i<num;i++) {
			for(int j=0;j<5;j++) {
				score[i][j]=sc.nextInt();
				}
		}
		for(int i=0;i<num;i++) {
		Arrays.sort(score[i]);}
		for(int i=0;i<num;i++) {
		    int sum=0;
			for(int j=1;j<4;j++) {
				if(score[i][3]-score[i][1]>=4) {
					s[i]="KIN";
					break;
				}
				else {
					sum+=score[i][j];
					s[i]=sum+"";
				}
			}
		}
		for(int i=0;i<num;i++) {
			System.out.println(s[i]);
		}
	}

}
