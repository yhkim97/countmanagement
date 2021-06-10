package manage;
import java.util.*;
import java.util.Scanner;

public class submenu {
	
	/*
	@brief 서브메뉴 관리
	@detail 재고, 입고, 출고를 관리하기 위한 클래스
	@author 최명규
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
	
	
	
	System.out.print("관리할 메뉴를 선택해주세요\n");
	System.out.print("1.재고 2.입고 3.출고 4.돌아가기: ");
	
	
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
