
public class StaticTest {
	{
		System.out.println("�����ǷǾ�̬�Ĵ����");
	}
	
	static {
		System.out.println("�����Ǿ�̬�����"); //�o�B���a�K��춷��o�B���a�K�\��
	}


	public StaticTest() {
		System.out.println("�����ǹ��췽��");
	}

	public void method() {
		System.out.println("�����ǳ�Ա����");
	}
public static void main(String[] args) {
	StaticTest test = new StaticTest();
	test.method();  //�o�B���a -> ���o�B -> ���췽�� -> �ɆT����
}
}
