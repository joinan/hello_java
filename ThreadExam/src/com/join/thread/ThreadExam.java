package com.join.thread;

public class ThreadExam {
	public static void main(String args[]) {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i=0; i <10; i++) {
					System.out.println("스레드");
					try{
						Thread.sleep(1000);
					}catch(Exception e) {}
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {	
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						break;
					}
					System.out.println("SAVE--------");
				}
				System.out.println("quit-----");
			}
		});
		thread2.setDaemon(true);
		thread1.start();
		thread2.start();
		
		
		for (int i=0; i<5; i++) {
			System.out.println("메인");
			try{
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		thread2.interrupt();
		
		Thread[] multiThread = new Thread[1000];
		for (int i = 0; i<1000; i++)
			multiThread[i] = new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					for(int i =0; i<10; i++) {
						System.out.println(i+"------"+Thread.currentThread().getName());
						try{
							Thread.sleep(500);
						}catch(Exception e){}
					}
				}
			});
	}
}
