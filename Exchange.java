

import java.util.Currency;			// ���� ��ġ(����) ���� ��, �� ��ġ�� ����� ���� method�� ��� ����
import java.util.Locale;			// Currency class�� method ��� ��, ���� ������ ���� class
import java.util.Scanner;

class Exchange extends Customer
{ 
	public final double USD;		// �� ������ ȯ�� ������ ���� ���� ����
	public final double JPY;
	public final double EUR;
	public final double CNY;
	public final double GBP;
	Currency cur;					// Currency class ��ü ����
	String giho;					// �� ������ ȭ�� ��ȣ ���� ���� ����

	Exchange()						// ��������ǻ�����. �� ���� �´� ȯ���� �ʱ�ȭ ����. 2019-08-26 ����.
	{
		USD=1218.40;	
		JPY=11.5768;
		EUR=1357.85;
		CNY=169.94;
		GBP=1494.49;
	}

	private static int money;		// �Է¹��� ȯ���� �ݾ� ���� ����
	private static int to;			// ���õ� ���� ���� ����
	private static long temp;		// ���� �ڱ� ������ ���� ����
	private static long won;		// ȯ�� �� ������/���޹��� ��ȭ ���� ����

	// Exchange class�� main method
	public void inputEx()	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ======= ȯ������ �Դϴ٢� =======");
		System.out.println("\n������ȯ�����񽺸� ��û�ϼ̳���? ^^*");
		System.out.print("1.��		2.�ƴϿ�...;;		: ");
		super.select = sc.next();
		
		if ("1".equals(super.select))		// ����ȯ�� ��û(1��)
		{
			preEx();		// ����ȯ�� method ȣ��
		}

