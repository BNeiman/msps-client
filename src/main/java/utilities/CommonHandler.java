package utilities;
import org.apache.commons.codec.binary.Base64;

public class CommonHandler {
    // Decode the parameter passed
    public static String decode(String parameter) {
    	
    	String decodedParameter = new String(Base64.decodeBase64(parameter.getBytes()));
    	
    	return decodedParameter;
    } 	
}
