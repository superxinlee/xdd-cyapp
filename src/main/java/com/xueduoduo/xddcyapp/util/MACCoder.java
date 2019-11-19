package com.xueduoduo.xddcyapp.util;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * MAC（Message Authentication Code，消息认证码算法）是含有密钥散列函数算法，兼容
 * 了MD和SHA算法的特性，并在此基础上加入了密钥。因此，我们也常把MAC称为HMAC （keyed-Hash Message Authentication
 * Code）。
 * <p/>
 * Java 6实现 HmacMD5 128 HmacSHA1 160 HmacSHA256 256 HmacSHA384 384 HmacSHA512
 * 512
 */
public class MACCoder {
	// /////////////////////////HmacMD5///////////////////////////////
	/**
	 * 初始化HmacMD5的密钥
	 * 
	 * @return byte[] 密钥
	 * 
	 * */
	public static byte[] initHmacMD5Key() throws Exception {
		// 初始化KeyGenerator
		KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacMD5");
		// 产生密钥
		SecretKey secretKey = keyGenerator.generateKey();
		// 获取密钥
		return secretKey.getEncoded();
	}

	/**
	 * HmacMD5消息摘要
	 * 
	 * @param data
	 *            待做摘要处理的数据
	 * @param key
	 *            密钥
	 * @return byte[] 消息摘要
	 * */
	public static byte[] encodeHmacMD5(byte[] data, byte[] key)
			throws Exception {
		// 还原密钥，因为密钥是以byte形式为消息传递算法所拥有
		SecretKey secretKey = new SecretKeySpec(key, "HmacMD5");
		// 实例化Mac
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		// 初始化Mac
		mac.init(secretKey);
		// 执行消息摘要处理
		return mac.doFinal(data);
	}

	// /////////////////////////////HmacSHA1//////////////////////////////////
	/**
	 * 初始化HmacSHA1的密钥
	 * 
	 * @return byte[] 密钥
	 * 
	 * */
	public static byte[] initHmacSHAKey() throws Exception {
		// 初始化KeyGenerator
		KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA1");
		// 产生密钥
		SecretKey secretKey = keyGenerator.generateKey();
		// 获取密钥
		return secretKey.getEncoded();
	}

	/**
	 * HmacSHA1消息摘要
	 * 
	 * @param data
	 *            待做摘要处理的数据
	 * @param key
	 *            密钥
	 * @return byte[] 消息摘要
	 * */
	public static byte[] encodeHmacSHA(byte[] data, byte[] key)
			throws Exception {
		// 还原密钥，因为密钥是以byte形式为消息传递算法所拥有
		SecretKey secretKey = new SecretKeySpec(key, "HmacSHA1");
		// 实例化Mac
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		// 初始化Mac
		mac.init(secretKey);
		// 执行消息摘要处理
		return mac.doFinal(data);
	}

	// /////////////////////////////HmacSHA256//////////////////////////////////
	/**
	 * 初始化HmacSHA256的密钥
	 * 
	 * @return byte[] 密钥
	 * 
	 * */
	public static byte[] initHmacSHA256Key() throws Exception {
		// 初始化KeyGenerator
		KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256");
		// 产生密钥
		SecretKey secretKey = keyGenerator.generateKey();
		// 获取密钥
		return secretKey.getEncoded();
	}

	/**
	 * HmacSHA256消息摘要
	 * 
	 * @param data
	 *            待做摘要处理的数据
	 * @param key
	 *            密钥
	 * @return byte[] 消息摘要
	 * */
	public static byte[] encodeHmacSHA256(byte[] data, byte[] key)
			throws Exception {
		// 还原密钥，因为密钥是以byte形式为消息传递算法所拥有
		SecretKey secretKey = new SecretKeySpec(key, "HmacSHA256");
		// 实例化Mac
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		// 初始化Mac
		mac.init(secretKey);
		// 执行消息摘要处理
		return mac.doFinal(data);
	}

