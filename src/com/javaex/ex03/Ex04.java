package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) throws IOException{
		
		//리스트 만들기
		List<Person> pList = new ArrayList<Person>();
		
		//스트림 준비
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		
		
		
		//반복(파일이 끝까지)
		while(true) {
			//파일에서 1줄(이효리)을 읽는다
			String str =br.readLine(); 
			
			//읽어줄에서 이름 hp company로 분리한다  
			//"이효리,010-2222-3333,031-2323-4441" -->[이효리][010-2222-3333][031-2323-4441]
			str.split(",");
			
			if(str == null) {
				break;
			}
			
			System.out.println(str);
		}
		
		
		
	
		
		//Person을 메모리에 올리고 이름 hp company를 초기화한다
		
		//리스트에 Person주소를 넣는다
		//반복
		
		
		
		
		
		
		

	}

}
