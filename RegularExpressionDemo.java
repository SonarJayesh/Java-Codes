import java.util.regex.Matcher;
import java.util.regex.Pattern;
class RegularExpressionDemo{

	public static void main(String[] args){

		String Name ="Jayeh";
		String nameExp ="^[A-Z]{1}[A-Za-z]{2,}$";
		
		Pattern pattern = Pattern.compile(nameExp);
		Matcher matcher = pattern.matcher(Name);
		System.out.println("Valid Name: "+matcher.matches());

		String mobNo = "8956475871";
		Pattern pattern1 = Pattern.compile("^[0-9]{10}$");
		Matcher matcher1 = pattern1.matcher(mobNo);
		System.out.println("Valid mobNo: "+matcher1.matches());

	}
}