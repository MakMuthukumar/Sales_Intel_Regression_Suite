$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/New_UI_View/TC_51_Sales_Intel_EnrichIntel.feature");
formatter.feature({
  "name": "To Validate Application Sales Intel Enrich Intel",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate Salesforce application Launching application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Sales_Intel_Enrich_Intel"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the Sales Force url",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.launch_the_Sales_Force_url()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate Salesforce application Valid User Username and Valid Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Sales_Intel_Enrich_Intel"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Username in Sales Force",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.enter_Valid_Username_in_Sales_Force()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Password in Sales Force",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_Valid_Password_in_Sales_Force()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Remember me Checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_On_Remember_me_Checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Login Button in Sales Force",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_On_Login_Button_in_Sales_Force()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Remember me Later if popup comes",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_On_Remember_me_Later_if_popup_comes()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate SalesIntel application Valid User Username and Valid Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Sales_Intel_Enrich_Intel"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on SalesIntel Tab",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.click_on_SalesIntel_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Username in SalesIntel Tab",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_Valid_Username_in_SalesIntel_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Password in SalesIntel Tab",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_Valid_Password_in_SalesIntel_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_Click_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate SalesIntel application - Selecting multiple contacts",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Sales_Intel_Enrich_Intel"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Wait for Page load",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.wait_for_Page_load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Contact Radio Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Contact_Radio_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Search Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_Click_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Multiple contact to Add Contact List",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.I_select_multiple_Contacts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Bulk Actions Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_On_Bulk_Actions_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Export Salesforce option",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_On_Export_Salesforce_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for Page load",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.wait_for_Page_load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Submit Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_On_Submit_Button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[@type\u003d\u0027submit\u0027 and contains(text(),\u0027Submit\u0027)]\"}\n  (Session info: chrome\u003d114.0.5735.134)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NHCLPT520\u0027, ip: \u0027192.168.0.102\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002716.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 114.0.5735.134, chrome: {chromedriverVersion: 114.0.5735.90 (386bc09e8f4f..., userDataDir: C:\\Users\\400121~1.LNT\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:57519}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 10a55de9220c1f718af3342ff7ef371e\n*** Element info: {Using\u003dxpath, value\u003d//button[@type\u003d\u0027submit\u0027 and contains(text(),\u0027Submit\u0027)]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:78)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy28.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:484)\r\n\tat org.stepdefinition.Steps.click_On_Submit_Button(Steps.java:7310)\r\n\tat ✽.Click On Submit Button(file:src/test/resources/Features/New_UI_View/TC_51_Sales_Intel_EnrichIntel.feature:31)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate Salesforce application - adding multiple contacts(First Lead) in leads page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Sales_Intel_Enrich_Intel"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Wait for Page load",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.wait_for_Page_load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Leads Tab",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Leads_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on New Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_New_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the First Lead - First Name Input Field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_the_First_Lead_First_Name_Input_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the First Lead - Last Name Input Field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_the_First_Lead_Last_Name_Input_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the First Lead - Company Input Field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_the_First_Lead_Company_Input_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the First Lead - Phone Input Field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_the_First_Lead_Phone_Input_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the First Lead - Email Input Field",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_the_First_Lead_Email_Input_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_On_Save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});