package kadai;
import java.util.Scanner;
public class story {
	public static void main(String[]args) {

		Scanner scanner = new Scanner(System.in);        //�E�҂̐���

		hero h =new hero();
		System.out.println("�E�҂̖��O����͂��Ă�������");
		h.name =scanner.nextLine();

        System.out.println("�E�҂̗̑͂���͂��Ă�������");
        h.hp =scanner.nextInt();
        
        System.out.println("�E�҂̍U���͂���͂��Ă�������");
        h.at =scanner.nextInt();
        
        System.out.println("�E�҂̖h��͂���͂��Ă�������");
        h.df =scanner.nextInt();
        
        
        System.out.println("�ւ荂���E�҂��������ɒa������");
        System.out.println("���O:"  +h.name);
        System.out.println("�̗�:"  +h.hp);
        System.out.println("�U����:"+h.at);
        System.out.println("�h���:"+h.df);
        
        
        
        Scanner scanner2=new Scanner(System.in);          //�����̐���
        
        monster m =new monster();
        System.out.println("�����X�^�[�̖��O����͂��Ă�������");
        m.name  =scanner2.nextLine();
        
        System.out.println("�����X�^�[�̗̑͂���͂��Ă�������");
        m.hp    =scanner2.nextInt();
        
        System.out.println("�����X�^�[�̍U���͂���͂��Ă�������");
        m.at    =scanner2.nextInt();
        
        System.out.println("�����X�^�[�̖h��͂���͂��Ă�������");
        m.df    =scanner2.nextInt();
        
        
        System.out.println("�ЁX���������������ɒa������");
        System.out.println("���O:"  +m.name);
        System.out.println("�̗�:"  +m.hp);
        System.out.println("�U����:"+m.at);
        System.out.println("�h���:"+m.df);
        
        
        
        Scanner scanner3=new Scanner(System.in);           //���@�g���̐���
        
        magician mg =new magician();
        System.out.println("���@�g���̖��O����͂��Ă�������");
        mg.name =scanner3.nextLine();
        
        System.out.println("���@�g���̗̑͂���͂��Ă�������");
        mg.hp   =scanner3.nextInt();
        
        System.out.println("���@�g���̍U���͂���͂��Ă�������");
        mg.at   =scanner3.nextInt();
        
        System.out.println("���@�g����MP����͂��Ă�������");
        mg.mp   =scanner3.nextInt();
        
        System.out.println("���@�g���̍U�����@�͂���͂��Ă�������");
        mg.m_at =scanner3.nextInt();
        
        
        
        System.out.println("���@�g���������ɒa������");
        System.out.println("���O:"      +mg.name);
        System.out.println("�̗�:"      +mg.hp);
        System.out.println("�U����:"    +mg.at);
        System.out.println("MP:"        +mg.mp);
        System.out.println("�U�����@��:"+mg.m_at);
        
        
        scanner.close();
        scanner2.close();
        scanner3.close();        
	}

}
