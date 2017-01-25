package com.join.animal;

public class Pig extends Animal implements Eatable, Attackable, GroundHabitable, WaterHabitable {
	public Pig(int age) {
		super();
		this.length = 184;
		this.weight = this.strength = 350;
		this.speed = 20;
		this.age = age;
		this.life = 15;
		this.skin = 1;
		this.legs = 4;
		this.feed = 3;
		this.breathe = 1;
		//this.habitat = 1;
		this.horns=0;
		this.alive=true;
	}
	@Override
	public void living() {
	}
	
	@Override
	public boolean eat(Animal feed){
		if (this.alive == true) {
			int satiety = feed.weight / 5;
			this.weight += satiety;
			this.strength += satiety * 3;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean eat(Plant feed){
		if (this.alive == true) {
			int satiety = feed.weight / 10;
			this.weight += satiety;
			this.strength += satiety * 2;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean attack(Animal enemy) {
		if (this.alive == true && enemy.alive == true) {
			int defence = enemy.weight*3;
			defence = defence / (enemy.age*100/enemy.life);
			defence += enemy.speed * (Math.random()*10);
			System.out.println("방어력:"+defence);//debug 코드
			
			int attack = this.weight/2;
			attack += attack*0.3;
			attack += this.speed * (Math.random()*10);
			System.out.println("공격력:"+attack);//debug 코드
			
			int demage = attack - defence;
			if (demage > 0) {
				enemy.strength -= demage;
				if (enemy.strength < 0) enemy.alive = false;
				return true;
			}
			else if (demage < 0) {
				this.strength += demage;
				if (this.strength < 0) this.alive = false;
			}
		}
		return false;
	}
	
	void kulkul() {
		System.out.println("꿀꿀꿀");
	}
}
