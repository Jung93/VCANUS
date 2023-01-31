package vcanusTest1;

public abstract class BreadFactory{
	
	public Bread newInstance() {
		
		try {
			Bread bread = createBread();
			return bread;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected abstract Bread createBread();
}
