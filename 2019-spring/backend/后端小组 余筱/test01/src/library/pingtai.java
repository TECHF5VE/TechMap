package library;

import java.util.Scanner;

public class pingtai {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		User user1=new User();
		if(user1.login())
		{
			System.out.println("欢迎进入图书管理系统！！恭喜您成为我们系统的尊贵的唯一的用户！！");
			Booklist booklist=new Booklist();
			while(true)
			{
			booklist.mulu();
			int choose=scanner.nextInt();
			switch (choose) {
			case 1:
				booklist.addbook();
				continue;
			case 2:
				booklist.delbook();
				continue;
			case 3:
				booklist.altbook();
				continue;
			case 4:
				booklist.chebook();
				continue;
			case 5:
				booklist.showbook();
				continue;
			case 6:
				System.out.println("退出成功，下次再来哦");
				break;
             default:
            	 System.out.println("不可以乱按哦，唉，原谅你了，再给你一次机会吧。");
				continue;
			}
			}
			
		}
		else {
			System.out.println("验证失败，不能进入系统");
			}
		
	}

}
