package kadai;

public class Magician {

	String name;
	int hp;
	int at;
	int mp;
	int m_at; // ���@�ł̍U��

	void attack() {
		System.out.println(this.name + "�̍U���I�I");
		System.out.println("�����" + this.at + "�|�C���g�̃_���[�W��^�����I�I");
	}

	void magic_Attack() { // ���@�U��
		System.out.println(this.name + "�͖��@�ōU�������I");
		System.out.println("�����" + this.m_at + "�̃_���[�W��^����");
		this.mp = this.mp - 10;
		System.out.println("MP���P�O�|�C���g���" + this.mp + "�|�C���g�ɂȂ���");
	}

	void magic_Recovery() { // �񕜖��@
		System.out.println(this.name + "�͖��@�ŉ񕜂���");
		this.hp = this.hp + 10;
		System.out.println(this.name + "�̗̑͂��P�O�|�C���g�񕜂���");
		this.mp = this.mp - 5;
		System.out.println(this.name + "��MP���T�|�C���g���" + this.mp + "�|�C���g�ɂȂ���");
	}

	void heal() {
		System.out.println(this.name + "�͋x�e������");
		this.hp = this.hp + 10;
		System.out.println(this.name + "�̗̑͂��P�O�|�C���g�񕜂��A" + this.hp + "�|�C���g�ɂȂ���");
	}
}
