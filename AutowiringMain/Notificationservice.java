package ustbatchno3.Com.Autowiring;

public class Notificationservice {

		private Messageservices messageservices;
		public void notifyservice() {
			messageservices.sendmessages("hi i'm autowired");
		}
		
		public void setMessageservices(Messageservices messageservices) {
			this.messageservices = messageservices;
		}
		
		
		

}
