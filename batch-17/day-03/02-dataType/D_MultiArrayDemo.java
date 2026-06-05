class D_MultiArrayDemo{
	public static void main(String[] args) {

		// multi array with elements
		int[][] array = {{1,2},{3,4,5},{6,7,8,9},{6,7}};
		System.out.println(array[1][2]);
		
		array[2][3] = 10;
		System.out.println(array[2][3]);


		// multi array with length
		int[]array2 = new int[3][2];
		array2[0][0] = 2;
		array2[0][1] = 3;
		// array2[0][2] = 3; array index out of bound exception
	}
}