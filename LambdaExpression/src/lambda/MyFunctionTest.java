package lambda;

public class MyFunctionTest {

	public static void main(String[] args) {
		
		MyFunctionEx fi;	//�������̽��� ��ü ����
		
		//���� �Լ��� ����
		fi = () -> {
			String str = "Hello~ Lambda!";
			System.out.println(str);
		};
		
		fi.method();	//�Լ� ȣ��
		
		fi = () -> System.out.println("Hello~ Lambda");
		fi.method();
	}
}

