package com.prac.def;

class mythread extends Thread {

	public void run() {
		System.out.println("this is my first thread");
	}
}

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mythread obj = new mythread();
		obj.start();
		obj.setName("Thread-Gagan");
		System.out.println("class :" + obj.getClass());
		System.out.println("id : " + obj.getId());
		System.out.println("name : " + obj.getName());
	}

}
