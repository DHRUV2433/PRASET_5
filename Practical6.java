//This program is run by Dhruv Vekariya(21CE152)
public class Practical6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program is run by Dhruv Vekariya(21CE152)");
		int num = 32, a;
		Integer numObj1 = num;
		Integer numObj2 = new Integer("23");
		System.out.println("Value of integer object: " + numObj1);
		System.out.println("Value of integer object2: " + numObj2);
		a = Integer.parseInt("1234");
		System.out.println("Val of a is :" + a);
		System.out.println("Use of toString function: " + Integer.toString(num));
		System.out.println("Byte value of integer object:" + numObj1.byteValue());
		System.out.println("Short value of integer object:" + numObj1.shortValue());
		System.out.println("Long value of integer object:" + numObj1.longValue());
		System.out.println("Float value of integer object:" + numObj1.floatValue());
		System.out.println("Double value of integer object:" + numObj1.doubleValue());
		System.out.println("Use of compareTo method:" + numObj1.compareTo(numObj2));
		System.out.println("Equals method: " + numObj1.equals(numObj2));
		Float f1 = new Float("34.5f");
		Float f2 = new Float(34.5f);
		Integer intWrapper1 = Integer.valueOf("9876");
		Integer intWrapper2 = Integer.valueOf("D", 16);
		Integer intWrapper3 = Integer.valueOf("1010", 2);
		Integer intWrapper4 = Integer.valueOf("75", 8);
		System.out.println("Value of intWrapper1: " + intWrapper1);
		System.out.println("Value of intWrapper2: " + intWrapper2);
		System.out.println("Value of intWrapper3: " + intWrapper3);
		System.out.println("Value of intWrapper4: " + intWrapper4);
		System.out.println("HexValue of intWrapper2:" + Integer.toHexString(intWrapper2));
		System.out.println("BinaryValue of intWrapper3:" + Integer.toBinaryString(intWrapper3));
		System.out.println("OctalValue of intWrapper4:" + Integer.toOctalString(intWrapper4));

	}

}
