package manage;
import java.util.*;
import java.util.Scanner;

public class stock {
	
	public void Stock() {
		Mainmenu m = new Mainmenu();
		
	switch(m.num)
	{
		case 1 :
			System.out.print("���� ������ ������" + m.top + "�Դϴ�.\n");
			if(m.top < 10)
			{
				System.out.print("���� ���ְ� �ʿ��մϴ�!!");
				
			}
			m.mainmenu();
			break;
			
		case 2 :
			System.out.print("���� ������ ������" + m.bottom + "�Դϴ�.\n");
			if(m.bottom < 10)
			{
				System.out.print("���� ���ְ� �ʿ��մϴ�!!");
				
			}
			m.mainmenu();
			break;
			
		case 3 :
			System.out.print("���� ������ ������" + m.shoes + "�Դϴ�.\n");
			if(m.shoes < 10)
			{
				System.out.print("�Ź� ���ְ� �ʿ��մϴ�!!");
				
			}
			m.mainmenu();
			break;
		
		
	}
 }
}
