import java.util.Scanner;

public class Account extends Customer
{
	private static long temp, temp1;				//-- (java.35) �� ���� �ӽ� ���� ���� ����
	private static String gejwa;			//-- (java.143) �޴� ���� ���¸� ���� ���� ����
	private static long account=0L;			//-- �� ���� �ӽ� ���� ���� ����
							
	//String st;
	//int money;
	//int Account1=100000000;
	//int Account2=0;
/*
	void inmoney (int amount)	// �Ա�
	{
		money += amount;
	}
	void outmoney (int amount)	// ���
	{
		money -=amount;
	}
*/
/*
	public String toString()
	{
	return "���� �ܾ��� " + money + "�Դϴ�";
	}
*/

	public String transfer(long amount, Account otherAccount)		//-- ������ü �� ��� �޼ҵ�
	{
		if(super.getTongjang() >= amount)								//-- �������� �ݾװ� ���� �ܰ� ��
		{
			
			temp1 = super.getTongjang() - amount;					//-- ���� �ܰ��� �ݾ��� ���� ���,
			otherAccount.account += amount;							//	 �� �ܰ��� �ݾ��� �� �� ����
			super.setTongjang(temp1);								//	 �� �ܰ� �ݾ� ����

			return "����ü�� �ݾ��� " + amount + " �Դϴ�";
		}
		else													//-- ���� �ܰ��� �ݾ��� Ŭ ���,
		{														//	 ���α׷� ���� �� �ȳ��� ���
			return "�ܾ��� �����մϴ٤Ф� ������ ��� ���� �� �־��ּ���. ^^/\n"; 
		}
	}// end trasfer()


