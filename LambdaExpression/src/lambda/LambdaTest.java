package lambda;

@FunctionalInterface
interface PrintString{
	
	void showString(String str);
}

public class LambdaTest {
	
	public static void main(String[] args) {
		//���ٽ� - �Ű����� 1���̸� ��ȣ ���� ����
		PrintString lambdaPrint = str -> System.out.println(str);
		lambdaPrint.showString("�ȳ��ϼ���");
		
		//�Լ� ȣ��
		printString(lambdaPrint);
		
		PrintString printstr = returnPrint();
		printstr.showString("�ȳ��ϼ���");
		
	}
	
	//�Ű������� �������̽��� ��ü
	public static void printString(PrintString p) {
		p.showString("�ȳ��ϼ���");
	}
	
	//��ȯ���� �Լ��� �������̽��� return�� �ִ� �޼ҵ�
	public static PrintString returnPrint() {
		return str -> System.out.println(str);
	}
	
}
