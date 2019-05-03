package library;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Booklist {
	Scanner scanner= new Scanner(System.in);
	private List booklist=new ArrayList();
	private int booknum=0;
	public void mulu(){

		System.out.println("添加图书请输入1");
		System.out.println("删除图书请输入2");
		System.out.println("修改图书信息请输入3");
		System.out.println("查找图书请输入4");
		System.out.println("查看所有图书信息请输入5");
		System.out.println("退出系统请输入6");
		
		}
	
	public void addbook() {
		
		System.out.println("请分别输入加入图书的书名和id:");
		String name=scanner.next();
		String id=scanner.next();
		Book book=new Book(name,id);
		 booklist.add(book);
		 booknum++;
		 System.out.println("添加成功");
	}
	public void delbook() {
		showbook();
		System.out.println("请输入想删除图书的序号");
		int num=scanner.nextInt();
		booklist.remove(num-1);
		booknum--;
		System.out.println("删除成功");
	}
	public void altbook() {
		showbook();
		System.out.println("请输入想修改图书的序号");
		int num=scanner.nextInt();
		System.out.println("请输入修改后的书名");
		String name=scanner.next();
		Book book=(Book)booklist.get(num-1);
		book.setName(name);
		System.out.println("修改成功");
		showbook();
	}
	public void chebook() {
		System.out.println("请输入想查找图书的书名");
		String name=scanner.next();
		for (int i = 0; i < booknum; i++) {
			Book book=(Book)booklist.get(i);
			if(book.getName().equals(name)) {
				System.out.println("你查找的书为：第"+(i+1)+"本书 书名:"+book.getName()+" id:"+book.getId()+" 未借出");
				break;
			}else {
				System.out.println("查无此书");}
			
		}
		
	}
	public void showbook() {
		if(booknum==0) {
			System.out.println("图书库为空");
			}else {
	for(int i=0;i<booknum;i++)
	{
		Book book=(Book)booklist.get(i);
		System.out.println("第"+(i+1)+"本书 书名:"+book.getName()+" id:"+book.getId()+" 未借出");
	}
			}
	}
	
	

}
