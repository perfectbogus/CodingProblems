package dev.perfectbogus.linkedinL.garbageCollection.example;

public class Main {
	
	public static void main(String[] args) 
	{
		Runtime runtime = Runtime.getRuntime();

		long availableBytes = runtime.freeMemory();
		System.out.println("Available memory (Start): " + availableBytes / 1024 + "k");

		// let's create a ton of garbage....
		Customer c;
		for (int i=0; i<1000000; i++)
		{
			c = new Customer("John");	
		}
		
		availableBytes = runtime.freeMemory();
		System.out.println("Available memory (Before GC): " + availableBytes / 1024 + "k");
		
		System.gc();
		
		availableBytes = runtime.freeMemory();
		System.out.println("Available memory (After GC): " + availableBytes / 1024 + "k");
	}

	
}
