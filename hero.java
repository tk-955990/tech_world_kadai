package kadai;

public class Hero {

	String name;
	int hp;
	int at;
	int df;

	void attack() {
		System.out.println(this.name + "�̍U���I�I");
		System.out.println("������" + this.at + "�|�C���g�̃_���[�W��^�����I�I");
	}

	void defense() {
		System.out.println(this.name + "�͐g�������");
		this.df = this.df + 10;
		System.out.println("�h��͂��P�O�オ��A�h��͂�" + this.df + "�|�C���g�ɂȂ���");
	}

	void heal() {
		System.out.println(this.name + "�͋x�e����");
		this.hp = this.hp + 10;
		System.out.println(this.name + "�̗̑͂��P�O�񕜂��A" + this.hp + "�|�C���g�ɂȂ���");
	}
}