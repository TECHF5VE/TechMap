package library;

import java.util.Scanner;

public class pingtai {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		User user1=new User();
		if(user1.login())
		{
			System.out.println("��ӭ����ͼ�����ϵͳ������ϲ����Ϊ����ϵͳ������Ψһ���û�����");
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
				System.out.println("�˳��ɹ����´�����Ŷ");
				break;
             default:
            	 System.out.println("�������Ұ�Ŷ������ԭ�����ˣ��ٸ���һ�λ���ɡ�");
				continue;
			}
			}
			
		}
		else {
			System.out.println("��֤ʧ�ܣ����ܽ���ϵͳ");
			}
		
	}

}
