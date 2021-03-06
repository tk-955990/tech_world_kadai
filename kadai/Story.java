package kadai;

import java.util.Scanner;

public class Story {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // 勇者の生成

		Hero h = new Hero("勇者");

		System.out.println("勇者の攻撃力を入力してください");
		h.at = scanner.nextInt();

		System.out.println("勇者の防御力を入力してください");
		h.df = scanner.nextInt();

		System.out.println("誇り高き勇者が今ここに誕生した");
		System.out.println("名前:"   + h.name);
		System.out.println("体力:"   + h.hp);
		System.out.println("攻撃力:" + h.at);
		System.out.println("防御力:" + h.df);
		

		Scanner scanner2 = new Scanner(System.in); // 怪物の生成

		Monster m = new Monster("怪物");

		System.out.println("モンスターの攻撃力を入力してください");
		m.at = scanner2.nextInt();

		System.out.println("モンスターの防御力を入力してください");
		m.df = scanner2.nextInt();

		System.out.println("禍々しい怪物がここに誕生した");
		System.out.println("名前:"   + m.name);
		System.out.println("体力:"   + m.hp);
		System.out.println("攻撃力:" + m.at);
		System.out.println("防御力:" + m.df);

		Scanner scanner3 = new Scanner(System.in); // 魔法使いの生成

		Magician mg = new Magician("たかし");

		System.out.println("魔法使いの攻撃力を入力してください");
		mg.at   = scanner3.nextInt();

		System.out.println("魔法使いのMPを入力してください");
		mg.mp   = scanner3.nextInt();

		System.out.println("魔法使いの攻撃魔法力を入力してください");
		mg.m_at = scanner3.nextInt();

		System.out.println("魔法使いがここに誕生した");
		System.out.println("名前:"   + mg.name);
		System.out.println("体力:"   + mg.hp);
		System.out.println("攻撃力:" + mg.at);
		System.out.println("MP:"     + mg.mp);
		System.out.println("攻撃魔法力:" + mg.m_at);

		Scanner scanner4 = new Scanner(System.in);

		LOOP_I: for (int i = 0; i < 5; i++) {
			System.out.println("< 魔法使いの作戦は？ >");
			System.out.println("攻撃:1 攻撃魔法:2 回復魔法:3 休憩:4 終了:5");

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
			System.out.println("【魔法使い:ステータス】");
			System.out.println("体力:" + mg.hp);
			System.out.println("MP:" + mg.mp);
		}
		System.out.println("魔法使いのターン終了");

		scanner.close();
		scanner2.close();
		scanner3.close();
		scanner4.close();
	}

}
