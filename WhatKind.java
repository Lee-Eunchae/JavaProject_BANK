import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WhatKind extends Customer
{

	public void whatKind()
	{
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ���� �ν��Ͻ� ����
		Yegum yg = new Yegum();
		// ��� �ν��Ͻ� ����
		Chulgum cg = new Chulgum();
		// ȯ�� �ν��Ͻ� ����
		Exchange ex = new Exchange();
		// ������ü �ν��Ͻ� ����
		Account ac = new Account();
		// ���� �ν��Ͻ� ����
		YesNo ys = new YesNo();
		// ���尳�� �ν��Ͻ� ����
		TongJang tj = new TongJang();
		

		try
		{
			Thread.sleep(2000);							//-- �ð� �� �α�
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		

		System.out.println("	 ======= �ȳ��ϼ��� ����~^^! =======");
		
		

		
		while (true)									//-- �������� ���� ����
		{												//   ������ ����� �ȵǾ��� �� �ٽ� ������ �� �ֵ���

			System.out.println("(1. ���� 2. ��� 3. ȯ�� 4. ������ü 5. ���°��� 6. ������ȸ)");
			System.out.print("��� ������ ���ðھ��^^*? : ");
			
			
			
			try
			{
				super.select = br.readLine();
			}
			catch (Exception e)
			{
				System.out.println(e.toString());
			}
			/* // Test
			System.out.println(select);
			select = "����";
			System.out.println("����".equals(select));
			*/
			

			if ("����".equals(super.select) || "1".equals(super.select))		//-- ���� ���� ����
			{
				if (super.getTongname() == super.getPhone())
				{
					yg.yegum();
					ys.yesNo();
					if (super.selectC != 'Y' && super.selectC != 'y')
					{
						return;
					}
				}
				else
				{
					System.out.println("���°� �����Ǿ����� �ʽ��ϴ�. ������ �缱�����ּ���.\n");
	
					
				}
				
				
			}
			else if ("���".equals(super.select) || "2".equals(super.select))	//-- ��� ���� ����
			{
				if (super.getTongname() == super.getPhone())
				{
					cg.chulgum();
					ys.yesNo();
					if (super.selectC != 'Y' && super.selectC != 'y')
					{
						return;
					}
				}
				else
				{
					System.out.println("���°� �����Ǿ����� �ʽ��ϴ�. ������ �缱�����ּ���.\n");
					
				}
				
				
			}
			else if ("ȯ��".equals(super.select) || "3".equals(super.select))	//-- ȯ�� ���� ����
			{
				
				
				ex.inputEx();
				ys.yesNo();
				if (super.selectC != 'Y' && super.selectC != 'y')
				{
					return;
				}
				

			}
			else if ("������ü".equals(super.select) || "4".equals(super.select))//-- ������ü ���� ����
			{
				
				if (super.getTongname() == super.getPhone())
				{
					ac.account();
					ys.yesNo();
					if (super.selectC != 'Y' && super.selectC != 'y')
					{
						return;
					}
				}
				else
				{
					System.out.println("���°� �����Ǿ����� �ʽ��ϴ�. ������ �缱�����ּ���.\n");
					
				}
				
			}
			else if ("���°���".equals(super.select) || "5".equals(super.select))
			{
				tj.gaeseol();
				ys.yesNo();
				if (super.selectC != 'Y' && super.selectC != 'y')
				{
					return;
				}
			}
			else if ("������ȸ".equals(super.select) || "6".equals(super.select))
			{
				
				if (super.getTongname() == super.getPhone())
				{
					tj.check();
					ys.yesNo();
					if (super.selectC != 'Y' && super.selectC != 'y')
					{
						return;
					}
				}
				else
				{
					System.out.println("���°� �����Ǿ����� �ʽ��ϴ�. ������ �缱�����ּ���.\n");
				
				}

			}
			else
			{
				System.out.println("�ŷ� ������ �ٽ� ���ּ���. ����..!!");
				System.out.println("====================================");
				System.out.println();
			}
		}


	}// end whatkind()

}// end class WhatKind