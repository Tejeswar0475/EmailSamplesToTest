package EmailSamples;

import java.util.Scanner;
import java.util.regex.*;

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
}
