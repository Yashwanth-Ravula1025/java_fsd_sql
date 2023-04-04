package ustbatchno3.Spring_ioc;

public interface Sim {
	public void calling();
		
	
	public void dailling(); 

}
class Jio implements Sim{

	public void calling() {
		System.out.println("I am calling from the Jio Sim");
		
	}

	public void dailling() {
		System.out.println("I am dialing from the Jio Sim");
		
	}
}
	class Airtel implements Sim{

		public void calling() {
			System.out.println("I am calling from the Airtel Sim");
			
		}

		public void dailling() {
			System.out.println("I am dialing from the Airtel Sim");
			
		}
	}
	class Vi implements Sim{

		public void calling() {
			System.out.println("I am calling from the Vi Sim");
			
		}

		public void dailling() {
			System.out.println("I am dailing from the Vi Sim");
			
		}
		
	}
