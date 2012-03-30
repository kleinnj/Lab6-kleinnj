
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;



public class PrintBalTest {
	
	@Test
	public void TestEnglish(){
		Locale engL = new Locale("EN","US");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", engL);
		
		PrintBalance.messages.add(messages.getString("prompt"));
		PrintBalance.messages.add(messages.getString("pleased"));
		PrintBalance.messages.add(messages.getString("trans"));
		PrintBalance.messages.add(messages.getString("shocker"));
		PrintBalance.messages.add(messages.getString("farewell"));
		PrintBalance.PrintBal("en","us");
		
		assertEquals(PrintBalance.me
	}
	

}
