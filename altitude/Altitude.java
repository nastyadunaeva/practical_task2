package altitude;

public interface Altitude {
	/*
	 * Метод higher() прибавляет к текущей высоте (изначально высота равна нулю) единицу
	 */
	void higher();
	/*
	 *  Метод lower() вычитает из текущей высоты единицу
	 */
	void lower();
	/*
	 * Метод howHigh() печатает в консоль “Flying x meters
	 * above the ground”, если x > 0, “Swimming x meters below the 
	 * ground”, если x < 0. В оставшемся случае метод печатает
	 * “Standing on the ground!”.
	 */
	void howHigh();
}
