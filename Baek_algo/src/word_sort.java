import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

/*����
 13
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours 

���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ����
 �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
1.���̰� ª�� �ͺ���
2.���̰� ������ ���� ������

�Է�


ù° �ٿ� �ܾ��� ���� N�� �־�����. 
(1��N��20,000) ��° �ٺ��� N���� �ٿ� ���� ���ĺ� �ҹ��ڷ� 
�̷���� �ܾ �� �ٿ� �ϳ��� �־�����.
 �־����� ���ڿ��� ���̴� 50�� ���� �ʴ´�.
*/


public class word_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
 
		HashSet hs=new HashSet();
		for(int i=0;i<size;i++) {
		hs.add(sc.next());
		}
		size=hs.size();
        String[] arr=new String[size];
		hs.toArray(arr);
		Arrays.sort(arr);
		 Arrays.sort(arr, new Comparator<String>() {

	            @Override
	            public int compare(String o1, String o2) {

	                return o1.length() - o2.length();
	            }
	            
	        });


		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
