import java.util.Scanner;

public class JuminCompare extends Customer
{

	private static String temp;							//-- �ֹι�ȣ �ӽ� ���� ���� ����
	
	

	public void juminCom()								//-- �ֹι�ȣ �� �޼ҵ�
	{

		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner (System.in);
		int arr[] = {2,3,4,5,6,7,0,8,9,2,3,4,5};		//-- �ֹι�ȣ ����� ���� �� �ڸ����� ���� ��� ����
		int tot = 0 ;									//-- ���� ���� �� ���� �� ������ ���� ���� �� �ʱ�ȭ
		
		do												//-- �ֹι�ȣ 14�ڸ��� �ƴ� ��� �ٽ� �Է¹޴� �ݺ���
		{
			System.out.print("�������� ������ �ֹι�ȣ�� �Է����ּ���.^^(���� xxxxxx-xxxxxxx ) : ");
			temp = sc.next();

			if (temp.length() != 14)
			{
				System.out.println("���ֹι�ȣ�� �ٽ� �Է����ּ���.\n");
			}
		
		}
		while (temp.length() !=14);
		

		

		if(temp.length() !=14)
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
			tot += arr[i] * Integer.parseInt(temp.substring(i,(i+1)));	//-- ���� ��� ����� �����տ� ����
	
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
		
		if(su == Integer.parseInt(temp.substring(13)) && temp.equals(super.getJumin()))
		{
			System.out.println("Ȯ�εǾ����ϴ�\n");
			
			super.selectC = 'n';						//-- PassCompare Ŭ���� �� ����Ǿ� �� ��� �ŷ������� ������

			// �׽�Ʈ
			//System.out.println(super.selectC);
		}
		else
		{
			System.out.println("������� �ź����� �ƴմϴ�.");
			super.selectC = 'y';						//-- PassCompare Ŭ���� �� ����Ǿ� �� ��� �ŷ������� �ߴ��ϴ� �������� ����

			// �׽�Ʈ
			//System.out.println(super.selectC);
			
		}	
		

	}// end juminCom()

}// end class JuminCompare