class Demo{
	int x=10;
	int y=20;

	public void finalize()throws Throwable{
		System.gc();
	}
}

