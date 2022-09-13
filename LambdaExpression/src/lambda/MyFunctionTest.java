package lambda;

public class MyFunctionTest {

	public static void main(String[] args) {
		
		MyFunctionEx fi;	//인터페이스형 객체 선언
		
		//람다 함수로 구현
		fi = () -> {
			String str = "Hello~ Lambda!";
			System.out.println(str);
		};
		
		fi.method();	//함수 호출
		
		fi = () -> System.out.println("Hello~ Lambda");
		fi.method();
	}
}

