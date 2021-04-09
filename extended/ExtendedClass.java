package extended;

public class ExtendedClass {
	private byte b;
	private int i;
	private double d;
	private String s;
	
	/*
	 * Возвращает значение private поля b типа byte
	 */
	public byte getB() {
		return b;
	}
	/*
	 * Устанавливает значение private поля b
	 */
	public void setB(byte b) {
		this.b = b;
	}
	/*
	 * Возвращает значение private поля i типа int
	 */
	public int getI() {
		return i;
	}
	/*
	 * Устанавливает значение private поля i
	 */
	public void setI(int i) {
		this.i = i;
	}
	/*
	 * Возвращает значение private поля d типа double
	 */
	public double getD() {
		return d;
	}
	/*
	 * Устанавливает значение private поля d
	 */
	public void setD(double d) {
		this.d = d;
	}
	/*
	 * Возвращает значение private поля s типа String
	 */
	public String getS() {
		return s;
	}
	/*
	 * Устанавливает значение private поля s
	 */
	public void setS(String s) {
		this.s = s;
	}
	
	/*
	 * Переопределение метода equals(Object obj)
	 */
	@Override
	public boolean equals(Object anObject) {
		if(!(anObject instanceof ExtendedClass)) 
			return false;
		ExtendedClass ec = (ExtendedClass) anObject;
		if (!(b == ec.b))
			return false;
		if (!(i == ec.i))
			return false;
		if (!(d == ec.d))
			return false;
		if (!(s.equals(ec.s)))
			return false;
		return true;
	}
	
	/*
	 * Переопределение метода hashCode()
	 */
	@Override
	public int hashCode() {
		int result = s == null ? 0 : s.hashCode();
		result = 31 * result + b;
		result = 31 * result + i;
		result += Math.round(d * 100) * 31;
		return result;
	}
	
	/*
	 * Переопределение метода toString()
	 */
	@Override
	public String toString() {
		return b + "\n" + i + "\n" + d + "\n" + s;
	}
}
