/*

문제
 

그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
 kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다.
 둘째줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.


출력
첫째 줄에 그룹 단어의 개수를 출력한다.

예제 입력 1 복사 
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
					if (alpa[s.charAt(i) - 'a'] == 0) { // 현재문자의 그룹단어 여부체크. 처음인 경우
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
