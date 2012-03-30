import java.util.Date;
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import java.text.DateFormat;



/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2011.
 */
public class PrintBalance{
	public static void main(String args[])
	{
		Scanner scanInput = new Scanner(System.in);
		System.out.println("enter L, then C");
		String L = scanInput.nextLine();
		String C = scanInput.nextLine();
		PrintBal(L,C);
	}
	
	
	public static void PrintBal(String L, String C){
		
		
		Locale currentLocale = new Locale(L,C);
	
	
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		
	
		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		DateFormat q = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, currentLocale);
		q.format(today);
		
		String money = NumberFormat.getCurrencyInstance(currentLocale).format(9876543.21);		
		//Greeting
		System.out.println(messages.getString("greet"));
		
		//Get User's Name
		System.out.println(messages.getString("prompt"));
		String name = scanInput.nextLine();
		System.out.println(messages.getString("pleased") + name);
		
		//print today's date, balance and bid goodbye
		System.out.println(messages.getString("trans")+ q.format(today));
		System.out.println(messages.getString("shocker") + money);
		System.out.println(messages.getString("farewell"));
	}
}
