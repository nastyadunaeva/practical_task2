package altitude;

public class AltitudeImpl implements Altitude {
	private int height;
	
	/*
	 * Конструктор по умолчанию, устанавливающий начальное значение высоты в 0
	 */
	public AltitudeImpl() {
		height = 0;
	}
	public void higher() {
		height++;
	}
	public void lower() {
		height--;
	}
	public void howHigh() {
		if (height > 0) {
			System.out.println("Flying " + height + " meters above the ground");
		} else if (height < 0) {
			System.out.println("Swimming " + Math.abs(height) + " meters below the ground");
		} else {
			System.out.println("Standing on the ground!");
		}
	}
}
