package EmailSamples;

import java.util.Scanner;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailSampleTest {

	@Test
	public void welcomeMessageTest()
	{
		EmailSample emailSample=new EmailSample();
		String welcomeMessageResult=emailSample.welcomeMessage("Welcome to email Sample");
		assertSame("Welcome to email Sample",welcomeMessageResult);
	}
	
	EmailSample emailSampleForMail=new EmailSample();
	
	@Test
	public void userEmailTest()
	{
		System.out.println("Enter mail");
		Scanner scanner = new Scanner(System.in);
		String userInputEmail=scanner.nextLine();
		boolean emailResult=EmailSample.emailValidation(userInputEmail);	
		assertEquals(true, emailResult);
	}
	
	
	
	
}
