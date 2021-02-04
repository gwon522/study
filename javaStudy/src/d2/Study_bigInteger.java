package d2;

import java.math.BigInteger;

public class Study_bigInteger {
	public static void main(String[] args) {
		BigInteger bi = new BigInteger("12345678901234567890");
		
		//String
		System.out.println(bi.toString());
		
		//진수
		System.out.println(bi.toString(2)); //2진수 
		System.out.println(bi.toString(8)); //8진수 
		System.out.println(bi.toString(10)); //10진수 
		System.out.println(bi.toString(16));//16진수
		
		int a = bi.intValue();
		long b = bi.longValue();
		double c= bi.doubleValue();
		float d = bi.floatValue();
		System.out.printf("%d\n%d\n%f\n%f\n",a,b,c,d);
		
		BigInteger bi2 = new BigInteger("123456123123");
		
		
		System.out.println(bi+"+"+ bi2+"="+bi.add(bi2)); //덧셈
		System.out.println(bi+"/"+ bi2+"="+bi.divide(bi2)); //나눗셈 
		System.out.println(bi+"%"+ bi2+"="+bi.remainder(bi2)); //나머지
		System.out.println(bi+"*"+ bi2+"="+bi.multiply(bi2)); //곱셈  
		System.out.println(bi+"-"+ bi2+"="+bi.subtract(bi2)); // 뺄셈 
		
		
		
		
	}
}
