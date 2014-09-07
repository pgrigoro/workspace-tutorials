package com.hascode.tutorial;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import java.util.List;

import org.junit.Test;

public class MyClass1Test {
	
	

	@Test
	public void test() {

		/*
		MyClass1 cl1 = mock(MyClass1.class);

		//when(cl1.add(2, 3)).thenReturn(99);
		
		int res = cl1.add(2, 3);
		System.out.println(res);
		*/
		
		// mock creation 
		List mockedList = mock(List.class); 
		
		// using mock object 
		mockedList.add("one"); 
		mockedList.clear(); 
		
		// selective and explicit vertification 
		verify(mockedList).add("one1"); 
		verify(mockedList).clear();

	}

}
