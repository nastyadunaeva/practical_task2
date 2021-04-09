package altitude;

public class Program {
	public static void main(String[] args) {
		Altitude al = new AltitudeImpl();
		al.howHigh();
		al.higher();
		al.higher();
		al.howHigh();
		for (int i = 0; i < 6; i++) {
			al.lower();
		}
		al.howHigh();
	}
}
