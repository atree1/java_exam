/*
����

�Ѽ��� ���� (x, y)�� �ִ�. ���簢���� ���� �Ʒ� �������� (0, 0)�� �ְ�,
 ������ �� �������� (w, h)�� �ִ�. ���簢���� ��輱���� ���� �Ÿ��� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� x y w h�� �־�����. w�� h�� 1,000���� �۰ų� ���� �ڿ����̰�, 
x�� 1���� ũ�ų� ����, w-1���� �۰ų� ���� �ڿ����̰�, y�� 1���� ũ�ų� ����,
 h-1���� �۰ų� ���� �ڿ����̴�.

���
ù° �ٿ� ������ ������ ����Ѵ�.

���� �Է� 1 ���� 
 6 2 10 3*/
import java.util.Scanner;

public class distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] score=new int[4];
		int min;
		for(int i=0;i<4;i++) {
			score[i]=sc.nextInt();
		}
		min=Math.min(score[2]-score[0],score[3]-score[1]);
		min=Math.min(min,Math.min(score[0],score[1]));
		System.out.println(min);
	      
	}

}
