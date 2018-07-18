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
	}
}
