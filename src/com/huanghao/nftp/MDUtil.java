package com.huanghao.nftp;

import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * 生成文件的数字摘要（MD5、SHA、CRC）
 * 
 * @author Huanghao
 *
 */
public class MDUtil {
	/**
	 * 获得文件的 MD5 值
	 * 
	 * @param file
	 * @return
	 */
	public static String getMD5(File file) {
		//函数
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			
			byte[] data = "hello".getBytes();
			byte[] result = md.digest(data);
			System.out.println(result.length);
			System.out.println(Arrays.toString(result));
			BigInteger b = new BigInteger(1, result);
			String m = b.toString(16);
			System.out.println(m.length());
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
