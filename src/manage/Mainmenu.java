package manage;
import java.util.*;
import java.util.Scanner;

public class Mainmenu {
	/*
	@brief �޴�����
	@detail �޴������� ���� �ʿ��� �޼ҵ� ȣ��
	@author ������
	@date 21.06.10
	@version 1.0.1
	*/
	static int top, bottom , shoes  = 0;
	static int num;
	
	public void mainmenu()
	{
	Scanner scan = new Scanner(System.in);
	submenu Sub = new submenu();
	System.out.print("������ ��ǰ�� ������ �������ּ���\n");
	System.out.print("1.���� 2.���� 3.�Ź� : ");
	
	num = scan.nextInt();
	
	switch(num)
	{
		case 1 : 
			Sub.Submenu();
			break;
			
		case 2 :
			Sub.Submenu();
			break;
			
		case 3 :
			Sub.Submenu();
			break;	
		
	}
}
}
