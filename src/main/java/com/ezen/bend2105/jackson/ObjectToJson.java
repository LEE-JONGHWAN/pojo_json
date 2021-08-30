package com.ezen.bend2105.jackson;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
 
public class ObjectToJson {
	public static void main(String[] a) {
		// POJO 객체 생성
		Product product = new Product();
		
		// 객체 필드 값 배정
		getObjectData(product); 
		
		// Jackson API ObjectMapper 객체 생성
		ObjectMapper Obj = new ObjectMapper();
		try {
			// POJO 객체를 Json 문자열로 변환
			String jsonStr = Obj.writeValueAsString(product);
 
			System.out.println(jsonStr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
 
	/**
	 * 인자로 공급된 Product 객체에 필드 값 배정
	 * @param product 공급된 Product 객체
	 * @return 피드 값 채워진 Product 객체
	 */
	public static Product getObjectData(Product product) {
		product.setId(101);
		product.setName("금강 생수");
		product.setPrice(900);
		
		return product;
	}
}

