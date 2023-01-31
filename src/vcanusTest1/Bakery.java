package vcanusTest1;

public class Bakery extends BreadFactory{
	@Override
	protected Bread createBread() {
		return new Baker();
	}
}
