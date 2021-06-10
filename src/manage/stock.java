package manage;
import java.util.*;
import java.util.Scanner;

public class stock {
	
	/*
	@brief 재고 파악
	@detail 현재 상품의 재고파악을 위한 클래스
	@author 최명규
	@date 21.06.10
	@version 1.0.1
	*/
	
	public void Stock() {
		Mainmenu m = new Mainmenu();
		
	switch(m.num)
	{
		case 1 :
			System.out.print("남은 수량의 개수는" + m.top + "입니다.\n");
			if(m.top < 10)
			{
				System.out.print("상의 발주가 필요합니다!!");
				
			}
			m.mainmenu();
			break;
			
		case 2 :
			System.out.print("남은 수량의 개수는" + m.bottom + "입니다.\n");
			if(m.bottom < 10)
			{
				System.out.print("하의 발주가 필요합니다!!");
				
			}
			m.mainmenu();
			break;
			
		case 3 :
			System.out.print("남은 수량의 개수는" + m.shoes + "입니다.\n");
			if(m.shoes < 10)
			{
				System.out.print("신발 발주가 필요합니다!!");
				
			}
			m.mainmenu();
			break;
		
		
	}
 }
}
