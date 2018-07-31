
public class ComplexNumberMultiplication {
	public String complexNumberMultiply(String a, String b) {
		String[] aNum = a.split("\\+|i");
		String[] bNum = b.split("\\+|i");
		int a1 = Integer.valueOf(aNum[0]);
		int a2 = Integer.valueOf(aNum[1]);
		int b1 = Integer.valueOf(bNum[0]);
		int b2 = Integer.valueOf(bNum[1]);
		String complex1 = String.valueOf(a1*b1-a2*b2);
		String complex2 = String.valueOf(a1*b2+a2*b1);
		return complex1+"+"+complex2+"i";
	}
}
