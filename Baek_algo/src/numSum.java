import java.util.Scanner;

/*

����
 N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
 ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.

���
 �Է����� �־��� ���� N���� ���� ����Ѵ�.

���� �Է� 1 ���� 
 1
1

���� ��� 1 ���� 
 1
���� �Է� 2 ���� 
 5
54321

���� ��� 2 ���� 
 15
*/
public class numSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String[] s=new String[num];
		String n=sc.next();
		int sum=0;
		for(int i=0;i<num;i++) {
			s[i]=n.charAt(i)+"";
			sum+=Integer.parseInt(s[i]);
		}
		System.out.println(sum);
	}

}
