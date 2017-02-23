package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
    public HelloClass (String name,String period) {
        this.message = "Good " + period +"  " + "TT"+"!";
    }
    public HelloClass(int first,int second){
    	
    	int res = first - second;
    	if(res>=0)this.message = "your  result = " + res;
    	else this.message = "not a natural number ";
    }
    public String getMessage() {
        return message;
    }
}
