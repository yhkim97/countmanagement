package manage;
import java.util.*;
import java.util.Scanner;

public class submenu {
	
	/*
	@brief ����޴� ����
	@detail ���, �԰�, ��� �����ϱ� ���� Ŭ����
	@author �ָ��
	@date 21.06.10
	@version 1.0.1
	*/
	
	public void Submenu() {
	
	Mainmenu me = new Mainmenu();
	main m = new main();	
	stock st = new stock();
	input in = new input();
	output ou = new output();
	
	Scanner scan = new Scanner(System.in);
	int num = 0;
	
	
	
	System.out.print("������ �޴��� �������ּ���\n");
	System.out.print("1.��� 2.�԰� 3.��� 4.���ư���: ");
	
	
	num = scan.nextInt();
	
	switch(num)
	{
		case 1 :
			st.Stock();
			break;
			
		case 2 :
			in.Input();
			break;
			
		case 3 :
			ou.Output();
			break;
		
		case 4 :
			me.mainmenu();
			break;
			
	
	
	}
}
}
