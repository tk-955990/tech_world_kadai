package kadai;

public class Monster {
	
	String name ;
	int  hp;
	int  at;
	int  df;
	
	void attack() {
		System.out.println(this.name+"�̍U���I�I�I");
		System.out.println(this.at+"�|�C���g�̃_���[�W���󂯂�");
	}
    void defense() {
    	System.out.println(this.name+"�͎����ł߂�");
    	this.df=this.df+10;
    	System.out.println(this.name+"�̖h��͂��P�O�|�C���g�オ����");
    }
}
