import java.util.Scanner;

/*�ټ��̴� �������� ������ ���� �̻�Դ�. 
 * �ټ��̴� �ڱ� �� ��ȣ�� ���� �ö�ƽ ���ڷ� ���� ���̷��� �Ѵ�.
�ټ����� ���������� �ö�ƽ ���ڸ� �� ��Ʈ�� �Ǵ�.
 �� ��Ʈ���� 0������ 9������ ���ڰ� �ϳ��� ����ִ�. 
 �ټ����� �� ��ȣ�� �־����� ��, 
 �ʿ��� ��Ʈ�� ������ �ּҰ��� ����Ͻÿ�. 
 (6�� 9�� ����� �̿��� �� �ְ�, 9�� 6�� ����� �̿��� �� �ִ�.)
*/
public class room_number {

	public static void main(String[] args) {
        
		int[] p_num=new int[10];
		Scanner sc=new Scanner(System.in);
		String dnum=sc.next();
		int max=0;
		for(int i=0;i<dnum.length();i++)
		{
			int num=dnum.charAt(i)-'0';
			
					p_num[num]++;
		}
		   int k=(p_num[6]+p_num[9])/2+(p_num[6]+p_num[9])%2;
		   p_num[6]=k;
		   p_num[9]=k;
	        for(int i=0;i<p_num.length;i++)
	        {
	        	max=Math.max(p_num[i], max);
	        	
	        }
	        System.out.println(max);
	}
}
