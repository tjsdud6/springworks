package lambda;

public class StringConcatTest {

	public static void main(String[] args) {
		
		//�������̽��� ��ü - ���� Ŭ����
		System.out.println("==== �Ϲ� ���� Ŭ���� ====");
		StringConcat str = new StringConcatImpl();
		
		str.makeString("�ȳ�", "�ϼ���");
		
		System.out.println("==== ���ٽ����� ���� ====");
		StringConcat str2;
		str2 = (s1, s2) -> System.out.println(s1 + "" + s2);
		str2.makeString("�ȳ�", "�ϼ���");
	}

}
