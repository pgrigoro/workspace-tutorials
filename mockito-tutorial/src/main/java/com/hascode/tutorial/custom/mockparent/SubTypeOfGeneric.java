package com.hascode.tutorial.custom.mockparent;

class SubTypeOfGeneric extends GenericConstruct {

	public String doSomethingExtra() {
		System.out.println(doSomethingGeneric());
		System.out.println(doSomethingElseGeneric());
		return "this is a very extra thing I am doing";
	}
	
	public String doSomethingGeneric() {
		return "I do something not so generic";
	}	

}