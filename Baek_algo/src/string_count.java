import java.util.Scanner;

/*
����
���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.
�� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
 ù° �ٿ� �ܾ �־�����. 
 �ܾ�� ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ������,
  ���̴� 100�� ���� �ʴ´�.
   ���̰� 0�� �ܾ�� �־����� �ʴ´�.

���
�Է����� �־��� �ܾ �� ���� ��� �� �ٿ� �ϳ��� ����Ѵ�.
 �ܾ��� ���̰� 10�� ����� �ƴ� ��쿡�� ������ �ٿ���
  10�� �̸��� ���ڸ� ����� ���� �ִ�.
  
���� �Է� 1  
 BaekjoonOnlineJudge
*/

public class string_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
         for(int i=0;i<s.length();i++) {
             System.out.print(s.charAt(i));
             if(i%10==9)
            	 System.out.println();
             
         }
		
	}

}
