
/*
����
���� ó���ϴ� ���� ����п��� ����� �߿��� ���̴�. ����п��� N���� ���� ��ǥ�ϴ� �⺻ ��谪���� ������ ���� �͵��� �ִ�.
 ��, N�� Ȧ����� ��������.
1.������ : N���� ������ ���� N���� ���� ��
2.�߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� ��ġ�ϴ� ��
3.�ֺ� : N���� ���� �� ���� ���� ��Ÿ���� ��
4.���� : N���� ���� �� �ִ밪�� �ּҰ��� ����

N���� ���� �־����� ��, �� ���� �⺻ ��谪�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
 
ù° �ٿ� ���� ���� N(1 �� N �� 500,000)�� �־�����. 
�� ���� N���� �ٿ��� �������� �־�����. �ԷµǴ� ������ ���밪�� 4,000�� ���� �ʴ´�.

���
 
ù° �ٿ��� �������� ����Ѵ�. �Ҽ��� ���� ù° �ڸ����� �ݿø��� ���� ����Ѵ�.
��° �ٿ��� �߾Ӱ��� ����Ѵ�.
��° �ٿ��� �ֺ��� ����Ѵ�. ���� �� ���� ������ �ֺ� �� �� ��°�� ���� ���� ����Ѵ�.
��° �ٿ��� ������ ����Ѵ�.

���� �Է� 1 ���� 
 5
1
3
8
-2
2
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] num=new int[n];
		int[] number=new int[8001];
		double average = 0;
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			average+=a;
			num[i]=a;
			if(a<0) {
				number[a*(-1)+4000]++;
			}else number[a]++;
		}
		int max= 0,ma=0;
		int count=1;
		for(int i=8000;i>4000;i--) {
			if(ma<number[i]) {
				ma=number[i];
				max=i;
				count=1;
				
			}else if(ma==number[i]) {
				if(count<2) {
					ma=number[i];	max=i; count++;}
				
			}
		 
	}
		for(int i=0;i<4001;i++) {
				if(ma<number[i]) {
					ma=number[i];
					max=i;
					count=1;
					
				}else if(ma==number[i]) {
					if(count<2) {
						ma=number[i]; max=i; count++;}
					
				}
			 
		}
		if(max>4000) {max=(max-4000)*(-1);}
		Arrays.sort(num);	
		average=Math.round(average/n);
		int m=num[num.length-1]-num[0];
		int middle=num[num.length/2];
		System.out.println((int)average);
		System.out.println(middle);
		System.out.println(max);	
		System.out.println(m);
		
	}

}
