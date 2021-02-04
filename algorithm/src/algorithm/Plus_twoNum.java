package algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Plus_twoNum {

	public static void main(String[] args) {
//		int [] nums = {2,1,3,4,1};
		int [] nums = {5,0,2,7};
		
		System.out.println(Arrays.toString(Solution(nums)));
		
	}
	
	
	
	public static int[] Solution(int [] nums) {
		int [] answer;
		//중복이 안되도록 hashSet 선언 
		Set<Integer> a = new HashSet<>();
		
		//2중for문을 돌아서 더함
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				a.add(nums[i]+nums[j]);
			}
		}
		
		//set 을 Integer배열에 담기
//		Integer[] temp = new Integer[a.size()]; 	
//		a.toArray(temp);
		//임시배열인 integer배열을 int 배열인 answer에 담기
//		answer = Arrays.stream(temp).mapToInt(i->i).toArray();
		answer = a.stream().mapToInt(i->i).toArray();
		//   a.stream().sorted().mapToInt().toArray();
		// HashSet 대신 TreeSet으로 생성하면 중복제거 및 정렬됨
		Arrays.sort(answer);
		return answer;
	}
	
	
	
	public static int[] Solution2(int [] nums) {
		//중복이 안되도록 hashSet 선언 
		Set<Integer> a = new HashSet<>();
		
		//2중for문을 돌아서 더함
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				a.add(nums[i]+nums[j]);
			}
		}
		//set의 사이즈만큼 배열 선언
		int [] answer= new int[a.size()];
		
		int cnt=0;
		//foreach문을 돌면서 answer에 넣어주기
		for (int i : a) {
			answer[cnt++]=i;
		}
		Arrays.sort(answer);
		return answer;
	}
}
