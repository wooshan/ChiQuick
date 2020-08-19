package com.chiQuick.dnfnf;

public class chiquick {
/** JavaDoc 주석
 * 이 영역에 기술되는 내용은 아래의 메소드에 대한 자동 문서화가 이루어진다.
 */
	public static void main(String[] args) {
		// Java 문법 Study Sample Coding
		
		System.out.println("Welcome to ChiQuick!!!");
		System.out.println(4+2);
		System.out.println(2*5);
		System.out.println(6/2);
		System.out.println('생');
		System.out.println("코딩");
		System.out.println("\"Welcome to ChiQuick!!!\"");
		System.out.println("\"Welcome" + " to ChiQuick!!!\"");
		System.out.println(" "+"Welcome to ChiQuick!!!"+" ");
		System.out.println(1+1);
		System.out.println("1"+"1");
		System.out.println("HTML\nCSS\nJavaScript\n");
		
		int a; a=1; System.out.println(a+12); //정수
		a=11; System.out.println(a+12);
		
		double b=1.1; System.out.println(b+1.1); System.out.println(b+2.2);  //실수
		
		String company_name="DNFNF"; System.out.println(company_name); //문자열
		
		int d=100; System.out.println(d); System.out.println(d+10); System.out.println((d+10)/10);
		
		// [ 변수형 Data Type ]
		// 정수형 Data Type : 정수형 기본 데이터 타입은 int임. byte와 short는 내부적으로 int로 간주됨. long은 형변환 지정이 필요함. 
		//		byte(1byte <128), Short(2byte, <32,768), int(4byte, <2,147,483,647), long(8byte)
		// 실수형 Data Type : 실수형은 double 사용을 권장. float는 형변환 지정이 필요함. 
		// 		float(4byte), double(8byte)
		// 문자형 Data Type : char(2byte)
		
		// [ 상수형 Data Type ] : 
		double abc = 2.2;
		float ab = 2.2F;
		int abcd = 2147483647;
		long abcde = 2147483648L;
		
		// 형변환 지정 : F(float), L(long) 을 데이터 뒤에 붙여준다.
		// 자동 형변환 (implicit Conversion) : 작은 데이터 타입에서 큰 데이터 타입으로의 형변환만 가능
		//		byte --> short / char --> int --> long --> float --> double
		// 형변환 (Type Conversion)
				
		int a1 = 3; 
		float b1 = 1.0F;
		double c1 = a1 + b1; // a1(float) , b1(float) 
		
		// 명시적 형변환
		float a2 = (float)100.0;
		int b2 = (int)100.9F;
		System.out.println(b2);
		
		// 대입 연산자 : =
		// 산술(Arithmetic) 연산자 (이항연산자) : + , - , * , / , %
		// 비교 연산자 : == , != , > , < , >= , <= , .equals
		// 논리 연산자 : 
		int a3 = 3;
		System.out.println(0%a3); //0
		System.out.println(1%a3); //1
		System.out.println(2%a3); //2
		System.out.println(3%a3); //0
		System.out.println(4%a3); //1
		System.out.println(5%a3); //2
		
		int a4 = 10 , b4 = 3; 
		float c4 = 10.0F, d4 = 3.0F;
		System.out.println(a4/b4); //정수
		System.out.println(c4/d4); //실수
		System.out.println(a4/d4); //실수+실수 --> 실수
		
		// [ 단항 연산자 ] : +(양수) , -(음수) , ++(1증가) , --(1감소)
		int i = 3;
		++i; // i=i+1
		i++; // i 출력 후 i값 1증가
		
		// 연산 우선 순위표 참조 : 
		int a5 = 4 - 3 * 6;  // -14
		
		// 비교 연산자(관계 연산자) : == , 연산 결과값은 boolean
		// Boolean(true & false)
		System.out.println(1 == 2); //false
		System.out.println(1 == 1); //true
		System.out.println("one" == "two"); //flase
		
		String a6 = "Hello World";
		String b6 = new String("Hello World");
		System.out.println(a6 == b6); // false
		System.out.println(a6.equals(b6)); //true
		
		// 조건문
		String id = args[0];
		String password = args[1];
		
		if(id.equals("woosh")) {
			if(password.equals("1111")) {
				System.out.println("Login OK");
			} else {
				System.out.println("Login Fail");
			}
		} else if(id.equals("egoing")) {
			System.out.println("Result : egoing");
		} else {
			System.out.println("Result : flase");
		}
		
		// switch var의 Data Type은 byte, short, char, int, enum, String, Character, Byte, Short, Integer 로 한정된다.
		int var = 4;
		switch(var) {
		case 1:
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 3");
			break;
		default:
			System.out.println("default");
		}
		
		// 논리 연산자  (2020.06.25)
		
	}

}
