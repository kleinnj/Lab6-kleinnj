import java.util.ArrayList;
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
	private static Locale currentLoc;
	private static ArrayList<String> messages =new ArrayList<String>();
	public static String date;
	public static String money;
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
		
		PrintBalance.messages.add(messages.getString("greet"));
		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		DateFormat q = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, currentLocale);
		PrintBalance.date = q.format(today);
		
		String money = NumberFormat.getCurrencyInstance(currentLocale).format(9876543.21);		
		PrintBalance.money =money;
		
		System.out.println(messages.getString("greet"));
		PrintBalance.messages.add(messages.getString("greet"));
		
		
		//Get User's Name
		System.out.println(messages.getString("prompt"));
	
		String name = scanInput.nextLine();
		System.out.println(messages.getString("pleased") + name);
	
		
		//print today's date, balance and bid goodbye
		System.out.println(messages.getString("trans")+ q.format(today));
		
		System.out.println(messages.getString("shocker") + money);
		
		System.out.println(messages.getString("farewell"));
		
		PrintBalance.messages.add(messages.getString("prompt"));
		PrintBalance.messages.add(messages.getString("pleased"));
		PrintBalance.messages.add(messages.getString("trans"));
		PrintBalance.messages.add(messages.getString("shocker"));
		PrintBalance.messages.add(messages.getString("farewell"));
	}
}
