package com.edureka.TestApp;

import org.junit.Test;

public class testPara {
	
	@Test
	public void printParameter(){
		
		System.out.println(System.getenv("var1"));
		System.out.println(System.getenv("var2"));
		System.out.println(System.getenv("var3"));
	}

}
