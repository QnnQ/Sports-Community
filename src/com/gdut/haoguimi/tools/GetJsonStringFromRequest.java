package com.gdut.haoguimi.tools;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

public class GetJsonStringFromRequest {

	public static String getJsonString(HttpServletRequest request) throws Exception{
		String acceptjson = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(
				(ServletInputStream) request.getInputStream(), "utf-8"));
		StringBuffer sb = new StringBuffer("");
		String temp;
		while ((temp = br.readLine()) != null) {
			sb.append(temp);
		}
		br.close();
		acceptjson = sb.toString();
		
		return acceptjson;
	}
}
