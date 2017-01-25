package com.join.collection;

import java.util.ArrayList;

public class CollectionExam {
	static class PersonInfo {
		private String name;private String tel;
		PersonInfo() {name=""; tel="";}
		public String getName() {return name;}
		public void setName(String name) {this.name = name;}
		public String getTel() {return tel;}
		public void setTel(String tel) {this.tel = tel;}
	}
	public static final int MAX = 10;
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String args[]){
		String[] name = new String[MAX];
		String[] tel = new String[MAX];
		
		PersonInfo[] addressBook = new PersonInfo[MAX];
		
		ArrayList<PersonInfo> addressBook2 = new ArrayList<PersonInfo>();
		
		// 1. 데이터 저장
		int index = 0;
		while(true) {
			if(index<MAX){
				name[index] = "김우성"+index;
				tel[index] = "01011112222";
				addressBook[index] = new PersonInfo();
				addressBook[index].setName("박초롱"+index);
				addressBook[index].setTel("01033334444");
				index++;
				//
				PersonInfo info = new PersonInfo();
				info.setName("보스"+addressBook2.size());
				info.setTel("01055556666");
				addressBook2.add(info);
			}else break;
		}
		for(int i=0;i<MAX;i++){
			System.out.println(name[i]+", "+tel[i]);
		}
		for(int i=0;i<MAX;i++){
			System.out.println(addressBook[i].getName()+", "+addressBook[i].getTel());
		}
		for(int i=0;i<addressBook2.size();i++){
			PersonInfo info = addressBook2.get(i);
			System.out.println(info.getName()+", "+info.getTel());
		}
	}
}
