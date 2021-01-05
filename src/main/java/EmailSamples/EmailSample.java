package EmailSamples;

import java.util.regex.*;

public class EmailSample {

	String welcomeMessage(String welcomeMessage)
	{
		return welcomeMessage;
	}
	
	public static boolean emailValidation(String userInputEmail)
	{

		Pattern emailRegExp1=Pattern.compile("^([a-zA-Z0-9]+)([_+.-]{1}[a-z0-9]+)*@([A-Za-z0-9]+).([a-z]{2,4})((.[a-z]{2,3})?)$");
		Matcher matchResult1=emailRegExp1.matcher(userInputEmail);
		boolean emailResult1=matchResult1.matches();
		return emailResult1;
	}
	
}
