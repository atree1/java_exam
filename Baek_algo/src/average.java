import java.util.Scanner;

/*

����
�����̴� �⸻���縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�.
 �ϴ� �����̴� �ڱ� ���� �߿� �ִ밪�� �����. �� ���� M�̶�� �Ѵ�. 
 �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� �� ������ ���� N�� �־�����. 
�� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����. 
�� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.

���
ù° �ٿ� ���ο� ����� ����Ѵ�. ������� ����/��� ������ 10-2���� ����Ѵ�.
*/
public class average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int max=0;
		int []score=new int[num];
		for(int i=0;i<num;i++) {
		  score[i]=sc.nextInt();
		
		  if(max<score[i]) max=score[i];
		}
		double sum=0;
		for(int i=0;i<num;i++) {		
			  sum+=((double)score[i]/max)*100;							
		}
		System.out.printf("%.2f",sum/num);
	}

}