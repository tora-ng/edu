class Circle {
	
	double r;
	
	public double getR() {
		return r;
	}
	public void setR(double rad) { //void를 하는 이유는 리턴할 필요 없이 rad를 집어 넣어 r에 값만 세팅해 준다. 리턴을 하지 않기 때문에 void 사용
		r = rad; //원래 있던 값에 가져온 값을 넣어 준다. '세팅'
	}
	public double getArea(){
		return r * r * Math.PI;
	}
	
}
public class AreaTest {

	public static void main(String[] args) {
		Circle circle = new Circle(); //변수 선언, 메모리에 값 올리기
		//이후 하고 싶은 건 값을 넣는 것. 값 넣는 문장 만들어야 함
		
		circle.setR(10);
		
		double area = circle.getArea();
		System.out.println(area);
		
		// 한번 만들어 두면 값만 바꾸고 계속 사용할 수 있다.
		
		circle.setR(20);

		area = circle.getArea();
		System.out.println(area); // System.out.println(circle.getArea()); 이것도 무관함
	}

}
