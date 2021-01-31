package d1;

public class String_Buffer_Builder {
	public static void main(String[] args) {
		
		//스트링 버퍼는 동기화를 실행
		//스트링빌더는 동기화를 하지않음 멀티스레드를 사용하지 않으면 둘의 차이가 별로없음 쓸경우 스트링빌더가 더 성능이 좋음
		//사용방법은 같음 
		StringBuffer sb = new StringBuffer(500);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append("123456789");
		System.out.println(sb);
		
		sb.delete(2,4);
		System.out.println(sb);
		
		sb.replace(0, 1, "7");
		System.out.println(sb);
		
		sb.insert(4, "A");
		System.out.println(sb);
		
		
		String a = sb.substring(4,7);
		System.out.println(a);
		
	}
}
