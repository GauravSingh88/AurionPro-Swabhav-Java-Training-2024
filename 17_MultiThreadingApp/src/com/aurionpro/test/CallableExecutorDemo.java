package com.aurionpro.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.aurionpro.model.NewTask;

public class CallableExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		Future<Integer> future = service.submit(new NewTask());
		
		try {
			System.out.println(future.get());
		} catch(InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		

	}

}
