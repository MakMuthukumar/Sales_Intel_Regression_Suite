$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/New_UI_View/TC_51_Adding_Company_File_To_List_Functionality.feature");
formatter.feature({
  "name": "To Validate Application Export CSV Machine Verified Companies From List View",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate SalesIntel application Launching application",
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
      "name": "@Add_Company"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the url",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.launch_the_url()"
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
      "name": "@Add_Company"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Username",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_enter_the_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Valid Password",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_enter_the_password()"
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
  "name": "To validate SalesIntel application adding Company file into List View",
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
      "name": "@Add_Company"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Lists View",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.click_on_Lists_View()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Adding The Multiple Company Entry Into List View",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.adding_The_Multiple_Company_Entry_Into_List_View()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d114.0.5735.110)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NHCLPT520\u0027, ip: \u0027192.168.0.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002716.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 114.0.5735.110, chrome: {chromedriverVersion: 114.0.5735.90 (386bc09e8f4f..., userDataDir: C:\\Users\\400121~1.LNT\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:56052}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 827549b8ab91f1b440269a2d43486051\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:78)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat jdk.internal.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy28.click(Unknown Source)\r\n\tat org.base.Global.clickButton(Global.java:54)\r\n\tat org.stepdefinition.Steps.adding_The_Multiple_Company_Entry_Into_List_View(Steps.java:8398)\r\n\tat ✽.Adding The Multiple Company Entry Into List View(file:src/test/resources/Features/New_UI_View/TC_51_Adding_Company_File_To_List_Functionality.feature:16)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Logout the application",
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
      "name": "@Add_Company"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click On Setting Options",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_click_welcome_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Logout Options",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.I_click_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});