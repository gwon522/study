package programmers_LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac_test {

	public static void main(String[] args) {
		//[1,2,3,4,5]
		int [] answers= {1,3,2,4,2};
		
		int[] result = solution(answers);
		System.out.println(Arrays.toString(result));
	}
	
	
	 public static int[] solution(int[] answers) {
	        List<Integer> temp = new ArrayList<>();
	        // 학생별 찍는 방법 
	        int [] stu1 = {1,2,3,4,5};
	        int [] stu2 = {2,1,2,3,2,4,2,5};
	        int [] stu3 = {3,3,1,1,2,2,4,4,5,5};
	        
	        //학생들 정답 카운트할 배열 하나 선언 
	        int [] cnt = new int[3];
	        
	        //문제를 돌면서 정답 카운트
	        for(int i= 0; i<answers.length;i++){
	            if(answers[i]==stu1[i%stu1.length])
	               cnt[0]++;
	            if(answers[i]==stu2[i%stu2.length])
	                cnt[1]++;
	            if(answers[i]==stu3[i%stu3.length])
	                cnt[2]++;
	        }
	        //학생들의 정답 갯수중 제일 큰값 
	        int max = Math.max(Math.max(cnt[0],cnt[1]),cnt[2]);
	        
	        //큰값에 해당하는 값을 list에 넣어줌
	        for(int i = 0; i<cnt.length; i++)
	            if(cnt[i]==max)
	                temp.add(i);
	        
	        int[] answer = new int[temp.size()];
	        //리스트에서 배열로 값 넘겨줌
	        for(int i = 0; i<answer.length; i++)
	            answer[i]=temp.get(i)+1;
	        return answer;
	    }
}
