package ustbatchno3.Com.Autowiring;

public interface Messageservices {
public void sendmessages(String message);

}
class Emailservices implements Messageservices{
	public void sendmessages(String message) {
	
	System.out.println("I'm from email services " +message);
}
}
class Smsservices implements Messageservices{
	public void sendmessages(String message) {
		
		System.out.println("I'm from sms services " +message);
	}
}
