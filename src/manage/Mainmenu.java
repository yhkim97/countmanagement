package manage;
import java.util.*;
import java.util.Scanner;

public class Mainmenu {
	static int top, bottom , shoes  = 0;
	static int num;
	
	public void mainmenu()
	{
	Scanner scan = new Scanner(System.in);
	submenu Sub = new submenu();
	System.out.print("관리할 상품의 종류를 선택해주세요\n");
	System.out.print("1.상의 2.하의 3.신발 : ");
	
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
