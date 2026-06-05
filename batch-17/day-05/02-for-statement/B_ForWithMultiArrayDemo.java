class B_ForWithMultiArrayDemo{
	public static void main(String[] args) {
		int [][] array = {{1,2},{4,3,2,1},{4,5,1}};
		showAll(array);
	}

	static void showAll(int [][] array){
		for(int x = 0;x < array.length;x ++){		
			for(int y = 0; y < array[x].length; y ++){
				System.out.println(array[x][y]);
			}
		}
	}
}