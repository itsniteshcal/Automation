package methodDriven;

public class ActiValidLoginTest extends BaseClass {
	public static void main(String[] args) throws Throwable {
		BaseClass b = new BaseClass();
		//open the and enter the test url
		b.openBrowser();
		
		FileLib12 flib = new FileLib12();
		 String username = flib.getPropKey(PROP_PATH, "username");
		String pass = flib.getPropKey(PROP_PATH, "password");
		Thread.sleep(3000);
		PageObjectModelClass p = new PageObjectModelClass(driver);
		p.clickLoginbtn();
		 
		 
	}

}
