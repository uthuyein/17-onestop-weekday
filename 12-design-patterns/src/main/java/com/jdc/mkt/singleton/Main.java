package com.jdc.mkt.singleton;

public class Main {

//	Only One object in heap.
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
	}
	
	
}

 class Singleton {

    private Singleton() {}

    private static class Holder {
        private static final Singleton INSTANCE =
                new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }
}


