package manage;
import java.util.*;
import java.util.Scanner;

public class input {
	
	/*
	@brief 상품입고
	@detail 상품 갯수 추가를 위한 클래스
	@author 박서영
	@date 21.06.10
	@version 1.0.1
	*/
	
	public void Input() {
		Mainmenu m = new Mainmenu();
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
	switch(m.num)
	{
		case 1 :
			System.out.print("입고할 상품의 개수 입력");
			num = scan.nextInt();
			m.top += num;
			System.out.print("현재 상의의 개수는 " + m.top + "입니다\n");
			m.mainmenu();
			break;
			
		case 2 :
			System.out.print("입고할 상품의 개수 입력");
			num = scan.nextInt();
			m.bottom = m.bottom+num;
			System.out.print("현재 하의의 개수는 " + m.bottom + "입니다\n");
			m.mainmenu();
			break;
			
		case 3 :
			System.out.print("입고할 상품의 개수 입력");
			num = scan.nextInt();
			m.shoes = m.shoes+num;
			System.out.print("현재 신발의 개수는 " + m.shoes + "입니다\n");
			m.mainmenu();
			break;
		
		
	}
 }
}
