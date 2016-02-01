package utilities;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class NTLMAuthenticator extends Authenticator {

	private String user;
	private String password;

	public NTLMAuthenticator(String user, String password) {
		this.user = user;
		this.password = password;
	}

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		PasswordAuthentication auth = new PasswordAuthentication(user, password.toCharArray());
		return auth;
	}

}
