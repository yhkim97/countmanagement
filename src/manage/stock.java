package manage;
import java.util.*;
import java.util.Scanner;

public class stock {
	
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
