package java_area;

public class EscapeSequences {

	public static void main(String[] args) {
		
		System.out.println("AB" + '\b' + 'C');
		//\b 없이 그대로 실행 시키면 ABC인데 \b 포함하여 실행 시키면 뒷부분(back)이 AC 됨
		System.out.println("AB" + '\t' + 'C');
		//\t는 수평 탭 AB   C가 된다
		System.out.println("AB" + '\n' + 'C');
		//\n는 그 다음줄에 표현 (엔터의 의미) 개행!! (행을 연다)
		System.out.println("AB" + '\r' + 'C');
		//\r 캐리지 리턴은 AB 찍고 제일 처음으로 돌아가서 CB로 실행
		
		//"Hello"
		System.out.println(" \' Hello \' ");
		

	}

}
