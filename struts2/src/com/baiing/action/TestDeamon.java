package com.baiing.action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;


class Mydeamon implements Runnable{

	@Override
	public void run() {
		System.out.println("进入到守护线程");
				
		try {
			write();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("退出守护线程");
		
	}
	
	private void write() throws IOException, Exception{
		File file = new File("d:"+File.separator+"/test.txt");
		OutputStream os = new FileOutputStream(file,true);
		int count = 0;
		while(count<999){
			os.write(("\r\nword"+count).getBytes());
			System.out.println("守护线程"+Thread.currentThread().getName()+"想文件中写入了word"+count++);
			Thread.sleep(1000);
		}
	}
}

public class TestDeamon {

	public static void main(String[] args) {
		System.out.println("进入到主线程");
		
		Mydeamon mydeamon = new Mydeamon();
		Thread tt = new Thread(mydeamon);
		tt.setDaemon(true);
		
		tt.start();
		Scanner sc = new Scanner(System.in);
		sc.next();
		
		System.out.println("退出到主线程");
	}
	
}