		else if ("2".equals(super.select))	// ����ȯ�� �̽�û(2��)
		{
			System.out.println("\n������������! ���Ͻô� ȯ�����񽺸� �������ּ���. ^^*");
			System.out.print("1.�ѱ� �� -> �ܱ� ��  	2.�ܱ� �� -> �ѱ� ��	3.�׳� ������ �ҷ���   : ");
			super.select = sc.next();

			if ("1".equals(super.select))		// ����ȯ�� - ��ȭ���� ��ȭ(1��)
			{
				exchangeEx();		// ȯ�� �ȳ� method ȣ��

				System.out.printf("\n��%,d%s �� %,d�� �Դϴ�. ȯ���Ͻðھ��? ^^\n", money, giho, won);
				System.out.print("1.��		2.�ƴϿ�, ������ �ҷ���		 : ");
				super.select = sc.next();

				if ("1".equals(super.select))			// ����ȯ�� - 1�� - ȯ��Ȯ��(1��)
				{
					
					System.out.printf("\n�� %s %,d%s �� %d�� �� ȯ���ϼ̽��ϴ�. \n", cur.getSymbol(), money, giho, won);
					
					temp = super.getCash() - won;				// ȯ���Ѹ�ŭ �ڱݿ��� ���� 				
					super.setCash(temp);

					System.out.printf("�������� �ܾ��� %,d��, %s %,d%s �Դϴ�.\n", super.getCash(), cur.getSymbol(), money, giho);
					System.out.println("\n            ========= �̿����ּż� �����մϴ� ^^* ========== ");
				}
				else if ("2".equals(super.select))			// ����ȯ�� - 1�� - �ŷ����(2��)
				{
					cancelEx();		// �ŷ� ��� method ȣ��
				}
				else
					wrongEx();
			}
			else if ("2".equals(super.select))		// ����ȯ�� - ��ȭ���� ��ȭ(2��)
			{
				exchangeEx();		// ȯ�� �ȳ� method ȣ��


				System.out.printf("\n��%,d%s �� %,d�� �Դϴ�. ȯ���Ͻðڽ��ϱ�? ^^\n", money, giho, won);
				System.out.print(/*"1.��. ���¿� �־��ּ���	*/	"1.��. �������� �ּ��� 		2.�ƴϿ�, ������ �ҷ���		: ");
				super.select = sc.next();

				if ("1".equals(super.select))				// ����ȯ�� - 2�� - �����Ա�(1��)
				{
					
					System.out.printf("\n�� %s %,d%s �� %d���� ȯ���ϼ̽��ϴ�. \n", cur.getSymbol(), money, giho, won);
				
					temp = super.getCash() + won;						// ȯ���Ѹ�ŭ �ڱݿ� �߰�
					super.setCash(temp);

					System.out.printf("�������� �ܾ��� %,d�� �Դϴ�.\n", super.getCash());
					System.out.println("\n			   ========= �̿����ּż� �����մϴ� ^^* ========== ");
				}
				/*
				else if ("2".equals(super.select))			// ����ȯ�� - 2�� - ��������(2��)
				{
					System.out.printf("\n�� %s %,d%s �� %,d���� ȯ���ϼ̽��ϴ�. \n�������� ȯ���� �ݾ� �帱�Կ�. ^^ �Ѧ���������", cur.getSymbol(), money, giho, won);
					System.out.printf("														  �Ѧ���������\n");
					System.out.println("\n				 ========= �̿����ּż� �����մϴ� ^^* ========== ");
				}
				*/
				else if ("2".equals(super.select))			// ����ȯ�� - 2�� - �ŷ����(2��)
				{
					cancelEx();
				}
				else
					wrongEx();
			}
			else if ("3".equals(super.select))		// ����ȯ�� - �ŷ����(3��)
			{
				cancelEx();
			}
			else 
				wrongEx();	
		}
		else
			wrongEx();						// �߸��� �Է� method ȣ��
	}// end inputEx()


	// ���� ȯ�� method
	public void preEx()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n������ȯ�����񽺿��� � ��� ����� �����ϼ̳���? ^^*");
		System.out.print("1.ȯ������		2.�������	 : ");
		super.select = sc.next();
			
		if ("1".equals(super.select))
		{
			System.out.print("\n�� ȯ������ ȯ������ 2% �Ǿ����ϴ�.");
			System.out.print("\n�� ������ �ݾ��� ������û�ϼ��� �� ��ݵǾ����ϴ�.\n");
			System.out.print("\n		====== �̿����ּż� �����մϴ�. ��ſ� ����Ǽ���^^/ ======\n");
			return;
		}
		else if ("2".equals(super.select))
		{
			System.out.print("\n�� ������� ȯ������ 1% �Ǿ����ϴ�");
			System.out.print("\n�� ������ �ݾ��� ������û�ϼ��� �� ��ݵǾ����ϴ�.\n");
			System.out.print("\n		====== �̿����ּż� �����մϴ�. ��ſ� ����Ǽ���^^/ ======\n");
			return;
		}
	}//end preEx()


	// ȯ�� �ȳ� method
	public void exchangeEx()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("\n����� ����� ��������? �η��پ� ^^*");
			System.out.printf("1.�̱�(USD)	  2.����(EUR)	  3.�Ϻ�(JPY) \n4.�߱�(CNY)	  5.����(GBP)	  6.��Ÿȭ��(Other)		: ");
			to = sc.nextInt();
			if (0<to && to<6)						// ������ �� ��ȣ �Է� ��												
				continue;
			System.out.println("\n���Է��Ͻ� ������ ȭ��� �غ�Ǿ� ���� �ʽ��ϴ٤Ф�"); 
		}
		while (to<1 || 5<to);

		System.out.print("\n���󸶳� ȯ���ص帱���?");
		System.out.print("\n (�ش� ������ ȭ�� �������� �Է����ּ���) :");
		money = sc.nextInt();
				
		won = (long)calEx(to, money);				// ȯ�� ��� method ȣ��. (parameter�� to-����, money-ȯ���� �ݾ�)
	}//end exchangeEx()
	
		
	// ȯ�� ��� method
	public double calEx(int country, int money)
	{
		double result=0;

		switch (country)
		{
		case 1: 
			cur = Currency.getInstance(Locale.US);		// ���� ��ġ�� Locale�� field������ ����		
			giho = cur.getSymbol(Locale.US);			// ������ ������ ȭ�� ��ȣ�� �޾ƿ�
			result = money*USD;								
			break;
		case 2:
			cur = Currency.getInstance(Locale.FRANCE);
			giho = cur.getSymbol(Locale.FRANCE);
			result = money*EUR;
			break;
		case 3:
			cur = Currency.getInstance(Locale.JAPAN);
			giho = cur.getSymbol(Locale.JAPAN);
			result = money*JPY;
			break;
		case 4:
			cur = Currency.getInstance(Locale.CHINA);
			giho = cur.getSymbol(Locale.CHINA);
			result = money*CNY;
			break;
		case 5:
			cur = Currency.getInstance(Locale.UK);
			giho = cur.getSymbol(Locale.UK);
			result = money*GBP;
			break;
		}

		return result * 1.2;										// ��� ��ģ �ݾ� ��ȯ. ���� ������(20%) ����.
	}// end calEx													


	// �ŷ� ��� method
	public void cancelEx()
	{
		System.out.println("\n    ======= ȯ���� ��ҵǾ����ϴ�. ó������ �ٽ� �������ּ���. ^^* =======  ");
		return;
	}// end cancleEx()

	
	// �߸��� ���� method (������ �� �ٸ� ��ȣ �Է� ��)
	public void wrongEx()
	{
		System.out.println("\n		 ======= �߸��� �Է��Դϴ�. ��ȸ�� �����ϴ�. ó������ �ٽ� �������ּ���. ^^* =======  ");
		return;
	}// end wrongEx()
}



/* �׽�Ʈ

public class ExTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Exchange ex = new Exchange();			// Exchange Ŭ���� ��� �ν��Ͻ� ����
		//Locale lc = new Locale("kor");			// Locale Ŭ���� ��� �ν��Ͻ� ����

		ex.inputEx();								// Exchange Ŭ���� input() �޼ҵ� ȣ��
	
	}
}
*/


