package in.ashokit;

public class Car {

	private IEngine eng;
	
	public Car(IEngine eng) {
		this.eng = eng;
	}

	public void drive() {
		int start = eng.start();

		if (start >= 1) {
			System.out.println("Journey Started...");
		} else {
			System.out.println("Engine in trouble...");
		}
	}
}
