package lambda;

public class MyNumberTest {

	public static void main(String[] args) {
		
		MyNumber num;
		
		//이름 없는 함수 (익명함수)
		num = (x, y) -> {
			return (x >= y) ? x : y;
			
		};
		
		System.out.println("최대값: " + num.getMax(10, 20));
		
		//축약 - {}과 return 생략 가능
		num = (x, y) -> (x >= y) ? x : y;
		System.out.println("최대값: " + num.getMax(10, 20));
	}

}
