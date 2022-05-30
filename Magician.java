package kadai;

public class Magician {

	String name;
	int hp;
	int at;
	int mp;
	int m_at; // 魔法での攻撃

	void attack() {
		System.out.println(this.name + "の攻撃！！");
		System.out.println("相手に" + this.at + "ポイントのダメージを与えた！！");
	}

	void magic_Attack() { // 魔法攻撃
		System.out.println(this.name + "は魔法で攻撃した！");
		System.out.println("相手に" + this.m_at + "のダメージを与えた");
		this.mp = this.mp - 10;
		System.out.println("MPが１０ポイント消費し" + this.mp + "ポイントになった");
	}

	void magic_Recovery() { // 回復魔法
		System.out.println(this.name + "は魔法で回復した");
		this.hp = this.hp + 10;
		System.out.println(this.name + "の体力が１０ポイント回復した");
		this.mp = this.mp - 5;
		System.out.println(this.name + "のMPが５ポイント消費し" + this.mp + "ポイントになった");
	}

	void heal() {
		System.out.println(this.name + "は休憩をした");
		this.hp = this.hp + 10;
		System.out.println(this.name + "の体力が１０ポイント回復し、" + this.hp + "ポイントになった");
	}
}
