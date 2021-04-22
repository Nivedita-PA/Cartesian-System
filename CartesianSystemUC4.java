public class CartesianSystemUC4 {
	
	public static  int x1;
	public static  int x2;
	public static  int y1;
	public static  int y2;
	public String length;
	public double length_Line;
	
	
		//Line 1   
		//int x1 = 4; 
		//int y1 = 2; 
		//int x2 = 8; 
		//int y2 = 4;
		//Line 2
		//int a1 = 4; 
		//int b1 = 6; 
		//int a2 = 7; 
		//int b2 = 9;
		
		public void lengthOfLine(int x1, int x2, int y1, int y2) {
			
		
				double length_Line = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)); 
				//System.out.println(length_Line);
				String length = String.valueOf(length_Line);
		 }
				//String length2 = String.valueOf(length_Line);
				
				//double length_Line_2 = ((a2 - a1) * (a2 - a1)) + ((b2 - b1) * (b2 - b1));
				//System.out.println(length_Line_2);
				//String length2 = String.valueOf(length_Line_2);
				
//		public String result() {	
//		 if (length1.equals(length2)) {
//					System.out.println("Both the lines are equal");
//				}
//					else {
//						System.out.println("Both the lines are not equal");
//				}
					
//	}

		public static void main(String[] args) {
            
			lengthOfLine l1 = new lengthOfLine(2,3,4,5);
			lengthOfLine l2 = new lengthOfLine(3,8,7,6);
			
			
			 if (l1.equals(l2)) {
				System.out.println("Both the lines are equal");
				}
                	else {
						System.out.println("Both the lines are not equal");
				}
		
		}
		
}
