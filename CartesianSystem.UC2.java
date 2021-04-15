public class CartesianSystemUC2 {

	public static void main(String[] args) {
		   
		int x1 = Integer.valueOf(4); 
		int y1 = Integer.valueOf(2); 
		int x2 = Integer.valueOf(8); 
		int y2 = Integer.valueOf(4);
		
		int a1 = Integer.valueOf(4); 
		int b1 = Integer.valueOf(6); 
		int a2 = Integer.valueOf(7); 
		int b2 = Integer.valueOf(9);
				double length_Line = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)); 
				System.out.println(length_Line);
				String length1 = String.valueOf(length_Line);
				double length_Line_2 = ((a2 - a1) * (a2 - a1)) + ((b2 - b1) * (b2 - b1));
				System.out.println(length_Line_2);
				String length2 = String.valueOf(length_Line_2);
				
				if (length1.equals(length2)) {
					System.out.println("Both the lines are equal");
				}
					else {
						System.out.println("Both the lines are not equal");
				}
					

	}

}
