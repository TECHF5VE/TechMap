package library;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Booklist {
	Scanner scanner= new Scanner(System.in);
	private List booklist=new ArrayList();
	private int booknum=0;
	public void mulu(){

		System.out.println("���ͼ��������1");
		System.out.println("ɾ��ͼ��������2");
		System.out.println("�޸�ͼ����Ϣ������3");
		System.out.println("����ͼ��������4");
		System.out.println("�鿴����ͼ����Ϣ������5");
		System.out.println("�˳�ϵͳ������6");
		
		}
	
	public void addbook() {
		
		System.out.println("��ֱ��������ͼ���������id:");
		String name=scanner.next();
		String id=scanner.next();
		Book book=new Book(name,id);
		 booklist.add(book);
		 booknum++;
		 System.out.println("��ӳɹ�");
	}
	public void delbook() {
		showbook();
		System.out.println("��������ɾ��ͼ������");
		int num=scanner.nextInt();
		booklist.remove(num-1);
		booknum--;
		System.out.println("ɾ���ɹ�");
	}
	public void altbook() {
		showbook();
		System.out.println("���������޸�ͼ������");
		int num=scanner.nextInt();
		System.out.println("�������޸ĺ������");
		String name=scanner.next();
		Book book=(Book)booklist.get(num-1);
		book.setName(name);
		System.out.println("�޸ĳɹ�");
		showbook();
	}
	public void chebook() {
		System.out.println("�����������ͼ�������");
		String name=scanner.next();
		for (int i = 0; i < booknum; i++) {
			Book book=(Book)booklist.get(i);
			if(book.getName().equals(name)) {
				System.out.println("����ҵ���Ϊ����"+(i+1)+"���� ����:"+book.getName()+" id:"+book.getId()+" δ���");
				break;
			}else {
				System.out.println("���޴���");}
			
		}
		
	}
	public void showbook() {
		if(booknum==0) {
			System.out.println("ͼ���Ϊ��");
			}else {
	for(int i=0;i<booknum;i++)
	{
		Book book=(Book)booklist.get(i);
		System.out.println("��"+(i+1)+"���� ����:"+book.getName()+" id:"+book.getId()+" δ���");
	}
			}
	}
	
	

}
