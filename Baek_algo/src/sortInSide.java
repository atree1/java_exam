/*

����
�迭�� �����ϴ� ���� ����. ���� �־�����, �� ���� �� �ڸ����� ������������ �����غ���.

�Է�
ù° �ٿ� �����ϰ����ϴ� �� N�� �־�����. N�� 1,000,000,000���� �۰ų� ���� �ڿ����̴�.

���
 
ù° �ٿ� �ڸ����� ������������ ������ ���� ����Ѵ�.

�Է� 1 ���� 
 2143

���� ��� 1 ���� 
 4321
*/
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class sortInSide {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		String[] number=new String[num.length()];
		for(int i=0;i<num.length();i++) {
			number[i]=num.charAt(i)+"";
		}
		Arrays.sort(number);
		
		for(int i=number.length-1;i>=0;i--) {
			System.out.print(number[i]);
		}
		}
	
}
