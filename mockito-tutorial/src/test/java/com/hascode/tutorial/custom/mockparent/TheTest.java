package com.hascode.tutorial.custom.mockparent;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

public class TheTest {

	@Test
	public void test() {
		
		SubTypeOfGeneric aSpy = Mockito.spy(new SubTypeOfGeneric());
		Mockito.doReturn("a random value").when(aSpy).doSomethingGeneric();
		//Mockito.doReturn("another random value").when(aSpy).doSomethingElseGeneric();

		//Mockito.doReturn("a random value").when((GenericConstruct) aSpy).doSomethingGeneric();
		//Mockito.doReturn("another random value").when((GenericConstruct) aSpy).doSomethingElseGeneric();

		String result = aSpy.doSomethingExtra();
		assertTrue(!result.isEmpty());

	}
}
