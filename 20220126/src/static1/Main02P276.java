package static1;

public class Main02P276 {
    public static void main(String[] args) {
    	// Static 변수는 생성 없이도 활용할 수 있다. / out.println(StaticTest.num1); -> num1은 X
    	System.out.println(StaticTest.num2);

    	// Static 메서드는 객체를 만들지 않아도 호출할 수 있다.
    	// 클래스명.메서드명()으로 정적메서드를 호출할 수 있습니다.
    	StaticTest.check();
    	
    	// StaticTest s1을 생성한 후 s1.check();
    	// 를 호출해보세요.
    	StaticTest s1 = new StaticTest();
    	s1.check();
    	
	}

}
