package com.example.demo.exception;

public class TraineeNotFoundException extends RuntimeException 
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public TraineeNotFoundException()
   {}
   
   public TraineeNotFoundException(String msg)
   {
	  super(msg);
   }
}
