class A_ForWithSingleArrayDemo{
	public static void main(String[] args) {
		String [] array = {"Hennery","John","William","Patick","Michael"};
		useEnhenceFor(array);
	}

	static void useLegacyFor(String[] array){
		for(int i = 0 ; i < array.length ; i++){
			System.out.println(array[i]);

		}
	}

	// Only Used for array,collection
	static void useEnhenceFor(String[] array){
		 for(String name : array){
		 	System.out.println(name);
		 }
	}
}