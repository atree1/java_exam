import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

/*문제
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

알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라
 정렬하는 프로그램을 작성하시오.
1.길이가 짧은 것부터
2.길이가 같으면 사전 순으로

입력


첫째 줄에 단어의 개수 N이 주어진다. 
(1≤N≤20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 
이루어진 단어가 한 줄에 하나씩 주어진다.
 주어지는 문자열의 길이는 50을 넘지 않는다.
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
