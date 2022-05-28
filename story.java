package kadai;
import java.util.Scanner;
public class story {
	public static void main(String[]args) {

		Scanner scanner = new Scanner(System.in);        //勇者の生成

		hero h =new hero();
		System.out.println("勇者の名前を入力してください");
		h.name =scanner.nextLine();

        System.out.println("勇者の体力を入力してください");
        h.hp =scanner.nextInt();
        
        System.out.println("勇者の攻撃力を入力してください");
        h.at =scanner.nextInt();
        
        System.out.println("勇者の防御力を入力してください");
        h.df =scanner.nextInt();
        
        
        System.out.println("誇り高き勇者が今ここに誕生した");
        System.out.println("名前:"  +h.name);
        System.out.println("体力:"  +h.hp);
        System.out.println("攻撃力:"+h.at);
        System.out.println("防御力:"+h.df);
        
        
        
        Scanner scanner2=new Scanner(System.in);          //怪物の生成
        
        monster m =new monster();
        System.out.println("モンスターの名前を入力してください");
        m.name  =scanner2.nextLine();
        
        System.out.println("モンスターの体力を入力してください");
        m.hp    =scanner2.nextInt();
        
        System.out.println("モンスターの攻撃力を入力してください");
        m.at    =scanner2.nextInt();
        
        System.out.println("モンスターの防御力を入力してください");
        m.df    =scanner2.nextInt();
        
        
        System.out.println("禍々しい怪物がここに誕生した");
        System.out.println("名前:"  +m.name);
        System.out.println("体力:"  +m.hp);
        System.out.println("攻撃力:"+m.at);
        System.out.println("防御力:"+m.df);
        
        
        
        Scanner scanner3=new Scanner(System.in);           //魔法使いの生成
        
        magician mg =new magician();
        System.out.println("魔法使いの名前を入力してください");
        mg.name =scanner3.nextLine();
        
        System.out.println("魔法使いの体力を入力してください");
        mg.hp   =scanner3.nextInt();
        
        System.out.println("魔法使いの攻撃力を入力してください");
        mg.at   =scanner3.nextInt();
        
        System.out.println("魔法使いのMPを入力してください");
        mg.mp   =scanner3.nextInt();
        
        System.out.println("魔法使いの攻撃魔法力を入力してください");
        mg.m_at =scanner3.nextInt();
        
        
        
        System.out.println("魔法使いがここに誕生した");
        System.out.println("名前:"      +mg.name);
        System.out.println("体力:"      +mg.hp);
        System.out.println("攻撃力:"    +mg.at);
        System.out.println("MP:"        +mg.mp);
        System.out.println("攻撃魔法力:"+mg.m_at);
        
        
        scanner.close();
        scanner2.close();
        scanner3.close();        
	}

}
