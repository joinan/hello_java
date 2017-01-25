package com.join.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class HTTPNetworkApiExam {
	public static void main(String []args){
		String keyword = "카카오프렌즈";
		try{
			keyword = URLEncoder.encode(keyword, "utf-8");
		}catch(UnsupportedEncodingException e1){
			e1.printStackTrace();
		}
		String urlKeyword = URLEncoder.encode(keyword);
		String urlString = "https://apis.daum.net/shopping/search?"
				+"apikey=2a19ee81b903b917c0e7eb44c30ff072&q="+keyword
				+"&result=5&pageno=1&sort=pop&output=json";
		StringBuffer sb =  new StringBuffer(); // 
		try{
			URL url = new URL(urlString); // URL인스턴스 생성
			 
			  // open connection
			HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // HTTP URL 커넥션으로 생성
			conn.setDoInput(true);          // 입력스트림 사용
			conn.setDoOutput(true);         // 출력스트림 사용
			conn.setUseCaches(false);       // 캐시사용 안함
			conn.setReadTimeout(30000);     // 타임아웃 : 3초
			conn.setRequestMethod("GET");   // GET or POST ...
			         
			
			InputStreamReader ir = new InputStreamReader(conn.getInputStream());
			BufferedReader br = new BufferedReader(ir);
			String line;
			while((line=br.readLine()) != null)
				sb.append(line);
			br.close(); ir.close(); conn.disconnect();
			System.out.println(sb.toString());
		}catch(Exception e){
			e.printStackTrace();
		}
		try {
			JSONParser jsonParser = new JSONParser(); // JSON파서 객체 생성, 파서를 쓰기위해
			JSONObject json = (JSONObject)jsonParser.parse(sb.toString());  // JSON문자열을 받아서 객체로 만듬
			JSONObject channel = (JSONObject)json.get("channel"); // 채널이라는 객체를 만들고 channel이라는 키를 찾아서
			System.out.println(channel.get("result")); // channel1에 줘라 // channel1에 result를 출력해라
			JSONArray items = (JSONArray)channel.get("item");
			System.out.println(items.size());
			for(int i = 0; i<items.size(); i++){
				JSONObject obj = (JSONObject)items.get(i);
				System.out.println(i+": "+obj.get("title")+", "+
								obj.get("price_min")+", "+obj.get("price_max"));
			}
		} catch(Exception e2){
			e2.printStackTrace();
		}
	}
}
