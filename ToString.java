class Box{
	private String conts; // = "Camera"
	
	Box(String cont){
		this.conts = cont;
	}
	public String toString() {
		return conts; // = "Camera" 따라서 Camera를 리턴함
	}
}
public class ToString {

	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("12");
		stb.append(34);
		System.out.println(stb.toString()); //String 타입 "1234"
		//println 들어가면 String 함수가 나옴.
		System.out.println(stb); //객체를 넣은 것이다.
		//println 들어가면 Object 함수가 나옴 (StringBuilder stb가 들어가기 때문에)
		// ^가 에러가 안 나려면 함수를 어떻게 만들어야 할 것인가?
		//: 함수를 만들 때 데이터 타입을 StringBuilder stb 이렇게 넣는다
		
		
		Box box = new Box("Camera");
		System.out.println(box.toString());
		
		System.out.println(box);
		//8개의 데이터타입을 제외한 자료형은 println 들어가면 Object가 나온다
		//F3 치고 들어가보면 결국 내부적으로는 toString으로 호출하게 되어있다.
		//에러가 안 난다는 건 println()함수에서 box를 받아낸다는 이야기다.
		//만약 box가 null이면 또 F3으로 들어가 보고 null 부분을 찾아낸다.

	}

}
