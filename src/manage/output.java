package manage;

import java.util.*;
import java.util.Scanner;

public class output {
	
	/*
	@brief ��ǰ ���
	@detail ��ǰ ������ ����ϱ� ���� Ŭ����
	@author �����
	@date 21.06.10
	@version 1.0.1
	*/
	
	public void Output() {

		Mainmenu m = new Mainmenu();
	Scanner scan = new Scanner(System.in);
	
	int num = 0;
	
	switch(m.num)
	{
	case 1 :
		System.out.print("����� ��ǰ�� ���� �Է�");
		num = scan.nextInt();
		m.top -= num;
		System.out.print("���� ������ ������ " + m.top + "�Դϴ�\n");
		m.mainmenu();
		break;
		
	case 2 :
		System.out.print("����� ��ǰ�� ���� �Է�");
		num = scan.nextInt();
		m.bottom -=num;
		System.out.print("���� ������ ������ " + m.bottom + "�Դϴ�\n");
		m.mainmenu();
		break;
		
	case 3 :
		System.out.print("����� ��ǰ�� ���� �Է�");
		num = scan.nextInt();
		m.shoes -= num;
		System.out.print("���� �Ź��� ������ " + m.shoes + "�Դϴ�\n");
		m.mainmenu();
		break;
	
	
	}
}
}
