
/*
����
� ���� ���� X�� �ڸ����� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 

�Է�
 
ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.

���
 

ù° �ٿ� 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.

���� �Է� 1 ���� 
 110
���� ��� 1 ���� 
 99
*/
import java.util.Scanner;

public class hansu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
            int hansu=0;
            
            if(num<100)hansu=num;
            else {
            	hansu+=99;
            	
            	for(int i=100;i<=num;i++) {
            		int h=i%100;
            		int t=h/10;
            		int o=h%10;
            		if(i/100-t==t-o)hansu++;
            		
            	}
            }
            System.out.println(hansu);
            
			
	}

}
