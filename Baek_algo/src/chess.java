/*

����
ü������ 8*8ũ���̰�, ���� ĭ�� �Ͼ� ĭ�� �����ư��鼭 ��ĥ�Ǿ� �ִ�.
 ���� ���� ��ĭ (0,0)�� �Ͼ���̴�. ü������ ���°� �־����� ��, 
 �Ͼ� ĭ ���� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
  8���� �ٿ� ü������ ���°� �־�����. ��.���� �� ĭ�̰�, ��F���� ���� ���� �ִ� ĭ�̴�.

���
ù° �ٿ� ������ ������ ����Ѵ�.

���� �Է� 1 ���� 
 .F.F...F
F...F.F.
...F.F.F
F.F...F.
.F...F..
F...F.F.
.F.F.F.F
..FF..F.
*/
import java.util.Scanner;

public class chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int count=0;
		String[] s= new String[8];
		for(int i=0;i<8;i++) {
			s[i]=sc.next();
		}
		for(int i=0;i<8;i++) {
			for(int j = i % 2; j < 8; j += 2) {
				if(s[i].charAt(j)=='F') count++;
			}
			
		}
		System.out.println(count);
	}

}