	public void account()										//-- ������ü ���� �޼ҵ�
	{
		Scanner sc = new Scanner(System.in);

		//Account me = new BankAccount();
		Account you = new Account();							//-- ���� �ν��Ͻ� ����
		Customer me = new Account();							//-- �� �ν��Ͻ� ����
		JuminCompare jc = new JuminCompare();					//-- �ֹι�ȣ �� �ν��Ͻ� ����
		PassCompare pc = new PassCompare();						//-- ��й�ȣ �� �ν��Ͻ� ����

		while (true)	// ���ѷ��� �� �ź��� Ȯ�� �� �ŷ� ���ӿ��� Ȯ��
		{
			try
			{
				System.out.println(" ======= ������ü���� �Դϴ٢� =======");
				System.out.print("���ź��� Ȯ���ҰԿ�.^^(Y/N) : ");		// �ź��� Ȯ��
				super.selectC = (char)System.in.read();
				System.in.skip(2);

				if (super.selectC != 'Y' && super.selectC != 'y')	// y�� �ƴ� ��� ���� ����
				{
					System.out.println("�ŷ��� �Ͻ� �� �����Ф�");
					System.out.print("\n����� �ŷ��� �����Ͻðڽ��ϱ�?(Y/N): ");
					super.selectC = (char)System.in.read();
					System.in.skip(2);

				}
				else												//-- y �� ��� �ŷ� ��� ����
				{
					System.out.println("�ź��� Ȯ�����Դϴ�. ^^\n");
					jc.juminCom();									//-- ��ϵ� �ֹι�ȣ�� �Է� �ֹι�ȣ ����
					pc.passCom();									//-- ��ϵ� ��й�ȣ�� �Է� ��й�ȣ ����
	
				}

				
				if (super.selectC != 'Y' && super.selectC != 'y')	//--	java.61 �� ���� ������ y�� �ƴ� ���
				{
					System.out.println("������ �� �̿����ּ���. ^^*");
					System.out.println("================================");
					break;
					
				}
				else												//-- y �� ��� �Ѿ��.
				{
					System.out.println();
					break;
					
				}
			}
			catch (Exception e)										//-- Exception ��Ƴ��� ����
			{
				System.out.println(e.toString());
			}
			
		}

		

		// test	
		//System.out.println("�� : " + choice);
		
		if (super.selectC != 'Y' && super.selectC != 'y')			//-- �ռ� ������ y�� �ƴҰ��
		{
			return;													//   account() �޼ҵ� ����
		}

		try
		{
			System.out.print("����ü�� �ݾ��� �Է����ּ���.^^ : ");	//-- ��ü �ݾ� �Է�	
			temp = (long)sc.nextInt();	
		}
		catch (Exception e)
		{
			
			System.out.println("��, ���ڸ� �Է����ּ���. :(");			//-- ���� �ܿ� �ٸ� �� �Է� �� ����
			System.out.println("\n�ŷ��� �ٽ� �̿����ּ���!!");
			return;
		}
		//System.out.println("�� : " + choice);
	
		
		
		
		
		do
		{
			System.out.println("(1. �ĸ� 2. ���� 3. ���� 4. ����)");//-- ���� ����
			System.out.print("\n���޴� ������ ������ �������ּ��� : ");
			super.select = sc.next();

			if ("�ĸ�".equals(super.select) || "1".equals(super.select) || "����".equals(super.select) || "2".equals(super.select) || "����".equals(super.select) || "3".equals(super.select) || "����".equals(super.select) || "4".equals(super.select))		//-- ���� ���� ����
			{

				do													//-- ���¹�ȣ ��
				{
					System.out.print("\n���޴� ���� ���¹�ȣ�� �Է����ּ���.^^ (���� : 010xxxxxxxx) : ");
					gejwa = sc.next();

					if (gejwa.length() !=11)
					{
						System.out.println("�����¹�ȣ�� �ٽ� �Է����ֽñ� �ٶ��ϴ�.\n");
					}
				}
				while (gejwa.length() !=11);							//-- 11�ڸ��� �Ѿ ��쿡 �ٽ� �Է�

				

				gejwa = ((Account)me).transfer(temp, you);				//-- �ٿ� ĳ���� 
																		//-- ������ü ����

				if (gejwa.equals("�ܾ��� �����մϴ�! �����̿���.^^*"))
				{
					System.out.println();
					return;
				}
				

				


				try
				{
					System.out.printf("%,d�� �ݾ��� �½��ϱ�?(Y/N) :", temp);
					super.selectC = (char)System.in.read();
					System.in.skip(2);

					if (super.selectC != 'Y' && super.selectC != 'y')		// ����� �ݾװ� ���� ���� ��� �ٽ� �Է�
					{
						System.out.println("�ٽ� �ŷ��� �̿����ֽñ� �ٶ��ϴ�.");
						return ;
					}
					
				}
				catch (Exception e)
				{
					System.out.println(e.toString());
				}


				System.out.printf("\n����ü �Ͻ� %,d ��(��)�� ���������� ��ü�Ǿ����ϴ�\n", temp);
				System.out.printf("�������� ���� ���� �ܾ��� : %,d ��(��)�Դϴ�.^^\n", super.getTongjang());
				System.out.println("		====== �ȳ���������. �� �̿����ּ���! ^^* ========\n");
				
				break;
			}
			else
			{
				System.out.println("���� ������ �ٽ� ���ּ���. ����..!!");
				System.out.println("====================================");
				System.out.println();
			}
		}
		while (true);
		
	



		
	}// end account()


}// end class Account





/*
public class Account
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		BankAccount me = new BankAccount();
		BankAccount you = new BankAccount();

		System.out.println(" ��ü�Ͻ� �ݾ��� �Է����ּ���.^^ ");		
		int amount = sc.nextInt();		
		System.out.println(" ��ü ���� ���¹�ȣ�� �Է����ּ���.^^ (���� : 010xxxxxxxx) : ");
		String gejwa = sc.next();
		System.out.println(me.transfer(amount, you)); 
		System.out.println(" ���� ���� ���� �ܾ��� : " + super.getCash() + " ��(��)�Դϴ�.^^");
		System.out.println("��ü �Ͻ� " + you.Account2 + " ��(��)�� ���������� ó���Ǿ����ϴ�" );
	}
}
*/