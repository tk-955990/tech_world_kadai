package kadai;

public class Monster {
	
	String name ;
	int  hp;
	int  at;
	int  df;
	
	void attack() {
		System.out.println(this.name+"の攻撃！！！");
		System.out.println(this.at+"ポイントのダメージを受けた");
	}
    void defense() {
    	System.out.println(this.name+"は守りを固めた");
    	this.df=this.df+10;
    	System.out.println(this.name+"の防御力が１０ポイント上がった");
    }
}
