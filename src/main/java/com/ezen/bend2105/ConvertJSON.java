package com.ezen.bend2105;

import com.google.gson.Gson;

public class ConvertJSON {
	public static MobilePhone getMobile(MobilePhone mobile) {
		mobile.setBrand("삼성");
		mobile.setName("J2 Core");
		mobile.setRam(2);
		mobile.setRom(4);
		return mobile;
	}
 
	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone();
		mobilePhone = getMobile(mobilePhone);
		System.out.println("mobilePhone 의 Json 형식 =>");
		System.out.println(new Gson().toJson(mobilePhone));
	}
}

