package com.fubon.dm;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DmApplicationTests {

	@Test
	void contextLoads() {
		String filePath="C:\\FB-dm-project\\example\\";
//		try(FileInputStream fis=new FileInputStream(filePath);
//			InputStreamReader isr=new InputStreamReader(fis);
//			BufferedReader bfr=new BufferedReader(isr);
//				){
//			
//			
//		}catch(Exception e){
//			System.out.println(e);
//		}
		String[] rootFolder = new File(filePath).list();
		
		for(String fileName:rootFolder) {
			System.out.println(fileName);
		}
		
	}

}
