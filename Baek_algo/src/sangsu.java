
/*

����
 
������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. 
�̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���. 
����̴� �� �ڸ� ���� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.

����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, 
����� �� ���� 437�� 398�� �д´�. ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.

�� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ����̰� ĥ�ǿ� ���� �� �� A�� B�� �־�����. 
�� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ���� �ʴ�.

���

ù° �ٿ� ����� ����� ����Ѵ�.
���� �Է� 1 ���� 
 734 893
*/
import java.util.Scanner;
public class sangsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextInt()+"";
		String num2= sc.nextInt()+"";
		
		String reberse_num1="";
		String reberse_num2="";
		for(int i=num1.length()-1;i>=0;i--)
		{
			reberse_num1+=num1.charAt(i);
		}
		for(int i=num2.length()-1;i>=0;i--)
		{
			reberse_num2+=num2.charAt(i);
		}
	
		
		System.out.println(reberse_num1.compareTo(reberse_num2)>0?reberse_num1:reberse_num2 );
	}

}
