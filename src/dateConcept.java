import java.text.SimpleDateFormat;
import java.util.Date;

public class dateConcept {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toString());
		
		SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(simpleformat.format(date));
		
		SimpleDateFormat simpleformat1 = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
		System.out.println(simpleformat1.format(date));
	}

}
