
/*
����
���� N���� �̷���� ���� A�� ���� X�� �־�����. �� ��, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է� 

ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.
���
 
X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.

���� �Է� 1 ���� 
 10 5
1 10 4 9 2 3 8 5 7 6

���� ��� 1 ���� 
 1 4 2 3
*/
import java.util.Scanner;

public class xUnder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int num=sc.nextInt();
		int[] a=new int[size];
		String s="";
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
			if(a[i]<num) {
				s+=a[i]+" ";
			}
		}
		System.out.println(s);
	}

}
