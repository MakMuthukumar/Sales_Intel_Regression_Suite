package org.pages;

import java.util.List;

import org.base.Global;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Global {

	public LoginPage() throws Throwable {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Search by Email Address']")
	private WebElement EmailInputBoxInResearch;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement userName;

	@FindBy(xpath = "(//button[@type='button' and contains(text(),'Request')])[1]")
	private WebElement RequestVerificationButton;

	@FindBy(xpath = "//div[contains(text(),'Jonathan Kirst')]")
	private WebElement RODreqestedInRODtab;

	@FindBy(xpath = "//a[@class='nav-link' and contains(text(),'RoD')]")
	private WebElement RoDTab;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginCTA;

	@FindBy(xpath = "//span[text()='Name']")
	private WebElement ContactName;

	@FindBy(xpath = "//*[@name='firstName']")
	private WebElement FirstName;

	@FindBy(xpath = "//*[@name='lastName']")
	private WebElement LastName;

	@FindBy(xpath = "(//span[contains(text(),'Email')])[1]")
	private WebElement contactemail;

	@FindBy(xpath = "//*[@type='submit' and @class='btn btn-primary btn-search']")
	private WebElement SearchButton;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement SearchButtonForResearch;

	@FindBy(xpath = "//th[contains(text(),'Contact Id')]/../../../tbody/tr/td[2]/a")
	private WebElement SearchedContactInResearch;

	@FindBy(xpath = "(//*[@type='submit' and @class='btn btn-primary btn-search'])[1]")
	private WebElement CompanySearchButton;

	@FindBy(xpath = "(//div[contains(text(),'Company Name or Domain')]//following::input[@type='text' and @aria-autocomplete='list'])[1]")
	private WebElement CompanyInput;

	@FindBy(xpath = "//*[contains(text(),'FAQ')]")
	private WebElement Faq;

	@FindBy(xpath = "//*[@class='page-title mb-0' and contains(text(),'Login')]")
	private WebElement LoginTitle;

	@FindBy(xpath = "//span[text()='Company']")
	private WebElement CompanyName;

	@FindBy(xpath = "//*[@placeholder='Email']")
	private WebElement EmailPlaceholder;

	@FindBy(xpath = "(//*[contains(text(),'Data Enrichment')])[3]")
	private WebElement Scrolldown;

	@FindBy(xpath = "//*[contains(text(),'Type Company Name or Domain')]")
	private WebElement Scrollup;

	@FindBy(xpath = "//*[@placeholder='Password']")
	private WebElement PasswordPlaceholder;

	@FindBy(xpath = "//*[contains(text(),' Remember me')]")
	private WebElement RememberMe;

	@FindBy(xpath = "//*[@type='submit' and contains(text(),'Login')]")
	private WebElement LoginButton;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement LogoutButtonInResearch;

	@FindBy(xpath = "//*[@type='submit' and contains(text(),'LOGIN')]")
	private WebElement LoginButtonRes;

	@FindBy(xpath = "//span[@class='search-option-label' and contains(text(),'Contacts')]")
	private WebElement newContactradiobutton;

	@FindBy(xpath = "(//span[@class='search-option-label']//preceding-sibling::input[@type='radio' and contains(@class,'form-check-input')])[2]")
	private WebElement newuniversalContactradiobutton;

	@FindBy(xpath = "//span[@class='search-option-label' and contains(text(),'Companies')]")
	private WebElement newCompanyradiobutton;

	@FindBy(xpath = "//*[contains(text(),'Forgot Password')]")
	private WebElement ForgotPassword;

	@FindBy(xpath = "//*[contains(text(),'Please enter a valid Username.')]")
	private WebElement InvalidUsernameResult;

	@FindBy(xpath = "//*[contains(text(),'Username is')]")
	private WebElement InvalidUsernamepasswordResult;

	@FindBy(xpath = "//*[contains(text(),'Password is')]")
	private WebElement InvalidpasswordUsernameResult;

	@FindBy(xpath = "(//div[contains(text(),'Contact')])[2]")
	private WebElement Contactsection;

	@FindBy(xpath = "//*[contains(text(),'No Contacts Found')]")
	private WebElement ContactSearchwithInteger;

	@FindBy(xpath = "//*[@placeholder='Email']")
	private WebElement ForgetPasswordEmail;

	@FindBy(xpath = "//*[contains(text(),'Reset Password')]")
	private WebElement ResetPasswordButton;

	@FindBy(xpath = "(//span[contains(text(),'--Select--')])[1]/../../../span")
	private WebElement ContactListDropdown;

	@FindBy(xpath = "(//span[contains(text(),'--Select--')])[1]/../../../span")
	private WebElement CompanyListDropdown;

	@FindBy(xpath = "//*[@placeholder='Work or Personal Email']")
	private WebElement ContactEmailInputbox;

	@FindBy(xpath = "//span[contains(text(),'Level')]")
	private WebElement ContactJobLevel;

	@FindBy(xpath = "//Label[contains(text(),'Board Members')]")
	private WebElement BoardMemberJobLevelFilter;

	@FindBy(xpath = "(//div[contains(text(),'Board Member')])[1]")
	private WebElement BoardMemberJobLevelInResult;

	@FindBy(xpath = "(//div[contains(text(),'C-level Executive')])[1]")
	private WebElement ClevelExecutiveJobLevelInResult;

	@FindBy(xpath = "(//div[contains(text(),'Vice President')])[1]")
	private WebElement VicePresidentJobLevelInResult;

	@FindBy(xpath = "(//div[contains(text(),'Director')])[1]")
	private WebElement DirectorsJobLevelInResult;

	@FindBy(xpath = "(//div[contains(text(),'Manager')])[1]")
	private WebElement ManagersJobLevelInResult;

	@FindBy(xpath = "(//div[contains(text(),'Key Influencer')])[1]")
	private WebElement KeyInfluencersJobLevelInResult;

	@FindBy(xpath = "//*[contains(text(),'Role')]")
	private WebElement Rolesection;

	@FindBy(xpath = "(//span[contains(text(),'Department')])[1]")
	private WebElement DepartmentFilter;

	@FindBy(xpath = "(//span[contains(text(),'Finance')])[2]")
	private WebElement FinanceDepartmentFilter;

	@FindBy(xpath = "//span[contains(text(),'HR')]/../../../input")
	private WebElement HrDepartmentFilter;

	@FindBy(xpath = "(//span[contains(text(),'IT')])[1]")
	private WebElement ITDepartmentFilter;

	@FindBy(xpath = "//span[contains(text(),'Legal')]")
	private WebElement LegalDepartmentFilter;

	@FindBy(xpath = "(//span[contains(text(),'Marketing')])[1]")
	private WebElement MarketingDepartmentFilter;

	@FindBy(xpath = "(//div[contains(text(),'Marketing')])[1]")
	private WebElement MarketingDepartmentInResult;

	@FindBy(xpath = "(//div[contains(text(),'Legal')])[1]")
	private WebElement LegalDepartmentInResult;

	@FindBy(xpath = "(//div[contains(text(),'HR')])[1]")
	private WebElement HrDepartmentInResult;

	@FindBy(xpath = "(//div[contains(text(),'IT')])[1]")
	private WebElement ITDepartmentInResult;

	@FindBy(xpath = "(//div[contains(text(),'Finance')])[1]")
	private WebElement FinanceDepartmentInResult;

	@FindBy(xpath = "(//span[contains(text(),'Operations')])[1]")
	private WebElement OperationsDepartmentFilter;

	@FindBy(xpath = "(//div[contains(text(),'Operations')])[1]")
	private WebElement OperationsDepartmentInResult;

	@FindBy(xpath = "//span[contains(text(),'Procurement')]")
	private WebElement ProcurementDepartmentFilter;

	@FindBy(xpath = "(//div[contains(text(),'Procurement')])[1]")
	private WebElement ProcurementDepartmentInResult;

	@FindBy(xpath = "//span[contains(text(),'R&D')]")
	private WebElement RndDepartmentFilter;

	@FindBy(xpath = "(//div[contains(text(),'R&D')])[1]")
	private WebElement RndDepartmentInResult;

	@FindBy(xpath = "(//span[contains(text(),'Sales')])[1]")
	private WebElement SalesDepartmentFilter;

	@FindBy(xpath = "(//div[contains(text(),'Sales')])[1]")
	private WebElement SalesDepartmentIn_Result;

	@FindBy(xpath = "//span[contains(text(),'Cross Functional')]")
	private WebElement CrossFunctionalDepartmentFilter;

	@FindBy(xpath = "(//div[contains(text(),'Cross Function')])[1]")
	private WebElement CrossFunctionalDepartmentInResult;

	@FindBy(xpath = "(//span[contains(text(),'Job Level')]//following::input[@type='checkbox'])[1]")
	private WebElement JobLevelSelectAll;

	@FindBy(xpath = "(//span[contains(text(),'Job Level')]//following::input[@type='checkbox'])[2]")
	private WebElement JobBoardMember;

	@FindBy(xpath = "//Label[contains(text(),'C-level Executive')]")
	private WebElement JobclevelexecutiveFilter;

	@FindBy(xpath = "//Label[contains(text(),'Vice Presidents')]")
	private WebElement VicePrecidentsJobLevelFilter;

	@FindBy(xpath = "//Label[contains(text(),'Directors')]")
	private WebElement DirectorsJobLevelFilter;

	@FindBy(xpath = "//Label[contains(text(),'Managers')]")
	private WebElement ManagersJobLevelFilter;

	@FindBy(xpath = "//Label[contains(text(),'Key Influencers')]")
	private WebElement KeyInfluencersJobLevelFilter;

	@FindBy(xpath = "//Span[contains(text(),'Title')]")
	private WebElement TitleFilter;

	@FindBy(xpath = "//textarea[@name='jobTitle']")
	private WebElement TitleTextField;

	@FindBy(xpath = "(//Span[contains(text(),'Location')])[1]")
	private WebElement LocationFilter;

	@FindBy(xpath = "(//Span[contains(text(),'Location')])[2]")
	private WebElement ContactLocationFilter;

	@FindBy(xpath = "(//div[contains(text(),'States')])[1]")
	private WebElement StateField;

	@FindBy(xpath = "//div[contains(text(),'California')]")
	private WebElement CaliforniaState;

	@FindBy(xpath = "(//Span[contains(text(),'CA')])[1]")
	private WebElement CaliforniaInResult;

	@FindBy(xpath = "(//a[contains(text(),'Zip Code')])[1]")
	private WebElement ZipCodePage;

	@FindBy(xpath = "(//a[contains(text(),'Zip Code')])[2]")
	private WebElement ContactZipCodePage;

	@FindBy(xpath = "(//a[contains(text(),'State')])[1]")
	private WebElement StatePage;

	@FindBy(xpath = "//input[@placeholder='e.g. 20001']")
	private WebElement ZipCodeTextField;

	@FindBy(xpath = "(//Select)[2]")
	private WebElement MilesSelectBox;

	@FindBy(xpath = "(//a[contains(text(),'Metro Area')])[1]")
	private WebElement MetroAreaPage;

	@FindBy(xpath = "(//a[contains(text(),'Metro Area')])[2]")
	private WebElement MetroAreaPageForContact;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement MetroAreaTextField;

	@FindBy(xpath = "(//div[contains(text(),'Metro Areas')])[1]/../div[2]/input")
	private WebElement MetroAreaTextFieldForContact;

	@FindBy(xpath = "(//span[contains(text(),'Albany, GA')])[2]")
	private WebElement MetroAreatInSearchResult;

	@FindBy(xpath = "(//input[@type='radio'])[3]")
	private WebElement NonUsaRadioButton;

	@FindBy(xpath = "(//input[@type='radio'])[5]")
	private WebElement NonUsaRadioButtonForContact;

	@FindBy(xpath = "(//input[@type='radio'])[3]")
	private WebElement GlobalRadioButton;

	@FindBy(xpath = "(//input[@type='radio'])[6]")
	private WebElement GlobalRadioButtonForContact;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement CountryBox;

	@FindBy(xpath = "(//input[@type='text'])[15]")
	private WebElement CountryBoxForContact;

	@FindBy(xpath = "//span[contains(text(),'Keywords')]")
	private WebElement KeywordsFilter;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement KeywordsInputBox;

	@FindBy(xpath = "(//span[contains(text(),'Industry')])[1]")
	private WebElement IndustryFilter;

	@FindBy(xpath = "//a[contains(text(),'NAICS or SIC')]")
	private WebElement NAICSorSICpage;

	@FindBy(xpath = "//label[contains(text(),'SIC Codes')]")
	private WebElement SICcodeRadioButton;

	@FindBy(xpath = "//span[contains(text(),'Revenue')]")
	private WebElement RevenueFilter;

	@FindBy(xpath = "//span[contains(text(),'Employees / Size')]")
	private WebElement EmployeeSizeFilter;

	@FindBy(xpath = "//input[@placeholder='no min.']")
	private WebElement MinRevenueInputBox;

	@FindBy(xpath = "//input[@placeholder='no minimum']")
	private WebElement MinEmpSizeInputBox;

	@FindBy(xpath = "//input[@placeholder='no max.']")
	private WebElement MaxRevenueInputBox;

	@FindBy(xpath = "//input[@placeholder='no maximum']")
	private WebElement MaxEmpSizeInputBox;

	@FindBy(xpath = "(//div[@class='td col-2'])[1]")
	private WebElement RevenueInSearchResult;

	@FindBy(xpath = "(//div[contains(text(),'Company Size')]/..)/span")
	private WebElement EmpSizeInSearchResult;

	@FindBy(xpath = "//div[contains(text(),'Technographics')]")
	private WebElement Technographics;

	@FindBy(xpath = "//span[contains(text(),'Products')]")
	private WebElement ProductFilter;

	@FindBy(xpath = "//span[contains(text(),'Providers')]")
	private WebElement ProviderFilter;

	@FindBy(xpath = "(//label[contains(text(),'Select All')])[3]")
	private WebElement SelectAllCheckBoxForCategories;

	@FindBy(xpath = "//span[contains(text(),'Categories')]")
	private WebElement CategoriesFilter;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement ProductTestBox;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	private WebElement ProviderTextBox;

	@FindBy(xpath = "(//input[@type='text'])[13]")
	private WebElement CategoryTextBox;

	@FindBy(xpath = "(//input[@type='checkbox' and @title])[2]/../../div[3]/div[1]/a")
	private WebElement CompanyNameInResult;

	@FindBy(xpath = "//th[contains(text(),'Products')]/../../../tbody/tr[2]/td[2]/table/tr/td[2]/div/div")
	private WebElement ProductInResult;

	@FindBy(xpath = "//th[contains(text(),'Products')]/../../../tbody/tr[2]/td[2]/table/tr/td[1]")
	private WebElement ProviderInResult;

	@FindBy(xpath = "//th[contains(text(),'Categories')]/../../../tbody/tr[2]/td/span[2]")
	private WebElement CategoryInResult;

	@FindBy(xpath = "//div[contains(text(),' There are no technographics matching your search')]")
	private WebElement NoTechnographyIsMatching;

	@FindBy(xpath = "(//button[@type='button' and contains(text(),'ALL')])[1]")
	private WebElement ALLButtonInProduct;

	@FindBy(xpath = "(//button[@type='button' and contains(text(),'ALL')])[2]")
	private WebElement ALLButtonInProvider;

	@FindBy(xpath = "(//button[@type='button' and contains(text(),'ALL')])[3]")
	private WebElement ALLButtonInCategory;

	@FindBy(xpath = "(//button[@type='button' and contains(text(),'NONE')])[1]")
	private WebElement NoneButtonInProduct;

	@FindBy(xpath = "(//button[@type='button' and contains(text(),'NONE')])[2]")
	private WebElement NoneButtonInProvider;

	@FindBy(xpath = "(//button[@type='button' and contains(text(),'NONE')])[3]")
	private WebElement NoneButtonInCategory;

	@FindBy(xpath = "//a[contains(text(),'« Back to search results')]")
	private WebElement BackToSearchResults;

	@FindBy(xpath = "//label[contains(text(),'All')]")
	private WebElement AllButton;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement SearchInputBox;

	@FindBy(xpath = "//a[@id='brand-logo']")
	private WebElement SalesIntelLogo;

	@FindBy(xpath = "//div[contains(text(),'Intent')]")
	private WebElement INTENT;

	@FindBy(xpath = "//span[contains(text(),'Score Threshold')]")
	private WebElement ScoreThresHoldFilter;

	@FindBy(xpath = "//span[contains(text(),'Topic Threshold')]")
	private WebElement TopicThresHoldFilter;

	@FindBy(xpath = "//span[contains(text(),'Rankings')]")
	private WebElement RankingFilter;

	@FindBy(xpath = "(//label[contains(text(),'Select All')])[5]")
	private WebElement SelectAllForRankings;

	@FindBy(xpath = "//label[contains(text(),' 100 Fastest Growing')]")
	private WebElement SelectFirstCheckBoxForRankings;

	@FindBy(xpath = "//span[contains(text(),'Your Lists')]")
	private WebElement YourListsFilter;

	@FindBy(xpath = "//span[contains(text(),'Results Include')]")
	private WebElement ResultIncludeFilter;

	@FindBy(xpath = "//span[contains(text(),'Last Modified')]")
	private WebElement LastModifiedFilter;

	@FindBy(xpath = "//*[@id='collapseBasic']/app-last-modified/div/div[2]/ng-select/div/div/div[2]")
	private WebElement LastModifiedDropDown;

	@FindBy(xpath = "//button[@class='previous']")
	private WebElement PreviousMonthInCalndar;

	@FindBy(xpath = "//table[@role='grid']/tbody/tr[2]/td[2]")
	private WebElement CustomDateForLastModified;

	@FindBy(xpath = "//table[@role='grid']/tbody/tr[2]/td[2]/../../../../../div[1]/bs-datepicker-navigation-view/button[2]/span")
	private WebElement MonthFromCustomDate;

	@FindBy(xpath = "//table[@role='grid']/tbody/tr[2]/td[2]/../../../../../div[1]/bs-datepicker-navigation-view/button[3]/span")
	private WebElement YearFromCustomDate;

	@FindBy(xpath = "//span[contains(text(),'Within last 21 days')]")
	private WebElement LastModifiedWithin21Days;

	@FindBy(xpath = "//span[contains(text(),'Within last 30 days')]")
	private WebElement LastModifiedWithin30Days;

	@FindBy(xpath = "//span[contains(text(),'Within last 7 days')]")
	private WebElement LastModifiedWithin7Days;

	@FindBy(xpath = "//span[contains(text(),'Within last 14 days')]")
	private WebElement LastModifiedWithin14Days;

	@FindBy(xpath = "(//span[contains(text(),'Custom')])[2]")
	private WebElement CustomForLastModified;

	@FindBy(xpath = "//label[contains(text(),'Address')]")
	private WebElement AddressCheckBox;

	@FindBy(xpath = "//label[contains(text(),'Any Phone')]")
	private WebElement AnyPhoneCheckBox;

	@FindBy(xpath = "//label[contains(text(),'Any Direct Phone')]")
	private WebElement AnyDirectPhoneCheckBox;

	@FindBy(xpath = "//label[contains(text(),'Any Mobile Phone')]")
	private WebElement AnyMobilePhoneCheckBox;

	@FindBy(xpath = "//label[contains(text(),'Personal Email')]")
	private WebElement PersonalEmailCheckBox;

	@FindBy(xpath = "//label[contains(text(),'Linkedin Url')]")
	private WebElement LinkedInUrlCheckBox;

	@FindBy(xpath = "//label[contains(text(),'Title')]")
	private WebElement TitleCheckBox;

	@FindBy(xpath = "//strong[contains(text(),'Contact List')]")
	private WebElement ContactListFilter;

	@FindBy(xpath = "//td[contains(text(),'Contact List')]")
	private WebElement ContactListForDataEnrichment;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	private WebElement NextButton;

	@FindBy(xpath = "//input[@placeholder='Enter a name for your list']")
	private WebElement ListNameForDataEnrichment;

	@FindBy(xpath = "//button[@type='button' and contains(text(),'Save')]")
	private WebElement SaveListForDatanrichment;

	@FindBy(xpath = "//button[contains(text(),'Close')]")
	private WebElement CloseButton;

	@FindBy(xpath = "//strong[contains(text(),'Company List')]/../div/div/label/input")
	private WebElement AllCompanyList;

	@FindBy(xpath = "//strong[contains(text(),'Contact List')]/../div/div/label/input")
	private WebElement AllContactList;

	@FindBy(xpath = "//strong[contains(text(),'Suppression List')]/../div/div/label/input")
	private WebElement AllSuppressionList;

	@FindBy(xpath = "//strong[contains(text(),'RoD List')]/../div/label/input")
	private WebElement AllRODList;

	@FindBy(xpath = "//strong[contains(text(),'RoD List')]/../div/div/label[1]")
	private WebElement OneRODList;

	@FindBy(xpath = "//strong[contains(text(),'RoD List')]")
	private WebElement RODList;

	@FindBy(xpath = "//strong[contains(text(),'Company List')]/../div/div/div/label[1]")
	private WebElement OneCompanyList;

	@FindBy(xpath = "//strong[contains(text(),'Contact List')]/../div/div/div/label[4]")
	private WebElement OneContactList;

	@FindBy(xpath = "//strong[contains(text(),'Suppression List')]/../div/div/div/label/input")
	private WebElement OneSuppressionList;

	@FindBy(xpath = "(//input[@type='checkbox' and @title])[2]/../../../../div[1]/div/div[3]/div[1]/..")
	private WebElement FirstCompanyInResult;

	@FindBy(xpath = "(//input[@type='checkbox' and @title])[2]/../../../../../div/div[1]/div/div[3]/div[1]/a")
	private WebElement FirstCompanyLinkInResult;

	@FindBy(xpath = "(//span[contains(text(),'Netflix') or contains(text(),'Hulu')])[3]")
	private WebElement TopicThresholdInResult;

	@FindBy(xpath = "//input[@type='range' and @name='score']")
	private WebElement ScoreThresholdMover;

	@FindBy(xpath = "//input[@type='range' and @name='threshold']")
	private WebElement TopicThresholdMover;

	@FindBy(xpath = "(//span[contains(text(),'Topic')])[1]")
	private WebElement TopicFilter;

	@FindBy(xpath = "//span[contains(text(),'Netflix')]")
	private WebElement NetflixTopic;

	@FindBy(xpath = "//span[contains(text(),'Hulu')]")
	private WebElement HuluTopic;

	@FindBy(xpath = "(//span[contains(text(),'Netflix')])[2]")
	private WebElement NetflixTopicInResult;

	@FindBy(xpath = "//input[@placeholder='Enter Industry Name']")
	private WebElement IndustryNameInputBox;

	@FindBy(xpath = "(//input[@placeholder='Filter by name...' and @type='text'])[1]")
	private WebElement SearchByNameInput;

	@FindBy(xpath = "(//input[@placeholder='Filter by name...' and @type='text'])[2]")
	private WebElement SearchByNameInputInList;

	@FindBy(xpath = "//div[contains(text(),'No Records Found')]")
	private WebElement NoRecordForSavedSearch;

	@FindBy(xpath = "//label[contains(text(),' Include Team Searches')]/input")
	private WebElement IncludeTeamCheckBox;

	@FindBy(xpath = "//strong[contains(text(),'Name')]/../../../../../../article/div[1]/div/div/div/div[1]/div/div[2]/span/span")
	private WebElement FirstSearchedContact;

	@FindBy(xpath = "//strong[contains(text(),'Name')]/../../../../../../article/div[1]/div/div/div/div[1]/div/div[2]/span/span")
	private WebElement FirstSearchedContactName;

	@FindBy(xpath = "(//strong[contains(text(),'NAME')])[1]/../../../../tbody/tr[1]/td[1]/div/span")
	private WebElement FirstSavedSearchName;

	@FindBy(xpath = "(//span[contains(text(),'')]/../../../td[2]/div[contains(text(),'Private')])[1]")
	private WebElement VisibilityAsPrivateInSavedSearch;

	@FindBy(xpath = "(//span[contains(text(),'')]/../../../td[2]/div[contains(text(),'Team')])[1]")
	private WebElement VisibilityAsTeamInSavedSearch;

	@FindBy(xpath = "//strong[contains(text(),'Location')]/../../../../article/div[1]/div/div/div/div[5]/div")
	private WebElement FirstSearchedContactLocation;

	@FindBy(xpath = "//strong[contains(text(),'Location')]/../../../../article/div[1]/div/div[2]/app-contact-overview/section/article/div/div[2]/div[2]/div[contains(text(),'Personal Email')]")
	private WebElement PersonalEmailInResult;

	@FindBy(xpath = "//strong[contains(text(),'Location')]/../../../../article/div[1]/div/div[2]/app-contact-overview/section/article/div/div[2]/div[1]/span")
	private WebElement WorkEmailInResult;

	@FindBy(xpath = "//strong[contains(text(),'Location')]/../../../../article/div[1]/div/div[1]/div/div[1]/div/div/div/a[1]")
	private WebElement LinkedInUrlInResult;

	@FindBy(xpath = "//strong[contains(text(),'Location')]/../../../../article/div[1]/div/div[1]/div/div[2]/span/span")
	private WebElement TitleInSearchResult;

	@FindBy(xpath = "//label[contains(text(),'Last Updated')]/../div/p")
	private WebElement LastUpdatedDateFromRes;

	@FindBy(xpath = "//strong[contains(text(),'Location')]/../../../../article/div[1]/div/div[2]/app-contact-overview/section/article/div/div[1]/div/div/span[contains(text(),'Mobile')]")
	private WebElement MobilePhoneInResult;

	@FindBy(xpath = "//strong[contains(text(),'Location')]/../../../../article/div[1]/div/div[2]/app-contact-overview/section/article/div/div[1]/div/div/span[contains(text(),'Direct Phone')]")
	private WebElement DirectPhoneInResult;

	@FindBy(xpath = "(//label[contains(text(),' Select All ')])[1]")
	private WebElement SelectAllCheckBox;

	@FindBy(xpath = "//div[@title='Albany, OR']")
	private WebElement AlbanyORMetroArea;

	@FindBy(xpath = "(//div[contains(text(),'Manager')])[1]")
	private WebElement TitleInResult;

	@FindBy(xpath = "//span[contains(text(),'wabdelati@imf.org')]")
	private WebElement EmailInResult;

	@FindBy(xpath = "//span[contains(text(),'Wafa Abdelati')]")
	private WebElement SearchedContact;

	@FindBy(xpath = "(//span[contains(text(),'Job Level')]//following::input[@type='checkbox'])[4]")
	private WebElement JobVicepresident;

	@FindBy(xpath = "(//span[contains(text(),'Level')]//following::input[@type='checkbox'])[5]")
	private WebElement JobDirectors;

	@FindBy(xpath = "(//strong[contains(text(),'NAME')])[1]")
	private WebElement NameColumn;

	@FindBy(xpath = "(//span[contains(text(),'Job Level')]//following::input[@type='checkbox'])[6]")
	private WebElement JobManagers;

	@FindBy(xpath = "(//span[contains(text(),'Job Level')]//following::input[@type='checkbox'])[7]")
	private WebElement JobKeyinfluence;

	private String Contact_search_Name1 = ReadDatafromJson("Contact_Name", "ContactSearch1");

	@FindBy(xpath = "(//strong[@class='cursor-pointer'])[1]")
	private WebElement SortbyName;

	@FindBy(xpath = "(//strong[@class='cursor-pointer'])[2]")
	private WebElement SortbyJobTitle;

	@FindBy(xpath = "(//strong[@class='cursor-pointer'])[3]")
	private WebElement SortbyLevel;

	@FindBy(xpath = "(//strong[@class='cursor-pointer'])[4]")
	private WebElement SortbyDept;

	@FindBy(xpath = "(//strong[@class='cursor-pointer'])[5]")
	private WebElement SortbyComp;

	@FindBy(xpath = "(//strong[@class='cursor-pointer'])[6]")
	private WebElement SortbyLocation;

	@FindBy(xpath = "//*[contains(text(),'Vanessa DaSilva')]")
	private WebElement ContactSearch1;

	@FindBy(xpath = "//*[contains(text(),'Greg Eyrich')]")
	private WebElement ContactSearch2;

	@FindBy(xpath = "//*[contains(text(),'Greg Farrah')]")
	private WebElement ContactSearch3;

	@FindBy(xpath = "//*[contains(text(),'Mark Fasano')]")
	private WebElement ContactSearch4;

	@FindBy(xpath = "//*[contains(text(),'John Flagg')]")
	private WebElement ContactSearch5;

	@FindBy(xpath = "//button[contains(@class,'btn btn-sm btn-info')]//child::i")
	private WebElement ContactSearchReveal;

	@FindBy(xpath = "//a[contains(text(),'NONE OF')]")
	private WebElement NoneOfPage;

	@FindBy(xpath = "//input[@type='text' and @name='code']")
	private WebElement NAICScodeInputBox;

	@FindBy(xpath = "//span[contains(text(),'credits available')]")
	private WebElement TotalCredits;

	@FindBy(xpath = "//*[@role='tooltip']")
	private WebElement monthly_License_Credits_And_Shared_Credits;

	@FindBy(xpath = "//button[contains(text(),'Clear')]")
	private WebElement Clearbutton;

	@FindBy(xpath = "//button[contains(text(),'clear')]")
	private WebElement ClearCSV;

	@FindBy(xpath = "//*[contains(text(),'Do Not Save')]")
	private WebElement Donotsavebutton;

	@FindBy(xpath = "(//*[contains(text(),'100 Fastest Growing')])[4]")
	private WebElement FastgrowingContact;

	@FindBy(xpath = "(//button[contains(@class,'btn btn-outline-primary') and @type='button']//following::span[contains(text(),'Add')])[1]")
	private WebElement Addalltolistbutton;

	@FindBy(xpath = "//*[contains(text(),'Create new contact list')]")
	private WebElement Createnewcontactlist;

	@FindBy(xpath = "//*[contains(text(),' Add to existing contact list:')]")
	private WebElement Addtoexistinglist;

	@FindBy(xpath = "//*[contains(text(),'Create new company list')]")
	private WebElement Createnewcompanylist;

	@FindBy(xpath = "//*[contains(text(),'Add to existing company list:')]")
	private WebElement Addtoexistingcompanylist;

	@FindBy(xpath = "//*[@placeholder='Enter name']")
	private WebElement Entercreatenamelist;

	@FindBy(xpath = "//*[@class='btn btn-primary' and contains(text(),'Save')]")
	private WebElement createnamelistsavebutton;

	@FindBy(xpath = "(//*[contains(text(),'Lists')])[1]")
	private WebElement Listtab;

	@FindBy(xpath = "//a[contains(text(),'SalesIntel')]")
	private WebElement SalesIntelTab;

	@FindBy(xpath = "(//div[contains(text(),'Type Company Name or Domain')])[3]/../div[2]/input")
	private WebElement SearchBoxInSalesIntalTab;

	@FindBy(xpath = "(//h5[contains(text(),'Recommended Lists')])[3]")
	private WebElement RecommendedList;

	@FindBy(xpath = "(//h5[contains(text(),'Saved Searches')])[2]")
	private WebElement SavedSearchesInSiTab;

	@FindBy(xpath = "(//h5[contains(text(),'Saved Searches')])[2]/../../../ul/li[1]/span/span")
	private WebElement FirstSavedSearchInSiTab;

	@FindBy(xpath = "//button[@type='button' and contains(text(),'Save Search')]")
	private WebElement SaveSearchButton;

	@FindBy(xpath = "//button[@type='button' and contains(text(),'Search Saved')]")
	private WebElement SearchSavedButton;

	@FindBy(xpath = "(//strong[contains(text(),'NAME')])[1]/../../../../tbody/tr[1]/td[4]/div/button[1]/i")
	private WebElement EditButtonForFirstSavedSearch;

	@FindBy(xpath = "(//strong[contains(text(),'NAME')])[2]/../../../../tbody/tr[1]/td[5]/div/button[2]/i")
	private WebElement EditButtonForFirstList;

	@FindBy(xpath = "(//strong[contains(text(),'NAME')])[2]/../../../../tbody/tr[1]/td[5]/div/button[3]/i")
	private WebElement DeleteButtonForFirstList;

	@FindBy(xpath = "//button[@type='submit' and contains(text(),'Delete')]")
	private WebElement DeleteConfirmationButton;

	@FindBy(xpath = "//th[contains(text(),'Name')]/../../../../../../div[1]/div/i")
	private WebElement EditButtonForListName;

	@FindBy(xpath = "//h4[contains(text(),'Edit Suppression List')]/../../div[2]/div/div/div/div/div/div/i")
	private WebElement EditButtonForSuppressionListName;

	@FindBy(xpath = "//input[@type='text' and @formcontrolname='name']")
	private WebElement EditNameTextField;

	@FindBy(xpath = "//th[contains(text(),'Name')]/../../../../../../div[1]/form/div/button/i")
	private WebElement SaveEditedListName;

	@FindBy(xpath = "//input[@type='text' and @formcontrolname='name']/../button/i")
	private WebElement SaveEditedSuppressionListName;

	@FindBy(xpath = "//th[contains(text(),'Name')]/../../../tbody/tr[2]/td/input")
	private WebElement FirstRecordInEditList;

	@FindBy(xpath = "//h4[contains(text(),'Edit Suppression List')]/../../div[2]/div/div/div[1]/div/div[2]/div/nav/tabset/div/tab[1]/div[2]/table/tbody/tr[1]/td[1]/input")
	private WebElement FirstRecordInEditSuppressionList;

	@FindBy(xpath = "//th[contains(text(),'Name')]/../../../../../div[1]/div[2]/button")
	private WebElement DeleteRecordInEditList;

	@FindBy(xpath = "//input[@placeholder='Search email']/../../../../div[3]/button")
	private WebElement DeleteSuppressionRecordInEditList;

	@FindBy(xpath = "//th[contains(text(),'Name')]/../../../../../div[1]/div[3]/button")
	private WebElement DeleteContactRecordInEditList;

	@FindBy(xpath = "//label[contains(text(),'Name')]/../div/input")
	private WebElement SaveSearchNameTextBox;

	@FindBy(xpath = "//h4[contains(text(),'Edit Saved Search')]")
	private WebElement SavedSearchEditPopupTitle;

	@FindBy(xpath = "//label[contains(text(),'Receive Email Alerts')]/../div/ui-switch/button")
	private WebElement RecieveEmailAllertButton;

	@FindBy(xpath = "//label[contains(text(),' Visibility')]/../div/ng-select")
	private WebElement VisibilityOptions;

	@FindBy(xpath = "//label[contains(text(),'Default View')]/../div/ng-select/div/span")
	private WebElement DefaultViewDropdown;

	@FindBy(xpath = "//button[@type='button'and contains(text(),'Cancel')]")
	private WebElement CancelButton;

	@FindBy(xpath = "//div[@class='ng-dropdown-panel-items scroll-host']//span[contains(text(),'Team')]")
	private WebElement VisibilityToTeam;

	@FindBy(xpath = "(//span[@class='ng-option-label ng-star-inserted' and contains(text(),'Team')])")
	private WebElement VisibilityToTeamWithClass;

	@FindBy(xpath = "(//span[contains(text(),'Private')])[2]")
	private WebElement VisibilityPrivate;

	@FindBy(xpath = "(//span[contains(text(),'Private')])[1]")
	private WebElement VisibilityPrivateForEdit;

	@FindBy(xpath = "//label[contains(text(),'Default View')]/../div/ng-select/ng-dropdown-panel/div/div[2]/div[2]")
	private WebElement DefaultViewCompany;

	@FindBy(xpath = "//label[contains(text(),'Default View')]/../div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	private WebElement DefaultViewContact;

	@FindBy(xpath = "(//button[@type='submit' and contains(text(),'Save')])")
	private WebElement SaveButton;

	@FindBy(xpath = "//button[contains(text(),'Save List')]")
	private WebElement SaveList;

	@FindBy(xpath = "(//button[ contains(text(),'Save')])[2]")
	private WebElement SaveButtonForSavedSearch;

	@FindBy(xpath = "//*[contains(text(),'My Saved Searches')]")
	private WebElement MySavedSearchesDropdown;

	@FindBy(xpath = "(//*[contains(text(),'My Saved Searches')])[2]/../../div[2]")
	private WebElement FirstSavedSearchInDropdown;

	@FindBy(xpath = "//button[@type='submit' and contains(text(),'Delete')]")
	private WebElement DeleteButton;

	@FindBy(xpath = "//span[@class='h5' and contains(text(),'Saved Search')]")
	private WebElement SavedSearchesCount;

	@FindBy(xpath = "//a[contains(text(),'Saved Search')]/i")
	private WebElement SavedSearchTab;

	@FindBy(xpath = "(//h5[contains(text(),'Recommended Lists')])[3]/../ul/li[1]/span/span")
	private WebElement FirstRecommendedList;

	@FindBy(xpath = "//a[contains(text(),'View all')]")
	private WebElement ViewallForSavedSearch;

	@FindBy(xpath = "//label[contains(text(),'Include Team Searches')]")
	private WebElement IncludeTeamSearchesTextInSavedSearchTab;

	@FindBy(xpath = "//span[contains(text(),'Rankings')]/../../div/app-rankings/div[2]/div[1]/label[contains(text(),' 100 Fastest Growing ')]/input")
	private WebElement FirstRecommendedListInRankings;

	@FindBy(xpath = "(//button[@type='submit'])[4]")
	private WebElement SearchButtonInSalesIntelTab;

	@FindBy(xpath = "//a[@id='COMPANIES-link']")
	private WebElement CompaniesTab;

	@FindBy(xpath = "//h1[contains(text(),'No Contacts Found')]")
	private WebElement NoContactFound;

	@FindBy(xpath = "//h1[contains(text(),'No Companies Found')]")
	private WebElement NoCompanyFound;

	@FindBy(xpath = "//*[text()='Contacts']")
	private WebElement ContactsTab;

	@FindBy(xpath = "//*[text()='Companies']")
	private WebElement CompanyTab;

	@FindBy(xpath = "(//*[contains(text(),'Delete')])[2]")
	private WebElement DeletecontactList;

	@FindBy(xpath = "(//button[contains(text(),' browse ')])[2]")
	private WebElement Browsefile;

	@FindBy(xpath = "//label[contains(text(),'Choose File')]")
	private WebElement ChooseFileButton;

	@FindBy(xpath = "//a[contains(text(),'Download')]")
	private WebElement DownloadTemplate;

	@FindBy(xpath = "//button[contains(text(),'Create List')]")
	private WebElement CreateListButton;

	@FindBy(xpath = "//a[contains(text(),'Create Company List')]")
	private WebElement CreateCompanyList;

	@FindBy(xpath = "//a[contains(text(),'Create Contact List')]")
	private WebElement CreateContactList;

	@FindBy(xpath = "//a[contains(text(),'Create Suppression List')]")
	private WebElement CreateSuppressionList;

	@FindBy(xpath = "//*[contains(text(),'Welcome,')]")
	private WebElement WelcomeTextforLogout;

	@FindBy(xpath = "//*[contains(text(),'Logout')]")
	private WebElement Logout;

	@FindBy(xpath = "//button[contains(text(),'Update')]")
	private WebElement UpdateButtonForSaveSearch;

	@FindBy(xpath = "(//span[text()='Location'])[1]")
	private WebElement LocationTab;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement Statevalueselection;

	@FindBy(xpath = "(//div[contains(text(),'States')])[2]/../div[2]/input")
	private WebElement getStatevalueselectionForContact;

	@FindBy(xpath = "(//span[contains(text(),'Human Verifie')])[1]")
	private WebElement HumanVerifiedCompaniesCount;

	@FindBy(xpath = "(//a[@class='nav-link active' and @role='tab'])[2]")
	private WebElement HumanVerifiedCompaniesCountSalesIntel;

	@FindBy(xpath = "(//span[contains(text(),'Human Verifie')])[1]")
	private WebElement HumanVerifiedContactsCount;

	@FindBy(xpath = "(//*[contains(text(),'Human Verified')])[1]")
	private WebElement Humanverified;

	@FindBy(xpath = "//*[contains(text(),'Welcome, ')]")
	private WebElement Welcome_Universal_Label;

	@FindBy(xpath = "//span[contains(text(),'Machine Verified')]")
	private WebElement company_Radio_Button;

	@FindBy(xpath = "(//input[@type='checkbox' and @title='Select'])[1]")
	private WebElement export_Company_To_Salesforce_1st_Company_Checkbox;

	@FindBy(xpath = "(//button[@type='button' and contains(@class,'btn btn-outline-secondary')])[1]")
	private WebElement export_Company_To_Salesforce_Bulk_Actions_Companies;

	@FindBy(xpath = "//a[contains(text(),'Export to Salesforce')]")
	private WebElement export_Company_To_Salesforce;

	@FindBy(xpath = "//h3[contains(text(),'Duplicates')]")
	private WebElement export_Company_To_Salesforce_Duplicates;

	@FindBy(xpath = "//button[@type='button' and text()='Next']")
	private WebElement export_Company_To_Salesforce_Next;

	@FindBy(xpath = "//section[@class='mt-3 pl-3 table-scroll']")
	private WebElement export_Company_To_Salesforce_Status;

	@FindBy(xpath = "//button[@type='button' and text()='Close']")
	private WebElement export_Company_To_Salesforce_Close;

	@FindBy(xpath = "//section[@class='text-center']")
	private WebElement export_Company_To_Salesforce_Failed_Popup;

	@FindBy(xpath = "(//div[@class='col-12 cursor-pointer row-border-bottom']//input[@type='checkbox' and @title='Select'])[1]")
	private WebElement export_Contact_To_Salesforce_1st_Contact_Checkbox;

	@FindBy(xpath = "(//button[@type='button' and contains(@class,'btn btn-outline-secondary')])[1]")
	private WebElement export_Contact_To_Salesforce_Bulk_Actions_Companies;

	@FindBy(xpath = "(//button[@type='button' and contains(@class,'btn btn-outline-secondary')])[2]")
	private WebElement export_Contact_To_CSV_Bulk_Actions_Contacts;

	@FindBy(xpath = "//a[contains(text(),'Export to Salesforce')]")
	private WebElement export_Contact_To_Salesforce;

	@FindBy(xpath = "//td[contains(text(),' Export as Lead ')]")
	private WebElement export_Contact_To_Salesforce_Export_As_Lead;

	@FindBy(xpath = "//div[@class='mt-1 pl-3']")
	private WebElement export_Contact_To_Salesforce_Status;

	@FindBy(xpath = "//a[contains(text(),'Export to CSV')]")
	private WebElement companies_Export_to_CSV;

	@FindBy(xpath = "//input[@formcontrolname='inputValue']")
	private WebElement companies_Export_to_CSV_Text_Field;

	@FindBy(xpath = "//button[@type='submit' and contains(text(),'Submit')]")
	private WebElement companies_Export_to_CSV_Submit_Button;

	@FindBy(xpath = "//*[@id=\"CONTACTS\"]/section/app-contact-list/div/section/div/header/div/div/ul/li[9]/a")
	private WebElement contact_Export_to_CSV;

	@FindBy(xpath = "(//*[contains(text(),'Human Verified')])[2]")
	private WebElement contact_Humanverified;

	@FindBy(xpath = "//a[contains(text(),'Export to Zoho')]")
	private WebElement companies_Export_To_Zoho;

	@FindBy(xpath = "//div[@class='modal-body overflow-hidden']")
	private WebElement companies_Export_To_Zoho_ExportStatus;

	@FindBy(xpath = "//*[@id=\"CONTACTS\"]/section/app-contact-list/div/section/div/header/div/div/ul/li[8]/a")
	private WebElement contacts_Export_To_Zoho;

	@FindBy(xpath = "//div[contains(@class,'mt-1 pl-3')]")
	private WebElement contacts_Export_To_Zoho_ExportStatus;

	@FindBy(xpath = "//*[@id=\"CONTACTS\"]/section/app-contact-list/div/section/div/header/div/div/ul/li[5]/a")
	private WebElement contacts_Export_To_Outreach;

	@FindBy(xpath = "//div[contains(@class,'col-md-12')]")
	private WebElement contacts_Export_To_Outreach_ExportStatus;

	@FindBy(xpath = "//button[text()='Close']")
	private WebElement contacts_Export_To_Outreach_Close;

	@FindBy(xpath = "(//a[contains(text(),'Export To Dynamics 365')])[1]")
	private WebElement companies_Export_To_Dynamics_365;

	@FindBy(xpath = "//section[contains(@class,'mt-1 pl-3')]")
	private WebElement companies_Export_To_Dynamics_365_ExportStatus;

	@FindBy(xpath = "//*[@id=\"CONTACTS\"]/section/app-contact-list/div/section/div/header/div/div/ul/li[7]/a")
	private WebElement contacts_Export_To_Dynamics_365;

	@FindBy(xpath = "//div[@class='modal-body overflow-hidden']")
	private WebElement contacts_Export_To_Dynamics_365_ExportStatus;

	@FindBy(xpath = "//*[@id=\"CONTACTS\"]/section/app-contact-list/div/section/div/header/div/div/ul/li[4]/a")
	private WebElement contacts_Export_To_Marketo;

	@FindBy(xpath = "//div[@class='modal-body overflow-hidden']")
	private WebElement contacts_Export_To_Marketo_ExportStatus;

	@FindBy(xpath = "//button[text()='Close']")
	private WebElement contacts_Export_To_Marketo_Close;

	@FindBy(xpath = "//*[@id=\"CONTACTS\"]/section/app-contact-list/div/section/div/header/div/div/ul/li[3]/a")
	private WebElement contacts_Export_To_HotSpot;

	@FindBy(xpath = "//i[contains(@class,'float-right fa text-primary-light fa-chevron-')]")
	private WebElement contacts_Export_To_HotSpot_ExportStatus_Expand_Icon;

	@FindBy(xpath = "//div[@class='modal-body overflow-hidden']")
	private WebElement contacts_Export_To_HotSpot_ExportStatus;

	@FindBy(xpath = "//button[text()='Close']")
	private WebElement contacts_Export_To_HotSpot_Close;

	@FindBy(xpath = "(//i[contains(@class,'fa pr-3 text-primary fa-chevron-')])[4]")
	private WebElement industry_Icon_Right_Arrow;

	@FindBy(xpath = "//span[@class='ml-2' and contains(text(),'Machine Verified')]")
	private WebElement machine_Verified_Label;

	@FindBy(xpath = "//button[@type='button' and contains(text(),'Export All Companies')]")
	private WebElement export_All_Companies_Button;

	@FindBy(xpath = "//td[contains(@class,'row-height')]")
	private WebElement export_All_Companies_CSV_Entire_Row;

	@FindBy(xpath = "(//i[@class='fa fa-chevron-down pl-1'])[2]")
	private WebElement welcome_Icon_Down_Arrow;

	@FindBy(xpath = "//a[contains(text(),'File Center')]")
	private WebElement file_Center_Label;

	@FindBy(xpath = "(//input[@type='checkbox'])[4]")
	private WebElement agriculture_Forestry_Fishing_And_Hunting;

	@FindBy(xpath = "(//a[@class='download-csv'])[1]")
	private WebElement companies_Download_CSV;

	@FindBy(xpath = "//button[@type='button' and @class='close']")
	private WebElement export_Close_Button;

	@FindBy(xpath = "//button[contains(text(),'Export All Contacts')]")
	private WebElement export_All_Contacts_Button;

	@FindBy(xpath = "(//input[@type='checkbox'])[5]")
	private WebElement arts_Entertainment_And_Recreation;

	@FindBy(xpath = "(//table[@class='table mb-0']//following::td)[1]")
	private WebElement first_Contact_List_Details;

	@FindBy(xpath = "//*[@id=\"CONTACTS\"]/section/app-contact-list/div/section/div/section/div/header/div[1]/div/div/button/input")
	private WebElement select_All_Checkbox;

	@FindBy(xpath = "//a[@class='dropdown-item' and contains(text(),'Select All')]")
	private WebElement select_All_Dropdown_Options;

	@FindBy(xpath = "//*[@id=\"CONTACTS\"]/section/app-contact-list/div/section/div/header/div[2]/div/ul/li[11]/a")
	private WebElement contacts_Preview_Options;

	@FindBy(xpath = "//*[@id=\"CONTACTS\"]/section/app-contact-list/div/header/div/span/label[2]/span")
	private WebElement contacts_Machine_Verified;

	@FindBy(xpath = "(//span[contains(text(),'Lists')])[1]")
	private WebElement export_From_List;

	@FindBy(xpath = "//strong[contains(text(),' COUNT ')]//i[@class='fa pl-2 fa-sort']")
	private WebElement export_From_List_Count_Sort_Arrow;

	@FindBy(xpath = "//strong[contains(text(),' COUNT ')]//i[@class='fa pl-2 fa-sort-desc sort-not']")
	private WebElement export_From_List_Count_Desc_Sort_Arrow;

	@FindBy(xpath = "(//span[contains(text(),'Company List')])[1]//parent::div//parent::td//preceding-sibling::td//following-sibling::div//child::span")
	private WebElement export_From_List_Company_List;

	@FindBy(xpath = "(//span[contains(text(),'Contact List')])[1]//parent::div//parent::td//preceding-sibling::td//following-sibling::div//child::span")
	private WebElement export_From_List_Contact_List;

	@FindBy(xpath = "(//button[@class='btn btn-outline-primary btn-sm dropdown-toggle border-0'])[4]")
	private WebElement export_From_List_Company_Human_Verified;

	@FindBy(xpath = "/html/body/modal-container/div[2]/div/app-create-company-list/div[2]/div[3]/div/div[3]/div[2]/div[1]/div/div[2]/div/div/ul/li[1]")
	private WebElement export_From_List_Salesforce_Company_Human_Verified;

	@FindBy(xpath = "/html/body/modal-container/div[2]/div/app-create-company-list/div[2]/div[3]/div/div[3]/div[2]/div[1]/div/div[2]/div/div/ul/li[2]")
	private WebElement export_From_List_Dynamic_365_Company_Human_Verified;

	@FindBy(xpath = "/html/body/modal-container/div[2]/div/app-create-company-list/div[2]/div[3]/div/div[3]/div[2]/div[1]/div/div[2]/div/div/ul/li[3]")
	private WebElement export_From_List_Zoho_Company_Human_Verified;

	@FindBy(xpath = "/html/body/modal-container/div[2]/div/app-create-company-list/div[2]/div[3]/div/div[3]/div[2]/div[1]/div/div[2]/div/div/ul/li[4]")
	private WebElement export_From_List_CSV_Company_Human_Verified;

	@FindBy(xpath = "(//button[@class='btn btn-outline-primary btn-sm dropdown-toggle border-0'])[5]")
	private WebElement export_From_List_Company_Machine_Verified;

	@FindBy(xpath = "/html/body/modal-container/div[2]/div/app-create-company-list/div[2]/div[3]/div/div[3]/div[2]/div[2]/div/div[2]/div/div/ul/li[1]/a")
	private WebElement export_From_List_Salesforce_Company_Machine_Verified;

	@FindBy(xpath = "/html/body/modal-container/div[2]/div/app-create-company-list/div[2]/div[3]/div/div[3]/div[2]/div[2]/div/div[2]/div/div/ul/li[2]/a")
	private WebElement export_From_List_Dynamic_365_Company_Machine_Verified;

	@FindBy(xpath = "/html/body/modal-container/div[2]/div/app-create-company-list/div[2]/div[3]/div/div[3]/div[2]/div[2]/div/div[2]/div/div/ul/li[3]/a")
	private WebElement export_From_List_Zoho_Company_Machine_Verified;

	@FindBy(xpath = "/html/body/modal-container/div[2]/div/app-create-company-list/div[2]/div[3]/div/div[3]/div[2]/div[2]/div/div[2]/div/div/ul/li[4]/a")
	private WebElement export_From_List_CSV_Company_Machine_Verified;

	@FindBy(xpath = "//button[@type='button' and contains(text(),'Close')]")
	private WebElement export_From_List_Close_Button;

	@FindBy(xpath = "(//button[@class='btn btn-outline-primary btn-sm dropdown-toggle border-0'])[2]")
	private WebElement export_From_List_Company_Human_Verified_Duplicates;

	@FindBy(xpath = "/html/body/modal-container/div[2]/div/app-create-company-list/div[2]/div[3]/div/div[3]/div[1]/div[2]/div/div[2]/div[3]/div/ul/li/a")
	private WebElement export_From_List_Company_Human_Verified_Duplicates_Export_Original_Records;

	@FindBy(xpath = "(//div[@class='two-line-wrap'])[1]")
	private WebElement FirstSearchedResult;

	@FindBy(xpath = "(//div[@class='row row-py'])[1]")
	private WebElement FirstSearchedResultByEmployee;

	@FindBy(xpath = "(//div[@class='row row-py'])[1]")
	private WebElement FirstSearchedResultByContacts;

	@FindBy(xpath = "//a[contains(text(),'Back to search results')]")
	private WebElement back_To_Search_Results;

	@FindBy(xpath = "(//div[@class='col-12']//child::ul[@class='list-unstyled lists']//child::li)[1]//child::span[@class='a cursor-pointer']")
	private WebElement saved_Search_Results;

	@FindBy(xpath = "//button[@type='button' and @class='btn btn-primary rounded']")
	private WebElement create_List_Button;

	@FindBy(xpath = "//a[@class='dropdown-item' and contains(text(),'Create Company List')]")
	private WebElement create_Company_List_Button;

	@FindBy(xpath = "//input[@type='text' and @placeholder='Enter a name for your list']")
	private WebElement list_Name_Text_Field;

	@FindBy(xpath = "//label[contains(text(),'Choose File')]")
	private WebElement choose_File_Button;

	@FindBy(xpath = "(//div[@class='col-sm-9 col-form-label'])[3]")
	private WebElement availability_Combobox_Field;

	@FindBy(xpath = "//span[contains(text(),'Team') and @class='ng-option-label']")
	private WebElement team_field;

	@FindBy(xpath = "//button[contains(text(),'Save List')]")
	private WebElement save_List_Button;

	@FindBy(xpath = "//input[@id='username']")
	private WebElement salesforce_Username;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement salesforce_Password;

	@FindBy(xpath = "//input[@id='Login']")
	private WebElement salesforce_Login_Button;

	@FindBy(xpath = "//input[@id='rememberUn']")
	private WebElement salesforce_Remember_Me_Checkbox;

	@FindBy(xpath = "//a[contains(text(),'Remind Me Later')]")
	private List<WebElement> salesforce_Remind_Me_Later;

	@FindBy(xpath = "(//span[@class='slds-truncate' and contains(text(),'SalesIntel')])[2]")
	private WebElement salesforce_SalesIntel_Tab;

	@FindBy(xpath = "(//span[contains(text(),'Leads')])[1]")
	private WebElement salesforce_Leads_Button;

	@FindBy(xpath = "//div[contains(text(),'New')]")
	private WebElement salesforce_Leads_New_Button;

	@FindBy(xpath = "//input[@type='text' and @placeholder='First Name']")
	private WebElement salesforce_Leads_First_Name;

	@FindBy(xpath = "//input[@type='text' and @placeholder='Last Name']")
	private WebElement salesforce_Leads_Last_Name;

	@FindBy(xpath = "//input[@type='text' and @name='Company']")
	private WebElement salesforce_Leads_Company;

	@FindBy(xpath = "//input[@type='text' and @name='Phone']")
	private WebElement salesforce_Leads_Phone;

	@FindBy(xpath = "//input[@type='text' and @name='Email']")
	private WebElement salesforce_Leads_Email;

	@FindBy(xpath = "(//button[@type='button' and contains(text(),'Save')])[2]")
	private WebElement salesforce_Leads_Save_Button;

	@FindBy(xpath = "//button[@type='button' and @class='btn btn-outline-secondary btn-sm ml-2 dropdown-toggle']")
	private WebElement salesforce_Bulk_Actions_Button;

	@FindBy(xpath = "//*[@id=\"CONTACTS\"]/section/app-contact-list/div/section/div/header/div/div/ul/li[1]/a")
	private WebElement salesforce_Export_Salesforce_Button;
	
	@FindBy(xpath = "//*[@id=\"CONTACTS\"]/section/app-contact-list/div/section/div/header/div/div/ul/li[8]/a")
	private WebElement salesforce_Export_CSV_Button;

	@FindBy(xpath = "//img[@class='icon noicon']")
	private List<WebElement> switch_To_Lighting_View_Profile_Image;

	@FindBy(xpath = "//a[contains(text(),'Switch to Salesforce Classic')]")
	private WebElement switch_To_Salesforce_Classic_Label;

	@FindBy(xpath = "//a[contains(text(),'Switch to Lightning Experience') and @class='switch-to-lightning']")
	private List<WebElement> switch_To_Lightning_Experience_Label;

	@FindBy(xpath = "//span[contains(text(),'SalesIntel EnrichIntel')]")
	private WebElement salesIntel_EnrichIntel_Label;

	@FindBy(xpath = "//button[@title='New Enrichment']")
	private WebElement new_Enrichment_Button;

	@FindBy(xpath = "(//div[contains(text(),'Enrichment Task Name (min 5 characters) * ')]//following::input)[1]")
	private WebElement enrichment_Task_Name_Label;

	@FindBy(xpath = "//button[contains(text(),'Lead')]")
	private WebElement new_Enrichment_Lead_Button;

	@FindBy(xpath = "//select[@class='slds-select custom-select custom-select-sm slds-m-top_xx-small']")
	private WebElement new_Enrichment_Lead_Filter_Dropdown;

	@FindBy(xpath = "//input[@class='slds-m-top_xx-small slds-border']")
	private WebElement new_Enrichment_Lead_Filter_Input_Field;
	
	@FindBy(xpath = "//button[@title='Analyze']")
	private WebElement new_Enrichment_Analyze_Button;
	
	@FindBy(xpath = "//button[@title='Refresh Status']")
	private WebElement new_Enrichment_Lead_Refresh_Status;
	
	@FindBy(xpath = "//span[contains(text(),'Start Enrichment')]")
	private WebElement new_Enrichment_Lead_Start_Enrichment;
	
	@FindBy(xpath = "//div[contains(@id,'prompt-message-wrapper-')]")
	private WebElement new_Enrichment_Lead_Start_Enrichment_Data;
	
	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	private WebElement new_Enrichment_Lead_Start_Enrichment_Data_Yes_Button;
	
	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	private WebElement salesforce_Logout;
	
	@FindBy(xpath = "//button[@type='button' and contains(@class,'slds-button branding-userProfile-button')]")
	private WebElement salesforce_Settings_Icon;


	public WebElement getRequestVerificationButton() {
		return RequestVerificationButton;
	}

	public WebElement getRODreqestedInRODtab() {
		return RODreqestedInRODtab;
	}

	public WebElement getContactemail() {
		return contactemail;
	}

	public WebElement getNewContactradiobutton() {
		return newContactradiobutton;
	}

	public WebElement getNewuniversalContactradiobutton() {
		return newuniversalContactradiobutton;
	}

	public WebElement getNewCompanyradiobutton() {
		return newCompanyradiobutton;
	}

	public WebElement getProductTestBox() {
		return ProductTestBox;
	}

	public WebElement getScoreThresholdMover() {
		return ScoreThresholdMover;
	}

	public WebElement getTopicThresholdMover() {
		return TopicThresholdMover;
	}

	public WebElement getJobKeyinfluence() {
		return JobKeyinfluence;
	}

	public String getContact_search_Name1() {
		return Contact_search_Name1;
	}

	public WebElement getCreatenamelistsavebutton() {
		return createnamelistsavebutton;
	}

	public WebElement getLocationTab() {
		return LocationTab;
	}

	public WebElement getStatevalueselection() {
		return Statevalueselection;
	}

	public WebElement getGetStatevalueselectionForContact() {
		return getStatevalueselectionForContact;
	}

	public WebElement getHumanverified() {
		return Humanverified;
	}

	public WebElement getWelcome_Universal_Label() {
		return Welcome_Universal_Label;
	}

	public WebElement getEmailInputBoxInResearch() {
		return EmailInputBoxInResearch;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginCTA() {
		return loginCTA;
	}

	public WebElement getContactName() {
		return ContactName;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getContactEmail() {
		return contactemail;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getSearchButtonForResearch() {
		return SearchButtonForResearch;
	}

	public WebElement getSearchedContactInResearch() {
		return SearchedContactInResearch;
	}

	public WebElement getCompanySearchButton() {
		return CompanySearchButton;
	}

	public WebElement getFaq() {
		return Faq;
	}

	public WebElement getLoginTitle() {
		return LoginTitle;
	}

	public WebElement getEmailPlaceholder() {
		return EmailPlaceholder;
	}

	public WebElement getPasswordPlaceholder() {
		return PasswordPlaceholder;
	}

	public WebElement getRememberMe() {
		return RememberMe;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getLogoutButtonInResearch() {
		return LogoutButtonInResearch;
	}

	public WebElement getLoginButtonRes() {
		return LoginButtonRes;
	}

	public WebElement getForgotPassword() {
		return ForgotPassword;
	}

	public WebElement getInvalidUsernameResult() {
		return InvalidUsernameResult;
	}

	public WebElement getInvalidUsernamepasswordResult() {
		return InvalidUsernamepasswordResult;
	}

	public WebElement getInvalidpasswordUsernameResult() {
		return InvalidpasswordUsernameResult;
	}

	public WebElement getContactsection() {
		return Contactsection;
	}

	public WebElement getContactSearchwithInteger() {
		return ContactSearchwithInteger;
	}

	public WebElement getForgetPasswordEmail() {
		return ForgetPasswordEmail;
	}

	public WebElement getResetPasswordButton() {
		return ResetPasswordButton;
	}

	public WebElement getContactEmailInputbox() {
		return ContactEmailInputbox;
	}

	public WebElement getContactJobLevel() {
		return ContactJobLevel;
	}

	public WebElement getBoardMemberJobLevelFilter() {
		return BoardMemberJobLevelFilter;
	}

	public WebElement getBoardMemberJobLevelInResult() {
		return BoardMemberJobLevelInResult;
	}

	public WebElement getClevelExecutiveJobLevelInResult() {
		return ClevelExecutiveJobLevelInResult;
	}

	public WebElement getVicePresidentJobLevelInResult() {
		return VicePresidentJobLevelInResult;
	}

	public WebElement getDirectorsJobLevelInResult() {
		return DirectorsJobLevelInResult;
	}

	public WebElement getManagersJobLevelInResult() {
		return ManagersJobLevelInResult;
	}

	public WebElement getKeyInfluencersJobLevelInResult() {
		return KeyInfluencersJobLevelInResult;
	}

	public WebElement getRolesection() {
		return Rolesection;
	}

	public WebElement getDepartmentFilter() {
		return DepartmentFilter;
	}

	public WebElement getFinanceDepartmentFilter() {
		return FinanceDepartmentFilter;
	}

	public WebElement getHrDepartmentFilter() {
		return HrDepartmentFilter;
	}

	public WebElement getITDepartmentFilter() {
		return ITDepartmentFilter;
	}

	public WebElement getLegalDepartmentFilter() {
		return LegalDepartmentFilter;
	}

	public WebElement getMarketingDepartmentFilter() {
		return MarketingDepartmentFilter;
	}

	public WebElement getMarketingDepartmentInResult() {
		return MarketingDepartmentInResult;
	}

	public WebElement getLegalDepartmentInResult() {
		return LegalDepartmentInResult;
	}

	public WebElement getITDepartmentInResult() {
		return ITDepartmentInResult;
	}

	public WebElement getHrDepartmentInResult() {
		return HrDepartmentInResult;
	}

	public WebElement getFinanceDepartmentInResult() {
		return FinanceDepartmentInResult;
	}

	public WebElement getOperationsDepartmentFilter() {
		return OperationsDepartmentFilter;
	}

	public WebElement getOperationsDepartmentInResult() {
		return OperationsDepartmentInResult;
	}

	public WebElement getProcurementDepartmentFilter() {
		return ProcurementDepartmentFilter;
	}

	public WebElement getProcurementDepartmentInResult() {
		return ProcurementDepartmentInResult;
	}

	public WebElement getRndDepartmentFilter() {
		return RndDepartmentFilter;
	}

	public WebElement getRndDepartmentInResult() {
		return RndDepartmentInResult;
	}

	public WebElement getSalesDepartmentFilter() {
		return SalesDepartmentFilter;
	}

	public WebElement getSalesDepartmentIn_Result() {
		return SalesDepartmentIn_Result;
	}

	public WebElement getCrossFunctionalDepartmentFilter() {
		return CrossFunctionalDepartmentFilter;
	}

	public WebElement getCrossFunctionalDepartmentInResult() {
		return CrossFunctionalDepartmentInResult;
	}

	public WebElement getJobBoardMember() {
		return JobBoardMember;
	}

	public WebElement getJobclevelexecutiveFilter() {
		return JobclevelexecutiveFilter;
	}

	public WebElement getVicePrecidentsJobLevelFilter() {
		return VicePrecidentsJobLevelFilter;
	}

	public WebElement getDirectorsJobLevelFilter() {
		return DirectorsJobLevelFilter;
	}

	public WebElement getManagersJobLevelFilter() {
		return ManagersJobLevelFilter;
	}

	public WebElement getKeyInfluencersJobLevelFilter() {
		return KeyInfluencersJobLevelFilter;
	}

	public WebElement getTitleFilter() {
		return TitleFilter;
	}

	public WebElement getTitleTextField() {
		return TitleTextField;
	}

	public WebElement getLocationFilter() {
		return LocationFilter;
	}

	public WebElement getContactLocationFilter() {
		return ContactLocationFilter;
	}

	public WebElement getStateField() {
		return StateField;
	}

	public WebElement getCaliforniaState() {
		return CaliforniaState;
	}

	public WebElement getCaliforniaInResult() {
		return CaliforniaInResult;
	}

	public WebElement getZipCodePage() {
		return ZipCodePage;
	}

	public WebElement getContactZipCodePage() {
		return ContactZipCodePage;
	}

	public WebElement getStatePage() {
		return StatePage;
	}

	public WebElement getZipCodeTextField() {
		return ZipCodeTextField;
	}

	public WebElement getMilesSelectBox() {
		return MilesSelectBox;
	}

	public WebElement getMetroAreaPage() {
		return MetroAreaPage;
	}

	public WebElement getMetroAreaPageForContact() {
		return MetroAreaPageForContact;
	}

	public WebElement getMetroAreaTextField() {
		return MetroAreaTextField;
	}

	public WebElement getMetroAreaTextFieldForContact() {
		return MetroAreaTextFieldForContact;
	}

	public WebElement getMetroAreatInSearchResult() {
		return MetroAreatInSearchResult;
	}

	public WebElement getNonUsaRadioButton() {
		return NonUsaRadioButton;
	}

	public WebElement getNonUsaRadioButtonForContact() {
		return NonUsaRadioButtonForContact;
	}

	public WebElement getGlobalRadioButton() {
		return GlobalRadioButton;
	}

	public WebElement getGlobalRadioButtonForContact() {
		return GlobalRadioButtonForContact;
	}

	public WebElement getCountryBox() {
		return CountryBox;
	}

	public WebElement getCountryBoxForContact() {
		return CountryBoxForContact;
	}

	public WebElement getKeywordsFilter() {
		return KeywordsFilter;
	}

	public WebElement getIndustryFilter() {
		return IndustryFilter;
	}

	public WebElement getNAICSorSICpage() {
		return NAICSorSICpage;
	}

	public WebElement getSICcodeRadioButton() {
		return SICcodeRadioButton;
	}

	public WebElement getRevenueFilter() {
		return RevenueFilter;
	}

	public WebElement getEmployeeSizeFilter() {
		return EmployeeSizeFilter;
	}

	public WebElement getMinRevenueInputBox() {
		return MinRevenueInputBox;
	}

	public WebElement getMinEmpSizeInputBox() {
		return MinEmpSizeInputBox;
	}

	public WebElement getMaxRevenueInputBox() {
		return MaxRevenueInputBox;
	}

	public WebElement getMaxEmpSizeInputBox() {
		return MaxEmpSizeInputBox;
	}

	public WebElement getRevenueInSearchResult() {
		return RevenueInSearchResult;
	}

	public WebElement getEmpSizeInSearchResult() {
		return EmpSizeInSearchResult;
	}

	public WebElement getTechnographics() {
		return Technographics;
	}

	public WebElement getProductFilter() {
		return ProductFilter;
	}

	public WebElement getProviderFilter() {
		return ProviderFilter;
	}

	public WebElement getSelectAllCheckBoxForCategories() {
		return SelectAllCheckBoxForCategories;
	}

	public WebElement getCategoriesFilter() {
		return CategoriesFilter;
	}

	public WebElement getProductTextBox() {
		return ProductTestBox;
	}

	public WebElement getProviderTextBox() {
		return ProviderTextBox;
	}

	public WebElement getCategoryTextBox() {
		return CategoryTextBox;
	}

	public WebElement getCompanyNameInResult() {
		return CompanyNameInResult;
	}

	public WebElement getProductInResult() {
		return ProductInResult;
	}

	public WebElement getProviderInResult() {
		return ProviderInResult;
	}

	public WebElement getCategoryInResult() {
		return CategoryInResult;
	}

	public WebElement getNoTechnographyIsMatching() {
		return NoTechnographyIsMatching;
	}

	public WebElement getALLButtonInProduct() {
		return ALLButtonInProduct;
	}

	public WebElement getALLButtonInProvider() {
		return ALLButtonInProvider;
	}

	public WebElement getALLButtonInCategory() {
		return ALLButtonInCategory;
	}

	public WebElement getNoneButtonInProduct() {
		return NoneButtonInProduct;
	}

	public WebElement getNoneButtonInProvider() {
		return NoneButtonInProvider;
	}

	public WebElement getNoneButtonInCategory() {
		return NoneButtonInCategory;
	}

	public WebElement getBackToSearchResults() {
		return BackToSearchResults;
	}

	public WebElement getAllButton() {
		return AllButton;
	}

	public WebElement getSearchInputBox() {
		return SearchInputBox;
	}

	public WebElement getSalesIntelLogo() {
		return SalesIntelLogo;
	}

	public WebElement getINTENT() {
		return INTENT;
	}

	public WebElement getScoreThresHoldFilter() {
		return ScoreThresHoldFilter;
	}

	public WebElement getTopicThresHoldFilter() {
		return TopicThresHoldFilter;
	}

	public WebElement getTopicThresholdInResult() {
		return TopicThresholdInResult;
	}

	public WebElement ScoreThresholdMover() {
		return ScoreThresholdMover;
	}

	public WebElement TopicThresholdMover() {
		return TopicThresholdMover;
	}

	public WebElement getTopicFilter() {
		return TopicFilter;
	}

	public WebElement getNetflixTopic() {
		return NetflixTopic;
	}

	public WebElement getHuluTopic() {
		return HuluTopic;
	}

	public WebElement getNetflixTopicInResult() {
		return NetflixTopicInResult;
	}

//	@Override
//	public String toString() {
//		return "LoginPage{" +
//				"RevenueInSearchResult=" + RevenueInSearchResult +
//				'}';
//	}

	public WebElement getIndustryNameInputBox() {
		return IndustryNameInputBox;
	}

	public WebElement getSearchByNameInput() {
		return SearchByNameInput;
	}

	public WebElement getSearchByNameInputInList() {
		return SearchByNameInputInList;
	}

	public WebElement getNoRecordForSavedSearch() {
		return NoRecordForSavedSearch;
	}

	public WebElement getIncludeTeamCheckBox() {
		return IncludeTeamCheckBox;
	}

	public WebElement getFirstSearchedContact() {
		return FirstSearchedContact;
	}

	public WebElement getFirstSearchedContactName() {
		return FirstSearchedContactName;
	}

	public WebElement getFirstSearchedContactLocation() {
		return FirstSearchedContactLocation;
	}

	public WebElement getFirstSavedSearchName() {
		return FirstSavedSearchName;
	}

	public WebElement getVisibilityAsPrivateInSavedSearch() {
		return VisibilityAsPrivateInSavedSearch;
	}

	public WebElement getVisibilityAsTeamInSavedSearch() {
		return VisibilityAsTeamInSavedSearch;
	}

	public WebElement getPersonalEmailInResult() {
		return PersonalEmailInResult;
	}

	public WebElement getWorkEmailInResult() {
		return WorkEmailInResult;
	}

	public WebElement getLinkedInUrlInResult() {
		return LinkedInUrlInResult;
	}

	public WebElement getTitleInSearchResult() {
		return TitleInSearchResult;
	}

	public WebElement getLastUpdatedDateFromRes() {
		return LastUpdatedDateFromRes;
	}

	public WebElement getMobilePhoneInResult() {
		return MobilePhoneInResult;
	}

	public WebElement getDirectPhoneInResult() {
		return DirectPhoneInResult;
	}

	public WebElement getSelectAllCheckBox() {
		return SelectAllCheckBox;
	}

	public WebElement getKeywordsInputBox() {
		return KeywordsInputBox;
	}

	public WebElement getAlbanyORMetroArea() {
		return AlbanyORMetroArea;
	}

	public WebElement getTitleInResult() {
		return TitleInResult;
	}

	public WebElement getSearchedContact() {
		return SearchedContact;
	}

	public WebElement getEmailInResult() {
		return EmailInResult;
	}

	public WebElement getJobVicepresident() {
		return JobVicepresident;
	}

	public WebElement getJobDirectors() {
		return JobDirectors;
	}

	public WebElement getNameColumn() {
		return NameColumn;
	}

	public WebElement getJobManagers() {
		return JobManagers;
	}

	public WebElement getRankingFilter() {
		return RankingFilter;
	}

	public WebElement getSelectAllForRankings() {
		return SelectAllForRankings;
	}

	public WebElement getSelectFirstCheckBoxForRankings() {
		return SelectFirstCheckBoxForRankings;
	}

	public WebElement getYourListsFilter() {
		return YourListsFilter;
	}

	public WebElement getResultIncludeFilter() {
		return ResultIncludeFilter;
	}

	public WebElement getLastModifiedFilter() {
		return LastModifiedFilter;
	}

	public WebElement getLastModifiedDropDown() {
		return LastModifiedDropDown;
	}

	public WebElement getPreviousMonthInCalndar() {
		return PreviousMonthInCalndar;
	}

	public WebElement getCustomDateForLastModified() {
		return CustomDateForLastModified;
	}

	public WebElement getMonthFromCustomDate() {
		return MonthFromCustomDate;
	}

	public WebElement getYearFromCustomDate() {
		return YearFromCustomDate;
	}

	public WebElement getLastModifiedWithin21Days() {
		return LastModifiedWithin21Days;
	}

	public WebElement getLastModifiedWithin30Days() {
		return LastModifiedWithin30Days;
	}

	public WebElement getLastModifiedWithin7Days() {
		return LastModifiedWithin7Days;
	}

	public WebElement getLastModifiedWithin14Days() {
		return LastModifiedWithin14Days;
	}

	public WebElement getCustomForLastModified() {
		return CustomForLastModified;
	}

	public WebElement getAddressCheckBox() {
		return AddressCheckBox;
	}

	public WebElement getAnyPhoneCheckBox() {
		return AnyPhoneCheckBox;
	}

	public WebElement getAnyDirectPhoneCheckBox() {
		return AnyDirectPhoneCheckBox;
	}

	public WebElement getAnyMobilePhoneCheckBox() {
		return AnyMobilePhoneCheckBox;
	}

	public WebElement getPersonalEmailCheckBox() {
		return PersonalEmailCheckBox;
	}

	public WebElement getLinkedInUrlCheckBox() {
		return LinkedInUrlCheckBox;
	}

	public WebElement getTitleCheckBox() {
		return TitleCheckBox;
	}

	public WebElement getContactListFilter() {
		return ContactListFilter;
	}

	public WebElement getContactListForDataEnrichment() {
		return ContactListForDataEnrichment;
	}

	public WebElement getNextButton() {
		return NextButton;
	}

	public WebElement getListNameForDataEnrichment() {
		return ListNameForDataEnrichment;
	}

	public WebElement getSaveListForDatanrichment() {
		return SaveListForDatanrichment;
	}

	public WebElement getCloseButton() {
		return CloseButton;
	}

	public WebElement getAllCompanyList() {
		return AllCompanyList;
	}

	public WebElement getAllContactList() {
		return AllContactList;
	}

	public WebElement getAllSuppressionList() {
		return AllSuppressionList;
	}

	public WebElement getAllRODList() {
		return AllRODList;
	}

	public WebElement getOneRODList() {
		return OneRODList;
	}

	public WebElement getRODList() {
		return RODList;
	}

	public WebElement getOneCompanyList() {
		return OneCompanyList;
	}

	public WebElement getOneContactList() {
		return OneContactList;
	}

	public WebElement getOneSuppressionList() {
		return OneSuppressionList;
	}

	public WebElement getFirstCompanyInResult() {
		return FirstCompanyInResult;
	}

	public WebElement getFirstCompanyLinkInResult() {
		return FirstCompanyLinkInResult;
	}

	public WebElement getJobLevelSelectAll() {
		return JobLevelSelectAll;
	}

	public WebElement getContactSearch1() {
		return ContactSearch1;
	}

	public WebElement getContactSearch2() {
		return ContactSearch2;
	}

	public WebElement getContactSearch3() {
		return ContactSearch3;
	}

	public WebElement getContactSearch4() {
		return ContactSearch4;
	}

	public WebElement getContactSearch5() {
		return ContactSearch5;
	}

	public WebElement getContactSearchReveal() {
		return ContactSearchReveal;
	}

	public WebElement getNoneOfPage() {
		return NoneOfPage;
	}

	public WebElement getNAICScodeInputBox() {
		return NAICScodeInputBox;
	}

	public WebElement getClearbutton() {
		return Clearbutton;
	}

	public WebElement getClearCSV() {
		return ClearCSV;
	}

	public WebElement getTotalCredits() {
		return TotalCredits;
	}

	public WebElement getDonotsavebutton() {
		return Donotsavebutton;
	}

	public WebElement getFastgrowingContact() {
		return FastgrowingContact;
	}

	public WebElement getAddalltolistbutton() {
		return Addalltolistbutton;
	}

	public WebElement getCreatenewcontactlist() {
		return Createnewcontactlist;
	}

	public WebElement getEntercreatenamelist() {
		return Entercreatenamelist;
	}

	public WebElement getcreatenamelistsavebutton() {
		return createnamelistsavebutton;
	}

	public WebElement getListtab() {
		return Listtab;
	}

	public WebElement getDeletecontactList() {
		return DeletecontactList;
	}

	public WebElement getContactsTab() {
		return ContactsTab;
	}

	public WebElement getCompanyTab() {
		return CompanyTab;
	}

	public WebElement getAddtoexistinglist() {
		return Addtoexistinglist;
	}

	public WebElement getContactListDropdown() {
		return ContactListDropdown;
	}

	public WebElement getCompanyName() {
		return CompanyName;
	}

	public WebElement getCompanyInput() {
		return CompanyInput;
	}

	public WebElement getCreatenewcompanylist() {
		return Createnewcompanylist;
	}

	public WebElement getAddtoexistingcompanylist() {
		return Addtoexistingcompanylist;
	}

	public WebElement getSortbyName() {
		return SortbyName;
	}

	public WebElement getSortbyJobTitle() {
		return SortbyJobTitle;
	}

	public WebElement getSortbyLevel() {
		return SortbyLevel;
	}

	public WebElement getSortbyDept() {
		return SortbyDept;
	}

	public WebElement getSortbyComp() {
		return SortbyComp;
	}

	public WebElement getSortbyLocation() {
		return SortbyLocation;
	}

	public WebElement getScrolldown() {
		return Scrolldown;
	}

	public WebElement getScrollup() {
		return Scrollup;
	}

	public WebElement getBrowsefile() {
		return Browsefile;
	}

	public WebElement getChooseFileButton() {
		return ChooseFileButton;
	}

	public WebElement getDownloadTemplate() {
		return DownloadTemplate;
	}

	public WebElement getCreateListButton() {
		return CreateListButton;
	}

	public WebElement getCreateCompanyList() {
		return CreateCompanyList;
	}

	public WebElement getCreateContactList() {
		return CreateContactList;
	}

	public WebElement getCreateSuppressionList() {
		return CreateSuppressionList;
	}

	public WebElement getWelcomeTextforLogout() {
		return WelcomeTextforLogout;
	}

	public WebElement getLogout() {
		return Logout;
	}

	public WebElement getUpdateButtonForSaveSearch() {
		return UpdateButtonForSaveSearch;
	}

	public WebElement getnewContactradiobutton() {
		return newContactradiobutton;
	}

	public WebElement getnewCompanyradiobutton() {
		return newCompanyradiobutton;
	}

	public WebElement getSalesIntelTab() {
		return SalesIntelTab;
	}

	public WebElement getSearchBoxInSalesIntalTab() {
		return SearchBoxInSalesIntalTab;
	}

	public WebElement getRecommendedList() {
		return RecommendedList;
	}

	public WebElement getSavedSearchesInSiTab() {
		return SavedSearchesInSiTab;
	}

	public WebElement getFirstSavedSearchInSiTab() {
		return FirstSavedSearchInSiTab;
	}

	public WebElement getSaveSearchButton() {
		return SaveSearchButton;
	}

	public WebElement getSearchSavedButton() {
		return SearchSavedButton;
	}

	public WebElement getEditButtonForFirstSavedSearch() {
		return EditButtonForFirstSavedSearch;
	}

	public WebElement getEditButtonForFirstList() {
		return EditButtonForFirstList;
	}

	public WebElement getDeleteButtonForFirstList() {
		return DeleteButtonForFirstList;
	}

	public WebElement getDeleteConfirmationButton() {
		return DeleteConfirmationButton;
	}

	public WebElement getEditButtonForListName() {
		return EditButtonForListName;
	}

	public WebElement getEditButtonForSuppressionListName() {
		return EditButtonForSuppressionListName;
	}

	public WebElement getEditNameTextField() {
		return EditNameTextField;
	}

	public WebElement getSaveEditedListName() {
		return SaveEditedListName;
	}

	public WebElement getSaveEditedSuppressionListName() {
		return SaveEditedSuppressionListName;
	}

	public WebElement getFirstRecordInEditList() {
		return FirstRecordInEditList;
	}

	public WebElement getFirstRecordInEditSuppressionList() {
		return FirstRecordInEditSuppressionList;
	}

	public WebElement getDeleteRecordInEditList() {
		return DeleteRecordInEditList;
	}

	public WebElement getDeleteSuppressionRecordInEditList() {
		return DeleteSuppressionRecordInEditList;
	}

	public WebElement getDeleteContactRecordInEditList() {
		return DeleteContactRecordInEditList;
	}

	public WebElement getSaveSearchNameTextBox() {
		return SaveSearchNameTextBox;
	}

	public WebElement getSavedSearchEditPopupTitle() {
		return SavedSearchEditPopupTitle;
	}

	public WebElement getRecieveEmailAllertButton() {
		return RecieveEmailAllertButton;
	}

	public WebElement getVisibilityOptions() {
		return VisibilityOptions;
	}

	public WebElement getDefaultViewDropdown() {
		return DefaultViewDropdown;
	}

	public WebElement getCancelButton() {
		return CancelButton;
	}

	public WebElement getVisibilityToTeam() {
		return VisibilityToTeam;
	}

	public WebElement getVisibilityToTeamWithClass() {
		return VisibilityToTeamWithClass;
	}

	public WebElement getVisibilityPrivate() {
		return VisibilityPrivate;
	}

	public WebElement getVisibilityPrivateForEdit() {
		return VisibilityPrivateForEdit;
	}

	public WebElement getDefaultViewCompany() {
		return DefaultViewCompany;
	}

	public WebElement getDefaultViewContact() {
		return DefaultViewContact;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public WebElement getSaveList() {
		return SaveList;
	}

	public WebElement getSaveButtonForSavedSearch() {
		return SaveButtonForSavedSearch;
	}

	public WebElement getMySavedSearchesDropdown() {
		return MySavedSearchesDropdown;
	}

	public WebElement getFirstSavedSearchInDropdown() {
		return FirstSavedSearchInDropdown;
	}

	public WebElement getDeleteButton() {
		return DeleteButton;
	}

	public WebElement getSavedSearchesCount() {
		return SavedSearchesCount;
	}

	public WebElement getSavedSearchTab() {
		return SavedSearchTab;
	}

	public WebElement getFirstRecommendedList() {
		return FirstRecommendedList;
	}

	public WebElement getViewallForSavedSearch() {
		return ViewallForSavedSearch;
	}

	public WebElement getIncludeTeamSearchesTextInSavedSearchTab() {
		return IncludeTeamSearchesTextInSavedSearchTab;
	}

	public WebElement getFirstRecommendedListInRankings() {
		return FirstRecommendedListInRankings;
	}

	public WebElement getSearchButtonInSalesIntelTab() {
		return SearchButtonInSalesIntelTab;
	}

	public WebElement getCompaniesTab() {
		return CompaniesTab;
	}

	public WebElement getNoContactFound() {
		return NoContactFound;
	}

	public WebElement getNoCompanyFound() {
		return NoCompanyFound;
	}

	public WebElement HumanVerified() {
		return Humanverified;
	}

	public WebElement getCompanyListDropdown() {
		return CompanyListDropdown;
	}

	public WebElement RequestVerificationButton() {
		return RequestVerificationButton;
	}

	public WebElement RODreqestedInRODtab() {
		return RODreqestedInRODtab;
	}

	public WebElement getRoDTab() {
		return RoDTab;
	}

	public WebElement getnewuniversalContactradiobutton() {
		return newuniversalContactradiobutton;
	}

	public WebElement Statevalueselection() {
		return Statevalueselection;
	}

	public WebElement getStatevalueselectionForContact() {
		return getStatevalueselectionForContact;
	}

	public WebElement getHumanVerifiedCompaniesCount() {
		return HumanVerifiedCompaniesCount;
	}

	public WebElement getHumanVerifiedContactsCount() {
		return HumanVerifiedContactsCount;
	}

	public WebElement LocationTab() {
		return LocationTab;
	}

	public WebElement getCompany_Radio_Button() {
		return company_Radio_Button;
	}

	public WebElement getMonthly_License_Credits_And_Shared_Credits() {
		return monthly_License_Credits_And_Shared_Credits;
	}

	public WebElement getExport_Company_To_Salesforce_1st_Company_Checkbox() {
		return export_Company_To_Salesforce_1st_Company_Checkbox;
	}

	public WebElement getExport_Company_To_Salesforce_Bulk_Actions_Companies() {
		return export_Company_To_Salesforce_Bulk_Actions_Companies;
	}

	public WebElement getExport_Company_To_Salesforce() {
		return export_Company_To_Salesforce;
	}

	public WebElement getExport_Company_To_Salesforce_Duplicates() {
		return export_Company_To_Salesforce_Duplicates;
	}

	public WebElement getExport_Company_To_Salesforce_Next() {
		return export_Company_To_Salesforce_Next;
	}

	public WebElement getExport_Company_To_Salesforce_Status() {
		return export_Company_To_Salesforce_Status;
	}

	public WebElement getExport_Company_To_Salesforce_Close() {
		return export_Company_To_Salesforce_Close;
	}

	public WebElement getExport_Company_To_Salesforce_Failed_Popup() {
		return export_Company_To_Salesforce_Failed_Popup;
	}

	public WebElement getExport_Contact_To_Salesforce_1st_Contact_Checkbox() {
		return export_Contact_To_Salesforce_1st_Contact_Checkbox;
	}

	public WebElement getExport_Contact_To_Salesforce_Bulk_Actions_Companies() {
		return export_Contact_To_Salesforce_Bulk_Actions_Companies;
	}

	public WebElement getExport_Contact_To_Salesforce() {
		return export_Contact_To_Salesforce;
	}

	public WebElement getExport_Contact_To_Salesforce_Export_As_Lead() {
		return export_Contact_To_Salesforce_Export_As_Lead;
	}

	public WebElement getExport_Contact_To_Salesforce_Status() {
		return export_Contact_To_Salesforce_Status;
	}

	public WebElement getCompanies_Export_to_CSV() {
		return companies_Export_to_CSV;
	}

	public WebElement getCompanies_Export_to_CSV_Text_Field() {
		return companies_Export_to_CSV_Text_Field;
	}

	public WebElement getCompanies_Export_to_CSV_Submit_Button() {
		return companies_Export_to_CSV_Submit_Button;
	}

	public WebElement getContact_Export_to_CSV() {
		return contact_Export_to_CSV;
	}

	public WebElement getContact_Humanverified() {
		return contact_Humanverified;
	}

	public WebElement getExport_Contact_To_CSV_Bulk_Actions_Contacts() {
		return export_Contact_To_CSV_Bulk_Actions_Contacts;
	}

	public WebElement getCompanies_Export_To_Zoho() {
		return companies_Export_To_Zoho;
	}

	public WebElement getCompanies_Export_To_Zoho_ExportStatus() {
		return companies_Export_To_Zoho_ExportStatus;
	}

	public WebElement getContacts_Export_To_Zoho() {
		return contacts_Export_To_Zoho;
	}

	public WebElement getContacts_Export_To_Zoho_ExportStatus() {
		return contacts_Export_To_Zoho_ExportStatus;
	}

	public WebElement getContacts_Export_To_Outreach() {
		return contacts_Export_To_Outreach;
	}

	public WebElement getContacts_Export_To_Outreach_ExportStatus() {
		return contacts_Export_To_Outreach_ExportStatus;
	}

	public WebElement getContacts_Export_To_Outreach_Close() {
		return contacts_Export_To_Outreach_Close;
	}

	public WebElement getCompanies_Export_To_Dynamics_365() {
		return companies_Export_To_Dynamics_365;
	}

	public WebElement getCompanies_Export_To_Dynamics_365_ExportStatus() {
		return companies_Export_To_Dynamics_365_ExportStatus;
	}

	public WebElement getContacts_Export_To_Dynamics_365() {
		return contacts_Export_To_Dynamics_365;
	}

	public WebElement getContacts_Export_To_Dynamics_365_ExportStatus() {
		return contacts_Export_To_Dynamics_365_ExportStatus;
	}

	public WebElement getContacts_Export_To_Marketo() {
		return contacts_Export_To_Marketo;
	}

	public WebElement getContacts_Export_To_Marketo_ExportStatus() {
		return contacts_Export_To_Marketo_ExportStatus;
	}

	public WebElement getContacts_Export_To_Marketo_Close() {
		return contacts_Export_To_Marketo_Close;
	}

	public WebElement getContacts_Export_To_HotSpot() {
		return contacts_Export_To_HotSpot;
	}

	public WebElement getContacts_Export_To_HotSpot_ExportStatus() {
		return contacts_Export_To_HotSpot_ExportStatus;
	}

	public WebElement getContacts_Export_To_HotSpot_ExportStatus_Expand_Icon() {
		return contacts_Export_To_HotSpot_ExportStatus_Expand_Icon;
	}

	public WebElement getContacts_Export_To_HotSpot_Close() {
		return contacts_Export_To_HotSpot_Close;
	}

	public WebElement getIndustry_Icon_Right_Arrow() {
		return industry_Icon_Right_Arrow;
	}

	public WebElement getMachine_Verified_Label() {
		return machine_Verified_Label;
	}

	public WebElement getExport_All_Companies_Button() {
		return export_All_Companies_Button;
	}

	public WebElement getExport_All_Companies_CSV_Entire_Row() {
		return export_All_Companies_CSV_Entire_Row;
	}

	public WebElement getWelcome_Icon_Down_Arrow() {
		return welcome_Icon_Down_Arrow;
	}

	public WebElement getFile_Center_Label() {
		return file_Center_Label;
	}

	public WebElement getAgriculture_Forestry_Fishing_And_Hunting() {
		return agriculture_Forestry_Fishing_And_Hunting;
	}

	public WebElement getCompanies_Download_CSV() {
		return companies_Download_CSV;
	}

	public WebElement getExport_Close_Button() {
		return export_Close_Button;
	}

	public WebElement getExport_All_Contacts_Button() {
		return export_All_Contacts_Button;
	}

	public WebElement getArts_Entertainment_And_Recreation() {
		return arts_Entertainment_And_Recreation;
	}

	public WebElement getFirst_Contact_List_Details() {
		return first_Contact_List_Details;
	}

	public WebElement getSelect_All_Checkbox() {
		return select_All_Checkbox;
	}

	public WebElement getSelect_All_Dropdown_Options() {
		return select_All_Dropdown_Options;
	}

	public WebElement getContacts_Preview_Options() {
		return contacts_Preview_Options;
	}

	public WebElement getContacts_Machine_Verified() {
		return contacts_Machine_Verified;
	}

	public WebElement getExport_From_List() {
		return export_From_List;
	}

	public WebElement getExport_From_List_Count_Sort_Arrow() {
		return export_From_List_Count_Sort_Arrow;
	}

	public WebElement getExport_From_List_Count_Desc_Sort_Arrow() {
		return export_From_List_Count_Desc_Sort_Arrow;
	}

	public WebElement getExport_From_List_Company_List() {
		return export_From_List_Company_List;
	}

	public WebElement getExport_From_List_Contact_List() {
		return export_From_List_Contact_List;
	}

	public WebElement getExport_From_List_Company_Human_Verified() {
		return export_From_List_Company_Human_Verified;
	}

	public WebElement getExport_From_List_Salesforce_Company_Human_Verified() {
		return export_From_List_Salesforce_Company_Human_Verified;
	}

	public WebElement getExport_From_List_Dynamic_365_Company_Human_Verified() {
		return export_From_List_Dynamic_365_Company_Human_Verified;
	}

	public WebElement getExport_From_List_Zoho_Company_Human_Verified() {
		return export_From_List_Zoho_Company_Human_Verified;
	}

	public WebElement getExport_From_List_CSV_Company_Human_Verified() {
		return export_From_List_CSV_Company_Human_Verified;
	}

	public WebElement getExport_From_List_Company_Machine_Verified() {
		return export_From_List_Company_Machine_Verified;
	}

	public WebElement getExport_From_List_Salesforce_Company_Machine_Verified() {
		return export_From_List_Salesforce_Company_Machine_Verified;
	}

	public WebElement getExport_From_List_Dynamic_365_Company_Machine_Verified() {
		return export_From_List_Dynamic_365_Company_Machine_Verified;
	}

	public WebElement getExport_From_List_Zoho_Company_Machine_Verified() {
		return export_From_List_Zoho_Company_Machine_Verified;
	}

	public WebElement getExport_From_List_CSV_Company_Machine_Verified() {
		return export_From_List_CSV_Company_Machine_Verified;
	}

	public WebElement getExport_From_List_Close_Button() {
		return export_From_List_Close_Button;
	}

	public WebElement getExport_From_List_Company_Human_Verified_Duplicates() {
		return export_From_List_Company_Human_Verified_Duplicates;
	}

	public WebElement getExport_From_List_Company_Human_Verified_Duplicates_Export_Original_Records() {
		return export_From_List_Company_Human_Verified_Duplicates_Export_Original_Records;
	}

	public WebElement getFirstSearchedResult() {
		return FirstSearchedResult;
	}

	public WebElement getFirstSearchedResultByEmployee() {
		return FirstSearchedResultByEmployee;
	}

	public WebElement getFirstSearchedResultByContacts() {
		return FirstSearchedResultByContacts;
	}

	public WebElement getHumanVerifiedCompaniesCountSalesIntel() {
		return HumanVerifiedCompaniesCountSalesIntel;
	}

	public WebElement getBack_To_Search_Results() {
		return back_To_Search_Results;
	}

	public WebElement getSaved_Search_Results() {
		return saved_Search_Results;
	}

	public WebElement getCreate_List_Button() {
		return create_List_Button;
	}

	public WebElement getCreate_Company_List_Button() {
		return create_Company_List_Button;
	}

	public WebElement getList_Name_Text_Field() {
		return list_Name_Text_Field;
	}

	public WebElement getChoose_File_Button() {
		return choose_File_Button;
	}

	public WebElement getAvailability_Combobox_Field() {
		return availability_Combobox_Field;
	}

	public WebElement getTeam_field() {
		return team_field;
	}

	public WebElement getSave_List_Button() {
		return save_List_Button;
	}

	public WebElement getSalesforce_Username() {
		return salesforce_Username;
	}

	public WebElement getSalesforce_Password() {
		return salesforce_Password;
	}

	public WebElement getSalesforce_Login_Button() {
		return salesforce_Login_Button;
	}

	public WebElement getSalesforce_Remember_Me_Checkbox() {
		return salesforce_Remember_Me_Checkbox;
	}

	public List<WebElement> getSalesforce_Remind_Me_Later() {
		return salesforce_Remind_Me_Later;
	}

	public WebElement getSalesforce_SalesIntel_Tab() {
		return salesforce_SalesIntel_Tab;
	}

	public WebElement getSalesforce_Leads_Button() {
		return salesforce_Leads_Button;
	}

	public WebElement getSalesforce_Leads_New_Button() {
		return salesforce_Leads_New_Button;
	}

	public WebElement getSalesforce_Leads_First_Name() {
		return salesforce_Leads_First_Name;
	}

	public WebElement getSalesforce_Leads_Last_Name() {
		return salesforce_Leads_Last_Name;
	}

	public WebElement getSalesforce_Leads_Company() {
		return salesforce_Leads_Company;
	}

	public WebElement getSalesforce_Leads_Phone() {
		return salesforce_Leads_Phone;
	}

	public WebElement getSalesforce_Leads_Email() {
		return salesforce_Leads_Email;
	}

	public WebElement getSalesforce_Leads_Save_Button() {
		return salesforce_Leads_Save_Button;
	}

	public WebElement getSalesforce_Bulk_Actions_Button() {
		return salesforce_Bulk_Actions_Button;
	}

	public WebElement getSalesforce_Export_Salesforce_Button() {
		return salesforce_Export_Salesforce_Button;
	}

	public List<WebElement> getSwitch_To_Lighting_View_Profile_Image() {
		return switch_To_Lighting_View_Profile_Image;
	}

	public WebElement getSwitch_To_Salesforce_Classic_Label() {
		return switch_To_Salesforce_Classic_Label;
	}

	public List<WebElement> getSwitch_To_Lightning_Experience_Label() {
		return switch_To_Lightning_Experience_Label;
	}

	public WebElement getSalesIntel_EnrichIntel_Label() {
		return salesIntel_EnrichIntel_Label;
	}

	public WebElement getNew_Enrichment_Button() {
		return new_Enrichment_Button;
	}

	public WebElement getEnrichment_Task_Name_Label() {
		return enrichment_Task_Name_Label;
	}

	public WebElement getNew_Enrichment_Lead_Button() {
		return new_Enrichment_Lead_Button;
	}

	public WebElement getNew_Enrichment_Lead_Filter_Dropdown() {
		return new_Enrichment_Lead_Filter_Dropdown;
	}

	public WebElement getNew_Enrichment_Lead_Filter_Input_Field() {
		return new_Enrichment_Lead_Filter_Input_Field;
	}

	public WebElement getNew_Enrichment_Analyze_Button() {
		return new_Enrichment_Analyze_Button;
	}

	public WebElement getSalesforce_Export_CSV_Button() {
		return salesforce_Export_CSV_Button;
	}

	public WebElement getNew_Enrichment_Lead_Refresh_Status() {
		return new_Enrichment_Lead_Refresh_Status;
	}

	public WebElement getNew_Enrichment_Lead_Start_Enrichment() {
		return new_Enrichment_Lead_Start_Enrichment;
	}

	public WebElement getNew_Enrichment_Lead_Start_Enrichment_Data() {
		return new_Enrichment_Lead_Start_Enrichment_Data;
	}

	public WebElement getNew_Enrichment_Lead_Start_Enrichment_Data_Yes_Button() {
		return new_Enrichment_Lead_Start_Enrichment_Data_Yes_Button;
	}

	public WebElement getSalesforce_Logout() {
		return salesforce_Logout;
	}

	public WebElement getSalesforce_Settings_Icon() {
		return salesforce_Settings_Icon;
	}

}
