package ifElseSwitchCase;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		String browser1 = "Chrome";
		String browser2 = "Firefox";
		String browser3 = "IE";
		String browser4 = "Safari";
		
		String launchBrowser = "Opera";
		
		if(browser1.equals(launchBrowser))
			System.out.println("Browser launched is " + browser1);
		else if(browser2.equals(launchBrowser))
				System.out.println("Browser launched is " + browser2);
		else if(browser3.equals(launchBrowser))
			      System.out.println("Browser launched is " +browser3);
		else if(browser4.equals(launchBrowser))
			System.out.println("Browser launched is " +browser4);
		else
			System.out.println(" Please pass the right browser name. ");

	}

}
