import java.util.Scanner;

public class TongJang extends Customer
{

	private static String temp;


	public void gaeseol()
	{
		try
		{
			System.out.println("\n ======= ���°������� �Դϴ٢� =======");
			System.out.printf("\n�������� �ڵ��� ��ȣ %s �� ���¹�ȣ�� ����ðھ��?(Y/N) : ", super.getPhone());
			super.selectC = (char)System.in.read();
			System.in.skip(2);

			if (super.selectC != 'Y' && super.selectC != 'y')
			{
				System.out.println("\n�����¸� �����Ͻ� �� �����..�Ф�");
				return;
			}
			super.setTongname(super.getPhone());
			System.out.println("\n���������� �ڵ��� ��ȣ ("+super.getTongname()+")�� ���¹�ȣ�� �����Ǿ����.^^\n");
			
			System.out.printf("�������� ���� �ܰ�� %,d�� �Դϴ�.\n", super.getTongjang());
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		
	}

	

	public void check()
	{
	  

	  Scanner sc = new Scanner (System.in);
	  do
	  {
		  System.out.print("���ݾ��� ��ȸ�Ͻ� ���¹�ȣ�� �Է� ���ּ��� : ");
		  temp = sc.next();

		  if (temp.equals(super.getPhone())==true)
		  {
			 System.out.printf("�������� ���� %s�� ����ִ� �ܾ��� %,d �� �Դϴ�\n",super.getPhone(), super.getTongjang());
		  }

	  
		 if (temp.equals(super.getPhone())==false)
		 {
			System.out.println("����ϵ� ���°� �����. �ٽ� �Է��� �ּ���");
			
		 }
	  }
	  while (temp.equals(super.getPhone())==false);
	  
	}
}