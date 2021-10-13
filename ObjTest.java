//class A {
//	int num; //인스턴스 변수
//
//
//	void setNum(int n) {
//		num = n;
//	}
//	
//	int getNum() {
//		return num; //자기 자신이 갖고 있는 num이란 변수에 대해 값을 리턴해준다.
//	}
//	
//	void printNum() {
//		System.out.println(num); //인스턴스 함수
//	}
//	
//	
//public class ObjTest {
//
//	public static void main(String[] args) {
//		A a; // 객체 생성 주소를 참조하고 있다고 해서 참조 변수다.
//		a = new A(); // A a = new A( );
//		
//		//a.num = 10;
//		a.setNum(10);
//		a.getNum(); //num에 들어있는 값을 확인하는 함수
//		
//		int num = a.getNum();
//		System.out.println(num);
//		
//		a.printNum(); //이걸 보고 함수를 생성해야 한다.
//		
//		
////		a.num = 10; // .으로 접근한다. 이걸 보고 A 클래스에 int num; a란 객체 안에 10이 들어있다.
////		
////		System.out.println(a.num);
//		
//		
//		}
//	}
//}
