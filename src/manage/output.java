package manage;

import java.util.*;
import java.util.Scanner;

public class output {
	
	/*
	@brief 상품 출고
	@detail 상품 개수를 출고하기 위한 클래스
	@author 김용희
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
		System.out.print("출고할 상품의 개수 입력");
		num = scan.nextInt();
		m.top -= num;
		System.out.print("현재 상의의 개수는 " + m.top + "입니다\n");
		m.mainmenu();
		break;
		
	case 2 :
		System.out.print("출고할 상품의 개수 입력");
		num = scan.nextInt();
		m.bottom -=num;
		System.out.print("현재 하의의 개수는 " + m.bottom + "입니다\n");
		m.mainmenu();
		break;
		
	case 3 :
		System.out.print("출고할 상품의 개수 입력");
		num = scan.nextInt();
		m.shoes -= num;
		System.out.print("현재 신발의 개수는 " + m.shoes + "입니다\n");
		m.mainmenu();
		break;
	
	
	}
}
}
