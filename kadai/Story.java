package kadai;

import java.util.Scanner;

public class Story {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // �E�҂̐���

		Hero h = new Hero();
		System.out.println("�E�҂̖��O����͂��Ă�������");
		h.name = scanner.nextLine();

		System.out.println("�E�҂̗̑͂���͂��Ă�������");
		h.hp = scanner.nextInt();

		System.out.println("�E�҂̍U���͂���͂��Ă�������");
		h.at = scanner.nextInt();

		System.out.println("�E�҂̖h��͂���͂��Ă�������");
		h.df = scanner.nextInt();

		System.out.println("�ւ荂���E�҂��������ɒa������");
		System.out.println("���O:" + h.name);
		System.out.println("�̗�:" + h.hp);
		System.out.println("�U����:" + h.at);
		System.out.println("�h���:" + h.df);

		Scanner scanner2 = new Scanner(System.in); // �����̐���

		Monster m = new Monster();
		System.out.println("�����X�^�[�̖��O����͂��Ă�������");
		m.name = scanner2.nextLine();

		System.out.println("�����X�^�[�̗̑͂���͂��Ă�������");
		m.hp = scanner2.nextInt();

		System.out.println("�����X�^�[�̍U���͂���͂��Ă�������");
		m.at = scanner2.nextInt();

		System.out.println("�����X�^�[�̖h��͂���͂��Ă�������");
		m.df = scanner2.nextInt();

		System.out.println("�ЁX���������������ɒa������");
		System.out.println("���O:" + m.name);
		System.out.println("�̗�:" + m.hp);
		System.out.println("�U����:" + m.at);
		System.out.println("�h���:" + m.df);

		Scanner scanner3 = new Scanner(System.in); // ���@�g���̐���

		Magician mg = new Magician();
		System.out.println("���@�g���̖��O����͂��Ă�������");
		mg.name = scanner3.nextLine();

		System.out.println("���@�g���̗̑͂���͂��Ă�������");
		mg.hp = scanner3.nextInt();

		System.out.println("���@�g���̍U���͂���͂��Ă�������");
		mg.at = scanner3.nextInt();

		System.out.println("���@�g����MP����͂��Ă�������");
		mg.mp = scanner3.nextInt();

		System.out.println("���@�g���̍U�����@�͂���͂��Ă�������");
		mg.m_at = scanner3.nextInt();

		System.out.println("���@�g���������ɒa������");
		System.out.println("���O:" + mg.name);
		System.out.println("�̗�:" + mg.hp);
		System.out.println("�U����:" + mg.at);
		System.out.println("MP:" + mg.mp);
		System.out.println("�U�����@��:" + mg.m_at);

		Scanner scanner4 = new Scanner(System.in);

		LOOP_I: for (int i = 0; i < 5; i++) {
			System.out.println("< ���@�g���̍��́H >");
			System.out.println("�U��:1 �U�����@:2 �񕜖��@:3 �x�e:4 �I��:5dd");

			int getCommand = new java.util.Scanner(System.in).nextInt();

			switch (getCommand) {
			case 1:
				mg.attack();
				break;
			case 2:
				mg.magic_Attack();
				break;
			case 3:
				mg.magic_Recovery();
				break;
			case 4:
				mg.heal();

				break;
			case 5:
				break LOOP_I;
			}
			System.out.println("�y���@�g��:�X�e�[�^�X�z");
			System.out.println("�̗�:" + mg.hp);
			System.out.println("MP:" + mg.mp);
		}
		System.out.println("���@�g���̃^�[���I��");

		scanner.close();
		scanner2.close();
		scanner3.close();
		scanner4.close();
	}

}
