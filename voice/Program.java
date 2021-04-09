package voice;

public class Program {
	public static void main(String[] args) {
		Voice cat = new Cat();
		cat.voice();
		Voice dog = new Dog();
		dog.voice();
		Voice cow = new Cow();
		cow.voice();
	}
}
