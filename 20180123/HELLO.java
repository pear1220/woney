// 1�� �ּ���

/*
	������ 
	�ּ���
*/

/**
	����ȭ �ּ�
	==> javadoc�� �̿��ؼ� API ������ ���鶧 ����Ѵ�.
*/

// ==== *** CLASS(Ŭ����)�� ���� *** ====
/*
CLASS(Ŭ����)�� ��� ���ø����̼� ���۽� �ʿ��� ���赵�� �̶�� ��������.
	
	1. ��Ű�� ����
	   ==> ��Ű���� Ŭ������ ����Ǿ��� ���͸� ��ζ�� ����ȴ�.

	   package ��Ű����;		==> �̶� ��Ű������ �ݵ�� �ҹ��ڷ� �����ؾ� �Ѵ�

	�� > packge my.com;

	2.IMPORT ��

	�� > import ��Ű����.Ŭ������;
		import java.lang.String;
		import java.lang.System;
		import java.lang.*;
	����Ʈ : https://docs.oracle.com/javase/8/docs/api/index.html

	3. Ŭ���� ����

	4. �������ϱ�

	5. �����ϱ�
*/
//import java.lang.String;
//import java.lang.System;

//import java.lang.*;  .* lang�ȿ� �ִ� ��Ű���� ���� ���ڴٶ�� �� lang�� ����ϰ� ����ϱ� ������ ���� import�� ���ص� import�ϰ� �Ǿ�����.

import java.util.Date;

public class HELLO // Ŭ������� ���� ������� �����ؾߵȴ�.
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Java!");
		System.out.println("�ȳ��ϼ���? �ݰ����ϴ�. ~~^^"); //()�� �޼ҵ��̰ų� �ν�Ʈ����(������) �̴�
		// System.out �� �����(�ܼ�ȭ��)�� ���Ѵ�.
		// System.out.println("�ȳ��ϼ���? �ݰ����ϴ�. ~~^^"); �� 
		// �����(�ܼ�ȭ��)�� ���ڿ� �ȳ��ϼ���? �ݰ����ϴ�. ~~^^ �� ����ض�� ���̴�.
		// System.out.println("���ڿ�"); �� ������ �� �ڵ������� �ٹٲ��� �Ͼ��. 

		System.out.print("Hi Java"); // �ٹٲ��� ����
		System.out.print("������ �սô�.");
		// System.out.print("���ڿ�"); �� ������ �� �ڵ� �ٹٲ��� �߻����� �ʴ´�.
		System.out.print("\n���� �ڹٸ� �����մϴ�.");
		// \n �� ���� �ٲ��� ���Ѵ�.

		System.out.print("\nThe End~~\n");
		System.out.print("�ȳ��� ������~~");

//		System.out.print("\n");
		System.out.println("");// \n�� "" �� �����ϰ� ���� �ٲ��� �ǹ��Ѵ�.

		System.out.println(new Date());
		// ���糯¥�� ��Ÿ���� ����.
		// new Date()�� ���� �ý����� ��¥�ð��� ������ ���̴�.

	}
}