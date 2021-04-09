package extended;

public class Program {
	public static void main(String[] args) {
		ExtendedClass ec1 = new ExtendedClass();
		ec1.setB((byte)4);
		ec1.setI(5);
		ec1.setD(3.2);
		ec1.setS("information");
		ExtendedClass ec2 = new ExtendedClass();
		ec2.setB((byte)4);
		ec2.setI(5);
		ec2.setD(3.2);
		ec2.setS("information");
		ExtendedClass ec3 = new ExtendedClass();
		ec3.setB((byte)2);
		ec3.setI(10);
		ec3.setD(0.5);
		ec3.setS("test");
		System.out.println("ExtendedClass 1:");
		System.out.println(ec1.toString());
		System.out.println();
		
		System.out.println("ExtendedClass 2:");
		System.out.println(ec2.toString());
		System.out.println();
		
		System.out.println("ExtendedClass 3:");
		System.out.println(ec3.toString());
		System.out.println();
		
		System.out.println("ExtendedClass 1 is equals ExtendedClass 2:");
		System.out.println(ec1.equals(ec2));
		System.out.println();
		
		System.out.println("ExtendedClass 2 is equals ExtendedClass 3:");
		System.out.println(ec2.equals(ec3));
		System.out.println();
		
		System.out.println("Hash code of ExtendedClass 1:");
		System.out.println(ec1.hashCode());
		System.out.println();
		
		System.out.println("Hash code of ExtendedClass 2:");
		System.out.println(ec2.hashCode());
		System.out.println();
		
		System.out.println("Hash code of ExtendedClass 3:");
		System.out.println(ec3.hashCode());
		System.out.println();
	}
}
