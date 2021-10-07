
public class Count {

	public static void main(String[] args) {

		
		/*
		int count = 0;
		
		while( (num++) < 1000 ) {
			
			if ((num % 2 == 0) && (num % 3 == 0)) {
				System.out.println(num);
				
				count++;
			//	System.out.println(num);
			}	
				System.out.println(count);
		}
		*/
		
		int count = 0;
		
		for (int i = 1; i <= 1000; i++) {
			if ((i % 2 != 0) || (i % 3 != 0)) {
				continue;
			}
		count++;
		}
		System.out.println(count);
	}

}
