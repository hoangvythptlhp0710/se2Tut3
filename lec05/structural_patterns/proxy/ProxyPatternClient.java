package lecture.lec05.structural_patterns.proxy;


public class ProxyPatternClient {
	
	public static void main(String[] args) 
	{
		OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");
		
		access.grantInternetAccess();
	}


}
