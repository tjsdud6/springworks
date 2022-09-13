package lambda;

public class StringConcatTest {

	public static void main(String[] args) {
		
		//인터페이스형 객체 - 구현 클래스
		System.out.println("==== 일반 구현 클래스 ====");
		StringConcat str = new StringConcatImpl();
		
		str.makeString("안녕", "하세요");
		
		System.out.println("==== 람다식으로 구현 ====");
		StringConcat str2;
		str2 = (s1, s2) -> System.out.println(s1 + "" + s2);
		str2.makeString("안녕", "하세여");
	}

}
