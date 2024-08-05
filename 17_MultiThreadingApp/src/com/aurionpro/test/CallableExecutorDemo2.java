package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.aurionpro.model.NewTask;

public class CallableExecutorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService service = Executors.newCachedThreadPool();
		
//		Future<Integer> future = service.submit(new NewTask());
		List<NewTask> tasks = new ArrayList<NewTask>();
		
		tasks.add(new NewTask());
		tasks.add(new NewTask());

		tasks.add(new NewTask());

		tasks.add(new NewTask());

		tasks.add(new NewTask());

		tasks.add(new NewTask());

		
		
		try {
			
			List<Future<Integer>> futures = service.invokeAll(tasks);
			for(Future future : futures) {
				System.out.println(future.get());

			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		

	}

}
