package Two.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * Junit 4
 * 
 * 		Junit4ͨ��ע��ķ�ʽ��ʶ����Է���
 * 		
 * 		@Before	 �ڲ��Է�������֮ǰ����
 * 
 * 		@Test	���Է���
 * 
 * 		@After	�ڲ��Է�������֮������
 * 
 */
public class Demo {

	
	
	@Test
	public void testTest(){
		System.out.println("��Ӳ���");
	}
	
	@After
	public void testAfter(){
		System.out.println("�ύ����");
	}
	@Before
	public void testBefore(){
		System.out.println("��������");
	}
	
}
