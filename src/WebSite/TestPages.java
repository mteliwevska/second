package WebSite;


	import java.awt.List;
	import java.util.ArrayList;
	
	public class TestPages {
		
		

	public static void main(String[] args)  {
		
		String htmlContent = "content";
		String titleA=AboutPage.titleA;
		String titleF=ForumPage.titleF;
		String Url = "URL5";

		
		
		AboutPage aboutpage1=new AboutPage (titleA,"URL1", htmlContent );
		AboutPage aboutpage2=new AboutPage (titleA,"URL2", htmlContent );
		
		 ForumPage forumpage1=new ForumPage (titleF,"URL3", htmlContent );
		 ForumPage forumpage2=new ForumPage (titleF,"URL4", htmlContent );
		 
		 HomePage homepage1 = new HomePage ("home page", Url, htmlContent);
		 LoginPage loginpage1= new LoginPage ("Login page",Url, htmlContent);
		 
		   ArrayList<Pages> pageList1 = new ArrayList<>();
		   pageList1.add(aboutpage1);
		   pageList1.add(aboutpage2);
		   pageList1.add(forumpage1);
		   pageList1.add(forumpage2);
		   pageList1.add(homepage1);
		   pageList1.add(loginpage1);
		   
		
		  
		  pageList1.forEach(System.out::println);
		  
		  
		  boolean Chrome ;
		  boolean FF;
		 
		  public String getChrome() { /
		      return this.getChrome();
		   }

		   public boolean setName(boolean Chrome) { 
	            return Chrome;
		   }
		
		 
		  if ( Chrome==true )
		  {
			  
		 
			public static String htmlbuilderA ( htmlContent, Chrome) { //output for About page
	
				return htmlContent;
			}
		  
			public static String htmlbuilderF (String htmlContent, Chrome) {//output for Forum page
				
				return htmlContent;
			}
			
		  }
			
			
		
	}
	private static void htmlbuilderA(String htmlContent, boolean chrome2) {
		// TODO Auto-generated method stub
		
	}
		  
		
}
