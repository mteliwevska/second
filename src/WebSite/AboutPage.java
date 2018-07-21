package iWebSIte;

import src.iWebSIte.AboutPage;
import src.iWebSIte.Pages;
import src.iWebSIte.String;

public class AboutPage extends Pages {



	private static final java.lang.String Html = null;

	public AboutPage(String title, String Url, String htmlContent) {
		
		// TODO Auto-generated constructor stub
	}
	public static String titleA="That is the About Page title";
	private String url;
	private String htmlContent;



	// TODO Auto-generated constructor stub
	


	htmlContent="html";
	
	 AboutPage aboutpage1 = new AboutPage (titleA, url, htmlContent);
	 aboutpage1.url="url1";

	 AboutPage aboutpage2 = new AboutPage (titleA, url, htmlContent);
	 aboutpage2.url="url2";
}
boolean isChrome ;
boolean IsFF;

public boolean isChrome() {
	return isChrome;
}

public void setChrome(boolean isChrome) {
	this.isChrome = isChrome;
}

public boolean isIsFF() {
	return IsFF;
}

public void setIsFF(boolean isFF) {
	IsFF = isFF;
}

String htmlbuilderA (String htmlContent, boolean isChrome) {

return Html;

}
}


}