package kr.co.aoptest.part1;

public class GilDong {

	void say() {
		System.out.println("���� ȫ�浿 �Դϴ�.");
	}
	
	public static void main(String[] args) {
		// AOP ����
		
		new GilDong().say();
		
	}//main end

}//class end
