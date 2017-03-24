package com.gjjf.commonservice.message.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;

public class MD5Util {
	
	public static byte[] encode2bytes(String source) {
		byte[] result = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.reset();
			md.update(source.getBytes("UTF-8"));
			result = md.digest();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return result;
	}

	public static String encode2hex(String source) {
		byte[] data = encode2bytes(source);

		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			String hex = Integer.toHexString(0xFF & data[i]);

			if (hex.length() == 1) {
				hexString.append('0');
			}

			hexString.append(hex);
		}

		return hexString.toString();
	}

	public static boolean validate(String unknown, String okHex) {
		return okHex.equals(encode2hex(unknown));
	}

	public static String encode2Base64String(byte[] source) {
		byte[] result = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.reset();
			md.update(source);
			result = md.digest();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return Base64.encodeBase64String(result);
	}

	public static byte[] encode2Base64(byte[] source) {
		byte[] result = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.reset();
			md.update(source);
			result = md.digest();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return Base64.encodeBase64(result);
	}
}
