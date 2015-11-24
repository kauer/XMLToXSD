import java.util.regex.Pattern;

public class TypeOfContent {
	public static final String DATE = "Date";
	public static final String STRING = "String";
	public static final String FLOAT = "Float";
	public static final String BYTE = "Byte";
	
	public static String getTypeOfString(String content){
		if(isInt(content) ||
		   isLong(content)){
			return BYTE;
		}
		if(isDouble(content) ||
		   isFloat(content)){
			return FLOAT;
		}
		if(isDate(content)){
			return DATE;
		}
		return STRING;
	}
	private static boolean isDouble(String content){
		try{    
		    double d = Double.parseDouble(content);  
		}catch(NumberFormatException nfe) {  
		    return false;  
		}  
		return true;
	}
	private static boolean isFloat(String content){
		try{    
		    float f = Float.parseFloat(content);  
		}catch(NumberFormatException nfe) {  
		    return false;  
		}  
		return true;
	}
	private static boolean isInt(String content){
		try{    
		    int i = Integer.parseInt(content);  
		}catch(NumberFormatException nfe) {  
		    return false;  
		}  
		return true;
	}
	private static boolean isLong(String content){
		try{    
		    Long l = Long.parseLong(content);  
		}catch(NumberFormatException nfe) {  
		    return false;  
		}  
		return true;
	}
	private static boolean isDate(String content){
		if(isDateByHyphen(content) ||
		   isDateBySlash(content)){
			return true;
		}
		return false;
	}
	private static boolean isDateByHyphen(String content){
		String regex = "^((19|20)\\d\\d)-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$";

		return Pattern.matches(regex, content);
	}
	private static boolean isDateBySlash(String content){
		String regex = "^((19|20)\\d\\d)/(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])$";

		return Pattern.matches(regex, content);
	}
}
