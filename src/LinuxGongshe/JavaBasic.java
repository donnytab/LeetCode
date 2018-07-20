package LinuxGongshe;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

public class JavaBasic {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(JavaBasic.class.getName());
		// 1. Difference between & and &&
		// &: bitwise, evaluate both side
		// &&: logical, if the left side is true then evaluate right side
		int y = 1;
		if(1==2 & ++y>0) {
			System.out.println("Into loop 1");
		}
		if(1==2 && ++y>0) {
			System.out.println("Into loop 2");
		}
		System.out.println(y);
		
		
		// 2. Switch, only convertible int values, strings or enum variables are permitted
		String switStr = "trueStr";
		int switInt = 0;
		byte switByte = 1;
		short switShort = 2;
		// long switLong = 3;	// compilation error
		switch(switStr) {
			case "trueStr":
				logger.log(Level.INFO, "Return string true");
				break;
		}
		
		
		// 3. BigInteger, to implement a 10B calculator
		// See implementation of BigInteger
		/*
		 	public class BigInteger {
		 		int sign;
		 		byte[] val;
		 		public BigInteger(String val) {
		 			sign = ;
		 			val = ;
		 		}
		 		public BigInteger add(BigInteger number) {}
		 		public BigInteger subtract(BigInteger number) {}
		 		public BigInteger multiply(BigInteger number) {}
		 		public BigInteger divide(BigInteger number) {}
		 	}
		 */
		BigInteger temp = new BigInteger("1");
		// https://blog.csdn.net/zhongkelee/article/details/52289163
		
		
		// 4. == , equals()
		String a = new String("foo");
		String b = new String("foo");
		if(a==b) logger.log(Level.INFO, "==");
		if(a.equals(b)) logger.log(Level.INFO, "equals");
		
		// 5. String size : English 1 byte, Chinese 2 bytes(GBK) or 3 bytes(UTF-8)
		String str1 = "hello";
		String str2 = "你好hello";
		// Log the byte length of strings
		try {
			logger.log(Level.INFO, "str1(utf-8): "+str1.getBytes("utf-8").length);
			logger.log(Level.INFO, "str1(gbk): "+str1.getBytes("gbk").length);
			logger.log(Level.INFO, "str2(utf-8): "+str2.getBytes("utf-8").length);
			logger.log(Level.INFO, "str2(gbk): "+str2.getBytes("gbk").length);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 6. String: immutable
		String ss = "123456";
		System.out.println("ss = " + ss);
		ss.replace('1', '0');
		System.out.println("ss = " + ss);
		String strTemp = ss.replace('1', '0');
		System.out.println("strTemp = " + strTemp);
		
		
		// 7. String & StringBuffer & (StringBuilder ?)
		StringBuffer sb = new StringBuffer();
		String s = new String();
//		for(int i=0; i<100; i++) {
//			sb.append(i);	// only 1 StringBuffer object
//			s = s + i;		// 101 String objects
//		}
		
		
		// 8. TreeSet with parent class and child class
		// 如果子类和父类都复写了compareTo方法那么各自调用自己的compareTo方法
		// 如果子类没有复写compareTo方法，那么调用的都是父类的compareTo方法 
		
		
		// 9. Byte Stream & Character Stream
		// Byte Stream : InputStream, OutputStream
		// Character Stream : Reader, Writer
		
		
		// 10. Serializable
		// private static final long serialVersionUID = 1L  // or random long number
		
	}
}

// Java Interface 隐式抽象，不需要加 abstract
abstract class Test{
	int i;
	Test(){i++;}	// 成员变量可以不初始化，局部变量必须初始化
	
	// final int i;  // Wrong. No default value for final
	
	abstract void testA();	// No private, can only be protected / public
	// abstract void testA(){};  // Wrong. No implementation
}
