package kr.co.aoptest.part1;

public aspect Advice {
	pointcut callsay() : call(* GilDong.say(..));
	
	before() : callsay() {
		System.out.println("æ»≥Á«œººø‰!");
		
	}
}//aspect end
