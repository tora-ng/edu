
public class ArrayPrac {

	public static void main(String[] args) {
		
		//1차원 배열 값 넣고 빼내는 거
		
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) { //for(int i = 0; i < arr.length(배열의 길이); i++) {
			arr[i] = i;
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
