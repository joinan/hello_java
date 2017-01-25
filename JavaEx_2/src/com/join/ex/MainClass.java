package com.join.ex;

class Singleton{
	private static Singleton single = new Singleton(); // 자기자신이 static으로 생성
	private Singleton(){} // 외부에서 생성하지 못하도록 private
	public static Singleton getInstance() {
		return single; // 인스턴스를 넘겨줄 함수를 생성
	}
	public void hello(){}
}

class Singleton2 extends Singleton {
	@Override
	public void hello() {
		
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Singleton single1 = new Singleton(); private떄문에 생성할 수 없음
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		if(single1 == single2) {
			System.out.println("SAME!!"); // 같은 인스턴스를 참조하고 있기 때문에 같다
		}
	}

}
