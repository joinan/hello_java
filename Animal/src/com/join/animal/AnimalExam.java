package com.join.animal;


public class AnimalExam {
	public static void main(String args[]) {

		// Animal pig1 = new Animal(); 에러발생, 추상클래스라 인스턴스생성불가
		Pig pig = new Pig(5);
		
//		Animal pig1 = new Animal();
//		pig1.strength = pig1.weight = 200;
//		pig1.skin = 1;
//		pig1.speed = 30;
//		pig1.life = 15; pig1.age = 2;
//		
//		Pig pig2 = new Pig(2);
//		
//		pig2.kulkul();
//		
//		Animal pig3 = pig2;
//		
//		Pig pig4 = (Pig)pig3;
//		pig4.kulkul();
//		
//		System.out.println(pig1 instanceof Animal);
//		System.out.println(pig1 instanceof Pig);
//		System.out.println(pig2 instanceof Animal);
//		System.out.println(pig2 instanceof Pig);
//		System.out.println(pig3 instanceof Animal);
//		System.out.println(pig3 instanceof Pig);
//		System.out.println(pig4 instanceof Animal);
//		System.out.println(pig4 instanceof Pig);
//		
		
//		Animal tiger1 = new Animal();
//		tiger1.strength = tiger1.weight = 310;
//		tiger1.skin = 1;
//		tiger1.speed = 65;
//		tiger1.life = 26; tiger1.age = 2;
//		
//		Pig pig = new Pig(2);
//		
//	
//		System.out.println(tiger1.attack(pig));
//		System.out.println(tiger1.strength);
//		System.out.println(pig.strength);
//		System.out.println("---------------------");
//		System.out.println(pig.attack(tiger1));
//		System.out.println(tiger1.strength);
//		System.out.println(pig.strength);
//		System.out.println("---------------------");
//
//		
/////////////////////////////////////////////////////////		
//		Animal tiger = new Animal();
//		Animal cow = new Animal();
//		tiger.feed = 1; cow.feed = 2;
//		System.out.println(tiger.eat(cow));
//		System.out.println(cow.eat(tiger));
//		Plant carret = new Plant();
//		System.out.println(tiger.eat(carret));
//		System.out.println(cow.eat(carret));
//		///////////////////////////////
//		Animal dog = new Animal();
//		dog.strength = dog.weight = 27;
//		dog.skin = 1;
//		dog.speed = 35;
//		dog.life = 15; dog.age = 8;
//		dog.feed = 3;
//		
//		tiger.strength = tiger.weight = 310;
//		tiger.skin = 1;
//		tiger.speed = 65;
//		tiger.life = 26; tiger.age = 2;
//
//		System.out.println(dog.attack(tiger));
//		System.out.println(dog.strength);
//		
//		Animal bear = new Animal();
//		bear.strength = bear.weight = 600;
//		bear.skin = 1;
//		bear.speed = 40;
//		bear.life = 20; bear.age = 3;
//		bear.feed = 3;
//		
//		System.out.println(tiger.attack(bear));
//		System.out.println(bear.strength);
//		System.out.println(bear.attack(tiger));
//		System.out.println(tiger.strength);
	}
}