
import static org.junit.Assert.*;
import org.junit.Test;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;



public class PrintBalTest {
	
	@Test
	public void TestEnglish(){
		
		ArrayList<String> test = new ArrayList<String>();
		Locale engL = new Locale("EN","US");
		Date today = new Date();
		DateFormat q = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, engL);
		String todays = q.format(today);
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", engL);
		test.add(messages.getString("greet"));
	
		test.add(messages.getString("prompt"));
		test.add(messages.getString("pleased"));
		test.add(messages.getString("trans"));
		test.add(messages.getString("shocker"));
		
		test.add(messages.getString("farewell"));
		PrintBalance.PrintBal("en", "us");
		assertEquals(PrintBalance.date, todays );
		String money = NumberFormat.getCurrencyInstance(engL).format(9876543.21);
		assertEquals(PrintBalance.money, money );
		assertEquals(PrintBalance.message.toString(),test.toString());
	}
	@Test
	public void TestGerman(){
		
		ArrayList<String> test = new ArrayList<String>();
		Locale DEL = new Locale("de","de");
		Date today = new Date();
		DateFormat q = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, DEL);
		String todays = q.format(today);
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", DEL);
		test.add(messages.getString("greet"));
	
		test.add(messages.getString("prompt"));
		test.add(messages.getString("pleased"));
		test.add(messages.getString("trans"));
		test.add(messages.getString("shocker"));
		
		test.add(messages.getString("farewell"));
		PrintBalance.PrintBal("de", "de");
		assertEquals(PrintBalance.date, todays );
		String money = NumberFormat.getCurrencyInstance(DEL).format(9876543.21);
		assertEquals(PrintBalance.money, money );
		assertEquals(PrintBalance.message.toString(), test.toString());
		
	}
	@Test
	public void TestFrench(){

		ArrayList<String> test = new ArrayList<String>();
		Locale FrL = new Locale("fr","fr");
		Date today = new Date();
		DateFormat q = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, FrL);
		String todays = q.format(today);
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", FrL);
		test.add(messages.getString("greet"));
	
		test.add(messages.getString("prompt"));
		test.add(messages.getString("pleased"));
		test.add(messages.getString("trans"));
		test.add(messages.getString("shocker"));
		
		test.add(messages.getString("farewell"));
		PrintBalance.PrintBal("Fr", "Fr");
		assertEquals(PrintBalance.date, todays );
		String money = NumberFormat.getCurrencyInstance(FrL).format(9876543.21);
		assertEquals(PrintBalance.money, money );
		assertEquals(PrintBalance.message.toString(), test.toString());
	}
	
	

}