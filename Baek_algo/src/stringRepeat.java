
/*
����
���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� T�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�ٽ� �������ڸ�, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ T�� ����� �ȴ�. 
S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ$%*+-./: �̴�.


�Է� 
ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 <= T <= 1,000)�� �־�����. 
�� �׽�Ʈ ���̽���  �ݺ� Ƚ�� R(1 <= R <= 8), ���ڿ� S�� �������� ���еǾ� �־�����. 
S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�. 

���
�� �׽�Ʈ ���̽��� ���� T�� ����Ѵ�.

���� �Է� 1 ���� 
 2
3 ABC
5 /HTP

���� ��� 1 ���� 
 AAABBBCCC
/////HHHHHTTTTTPPPPP

*/
import java.util.Scanner;

public class stringRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			int repeat=sc.nextInt();
			String s=sc.next();
		    String t="";
			
			for(int j=0;j<s.length();j++) {
			
				for(int k=0;k<repeat;k++) {
				t+=s.charAt(j);
				}
			}
			
			System.out.println(t);
		}
	}

}
