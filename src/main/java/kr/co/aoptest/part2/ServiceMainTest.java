package kr.co.aoptest.part2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ServiceMainTest {

	public static void main(String[] args) {
		// ���������� �̿��� AOP
		String aop ="src/main/java/kr/co/aoptest/part2/aop.xml";
		ApplicationContext context = new FileSystemXmlApplicationContext(aop);
		
		//1) POJO����� ��ü ����
		//Service svc = new ServiceImp();
		
		//2) �������� ����� ��ü ����
		Service svc = (Service) context.getBean("svc");
		
		svc.first();
		svc.first("KOREA");
		
		svc.second();
		
	}//main end
}//class end
