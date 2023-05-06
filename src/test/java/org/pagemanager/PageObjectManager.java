package org.pagemanager;

import org.pages.LoginPage;

public class PageObjectManager {

	private static PageObjectManager pageObjectManager;
	private static LoginPage loginPage;

	private PageObjectManager() {
		
	}
	
	public static PageObjectManager getInstance() {
		return (pageObjectManager == null) ? pageObjectManager = new PageObjectManager() : pageObjectManager;
	}

	public LoginPage getLoginPage() throws Throwable {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}

}
