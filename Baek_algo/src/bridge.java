
/*
����
����̴� �� ������ ������ �Ǿ���. �� ���ÿ��� ���ø� ���ʰ� �������� ������ ū ���� �帣�� �ִ�. 
������ ����̴� �ٸ��� ��� �ùε��� ���� �ǳʴµ� ū ������ �ް� ������ �˰� �ٸ��� ����� ����Ͽ���.
�� �ֺ����� �ٸ��� ���⿡ ������ ���� ����Ʈ��� �Ѵ�. ����̴� �� �ֺ��� ����� ������ �� ��� ���� ���ʿ��� N���� ����Ʈ�� �ְ� ���ʿ��� M���� ����Ʈ�� �ִٴ� ���� �˾Ҵ�. (N �� M)
����̴� ������ ����Ʈ�� ������ ����Ʈ�� �ٸ��� �����Ϸ��� �Ѵ�. 
(�̶� �� ����Ʈ���� �ִ� �� ���� �ٸ��� ����� �� �ִ�.) ����̴� �ٸ��� �ִ��� ���� �������� �ϱ� 
������ ������ ����Ʈ ������ŭ (N��) �ٸ��� �������� �Ѵ�.
 �ٸ������� ���� ������ �� ���ٰ� �� �� �ٸ��� ���� �� �ִ� ����� ���� ���ϴ� ���α׷��� �ۼ��϶�.
 
�Է�
 
�Է��� ù �ٿ��� �׽�Ʈ ���̽��� ���� T�� �־�����. 
�� ���� �ٺ��� ������ �׽�Ʈ���̽��� ���� ���� ���ʰ� ���ʿ� �ִ� ����Ʈ�� ���� ���� N, M (0 < N �� M < 30)�� �־�����.

���
�� �׽�Ʈ ���̽��� ���� �־��� �����Ͽ� �ٸ��� ���� �� �ִ� ����� ���� ����Ѵ�.
���� �Է� 1 ���� 
 3
2 2
1 5
13 29

���� ��� 1 ���� 
 1
5
67863915

*/
 import java.util.Scanner;

public class bridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[][] arr=new int[31][31];
		

		for(int i=1;i<31;i++) {
			arr[1][i]=i;
		}
		for(int i=2;i<31;i++) {
			arr[i][i]=1;
			for(int j=i+1;j<=30;j++) {//M
				arr[i][j]=arr[i][j-1]+arr[i-1][j-1];
			}

		}
		for(int i=0;i<num;i++) {
	            int n=sc.nextInt();
	            int n2=sc.nextInt();
	            System.out.println(arr[n][n2]);
	
		}
	}
}