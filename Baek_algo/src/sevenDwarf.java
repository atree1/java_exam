/*

���� 

�պ� ���� �ϰ� �����̵�� �Բ� ��ȭ�Ӱ� ��Ȱ�ϰ� �ִ� �鼳���ֿ��� ���Ⱑ ã�ƿԴ�. 
�ϰ��� ��ġ�� ���ƿ� �����̰� �ϰ� ���� �ƴ� ��ȩ ���̾��� ���̴�.
��ȩ ���� �����̴� ��� �ڽ��� "�鼳 ���ֿ� �ϰ� ������"�� ���ΰ��̶�� �����ߴ�.
 �پ ������ �������� ������ �ִ� �鼳���ִ�, ���ེ���Ե� �ϰ� �������� Ű�� ���� 100�� ���� ����� �´�.
��ȩ �������� Ű�� �־����� ��, �鼳���ָ� ���� �ϰ� �����̸� ã�� ���α׷��� �ۼ��Ͻÿ�.

�Է�

��ȩ ���� �ٿ� ���� �ϰ� �������� Ű�� �־�����. 
�־����� Ű�� 100�� ���� �ʴ� �ڿ����̸�, ��ȩ �������� Ű�� ��� �ٸ���, 
������ ������ ���������� ��쿡�� �ƹ��ų� ����Ѵ�.

���

�ϰ� �������� Ű�� ������������ ����Ѵ�.
���� �Է� 1 ���� 
 20
7
23
19
10
15
25
8
13

���� ��� 1 ���� 
 7
8
10
13
19
20
23

*/

import java.util.Arrays;
import java.util.Scanner;

public class sevenDwarf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int[] dwarf=new int[9];
			int[] fake=new int[2];
			int sum=0;
			for(int i=0;i<9;i++)
			{
			dwarf[i]=sc.nextInt();
			sum+=dwarf[i];
			}
			sum-=100;
			Arrays.sort(dwarf);
			
			for(int i=0;i<8;i++) {
				for(int j=i+1;j<9;j++) {
					if(dwarf[i]+dwarf[j]==sum) {
						fake[0]=i;fake[1]=j;
					}
				}
			}
			for(int i=0;i<9;i++) {
				if(i!=fake[0]&&i!=fake[1]) {
			System.out.println(dwarf[i]);}
			}
			
	}
}
