package com.dilip.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddressValidation {
	public static void main(String[] args) {
		String str = "111";
		Pattern ptrn = Pattern
				.compile("(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})");
		Matcher mtch = ptrn.matcher(str);
		// return mtch.find();
	}
}
