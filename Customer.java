import java.util.Scanner;

public class Customer	// ����� ���� Ŭ���� ���� �ſ�Ȯ�� Ŭ����
{
	
//	�ֿ� ������ ���� ���� ���� �� �޼ҵ� ����  /////////////////////////////////////////////////////////////////////////////

	private static String name;				//-- �� �̸� ���� ���ڿ� 
	private static String phone;			//-- �� �ڵ��� ���� ���ڿ�
	private static String jumin;			//-- �� �ֹι�ȣ ���� ���ڿ�
	private static String pass , pass1;		//-- �� ��й�ȣ ���� ���ڿ�
	private static String tongName;
	private static long tongjang = 0;
	private static long cash = 100000000;	//-- �� ���� �ݾ� 1��.
	static String select;					//-- �� ���� ����(String)
	static char selectC;					//-- �� ���� ����(char)
	private static boolean flag = true;
	
	

	public static final long getCash()			//-- getCash()
	{
		return cash;
	}// end getCash() 

	public static final void setCash(long cash)	//-- setCash()
	{
		Customer.cash = cash;
	}// end setCash()

	public static final String getPass()		//-- getPass()
	{
		return pass;
	}// end getPass() 

	public static final void setPass(String pass)//-- setPass()
	{
		Customer.pass += pass;
	}// end setPass()

	public static final String getJumin()		//-- getJumin()
	{
		return jumin;
	}// end getJumin() 

	public static final void setJumin(String jumin)
	{
		Customer.jumin = jumin;
	}// end setJumin()

	public static final String getPhone()		//-- getPhone()
	{
		return phone;
	}// end getPhone() 

	public static final void setPhone(String phone)//-- setPhone()
	{
		Customer.phone = phone;
	}// end setPhone()

	public static final long getTongjang()		//-- getTongjang()
	{
		return tongjang;
	}// end getTongjang() 

	public static final void setTongjang(long tongjang)//-- setTongjang()
	{
		Customer.tongjang = tongjang;
	}// end setTongjang()

	public static final String getTongname()		//-- getTongname()
	{
		return tongName;
	}// end getTongname()

	public static final void setTongname(String tongName)//-- setTongname()
	{
		Customer.tongName = tongName;
	}// end setTongname()

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void input() //�̸� �Է� �޼ҵ�
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("\n==== ������ ������ �ۼ� ��Ź�帳�ϴ�.^^ =====");	// ȸ�������� �������� �ٲ�
		System.out.print("���̸��� �Է����ּ��� : ");
		name = sc.next();
		System.out.println();

	}// end name()
	
	public void phone() //��ȭ��ȣ ���� �޼ҵ�
	{
		Scanner sc = new Scanner (System.in);
		do
		{
			System.out.print("�������� �ڵ��� ��ȣ�� �Է����ּ���.^^ (���� : 010xxxxxxxx) : ");
			phone = sc.next();

			if (phone.length() !=11)
			{
				System.out.println("�ڵ��� ��ȣ�� �ٽ� �Է����ּ���.\n");
			}
		}
		while (phone.length() !=11); //11�ڸ��� �Ѿ ��쿡 �ٽ� �Է�
		

	}// end phone()


	public void pass()	//��й�ȣ ���� �޼ҵ�
	{
		Scanner sc = new Scanner(System.in);
	
		do
		{
			System.out.print("�������� ��й�ȣ�� �Է��� �ּ���. (4�ڸ�): ");
			pass = sc.next();
			System.out.print("���ٽ� �� �� ��й�ȣ�� �Է��� �ּ���. (4�ڸ�): ");
			pass1 = sc.next();

		}	
		while (pass.length() !=4); 

			if (pass.equals(pass1)==true)	//pass1�� pass�� true�ϰ�� ����
			{
				System.out.println("��й�ȣ ���� �Ϸ�!");
			}
		do
		{
			if (pass.equals(pass1)==false) //pass1�� pass�� false�ϰ�� �ٽ� �Է�
			{
				System.out.print("����� ��ȣ�� Ʋ�Ƚ��ϴ٤Ф� �ٽ� �Է��� �ּ���. : ");
				pass1 = sc.next();						
			}
		}
		while (pass.equals(pass1)==false);

	}// end pass()


	public void jumin() //�ֹ� ��ȣ ���� �޼ҵ�
	{
		Scanner sc = new Scanner (System.in);
		int[]arr = {2,3,4,5,6,7,0,8,9,2,3,4,5};


		while (flag)
		{
			do
			{
				System.out.print("�������� ������ �ֹι�ȣ�� �Է����ּ���. (���� xxxxxx-xxxxxxx ) : ");
				jumin = sc.next();

				if (jumin.length() !=14)
				{
					System.out.println("���ֹι�ȣ�� �ٽ� �Է����ֽñ� �ٶ��ϴ�.\n");
				}
			
			}
			while (jumin.length() !=14);
			

			// ���� ���� �� ���� ��
			int tot = 0 ;

			if(jumin.length() !=14)
			{
				System.out.println("�Է¿���");
				return; //-- �޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
			}

			for (int i=0; i<13; i++)
			{
				if (i==6)
				{
					continue;			// i�� 6��°�� �����ϰ� 7������ �Ѿ (149���� line �����ϰ� ����ض�....)
				}
				tot += arr[i] * Integer.parseInt(jumin.substring(i,(i+1)));
		
			}

			int su = 11 - tot % 11;
			//�׽�Ʈ
			//System.out.println(su);

			// ���� ��� ��� ������ �߰� ���� �ʿ�~!!
			// -- su�� ���� ���� ����� �� �ڸ��� ���� ���
			// �ֹι�ȣ ������ �ڸ��� ���ڿ� ���� �� ���� ��Ȳ
			su = su %10;
			//-- ������� �����ϸ� 3 �� 4�� ��� ���� ��Ȳ�̸�
			// ���� ���� ����� ����su�� ����ִ� ��Ȳ�� �ȴ�.

			// ���� ��� ���
			
			if(su == Integer.parseInt(jumin.substring(13)))
			{
				System.out.println("��Ȯ�� �ֹι�ȣ�Դϴ�\n");
				flag = false;
			}
			else if (su != Integer.parseInt(jumin.substring(13)))
			{
				System.out.println("��Ȯ���� ���� �ֹι�ȣ�Դϴ�.");
				flag = true;
			}
		}
			
		
		
			
		
		
		
		
			

	

	}// end jumin()
	
	public void print() //��� �޼ҵ�
	{
		input();
		jumin();
		phone();
		pass();
		
		System.out.println("\n=========ȸ������==========");
		System.out.printf("�̸� : %s\n",name);
		System.out.printf("�ڵ��� ��ȣ (���¹�ȣ) : %s\n",phone);
		System.out.printf("�ֹι�ȣ: %s\n",jumin);
		System.out.println("===========================\n");
	}// end print()

	
}
