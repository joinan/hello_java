package com.join.fileioexam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable {
	int age; int length; int weight; int speed;
	int strength; int feed; int skin; int habittat;
	static int count;
	transient int referenced;
}


public class FileIOExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체입력
		try {
			FileOutputStream fos = new FileOutputStream("object.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Animal tiger = new Animal();
			tiger.age = 2; tiger.length =3; tiger.weight=200;
			tiger.speed = 70; tiger.strength=200; tiger.feed=1;
			tiger.skin=1; tiger.habittat=1; tiger.count=100;
			tiger.referenced = 20;
			oos.writeObject(tiger);
			oos.flush();
			oos.close();
			fos.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		
		// 객체 출력
		try{
			FileInputStream fis = new FileInputStream("object.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Animal tiger2 = (Animal) ois.readObject();
			System.out.println("나이 : "+tiger2.age);
			System.out.println("길이 : "+tiger2.length);
			System.out.println("무게 : "+tiger2.weight);
			System.out.println("속도 : "+tiger2.speed);
			System.out.println("스킨 : "+tiger2.skin);
			System.out.println("서식 : "+tiger2.habittat);
			System.out.println("카운트 : "+tiger2.count);
			System.out.println("참조 : "+tiger2.referenced);
			ois.close();
			fis.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		////////////////////////////////////////////////////////////////
		try {
			FileOutputStream fos = new FileOutputStream("test.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF("홍길동");
			dos.writeDouble(95.5);
			dos.writeInt(10);  // 현재 버퍼에 저장중
			dos.flush(); // 버퍼를 비워라
			dos.close(); //	DataOutputStream을 먼저 닫고
			fos.close(); // FileOutputStream을 닫아야 된다
		} catch(Exception e){
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("test.dat");
			DataInputStream dis = new DataInputStream(fis);
			String name = dis.readUTF();
			double score = dis.readDouble();
			int age = dis.readInt();
			System.out.println("이름 : "+name);
			System.out.println("점수 : "+score);
			System.out.println("나이 : "+age);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
