/*

����
 

�׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�.
 ���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, 
 kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������, aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.

�ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �ܾ��� ���� N�� ���´�. N�� 100���� �۰ų� ���� �ڿ����̴�.
 ��°�ٺ��� N���� �ٿ� �ܾ ���´�. �ܾ�� ���ĺ� �ҹ��ڷθ� �Ǿ��ְ� �ߺ����� ������, ���̴� �ִ� 100�̴�.


���
ù° �ٿ� �׷� �ܾ��� ������ ����Ѵ�.

���� �Է� 1 ���� 
 3
happy
new
year
*/
import java.util.Scanner;

public class groupCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
		int count = num;
		int[] alpa = new int[26];
		for (int k = 0; k < num; k++) {
			for (int j = 0; j < alpa.length; j++) {
				alpa[j] = 0;
			}

			String s = sc.next();
			alpa[s.charAt(0) - 'a'] = 1;
			for (int i = 1; i < s.length(); i++) {
				 
				if (s.charAt(i) != s.charAt(i - 1)) {
					if (alpa[s.charAt(i) - 'a'] == 0) { // ���繮���� �׷�ܾ� ����üũ. ó���� ���
						alpa[s.charAt(i) - 'a'] = 1;
					} else {
						
						count--;
						break;
					}

				}

			}

		}
		 System.out.println(count);
	}	
	
}