	// /////////////////////////////HmacSHA384//////////////////////////////////
	/**
	 * 初始化HmacSHA384的密钥
	 * 
	 * @return byte[] 密钥
	 * 
	 * */
	public static byte[] initHmacSHA384Key() throws Exception {
		// 初始化KeyGenerator
		KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA384");
		// 产生密钥
		SecretKey secretKey = keyGenerator.generateKey();
		// 获取密钥
		return secretKey.getEncoded();
	}

	/**
	 * HmacSHA384消息摘要
	 * 
	 * @param data
	 *            待做摘要处理的数据
	 * @param key
	 *            密钥
	 * @return byte[] 消息摘要
	 * */
	public static byte[] encodeHmacSHA384(byte[] data, byte[] key)
			throws Exception {
		// 还原密钥，因为密钥是以byte形式为消息传递算法所拥有
		SecretKey secretKey = new SecretKeySpec(key, "HmacSHA384");
		// 实例化Mac
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		// 初始化Mac
		mac.init(secretKey);
		// 执行消息摘要处理
		return mac.doFinal(data);
	}

	// /////////////////////////////HmacSHA512//////////////////////////////////
	/**
	 * 初始化HmacSHA512的密钥
	 * 
	 * @return byte[] 密钥
	 * 
	 * */
	public static byte[] initHmacSHA512Key() throws Exception {
		// 初始化KeyGenerator
		KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA512");
		// 产生密钥
		SecretKey secretKey = keyGenerator.generateKey();
		// 获取密钥
		return secretKey.getEncoded();
	}

	/**
	 * HmacSHA512消息摘要
	 * 
	 * @param data
	 *            待做摘要处理的数据
	 * @param key
	 *            密钥
	 * @return byte[] 消息摘要
	 * */
	public static byte[] encodeHmacSHA512(byte[] data, byte[] key)
			throws Exception {
		// 还原密钥，因为密钥是以byte形式为消息传递算法所拥有
		SecretKey secretKey = new SecretKeySpec(key, "HmacSHA512");
		// 实例化Mac
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		// 初始化Mac
		mac.init(secretKey);
		// 执行消息摘要处理
		return mac.doFinal(data);
	}

	/**
	 * 进行相关的摘要算法的处理展示
	 * 
	 * @throws Exception
	 * **/
	public static void main(String[] args) throws Exception {
		String str = "HmacMD5消息摘要";
		// 初始化密钥
		byte[] key1 = MACCoder.initHmacMD5Key();
		// 获取摘要信息
		byte[] data1 = MACCoder.encodeHmacMD5(str.getBytes(), key1);

		System.out.println("原文：" + str);
		System.out.println();
		System.out.println("HmacMD5的密钥:" + key1.toString());
		System.out.println("HmacMD5算法摘要：" + data1.toString());
		System.out.println();

		// 初始化密钥
		byte[] key2 = MACCoder.initHmacSHA256Key();
		// 获取摘要信息
		byte[] data2 = MACCoder.encodeHmacSHA256(str.getBytes(), key2);
		System.out.println("HmacSHA256的密钥:" + key2.toString());
		System.out.println("HmacSHA256算法摘要：" + data2.toString());
		System.out.println();

		// 初始化密钥
		byte[] key3 = MACCoder.initHmacSHAKey();
		// 获取摘要信息
		byte[] data3 = MACCoder.encodeHmacSHA(str.getBytes(), key3);
		System.out.println("HmacSHA1的密钥:" + key3.toString());
		System.out.println("HmacSHA1算法摘要：" + data3.toString());
		System.out.println();

		// 初始化密钥
		byte[] key4 = MACCoder.initHmacSHA384Key();
		// 获取摘要信息
		byte[] data4 = MACCoder.encodeHmacSHA384(str.getBytes(), key4);
		System.out.println("HmacSHA384的密钥:" + key4.toString());
		System.out.println("HmacSHA384算法摘要：" + data4.toString());
		System.out.println();

		// 初始化密钥
		byte[] key5 = MACCoder.initHmacSHA512Key();
		// 获取摘要信息
		byte[] data5 = MACCoder.encodeHmacSHA512(str.getBytes(), key5);
		System.out.println("HmacSHA512的密钥:" + key5.toString());
		System.out.println("HmacSHA512算法摘要：" + data5.toString());
		System.out.println();

	}
}
