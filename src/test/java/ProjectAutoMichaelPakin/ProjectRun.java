package ProjectAutoMichaelPakin;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import java.awt.*;
import java.io.IOException;
import java.security.Key;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
// public class ProjectRun {
public class ProjectRun extends ProjectJframe {
    static WebDriver driver;
    static ProjectFun func = new ProjectFun(driver);
    static ProjectPOM pom = new ProjectPOM();
    //Extent imports
    static ProjectExtentReports exm = new ProjectExtentReports(driver);
    // Jframe
    static ProjectJframe pjf = new ProjectJframe();
    static ExtentReports extent;
    static ExtentTest Test01;
    static ExtentTest Test02;
    static ExtentTest Test03;
    static ExtentTest Test04;
    static ExtentTest Test05;
    static ExtentTest Test06;
    static ExtentTest Test07;
    static ExtentTest Test08;
    static ExtentTest Test09;
    static ExtentTest Test10;
    static ExtentTest Test11;
    static ExtentTest Test12;
    static ExtentTest Test13;
    static ExtentTest Test14;
    static ExtentTest Test15;
    static ExtentTest Test16;
    static ExtentTest Test17;
    static ExtentTest Test18;
    static ExtentTest Test19;
    static ExtentTest Test20;
    static ExtentTest Test21;
    static ExtentTest Test22;
    static ExtentTest Test23;
    static ExtentTest Test24;
    static ExtentTest Test25;
    static ExtentTest Test26;
    static ExtentTest Test27;
    static ExtentTest Test28;
    static ExtentTest Test29;
    static ExtentTest Test30;


// nado sozdati testi > posmotri na pageObjectFunClassWork > razberisi s grupai testov bard v pomosh // yrok po teme 12


    By sergoog = By.className("gLFyf"); // חיפוס גוגל -
    By title = By.id("OfficeName"); // כותרת MOH -
    By langListBtn = By.id("langListBtn"); // שפות עמוד ראשי
    // test
    By currentLang = By.className("current-lang"); // שפה נוכחית + nekori

    By popupClose = By.xpath("/html/body/header/div/div[1]/div[2]/div[4]/div/div[1]"); // סגירה פופאפ
    // ------------- Translate Google -------------
    By Detectlanguage = By.className("VfPpkd-jY41G-V67aGc"); // זיהוי שפה
    By whatToTranslate = By.xpath("//*[@id='yDmH0d']/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[1]/span/span/div/textarea"); // לתרגום
    By Translation = By.className("ryNqvb"); // תוצאה תרגום
    // ------------- חיפוס משרד הבריאות -------------
    By subsearch = By.id("sub-search"); // חיפוס עמוד ראשי
    By SearchPageSearchInput = By.id("SearchPageSearchInput"); // שורת חיפוס עמוד חיפוס
    By totalResults = By.xpath("/html/body/article/section/div/div[2]/div/div[2]/div[2]/div[1]/h1/span[1]"); // כמות תוצעות
    By resultText = By.tagName("h1");
//    By textPage = By.xpath("/html/body/article/section/div/div[3]/div[2]/div/div[1]");

    // ------------- סינון -------------
    By clearFilter = By.xpath("/html/body/article/section/div/div[2]/div/div[2]/div[1]/div/a[1]");
    // ------------- ניווט -------------
    By naviText = By.tagName("h2");
// ------------ כפתור עוד בדיקת לינקים ----------
    By odButton = By.id("MoreOfficeTopMenu");
// ------------ בנרים פרסום -----------
    By ibuttonPlayStop = By.xpath("/html/body/div/article/div/div[2]/div/div/div[2]/div/button[3]/i");
By bannerNumber0 = By.className("clickableImages");
    By bannerNumber1 = By.id("officeBannerButton");
// ---------כניסה אזור אישי -----------
    By privateZone = By.id("private-zone-link");
    By toolTipText = By.className("tooltiptext");
    By loginBtn = By.className("login-btn");
    By regBtn = By.id("regBtn");
    By registration = By.className("xsDisplayNone");
    By submitBtn = By.id("submitBtn");
    By btnSend = By.id("btnSend_label");

    // ----- פרטים אישיים
    By firstName = By.id("givenName"); // first name
    By errorFirstName = By.className("errorTextInput");// first name
    By lname = By.id("sn"); // last name
    By errorLName = By.id("snErrorDiv");
    By zeut = By.id("cn"); // ת.ז
    By erroezeut = By.id("cnErrorDiv");

    By mail = By.id("mail");// mail
    By emailError = By.id("emailErrorDiv");
    By mailConfirm = By.id("mail_confirm"); // mail_confirm
    By errorMailConfirm = By.id("emailConfirmErrorDiv");
    By mobile = By.id("mobile"); // mobile
    By mobileError = By.id("mobileErrorDiv");
    By mobileConfirm = By.id("mobile_confirm"); // mobile Confirm
    By mobileConfirmError = By.id("mobileConfirmErrorDiv");

    By radioSMS = By.id("radioSMS"); // radio SMS
    By radioVOICE = By.id("radioVOICE"); // radio VOICE
    By SendCodeHidden = By.id("SendCodeHidden");// value

    // -------------- method container
    By methodContainer1 = By.id("payment-method-btn-container1");
    By identificationsButton1 = By.id("identificationsButton1");
    // ------------- CreditCard--------
    By cardNumber =By.id("idnt_ccNumber1");
    By cardNumberError = By.id("ccNumberErrorDiv1");
    By year = By.id("idnt_ccExpiredYear1");
    By month = By.id("idnt_ccExpiredMonth1");
    By cvv = By.id("idnt_ccCvv1");
    By cvvError = By.id("ccCvvErrorDiv1");

    By methodContainer2 = By.id("payment-method-btn-container2");
    By identificationsButton2 = By.id("identificationsButton2");

    By question1Container2 = By.id("question1-container2");
    By lastGoDateAnswer = By.id("idnt_lastGoDateAnswer_12");
    By question1AnswerErrorDiv2 = By.id("question1AnswerErrorDiv2");
    By question2Container2 = By.id("question2-container2");

    By idCardIssueDateAnswer = By.id("idnt_idCardIssueDateAnswer_22");

    By question2AnswerErrorDiv2 = By.id("question2AnswerErrorDiv2");

    //    ----------------Password---------------

    By password1 = By.id("password1");
    By passwordError1 = By.id("errorpassword1");

    By password2 = By.id("password2");
    By passwordError2 = By.id("errorpassword2");

    By radioAgreeEnvironment = By.id("radioAgreeEnvironment");
    By radioDisagreeEnvironment = By.id("radioDisagreeEnvironment");

    By agreementConsent = By.id("agreementConsent");


//    ----------------Enter--------------- userId

//    By zeutEnter = By.xpath("html/body/div[2]/div/div/div[2]/div/div/div[5]/div/div[1]/div/section/form/div[1]/div/input");
    By zeutEnter = By.id("userId");
    By zeutEnterError = By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div/div[2]/div/div[3]/form/div[2]/div[1]/div[3]/span");
    By passEnter = By.id("userPass");
    By passEnterError = By.xpath("/html/body/div[2]//div[2]//div[5]//section/form/div[2]/div/div/span");
    By enterButtonEnter = By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div/div[2]/div/div[3]/form/div[2]/div[4]/button/span[2]");
    By errorMessageEnter = By.id("errorMessage");

    By goBackLink = By.id("goBackLink");







    List <String> titleLangList = new ArrayList();
    List <String> LangList = new ArrayList();
    String moh = "משרד הבריאות";
    String url;
    String tit;


    @BeforeClass
    static public void beforeClass() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://www.google.co.il/");
        pom = PageFactory.initElements(driver,ProjectPOM.class);
        //Extent imports
        extent = exm.GetExtent();

        Test01 = exm.createTest("Site-Test01","כניסה מGOOGLE בדיקה שלינק ראשון הוא של משרד הבריאות");
        Test02 = exm.createTest("Site-Test02","בדיקה נכונות האתר");
        Test03 = exm.createTest("Language-Test03","בדיקת שינוי שפה");
        Test04 = exm.createTest("Language-Test04","בדיקת שפה בעזרת גוגל טרנסלייט");
        Test05 = exm.createTest("SearchTest-Test05","בדיקת כניסה לעמוד חיפוס");
        Test06 = exm.createTest("SearchTest-Test06","בדיקת חיפוס");
        Test07 = exm.createTest("SearchTest-Test07","בדיקת כמות התוצאות של החיפוש");
        Test08 = exm.createTest("SearchTest-Test08","בדיקת כניסה ללינקים של תוצעות חיפוס");
        Test09 = exm.createTest("SearchTest-Test09","בדיקת סינון תוצאות חיפוש");
        Test10 = exm.createTest("navigator-Test10","בדיקת ניווט באתר");
        Test11 = exm.createTest("navigator-Test11","בדיקת נכונות ניווט");
        Test12 = exm.createTest("navigator-Test12","בדיקת לינקים של ניווט");
        Test13 = exm.createTest("Links-Test13","בדיקת לינקים של אתר");
        Test14 = exm.createTest("banner-Test14","בדיקת באנר ראשון");
        Test15 = exm.createTest("banner-Test15","בדיקת החלפת באנר");
        Test16 = exm.createTest("banner-Test16","בדיקת באנר שני");
        Test17 = exm.createTest("banner-Test17","בדיקה החלפה באנר אוטומטי");
        Test18 = exm.createTest("banner-Test18","בדיקת קישורים חיצוניים");
        Test19 = exm.createTest("login-Test19","כניסה לאזור אישי");
        Test20 = exm.createTest("login-Test20","כניסה לעמוד הרשמה");
        Test21 = exm.createTest("login-Test21","בדיקת הרשמה - ללא ערכים");
        Test22 = exm.createTest("login-Test22","בדיקת הרשמה - שדות פרטים אישיים");
        Test23 = exm.createTest("login-Test23","בדיקת הרשמה - הרשמה עם 2 אמצעי זיהוי - זיהוי ראשון");
        Test24 = exm.createTest("login-Test24","בדיקת הרשמה - הרשמה עם 2 אמצעי זיהוי - זיהוי שני");
        Test25 = exm.createTest("login-Test25","סיסמה");
        Test26 = exm.createTest("login-Test26","כפתור הרשמה");
        Test27 = exm.createTest("Enter-Test27","עמוד כניסה בדיקת אפשרות שונות כניסה לאזור אישי");
        Test28 = exm.createTest("Enter-Test28","בדיקת שדות ת.ז וסיסמה");
        Test29 = exm.createTest("Enter-Test29","כפתור כניסה ");
        Test30 = exm.createTest("Enter-Test30","בדיקת ערכים בשדה לוגין");

        // problemnie testi
        // 1 - Enter 27+ - proveriti chto ne tak - problema v perehode na stranizy
        // 2 site
        // test 10 | 12| 14 | 15 | 17 |


        // proitisi po vsem testam proveriti
        // udaliti url is open na vseh testah
        // test 9 faild - pochemy + done pochemy ne poyavilsya
        // otpraviti ychitelu




    }

    @AfterClass
    static public void afterClass() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("____");
        System.out.println("Done");
        driver.quit();
        //Extent imports
        extent.flush();
    }




    @BeforeGroups(groups = "Site") ///////// --------- po ymy gruppi ---------------------
    static public void beforeGroupsSite() {
        pjf.label1.setText("Group Test Site - Run ");
        String selectBrowser = "Google Chrome";
        Object selectedItem = pjf.comboBox.getSelectedItem();
        if (selectedItem != null){
            selectBrowser = String.valueOf(selectedItem);}
        switch (selectBrowser){
            case "Google Chrome": ChromeOptions co = new ChromeOptions();
                co.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(co);break;
            case "Edge" : driver = new EdgeDriver();break;}

        driver.manage().window().maximize();
        pom = PageFactory.initElements(driver,ProjectPOM.class);
        //Extent imports
        extent = exm.GetExtent();
        Test01 = exm.createTest("Site-Test01","כניסה מGOOGLE בדיקה שלינק ראשון הוא של משרד הבריאות" + "  | Browser - " + selectBrowser);
        Test02 = exm.createTest("Site-Test02","בדיקה נכונות האתר" + "  | Browser - " + selectBrowser);}

    @Test(groups = "Site")
    public void Test01() throws InterruptedException, IOException, AWTException {
        // 1.כניסה מGOOGLE בדיקה שלינק ראשון הוא של משרד הבריאות
        func.printC("---------Test 01 - Start ---------");
        moh = "משרד הבריאות";
        driver.get("https://www.google.co.il/");
        Test01.info("פתיחת עמוד גוגל ");
        func.element(driver,sergoog).sendKeys(moh, Keys.ENTER);
        Test01.info("תוצאות חיפוש");
        Test01.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        func.waitToSite(driver,10);
        String link = func.CheckListResult(moh ,pom.googleR);
        func.printC("First link = " + link);
        pom.googleR.get(0).click();
        Test01.info("פתיחת לינק ראשון");
        func.waitToSite(driver,10);
        url = driver.getCurrentUrl();
        func.printC("URL site = " + url + " | Right site = " + func.compareStrings(url,"https://www.gov.il/he/departments/ministry_of_health/govil-landing-page"));
        if (func.compareStrings(url,"https://www.gov.il/he/departments/ministry_of_health/govil-landing-page") == true){
            func.printC("----- Test 01 = OK -----");
            Test01.pass("לינק ראשון הוא של משרד הבריאות");
            Test01.pass(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        }else {func.printC("----- Test 01 = Failed -----");
            Test01.fail("לינק ראשון הוא לא של משרד הבריאות");
            Test01.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
        func.printC("---------Test 01 - END ---------");
        func.printC(" ");
    }
    // propisati vse ysloviya vkluchaya kajdoe deistviya v "info" ++ razobratsya kak sdelati otchet v file xml - podskaska @BeforeGroups propisati testi
    @Test(groups = "Site")
    public void Test02() throws InterruptedException, IOException, AWTException {
        // 2. בדיקה נכונות האתר
        func.printC("---------Test 02 - Start ---------");
        try {driver.get(url);
        }catch (NullPointerException e){driver.get("https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");}
        func.waitToSite(driver,10);
        Test02.info("כניסה לעמוד");
        tit = func.element(driver,title).getText();
        func.printC( "Need title - " + moh + " | Site title - " + tit + " | Checking right site = " + func.compareStrings(moh,tit));
        if (func.compareStrings(moh,tit) == true){func.printC("----- Test 02 = OK -----");
            Test02.pass("אתר זה של משרד הבריאות");
            Test02.pass(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        }else{func.printC("----- Test 02 = Failed -----");
            Test02.fail("אתר הזה לא של משרד הבריאות");
            Test02.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
        func.printC("---------Test 02 - END ---------");
        func.printC(" ");
    }

    @AfterGroups(groups = "Site")
    static public void afterGroupsSite() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("____");
        System.out.println("Done");
        pjf.label1.setText("Group Test Site - Done");
        func.GamailSendReport(func.StringCheckEmail(pjf.textField.getText()));
        driver.quit();
        //Extent imports
        extent.flush();
    }

    @BeforeGroups(groups = "Language") ///////// --------- po ymy gruppi ---------------------
    static public void beforeGroupsLanguage() {


        pjf.label2.setText("Group Test Language - Run ");

        String selectBrowser = "Google Chrome";
        Object selectedItem = pjf.comboBox.getSelectedItem();
        if (selectedItem != null){
            selectBrowser = String.valueOf(selectedItem);}
        switch (selectBrowser){
            case "Google Chrome": ChromeOptions co = new ChromeOptions();
                co.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(co);break;
            case "Edge" : driver = new EdgeDriver();break;}



        driver.manage().window().maximize();
        pom = PageFactory.initElements(driver,ProjectPOM.class);
        //Extent imports
        extent = exm.GetExtent();
        Test03 = exm.createTest("Language-Test03","בדיקת שינוי שפה" + "  | Browser - " + selectBrowser);
        Test04 = exm.createTest("Language-Test04","בדיקת שפה בעזרת גוגל טרנסלייט" + "  | Browser - " + selectBrowser);
    }

    @Test(groups = "Language")
    public void Test03() throws InterruptedException, IOException, AWTException {
        // 3. בדיקת שינוי שפה
        func.printC("---------Test 03 - Start ---------");
        Actions actions = new Actions(driver);
        try {driver.get(url);}catch (NullPointerException e) {driver.get("https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");}
        func.waitToSite(driver,10);
        tit =  func.titlePage(driver,tit,func.element(driver,title));
        String langOnBtn;
        String pomsafaAll;
        func.MoveToOpen(driver,func.element(driver,langListBtn),actions);
        Test03.info("בדיקת שינוי שפה");
        Test03.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        func.printC("lang size = " + pom.safaAll.size());
        for (int i = 0; i<=pom.safaAll.size()-1; i++){
            func.MoveToOpen(driver,func.element(driver,langListBtn),actions);

            func.waitToAtribute(driver,10,func.element(driver,langListBtn),"class","languages open");

            pomsafaAll = pom.safaAll.get(i).getText();
            pom.safaAll.get(i).click();



//            func.waitToWebClick(driver,5,func.element(driver,currentLang));
//            func.waitToClick(driver,5,currentLang); // work
//            Thread.sleep(2000); // -------------------------------------- problema v ojidanii --------------------------------------------
            langOnBtn = func.element(driver,currentLang).getText();
            if (func.compareStrings(pomsafaAll,langOnBtn) == false){func.printC((i+1) + ". This Language DON'T Working " + pomsafaAll);
                Test03.info( " שינוי לשפה זו לא עובד " + " - " + pomsafaAll);
                Test03.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
                func.element(driver,popupClose).click();} else {func.printC((i+1) + ". This Language IT'S Working  " + pomsafaAll);
                Test03.pass(" שינוי לשפה זו עובד תקין "  + " - " + pomsafaAll);
                Test03.pass(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
                titleLangList.add(func.element(driver,title).getText());
                LangList.add(pomsafaAll);}
        }
        if (func.compareStrings(titleLangList.get(1),titleLangList.get(2)) == true || func.compareStrings(titleLangList.get(1),titleLangList.get(3)) == true || func.compareStrings(titleLangList.get(1),titleLangList.get(0)) == true ||
                func.compareStrings(titleLangList.get(2),titleLangList.get(3)) == true || func.compareStrings(titleLangList.get(2),titleLangList.get(0)) == true || func.compareStrings(titleLangList.get(3),titleLangList.get(0)) == true){
            func.printC("----- Test 03 = Failed -----");
            Test03.fail("שינוי שפה לא עובד ");
        } else { func.printC("----- Test 03 = OK -----");
            Test03.pass("שינוי שפה עובד תקין");
        }
        func.printC("---------Test 03 - END ---------");
        func.printC(" ");
    }
// Language
    @Test(groups = "Language")
    public void Test04() throws InterruptedException, IOException, AWTException {
        // 4. בדיקת שפה בעזרת גוגל טרנסלייט
        func.printC("---------Test 04 - Start ---------");
        try {driver.get(url);}catch (NullPointerException e) {driver.get("https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");}
        func.waitToSite(driver, 10);
        Test04.info("בדיקת שפה בעזרת גוגל טרנסלייט");
        String tlang = null;
        String Detectlang = null;
        int resultTest = 0;
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        driver.get("https://translate.google.com/");
        func.waitToSite(driver, 10);
        Test04.info("פתיחת עמוד גוגל טרנסלייט בלשונית חדשה");
        Test04.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        Detectlang = func.element(driver,Detectlanguage).getText();
        for (int i = 0; i <= titleLangList.size()-1; i++){
            tit = titleLangList.get(i);
            String lang = LangList.get(i);
            func.inputStringToElement(lang,func.element(driver,whatToTranslate));
            func.waitToSite(driver, 10);func.waitPresentInElement(driver,10,func.element(driver,Detectlanguage),Detectlang);
            tlang = func.element(driver,Translation).getText();
            func.waitToSite(driver, 10);func.waitPresentInElement(driver,10,func.element(driver,Detectlanguage),Detectlang);
            func.inputStringToElement(tit,func.element(driver,whatToTranslate));
            func.waitToSite(driver, 10);func.waitPresentInElement(driver,10,func.element(driver,Detectlanguage),Detectlang);
            Detectlang = func.element(driver,Detectlanguage).getText();
            Detectlang = func.cutWithSpace(Detectlang);
            Test04.info("השוואה בין השפה נבחרה לבין שפת של כותרת העמוד");
            if (func.compareStrings(Detectlang,tlang) == true){func.printC((i+1) + ") Test language Done " + " This language = " + Detectlang + " | Title = " + tit + " | Title language = " + tlang + " | language = " + lang);
                Test04.info((i+1) + ") Test language Done " + " This language = " + Detectlang + " | Title = " + tit + " | Title language = " + tlang + " | language = " + lang);
                Test04.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
                resultTest++;}else {func.printC((i+1) + " Test language Faile " + " This language = " + Detectlang + " | Title = " + tit + " | Title language = " + tlang + " | language = " + lang);
                Test04.info((i+1) + " Test language Faile " + " This language = " + Detectlang + " | Title = " + tit + " | Title language = " + tlang + " | language = " + lang);
                Test04.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
        } if (resultTest == 4){func.printC("----- Test 04 = OK -----");
            Test04.pass(" בדיקת שפה - תקין ");
            Test04.pass(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        }else{func.printC("----- Test 04 = Failed -----");
            Test04.pass(" בדיקת שפה - נכשל ");
            Test04.pass(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
        func.printC("---------Test 04 - END ---------");
        func.printC(" ");
        driver.close();driver.switchTo().window(tabs.get(0));}

    @AfterGroups(groups = "Language")
    static public void afterGroupsLanguage() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("____");
        System.out.println("Done");
        driver.quit();
        //Extent imports
        extent.flush();
        pjf.label2.setText("Group Test Language - Done ");
        func.GamailSendReport(func.StringCheckEmail(pjf.textField.getText()));
    }

    @BeforeGroups(groups = "SearchTest") ///////// --------- po ymy gruppi ---------------------
    static public void beforeGroupsSearchTest() {
        pjf.label3.setText("Group Test SearchTest - Run ");
        String selectBrowser = "Google Chrome";
        Object selectedItem = pjf.comboBox.getSelectedItem();
        if (selectedItem != null){
            selectBrowser = String.valueOf(selectedItem);}
        switch (selectBrowser){
            case "Google Chrome": ChromeOptions co = new ChromeOptions();
                co.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(co);break;
            case "Edge" : driver = new EdgeDriver();break;}
        driver.manage().window().maximize();
        pom = PageFactory.initElements(driver,ProjectPOM.class);
        //Extent imports
        extent = exm.GetExtent();
        Test05 = exm.createTest("SearchTest-Test05","בדיקת כניסה לעמוד חיפוס");
        Test06 = exm.createTest("SearchTest-Test06","בדיקת חיפוס");
        Test07 = exm.createTest("SearchTest-Test07","בדיקת כמות התוצאות של החיפוש");
        Test08 = exm.createTest("SearchTest-Test08","בדיקת כניסה ללינקים של תוצעות חיפוס");
        Test09 = exm.createTest("SearchTest-Test09","בדיקת סינון תוצאות חיפוש");}

    @Test(groups = "SearchTest")
    public void Test05() throws InterruptedException, IOException, AWTException {
        // 5. בדיקת כניסה לעמוד חיפוס
        func.printC("---------Test 05 - Start ---------");
        func.checkURL(driver,"https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");
        func.waitToSite(driver, 10);
        func.inputStringToElement("" + Keys.ENTER,func.element(driver,subsearch));
        if (func.compareStrings(moh,func.element(driver,title).getText()) == true){func.printC("it's MOH search page ");
            func.printC("----- Test 05 = OK -----");
            Test05.pass(" בדיקת כניסה לעמוד חיפוס - תקין ");
            Test05.pass(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        }else {func.printC("Don't MOH search page");func.printC("----- Test 05 = Failed -----");
            Test05.fail(" בדיקת כניסה לעמוד חיפוס - נכשל ");
            Test05.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
            try {driver.get(url);}catch (NullPointerException e) {driver.get("https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");func.printC("URL is Null");}}
        func.printC("---------Test 05 - END ---------");
        func.printC(" ");}

    @Test(groups = "SearchTest")
    public void Test06() throws InterruptedException, IOException, AWTException {
        // בדיקת חיפוס
        func.printC("---------Test 06 - Start ---------");
        func.checkURL(driver,"https://www.gov.il/he/search?OfficeId=104cb0f4-d65a-4692-b590-94af928c19c0&query=");
        func.waitToSite(driver, 10);
        Test06.info("בדיקת חיפוש לפי מחלקת שקילות");
        Test06.info("צמצום של מחלקת שקילות משיר רק ערכים עם תוצאות חיפוש");
        for (int i=0; i<= func.shkilut.size()-1; i++){
            try {func.waitToPresence(driver,10,totalResults);
            }catch (Exception e) {func.waitToSite(driver,10);
                func.waitToPresence(driver,10,resultText);}
            String totalResul = func.element(driver,totalResults).getText();
            String resultTextString = func.element(driver,resultText).getText();
            func.inputStringToElement(func.shkilut.get(i) + Keys.ENTER,func.element(driver,SearchPageSearchInput));
            func.waitToPresence(driver,10,totalResults);
            func.printC((i+1) + "Test Checkshkilut = " + func.Checkshkilut(totalResul,func.element(driver,totalResults),resultTextString,func.element(driver,resultText),i,func.shkilut));}
        if (func.ResultShkilut.size() >= func.shkilut.size()){func.printC("----- Test 06 = Failed -----");
            Test06.fail(" צמצום של מחלקת שקילות לא קרה - נכשל ");
            Test06.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        } else {func.printC("----- Test 06 = OK -----");
            Test06.pass(" צמצום של מחלקת שקילות  - תקין ");
            Test06.pass(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
        func.printC("---------Test 06 - END ---------");func.printC(" ");}

    @Test(groups = "SearchTest")
    public void Test07() throws InterruptedException, IOException, AWTException {
        // בודקת כמות התוצאות של החיפוש
        func.printC("---------Test 07 - Start ---------");
        func.checkURL(driver,"https://www.gov.il/he/search?OfficeId=104cb0f4-d65a-4692-b590-94af928c19c0&query=");
        func.waitToSite(driver, 10);
        int amountResults;int bResults;int totalResult = 0;
        for (int i = 0; i<= func.ResultShkilut.size()-1;i++){amountResults = 0;bResults = pom.b.size();
            func.inputStringToElement(func.ResultShkilut.get(i) + Keys.ENTER,func.element(driver,SearchPageSearchInput));
            for (int p=0; p<=pom.result.size()-1;p++){amountResults = amountResults + func.lookingSpecificWords(pom.result.get(p).getText(),func.ResultShkilut.get(i));
            }totalResult  = amountResults + bResults;
            func.printC((i+1)+ " ResultShkilut = " + func.ResultShkilut.get(i) + " | Amount of results = " + totalResult);}
        if (totalResult == 0){func.printC("----- Test 07 = Failed -----");
            Test07.fail(" כמות התוצאות של החיפוש שווה ל-0 ");
            Test07.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        } else {func.printC("----- Test 07 = OK -----");
            Test07.pass(" בודקת כמות התוצאות של החיפוש  - תקין ");
            Test07.pass(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
        func.printC("---------Test 07 - END ---------");func.printC(" ");}




    @Test(groups = "SearchTest")// ne zabiti pomenyat nazvaniya gryppi + zdelati po ymy -----------------------------------!!!!!!!!!!!!!!!!!!!!
    public void Test08() throws InterruptedException, IOException, AWTException {
        // בדיקת כניסה ללינקים של תוצעות חיפוס
        Random randomGenerator = new Random();
        func.printC("---------Test 08 - Start ---------");
        func.checkURL(driver,"https://www.gov.il/he/search?OfficeId=104cb0f4-d65a-4692-b590-94af928c19c0&query=");
        func.waitToSite(driver, 10);
        Test08.info("כניסה רנדומלית לינקים של תוצאות חיפוש");
        int randomNumber = 0;
        int numberOfMismatches = 0;
        String located = null;
        String resultRandom = null;
        for (int i = 0; i<= func.ResultShkilut.size()-1;i++){
            func.inputStringToElement(func.ResultShkilut.get(i) + Keys.ENTER,func.element(driver,SearchPageSearchInput));func.waitToSite(driver,10);
            func.printC(func.ResultShkilut.get(i));
            for (int p = 0; p <= 2; p++){randomNumber = randomGenerator.nextInt(0,10);
                String href = pom.result.get(randomNumber).getAttribute("href");
                resultRandom = pom.result.get(randomNumber).getText();
                ((JavascriptExecutor) driver).executeScript("window.open()");
                ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
                driver.switchTo().window(tabs.get(tabs.size() - 1)).manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
                try {driver.get(href);} catch (TimeoutException ignore) {}
                func.waitToSite(driver,10);
                Test08.info( " חיפוש " + func.ResultShkilut.get(i) + " | " + " כניסה ללינק " + resultRandom);
                if (func.compareStrings(href, driver.getCurrentUrl())){
                    boolean a = driver.getPageSource().contains(func.ResultShkilut.get(i));
                    if (a) {located = "yes";} else {located = "no";}
                Test08.pass(" לינק תקין - " + resultRandom);
                }else {numberOfMismatches++;located = " URL page do not match to href ";
                Test08.fail("URL לא תואם ל- Href של לינק ");
                Test08.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
                driver.close();driver.switchTo().window(tabs.get(0));
                func.printC((p+1)+"]"+ resultRandom + "| " + func.ResultShkilut.get(i) + " located in page - " + located);}
        } if (numberOfMismatches >= 20 ){func.printC("----- Test 08 = Failed -----");} else {func.printC("----- Test 08 = OK -----");}
        func.printC("---------Test 08 - END ---------");func.printC(" ");}



    @Test(groups = "SearchTest")
    public void Test09() throws InterruptedException, IOException, AWTException {
        // בדיקת סינון תוצאות חיפוש
        func.printC("---------Test 09 - Start ---------");
        func.checkURL(driver,"https://www.gov.il/he/search?OfficeId=104cb0f4-d65a-4692-b590-94af928c19c0&query=");
        func.waitToSite(driver, 10);
        int totalResultInt;int sinunInt;int filter = 0 ;
        for (int i = 0; i<= func.ResultShkilut.size()-1;i++){int sumsinun = 0;
            func.inputStringToElement(func.ResultShkilut.get(i) + Keys.ENTER,func.element(driver,SearchPageSearchInput));func.waitToSite(driver,10);
            func.printC((i+1)+")" + func.ResultShkilut.get(i));
            func.funCheckClearFilter(func.element(driver,clearFilter));
            for (int s = 0; s <= pom.sinun.size()-1; s++){
                totalResultInt = Integer.parseInt(func.element(driver,totalResults).getText());
                func.isSelectClick(pom.sinunLabel.get(s));
                func.waitToClick(driver,5,clearFilter);
//                --------------------------------------------------------------------------------------------------------------------------
                try { func.waitPresentInElement(driver,25,func.element(driver,totalResults), String.valueOf(totalResultInt));
                }catch (WebDriverException e){}
                sinunInt = func.onlyNumbers(pom.sinun.get(s).getText());
                totalResultInt = Integer.parseInt(func.element(driver,totalResults).getText());
               if (totalResultInt == sinunInt){sumsinun++;}else {func.printC((s+1)+"] "+ pom.sinun.get(s).getText()+" different "+ func.element(driver,resultText).getText());}
                func.funCheckClearFilter(func.element(driver,clearFilter));
                func.waitToPresence(driver,10,totalResults);
            }if (sumsinun != pom.sinun.size()){func.printC("Fault in the filtering | Have filters - " + pom.sinun.size() + " | Checking Filters " + sumsinun);
                Test09.fail("Fault in the filtering | Have filters - " + pom.sinun.size() + " | Checking Filters " + sumsinun + " | Shkilut - " + func.ResultShkilut.get(i));
                Test09.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
            else {func.printC("Filtering is ok | Have filters - " + pom.sinun.size() + " | Checking Filters " + sumsinun);
                Test09.pass("Filtering is ok | Have filters - " + pom.sinun.size() + " | Checking Filters " + sumsinun + " | Shkilut - " + func.ResultShkilut.get(i));
                filter++;}}
        func.printC(String.valueOf(filter) + " - " + "Total departments checked");
        if (filter == func.ResultShkilut.size()){func.printC("----- Test 09 = OK -----");
        Test09.pass(" סינונים  עבדים תקין");
        }else {func.printC("----- Test 09 = Failed -----");
            Test09.fail(" בדיקת עבודת סינונים - נכשל ");}
        func.printC("---------Test 09 - END ---------");func.printC(" ");}


    @AfterGroups(groups = "SearchTest")
    static public void afterGroupsSearchTest() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("____");
        System.out.println("Done");
        driver.quit();
        //Extent imports
        extent.flush();
        pjf.label3.setText("Group Test SearchTest - Done ");
        func.GamailSendReport(func.StringCheckEmail(pjf.textField.getText()));}

    @BeforeGroups(groups = "navigator")
    static public void BeforeGroupsnavigator() {
        pjf.label4.setText("Group Test navigator - Run ");
        String selectBrowser = "Google Chrome";
        Object selectedItem = pjf.comboBox.getSelectedItem();
        if (selectedItem != null){
            selectBrowser = String.valueOf(selectedItem);}
        switch (selectBrowser){
            case "Google Chrome": ChromeOptions co = new ChromeOptions();
                co.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(co);break;
            case "Edge" : driver = new EdgeDriver();break;}

        driver.manage().window().maximize();
        pom = PageFactory.initElements(driver,ProjectPOM.class);
        //Extent imports
        extent = exm.GetExtent();
        Test10 = exm.createTest("navigator-Test10","בדיקת ניווט באתר");
        Test11 = exm.createTest("navigator-Test11","בדיקת נכונות ניווט");
        Test12 = exm.createTest("navigator-Test12","בדיקת לינקים של ניווט");

    }

    @Test(groups = "navigator")
    public void Test10() throws InterruptedException, IOException, AWTException {
        // בדיקת ניווט באתר
        Actions actions = new Actions(driver);
        func.printC("---------Test 10 - Start ---------");
        int res = 0;
        String nav = null;
        func.checkURL(driver,"https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");
        func.waitToSite(driver, 10);
        Test10.info("בדיקת כפתורי ניווט ");
        for (int i = 0; i<= pom.navigator.size()-1; i++){func.waitToWebClick(driver,10,pom.navigator.get(i));
            func.MoveAndClick(driver,actions,pom.navigator.get(i));
            nav = pom.navigator.get(i).getText();
            func.waitToTextToBePresentInElement(driver,10,pom.navigatorTag.get(i),nav);
            try {func.waitToAtribute(driver,5,pom.navigator.get(i),"class","nav-item active");
            }catch (Exception e){}
            if (func.compareStrings(nav,pom.navigatorTag.get(i).getText())) {res++;
                Test10.pass(nav);
                }else {func.printC((i+1)+") navigator button Don't working " + pom.navigator.get(i).getText());
                Test10.fail(pom.navigator.get(i).getText());
                Test10.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
            func.MoveAndClick(driver,actions,pom.navigator.get(0));}
        if (res == pom.navigator.size()){func.printC("----- Test 10 = OK -----");
            Test10.pass("ניווט עובד תקין ");
        }else {func.printC("----- Test 10 = Failed -----");
            Test10.fail("בדיקת ניווט - נכשל");}
        func.printC("---------Test 10 - END ---------");func.printC(" ");}

    @Test(groups = "navigator")
    public void Test11() throws InterruptedException, IOException, AWTException {
        // בדיקת נכונות ניווט
        func.printC("---------Test 11 - Start ---------");
        Actions actions = new Actions(driver);
        int res = 0;
        func.checkURL(driver,"https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");
        func.waitToSite(driver, 10);
        for (int i = 0; i <= pom.navigator.size() - 1; i++) {func.waitToWebClick(driver, 10, pom.navigator.get(i));
            actions.moveToElement(pom.navigator.get(i)).perform();
            Test11.info(" בדיקת ניווט "  + " - "+ pom.navigator.get(i).getText());
            Test11.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
            switch (String.valueOf(func.compareStrings(pom.navigator.get(i).getText(),pom.navigatorTag.get(i).getText()))){case "true" : break;
                default: func.printC(" navigator = " + pom.navigator.get(i).getText() + " | navigatorTag = " + pom.navigatorTag.get(i).getText());res++;break;}
        }if (res >= 0){func.printC("----- Test 11 = OK -----");
        Test11.pass("בדיקת ניווט - תקין");
        }else {func.printC("----- Test 11 = Failed -----");
        Test11.fail("בדיקת ניווט - נכשל");}
        func.printC("---------Test 11 - END ---------");func.printC(" ");}

    @Test(groups = "navigator")  // 2 test - proverka vseh knopak +2 ?
    public void Test12() throws InterruptedException, IOException, AWTException {
        // בדיקת לינקים של ניווט
        Actions actions = new Actions(driver);
        func.printC("---------Test 12 - Start ---------");
        Random randomGenerator = new Random();
        String href;
        int res = 0;int randomNumber;
      func.checkURL(driver,"https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");
        func.waitToSite(driver, 10);
        Test12.info("פתיחת לינקים רנדומלית ");
        for (int i = 0; i <= 3; i++){randomNumber = randomGenerator.nextInt(0,pom.navigator.size());
            for (int u = 0;u <= 2;u++){
                func.waitToWebClick(driver,10,pom.navigator.get(randomNumber));
                func.MoveAndClick(driver,actions,pom.navigator.get(randomNumber));
                href = func.nivutUrl(randomNumber);
                func.waitToSite(driver,10);
                func.printC(href + " - " + pom.navigator.get(randomNumber).getText());
                ((JavascriptExecutor) driver).executeScript("window.open()");
                ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
                driver.switchTo().window(tabs.get(tabs.size() - 1)).manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
                func.waitToSite(driver,10);
                try {driver.get(href);}
                catch (TimeoutException ignore) {func.printC("Link Don't Work" + pom.navigator.get(randomNumber).getText() + " href = " + href); res++;
                    Test12.fail("לינק לא נפתח ");
                    Test12.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
                func.waitToSite(driver, 10);driver.close();driver.switchTo().window(tabs.get(0));}
        }if (res == 0){func.printC("----- Test 12 = OK -----");
        Test12.pass("לינקים תקינים");
        }else {func.printC("----- Test 12 = Failed -----");
        Test12.fail("בדיקת לינקים ניווט - נכשל ");}
        func.printC("---------Test 12 - END ---------");func.printC(" ");}

    @AfterGroups(groups = "navigator")
    static public void afterGroupsnavigator() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("____");
        System.out.println("Done");
        driver.quit();
        //Extent imports
        extent.flush();
        pjf.label4.setText("Group Test navigator - Done ");
        func.GamailSendReport(func.StringCheckEmail(pjf.textField.getText()));}


    @BeforeGroups(groups = "Links")
    static public void beforeGroupsLinks() {


        pjf.label5.setText("Group Test Links - Run ");

        String selectBrowser = "Google Chrome";
        Object selectedItem = pjf.comboBox.getSelectedItem();
        if (selectedItem != null){
            selectBrowser = String.valueOf(selectedItem);}
        switch (selectBrowser){
            case "Google Chrome": ChromeOptions co = new ChromeOptions();
                co.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(co);break;
            case "Edge" : driver = new EdgeDriver();break;}
        driver.manage().window().maximize();
        pom = PageFactory.initElements(driver,ProjectPOM.class);
        //Extent imports
        extent = exm.GetExtent();
        Test13 = exm.createTest("Links-Test13","בדיקת לינקים של אתר");
    }


    @Test(groups = "Links")  // spisak linkov / vhod proverka
    public void Test13() throws InterruptedException, IOException, AWTException {
        // בדיקת לינקים של אתר
        func.printC("---------Test 13 - Start ---------");
        Actions actions = new Actions(driver);
        int res = 0;

        driver.get("https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");
        func.waitToSite(driver, 10);
        Test13.info("פתיחה וסגירה של קישורים באתר");
        for (int i = 0; i <= pom.shiruts.size()-1;i++){func.MoveToOpen(driver,func.element(driver,odButton),actions);
            func.printC((i+1)+ func.openHrefLink(driver,pom.shiruts.get(i)));
            if (func.openHrefLink(driver,pom.shiruts.get(i)).contains("Link Don't Work")){res++;
            Test13.fail("לינק לא נפתח");
            Test13.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
        }if (res == 0){func.printC("----- Test 13 = OK -----");
        Test13.pass("לינקים עובדים תקין");}else {func.printC("----- Test 13 = Failed -----");Test13.fail("לינקים לא נפתחו");}
        func.printC("---------Test 13 - END ---------");func.printC(" ");}

    @AfterGroups(groups = "Links")
    static public void afterGroupsLinks() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("____");
        System.out.println("Done");
        driver.quit();
        //Extent imports
        extent.flush();
        pjf.label5.setText("Group Test Links - Done ");
        func.GamailSendReport(func.StringCheckEmail(pjf.textField.getText()));}


    @BeforeGroups(groups = "banner")
    static public void beforeGroupsbanner() {
        pjf.label6.setText("Group Test banner - Run ");
        String selectBrowser = "Google Chrome";
        Object selectedItem = pjf.comboBox.getSelectedItem();
        if (selectedItem != null){
            selectBrowser = String.valueOf(selectedItem);}
        switch (selectBrowser){
            case "Google Chrome": ChromeOptions co = new ChromeOptions();
                co.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(co);break;
            case "Edge" : driver = new EdgeDriver();break;}

        driver.manage().window().maximize();
        pom = PageFactory.initElements(driver,ProjectPOM.class);
        //Extent imports
        extent = exm.GetExtent();
        Test14 = exm.createTest("banner-Test14","בדיקת באנר ראשון");
        Test15 = exm.createTest("banner-Test15","בדיקת החלפת באנר");
        Test16 = exm.createTest("banner-Test16","בדיקת באנר שני");
        Test17 = exm.createTest("banner-Test17","בדיקה החלפה באנר אוטומטי");
        Test18 = exm.createTest("banner-Test18","בדיקת קישורים חיצוניים");
    }

    @Test(groups = "banner")  // 1 test banner 1 zaiti proveriti / viiti
    public void Test14() throws InterruptedException, IOException, AWTException {
        // בדיקת באנר ראשון
        func.printC("---------Test 14 - Start ---------");
        Actions actions = new Actions(driver);
        driver.get("https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");
//        func.checkURL(driver,"https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");
        func.waitToSite(driver, 10);
        func.printC("Banner 1 Check link open");
        Test14.info("בדיקת באנר 1");
        switch (func.checkActiveBanner()){case "Banner 1" : func.printC("Banner 1 active");break;
            case "Banner 2" : func.MoveAndClick(driver,actions,pom.butpirsum.get(0));
                func.waitToAtribute(driver,10,pom.butpirsum.get(0),"class","src_dot_button__fqz66 src_dot_button_active__IIimp");break;}
        if (func.openHrefLink(driver,func.element(driver,bannerNumber0)).contains("All Done")){
            func.printC("----- Test 14 = OK -----");
        Test14.pass("בדיקת באנר - תקין");
        Test14.pass(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        }else {func.printC("----- Test 14 = Failed -----");
        Test14.fail("בדיקת באנר - נכשל");
        Test14.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
        func.printC("---------Test 14 - END ---------");func.printC(" ");

    }

    @Test(groups = "banner")
    public void Test15() throws InterruptedException, IOException, AWTException {
        // בדיקת החלפת באנר
        func.printC("---------Test 15 - Start ---------");
        Actions actions = new Actions(driver);
        driver.get("https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");
//        func.checkURL(driver,"https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");
        func.waitToSite(driver, 10);
        Test15.info("בדיקת החלפת באנרים");
        switch (func.checkActiveBanner()){case "Banner 1" : func.printC("Banner 1 active");func.MoveAndClick(driver,actions,pom.butpirsum.get(1));
            func.waitToAtribute(driver,10,pom.butpirsum.get(1),"class","src_dot_button__fqz66 src_dot_button_active__IIimp");
            Test15.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());break;
            case "Banner 2" : func.printC("Banner 2 active");func.MoveAndClick(driver,actions,pom.butpirsum.get(0));
                func.waitToAtribute(driver,10,pom.butpirsum.get(0),"class","src_dot_button__fqz66 src_dot_button_active__IIimp");
                Test15.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());break;}
        switch (func.checkActiveBanner()){case "Banner 1" : func.printC("Banner 1 active");func.MoveAndClick(driver,actions,pom.butpirsum.get(1));
            func.waitToAtribute(driver,10,pom.butpirsum.get(1),"class","src_dot_button__fqz66 src_dot_button_active__IIimp");
            Test15.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());break;
            case "Banner 2" : func.printC("Banner 2 active");func.MoveAndClick(driver,actions,pom.butpirsum.get(0));
                func.waitToAtribute(driver,10,pom.butpirsum.get(0),"class","src_dot_button__fqz66 src_dot_button_active__IIimp");
                Test15.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());break;}
        switch (func.checkActiveBanner()){case "Banner 1" : func.printC("Banner 1 active");func.MoveAndClick(driver,actions,pom.butpirsum.get(1));
            func.waitToAtribute(driver,10,pom.butpirsum.get(1),"class","src_dot_button__fqz66 src_dot_button_active__IIimp");
            Test15.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());break;
            case "Banner 2" : func.printC("Banner 2 active");func.MoveAndClick(driver,actions,pom.butpirsum.get(0));
                func.waitToAtribute(driver,10,pom.butpirsum.get(0),"class","src_dot_button__fqz66 src_dot_button_active__IIimp");
                Test15.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());break;}
        func.printC("Active " + func.checkActiveBanner());
        func.printC("---------Test 15 - END ---------");func.printC(" ");}

    @Test(groups = "banner")
    public void Test16() throws InterruptedException, IOException, AWTException {
        // בדיקת באנר שני
        func.printC("---------Test 16 - Start ---------");
        Actions actions = new Actions(driver);
        driver.get("https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");
//        func.checkURL(driver,"https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");
        func.waitToSite(driver, 10);
        Test16.info("בדיקת באנר 2");
        func.printC("Banner 2 Check link open");
        switch (func.checkActiveBanner()){case "Banner 2" : func.printC("Banner 2 active");break;
            case "Banner 1" : func.MoveAndClick(driver,actions,pom.butpirsum.get(1));
                func.waitToAtribute(driver,10,pom.butpirsum.get(1),"class","src_dot_button__fqz66 src_dot_button_active__IIimp");break;}
        if (func.openHrefLink(driver,func.element(driver,bannerNumber1)).contains("All Done")){
            func.printC("----- Test 16 = OK -----");
        Test16.pass("בדיקת באנר 2 - תקין");
        Test16.pass(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        }else {func.printC("----- Test 16 = Failed -----");
        Test16.fail("בדיקת באנר 2 - נכשל");
        Test16.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
        func.printC("---------Test 16 - END ---------");func.printC(" ");}

    @Test(groups = "banner")
    public void Test17() throws InterruptedException, IOException, AWTException {
        // בדיקה החלפה באנר אוטומטי
        func.printC("---------Test 17 - Start ---------");
        Instant start;Instant end;Duration elapsedTime;double elapsedTimeSum = 0.0;
        driver.get("https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");
//        func.checkURL(driver,"https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");
        func.waitToSite(driver, 10);
        Test17.info("בדיקה החלפה אוטומטי באנר 1");
        func.printC("1) active " + func.checkActiveBanner());start = Instant.now();
        if (func.element(driver,ibuttonPlayStop).getAttribute("class").contains("src_play_icon__WNmjj")){func.element(driver,ibuttonPlayStop).click();}
        func.waitToAtribute(driver,10,pom.butpirsum.get(1),"class","src_dot_button__fqz66 src_dot_button_active__IIimp");
        end = Instant.now();elapsedTime = Duration.between(start, end);
        func.printC("Elapsed time to next banner " + func.elapsedTime(elapsedTime) + " sec");elapsedTimeSum = elapsedTimeSum +func.elapsedTime(elapsedTime);
        Test17.info("זמן החלפת באנר 1 " + func.elapsedTime(elapsedTime) + " sec");
        Test17.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        func.printC("2) active " + func.checkActiveBanner());start = Instant.now();
        func.waitToAtribute(driver,10,pom.butpirsum.get(0),"class","src_dot_button__fqz66 src_dot_button_active__IIimp");
        end = Instant.now();elapsedTime = Duration.between(start, end);
        func.printC("Elapsed time to next banner " + func.elapsedTime(elapsedTime) + " sec");elapsedTimeSum = elapsedTimeSum +func.elapsedTime(elapsedTime);
        Test17.info("זמן החלפת באנר 2 " + func.elapsedTime(elapsedTime) + " sec");
        Test17.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        func.printC("3) active " + func.checkActiveBanner());
        func.printC("Elapsed sum time change banners = " + elapsedTimeSum + " sec");
        Test17.info("זמן החלפת באנרים " + elapsedTimeSum + " sec");
        func.printC("---------Test 17 - END ---------");func.printC(" ");}

    @Test(groups = "banner")  // proverka avto perehoda
    public void Test18() throws InterruptedException, IOException, AWTException {
        // בדיקת קישורים חיצוניים
        func.printC("---------Test 18 - Start ---------");
        int res = 0;
        driver.get("https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");
//        func.checkURL(driver,"https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");
        func.waitToSite(driver, 10);
        Test18.info("בדיקת קישורים חיצוניים");
        for (int i = 0; i <= pom.externalLinks.size()-1; i++){func.printC((i+1)+") Test link - "+ pom.externalLinks.get(i).getAttribute("title"));
            if (func.openHrefLink(driver,pom.externalLinks.get(i)).contains("Link Don't Work")){res++;}
        }if (res == 0){func.printC("----- Test 18 = OK -----");
            Test18.pass("בדיקת קישורים חיצוניים - תקין");
            Test18.pass(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        }else {func.printC("----- Test 18 = Failed -----");
            Test18.fail("בדיקת קישורים חיצוניים - תקין");
            Test18.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
        func.printC("---------Test 18 - END ---------");func.printC(" ");}

    @AfterGroups(groups = "banner")
    static public void afterGroupsbanner() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("____");
        System.out.println("Done");
        driver.quit();
        //Extent imports
        extent.flush();
        pjf.label6.setText("Group Test banner - Done ");
        func.GamailSendReport(func.StringCheckEmail(pjf.textField.getText()));}

    @BeforeGroups(groups = "login")
    static public void beforeGroupsLogin() {
        pjf.label7.setText("Group Test login - Run ");
        String selectBrowser = "Google Chrome";
        Object selectedItem = pjf.comboBox.getSelectedItem();
        if (selectedItem != null){
            selectBrowser = String.valueOf(selectedItem);}
        switch (selectBrowser){
            case "Google Chrome": ChromeOptions co = new ChromeOptions();
                co.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(co);break;
            case "Edge" : driver = new EdgeDriver();break;}

        driver.manage().window().maximize();
        pom = PageFactory.initElements(driver,ProjectPOM.class);
        //Extent imports
        extent = exm.GetExtent();
        Test19 = exm.createTest("login-Test19","כניסה לאזור אישי");
        Test20 = exm.createTest("login-Test20","כניסה לעמוד הרשמה");
        Test21 = exm.createTest("login-Test21","בדיקת הרשמה - ללא ערכים");
        Test22 = exm.createTest("login-Test22","בדיקת הרשמה - שדות פרטים אישיים");
        Test23 = exm.createTest("login-Test23","בדיקת הרשמה - הרשמה עם 2 אמצעי זיהוי - זיהוי ראשון");
        Test24 = exm.createTest("login-Test24","בדיקת הרשמה - הרשמה עם 2 אמצעי זיהוי - זיהוי שני");
        Test25 = exm.createTest("login-Test25","סיסמה");
        Test26 = exm.createTest("login-Test26","כפתור הרשמה");

    }



    @Test(groups = "login")
    public void Test19() throws InterruptedException, IOException, AWTException {
        // כניסה לאזור אישי
        func.printC("---------Test 19 - Start ---------");
        Actions actions = new Actions(driver);
        func.checkURL(driver,"https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");
        try {driver.get(url);} catch (NullPointerException e) {driver.get("https://www.gov.il/he/departments/ministry_of_health/govil-landing-page");}
        func.waitToSite(driver, 10);
        Test19.info("כניסה לאזור אישי");
        actions.moveToElement(func.element(driver,privateZone)).perform();
        func.printC("Tool Tip Text - " + func.element(driver,toolTipText).getText());
        func.element(driver,privateZone).click();
        boolean a = driver.getPageSource().contains("אזור אישי ממשלתי");
        if (a) {func.element(driver,loginBtn).click();a = driver.getPageSource().contains("הזדהות וכניסה לשירות מבוקש");
            if (a) {url = driver.getCurrentUrl();func.printC("URL - " + url);func.printC("----- Test 19 = OK -----");} else {func.printC("----- Test 19 = Failed -----");}
        } else {a = driver.getPageSource().contains("הזדהות וכניסה לשירות מבוקש");if (a) {url = driver.getCurrentUrl();
            func.printC("URL - " + url);func.printC("----- Test 19 = OK -----");
        Test19.pass("אזור אישי");
        Test19.pass(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        } else {func.printC("----- Test 19 = Failed -----");
            Test19.fail("לא אזור אישי");
            Test19.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
        }func.printC("---------Test 19 - END ---------");func.printC(" ");}

    @Test(groups = "login")  // login
    public void Test20() throws InterruptedException, IOException, AWTException {
        // כניסה לעמוד הרשמה
        Actions actions = new Actions(driver);
        func.printC("---------Test 20 - Start ---------");

        func.checkURL(driver,"https://login.gov.il/nidp/saml2/sso?id=usernamePasswordSMSOtp&sid=1&option=credential&sid=1");
        func.waitToSite(driver, 10);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",func.element(driver,regBtn));func.waitToSite(driver,10);
        func.element(driver,registration).click();func.waitToSite(driver,10);
        Test20.info("כניסה לעמוד הרשמה");
        boolean a = driver.getPageSource().contains("הרשמה להזדהות הלאומית");
        if (a){url = driver.getCurrentUrl();func.printC("URL - " + url);func.printC("----- Test 20 = OK -----");
        Test20.pass("עמוד הרשמה");
        Test20.pass(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        }else {func.printC("----- Test 20 = Failed -----");
            Test20.fail("עמוד הרשמה - נכשל");
            Test20.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
        func.printC("---------Test 20 - END ---------");func.printC(" ");}


    @Test(groups = "login")  // login
    public void Test21() throws InterruptedException, IOException, AWTException {
        // בדיקת הרשמה - ללא ערכים
        func.printC("---------Test 21 - Start ---------");
        String errorText = null;
        func.checkURL(driver,"https://account.gov.il/sspr/public/newuser?forwardURL=https%3A%2F%2Flogin.gov.il%2Fnidp%2Fsaml2%2Fsso%3Fid%3DusernamePasswordSMSOtp%26sid%3D1%26option%3Dcredential%26sid%3D1&locale=iw");
        func.waitToSite(driver, 10);
        Test21.info("בדיקת הרשמה - ללא ערכים");
        Test21.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",func.element(driver,submitBtn));
        func.waitToPresence(driver,10,errorFirstName);
        errorText = func.element(driver,errorFirstName).getText();
        if (errorText.contains("נא למלא את שמך הפרטי (בעברית בלבד)")){func.printC("Presence Error Text ");func.printC("----- Test 21 = OK -----");
            Test21.pass("יש הודאת שגיאה");
            Test21.pass(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        }else {func.printC("Don't Presence Error Text");func.printC("----- Test 21 = Failed -----");
            Test21.fail("אין הודעת שגיאה");
            Test21.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
        func.printC("---------Test 21 - END ---------");func.printC(" ");}


    @Test(groups = "login")  // login
    public void Test22() throws InterruptedException, IOException, AWTException {
        // בדיקת הרשמה - שדות פרטים אישיים
        func.printC("---------Test 22 - Start ---------");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        int res=0;
        func.checkURL(driver,"https://account.gov.il/sspr/public/newuser?forwardURL=https%3A%2F%2Flogin.gov.il%2Fnidp%2Fsaml2%2Fsso%3Fid%3DusernamePasswordSMSOtp%26sid%3D1%26option%3Dcredential%26sid%3D1&locale=iw");
        func.waitToSite(driver, 10);
        func.printC("First Name test -------------------");
        func.FuncCheckingTextFields(driver,func.shkilut,func.element(driver,firstName),func.element(driver,errorFirstName));
        for (int i = 0; i <= func.ResultShkilut.size()-1; i++){func.printC((1+i) + " ) these value are accepted  - " + func.ResultShkilut.get(i));}
        func.inputStringToElement("דוד" + Keys.ENTER,func.element(driver,firstName));func.ResultShkilut.clear();
        func.printC("Last Name test -------------------");
        func.FuncCheckingTextFields(driver,func.shkilut,func.element(driver,lname),func.element(driver,errorLName));
        for (int i = 0; i <= func.ResultShkilut.size()-1; i++){func.printC((1+i) + " ) these value are accepted  - " + func.ResultShkilut.get(i));}
        func.inputStringToElement("קורונה" + Keys.ENTER,func.element(driver,lname));func.ResultShkilut.clear();
        func.printC("I.D number test -------------------");
        func.FuncCheckingTextFields(driver,func.shkilut,func.element(driver,zeut),func.element(driver,erroezeut));
        for (int i = 0; i <= func.ResultShkilut.size()-1; i++){func.printC((1+i) + " ) these value are accepted  - " + func.ResultShkilut.get(i));}
        func.inputStringToElement("111111118" + Keys.ENTER,func.element(driver,zeut));func.ResultShkilut.clear();
        js.executeScript("arguments[0].scrollIntoView();", func.element(driver,radioSMS));
        func.printC("Email test -------------------");
        func.FuncCheckingTextFields(driver,func.shkilut,func.element(driver,mail),func.element(driver,emailError));
        for (int i = 0; i <= func.ResultShkilut.size()-1; i++){func.printC((1+i) + " ) these value are accepted  - " + func.ResultShkilut.get(i));}
        func.inputStringToElement("mp123@tor.net" + Keys.ENTER,func.element(driver,mail));func.ResultShkilut.clear();
        func.printC("Email Confirm test -------------------");
        func.FuncCheckingTextFields(driver,func.shkilut,func.element(driver,mailConfirm),func.element(driver,errorMailConfirm));
        for (int i = 0; i <= func.ResultShkilut.size()-1; i++){func.printC((1+i) + " ) these value are accepted  - " + func.ResultShkilut.get(i));}
        func.inputStringToElement("mp123@tor.net" + Keys.ENTER,func.element(driver,mailConfirm));func.ResultShkilut.clear();
        func.printC("Mobile number test -------------------");
        func.FuncCheckingTextFields(driver,func.shkilutNumbers,func.element(driver,mobile),func.element(driver,mobileError));
        for (int i = 0; i <= func.ResultShkilut.size()-1; i++){func.printC((1+i) + " ) these value are accepted  - " + func.ResultShkilut.get(i));}
        func.inputStringToElement("0522310055" + Keys.ENTER,func.element(driver,mobile));func.ResultShkilut.clear();
        func.printC("Mobile Confirm number test -------------------");
        func.FuncCheckingTextFields(driver,func.shkilutNumbers,func.element(driver,mobileConfirm),func.element(driver,mobileConfirmError));
        for (int i = 0; i <= func.ResultShkilut.size()-1; i++){func.printC((1+i) + " ) these value are accepted  - " + func.ResultShkilut.get(i));}
        func.inputStringToElement("0522310055" + Keys.ENTER,func.element(driver,mobileConfirm));func.ResultShkilut.clear();
        func.printC("Radio buttons test -------------------");
        func.printC(func.ButtonChangedF(func.element(driver,SendCodeHidden)));
        js.executeScript("arguments[0].click();", func.element(driver,radioSMS));
        js.executeScript("arguments[0].click();", func.element(driver,radioVOICE));
        js.executeScript("arguments[0].click();", func.element(driver,radioSMS));
        switch (func.ButtonChangedF(func.element(driver,SendCodeHidden))){case "button selected SMS":res++;break;}
        if (res > 1 ){func.printC("Radio buttons have a fault");}else {func.printC("Radio buttons fine ");}
        Test22.info("בדיקת הרשמה - שדות פרטים אישיים - עם ערכים בשדות");
        Test22.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        func.printC("---------Test 22 - END ---------");func.printC(" ");}

    @Test(groups = "login")  // login
    public void Test23() throws InterruptedException, IOException, AWTException {
        //  בדיקת הרשמה - הרשמה עם 2 אמצעי זיהוי - זיהוי ראשון
        func.printC("---------Test 23 - Start ---------"); // number card
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Random randomGenerator = new Random();
        String identificationText;
        int randomNumber = 0;
        func.waitToSite(driver, 10);
        js.executeScript("arguments[0].scrollIntoView();", func.element(driver,methodContainer1));
        func.printC("אמצעי זיהוי ראשון");
        func.printC("כרטיס אשראי");
        for (int i = 0; i <= pom.mc1.size()-1; i++){js.executeScript("arguments[0].click();",  pom.mc1.get(i));
            func.waitToSite(driver, 10);
            identificationText = String.valueOf(js.executeScript("return document.getElementById('identificationsButton1').textContent"));
            identificationText = identificationText.trim().split("\n")[0];func.printC(identificationText);}
        js.executeScript("arguments[0].click();",  pom.mc1.get(0));js.executeScript("arguments[0].scrollIntoView();", func.element(driver,cvv));
        func.printC("Number Card test -------------------");

        func.FuncCheckingTextFields(driver,func.shkilut,func.element(driver,cardNumber),func.element(driver,cardNumberError));
        for (int i = 0; i <= func.ResultShkilut.size()-1; i++){func.printC((1+i) + " ) these value are accepted  - " + func.ResultShkilut.get(i));}
        func.inputStringToElement("4580161501590004" + Keys.ENTER,func.element(driver,cardNumber));func.ResultShkilut.clear();
        js.executeScript("arguments[0].scrollIntoView();", func.element(driver,cardNumber));

        func.printC("Year Card test -------------------");randomNumber = randomGenerator.nextInt(2024,2033);
        func.printC("Year = " + randomNumber);
        String rn = String.valueOf(randomNumber);func.element(driver,year).sendKeys(rn);
        func.printC("month Card test -------------------");randomNumber = randomGenerator.nextInt(1,12);
        func.printC("month = " + randomNumber);
        rn = (randomNumber < 10) ? "0" + randomNumber : String.valueOf(randomNumber);func.element(driver,month).sendKeys(rn);
        func.printC("CVV Card test -------------------");
        func.FuncCheckingTextFields(driver,func.shkilut,func.element(driver,cvv),func.element(driver,cvvError));
        js.executeScript("arguments[0].scrollIntoView();", func.element(driver,cvv));
        for (int i = 0; i <= func.ResultShkilut.size()-1; i++){
            func.printC((1+i) + " ) these value are accepted  - " + func.ResultShkilut.get(i) + " | value taken - " + func.onlyNumbers(func.ResultShkilut.get(i).substring(0,4)));}
        func.inputStringToElement("654" + Keys.ENTER,func.element(driver,cvv));
        func.printC(func.element(driver,cvv).getText());func.ResultShkilut.clear();
        js.executeScript("arguments[0].scrollIntoView();", func.element(driver,cvv));
        Test23.info("בדיקת הרשמה - הרשמה עם 2 אמצעי זיהוי - זיהוי ראשון - עם ערכים בשדות");
        Test23.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        func.printC("---------Test 23 - END ---------");func.printC(" ");}


    @Test(groups = "login")  // login
    public void Test24() throws InterruptedException, IOException, AWTException {
        //  בדיקת הרשמה - הרשמה עם 2 אמצעי זיהוי - זיהוי שני
        func.printC("---------Test 24 - Start ---------");//2 שאלות אישיות
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String identificationText;
        int t = 0;
        func.waitToSite(driver, 10);
        js.executeScript("arguments[0].scrollIntoView();", func.element(driver, methodContainer2));
        func.printC("אמצעי זיהוי שני");
        for (int i = 0; i <= pom.mc2.size()-1; i++){js.executeScript("arguments[0].click();",  pom.mc2.get(i));
            func.waitToSite(driver, 10);
            identificationText = String.valueOf(js.executeScript("return document.getElementById('identificationsButton2').textContent"));
            identificationText = identificationText.trim().split("\n")[0];func.printC(identificationText);
            if(identificationText.equals("2 שאלות אישיות")){t=i;}
        }js.executeScript("arguments[0].click();",  pom.mc2.get(t));
        func.printC("ערך נבחר 2 שאלות אישיות ");
        func.printC("שאלה ראשונה");
        func.printC(" שאלה נבחרה - מהו התאריך האחרון בו יצאת מהארץ? ");
        for (int i = 0;i <= pom.tobSecretQuestion1.size()-1; i++){js.executeScript("arguments[0].click();",  pom.tobSecretQuestion1.get(i));
            if(func.element(driver,question1Container2).getText().equals("מהו התאריך האחרון בו יצאת מהארץ?")){t=i;}
        }js.executeScript("arguments[0].click();",  pom.tobSecretQuestion1.get(t));
        func.printC("Last Go Date Answer test -------------------");
        func.FuncCheckingTextFields(driver,func.shkilutData,func.element(driver,lastGoDateAnswer),func.element(driver,question1AnswerErrorDiv2));
        for (int i = 0; i <= func.ResultShkilut.size()-1; i++){func.printC((1+i) + " ) these value are accepted  - " + func.ResultShkilut.get(i));}
        func.inputStringToElement("06-11-2020" + Keys.ENTER,func.element(driver,lastGoDateAnswer));func.ResultShkilut.clear();
        js.executeScript("arguments[0].scrollIntoView();", func.element(driver,methodContainer2));
        func.printC("שאלה שניה");
        func.printC(" שאלה נבחרה - מהו תאריך הנפקת תעודת הזהות שלך? ");
        for (int i = 0;i <= pom.tobSecretQuestion2.size()-1; i++){js.executeScript("arguments[0].click();",  pom.tobSecretQuestion2.get(i));
            if(func.element(driver,question2Container2).getText().equals("מהו תאריך הנפקת תעודת הזהות שלך?")){t=i;}
        }js.executeScript("arguments[0].click();",  pom.tobSecretQuestion2.get(t));
        func.FuncCheckingTextFields(driver,func.shkilutData,func.element(driver,idCardIssueDateAnswer),func.element(driver,question2AnswerErrorDiv2));
        for (int i = 0; i <= func.ResultShkilut.size()-1; i++){func.printC((1+i) + " ) these value are accepted  - " + func.ResultShkilut.get(i));}
        func.inputStringToElement("06-11-2020" + Keys.ENTER,func.element(driver,idCardIssueDateAnswer));func.ResultShkilut.clear();
        js.executeScript("arguments[0].scrollIntoView();", func.element(driver,methodContainer2));
        Test24.info("בדיקת הרשמה - הרשמה עם 2 אמצעי זיהוי - זיהוי שני - עם ערכים בשדות");
        Test24.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        func.printC("---------Test 24 - END ---------");func.printC(" ");
    }


    @Test(groups = "login")  // login
    public void Test25() throws InterruptedException, IOException, AWTException {
        //  סיסמה
        func.printC("---------Test 25 - Start ---------");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        func.waitToSite(driver, 10);
        js.executeScript("arguments[0].scrollIntoView();", func.element(driver,password1));
        func.printC("Password 1");
        func.FuncCheckingTextFields(driver,func.shkilut,func.element(driver,password1),func.element(driver,passwordError1));
        for (int i = 0; i <= func.ResultShkilut.size()-1; i++){
            js.executeScript("arguments[0].scrollIntoView();", func.element(driver,password1));
            func.printC((1+i) + " ) these value are accepted  - " + func.ResultShkilut.get(i));}
        func.inputStringToElement("Plm2025@#$%" + Keys.ENTER,func.element(driver,password1));
        func.ResultShkilut.clear();
        func.printC("Password 2");
        func.FuncCheckingTextFields(driver,func.shkilut,func.element(driver,password2),func.element(driver,passwordError2));
        for (int i = 0; i <= func.ResultShkilut.size()-1; i++){
            js.executeScript("arguments[0].scrollIntoView();", func.element(driver,password2));
            func.printC((1+i) + " ) these value are accepted  - " + func.ResultShkilut.get(i));}
        func.inputStringToElement("Plm2025@#$%" + Keys.ENTER,func.element(driver,password2));
        js.executeScript("arguments[0].scrollIntoView();", func.element(driver,password1));
        func.ResultShkilut.clear();
        Test25.info("בדיקת סיסמה");
        Test25.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
    }
    @Test(groups = "login")  // login
    public void Test26() throws InterruptedException, IOException, AWTException {
        //  כפתור כניסה
        func.printC("---------Test 26 - Start ---------");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        func.waitToSite(driver, 10);
        js.executeScript("arguments[0].scrollIntoView();", func.element(driver,radioAgreeEnvironment));
        func.printC("בדיקת שדות : מוותרים על ניירות ושומרים על הסביבה");
        func.printC("check - אני רוצה לעבור לדיוור דיגיטלי " + " = " + func.checkbox(js,driver,func.element(driver,radioAgreeEnvironment)));
        func.printC("check - אולי מאוחר יותר " + " = " + func.checkbox(js,driver,func.element(driver,radioDisagreeEnvironment)));
        js.executeScript("arguments[0].scrollIntoView();", func.element(driver,submitBtn));
        func.printC("בדיקץ שדות : קראתי ואישרתי את");
        func.printC("CheckBox " + " = " + func.checkbox(js,driver,func.element(driver,agreementConsent)));
        if (func.ButtonChanged(js,func.element(driver,submitBtn)).equals("yes")) {func.printC("----- Test 26 = OK -----");
            Test26.pass("בדיקת כפתור כניסה - ניתן ללחוץ");
            Test26.pass(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        } else {func.printC("----- Test 26 = Failed -----");
            Test24.fail("בדיקת כפתור כניסה - לא ניתו ללחוץ");
            Test24.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        }func.printC("---------Test 26 - END ---------");func.printC(" ");
    }

    @AfterGroups(groups = "login")
    static public void afterGroupsLogin() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("____");
        System.out.println("Done");
        driver.quit();
        //Extent imports
        extent.flush();
        pjf.label7.setText("Group Test login - Done ");
        func.GamailSendReport(func.StringCheckEmail(pjf.textField.getText()));}



    @BeforeGroups (groups = "Enter")
    static public void beforeGroupsEnterTest(){
        pjf.label8.setText("Group Test Enter - Run ");
        String selectBrowser = "Google Chrome";
        Object selectedItem = pjf.comboBox.getSelectedItem();
        if (selectedItem != null){
            selectBrowser = String.valueOf(selectedItem);}
        switch (selectBrowser){
            case "Google Chrome": ChromeOptions co = new ChromeOptions();
                co.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(co);break;
            case "Edge" : driver = new EdgeDriver();break;}

        driver.manage().window().maximize();
        pom = PageFactory.initElements(driver,ProjectPOM.class);
        //Extent imports
        extent = exm.GetExtent();
        Test27 = exm.createTest("Enter-Test27","עמוד כניסה בדיקת אפשרות שונות כניסה לאזור אישי");
        Test28 = exm.createTest("Enter-Test28","בדיקת שדות ת.ז וסיסמה");
        Test29 = exm.createTest("Enter-Test29","כפתור כניסה ");
        Test30 = exm.createTest("Enter-Test30","בדיקת ערכים בשדה לוגין");}



    @Test(groups = "Enter")  // Enter privat zone
    public void Test27() throws InterruptedException, IOException, AWTException {
        //  עמוד כניסה בדיקת אפשרות שונות כניסה לאזור אישי
        func.printC("---------Test 27 - Start ---------");
        Actions actions = new Actions(driver);
        String located;
        String tl;
        int res = 0;
        try {driver.get(url);} catch (NullPointerException e) {driver.get("https://login.gov.il/nidp/saml2/sso?id=usernamePasswordSMSOtp&sid=2&option=credential&sid=2");
        }func.waitToSite(driver, 10);
        for (int i = 0; i <= pom.tabList.size()-1;i++){
            tl = pom.tabList.get(i).getText();
            func.MoveAndClick(driver,actions,pom.tabList.get(i));
            boolean a = driver.getPageSource().contains(tl);
            if (a) {located = "yes";} else {located = "no"; res++;}
            func.printC(tl + " - " + located);
            func.MoveAndClick(driver,actions,func.element(driver,goBackLink));}
        if (res != 0){func.printC("----- Test 27 = Failed -----");
            Test27.fail("נכשל - עברה לאפשרויות נוספים לא קרתה ");
            Test27.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        } else {func.printC("----- Test 27 = OK -----");
            Test27.pass("תקין - עברה לאפשרויות נוספים תקינה");
            Test27.pass(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
        func.printC("---------Test 27 - END ---------");func.printC(" ");}



    @Test(groups = "Enter")  // zeut & enter
    public void Test28() throws InterruptedException, IOException, AWTException {
        // בדיקת שדה ת.ז
        func.printC("---------Test 28 - Start ---------");
        String errorText = "";
        String located = null;
        String clear = Keys.chord(Keys.CONTROL, "a",Keys.BACK_SPACE);
        try {driver.get(url);} catch (NullPointerException e) {driver.get("https://login.gov.il/nidp/saml2/sso?id=usernamePasswordSMSOtp&sid=2&option=credential&sid=2");
        }func.waitToSite(driver, 10);
        func.printC("---------I.D Test ---------");
        for (int i = 0; i <= func.shkilutNumbers.size()-1; i++){
            func.waitToPresence(driver,20,zeutEnter);
            func.inputStringToElement(func.shkilutNumbers.get(i) + Keys.ENTER,func.element(driver,zeutEnter));
            func.waitToSite(ProjectRun.driver,10);
            if (func.element(driver,zeutEnter).getAttribute("value") != null){try {errorText=func.element(driver,zeutEnterError).getText();}
            catch (WebDriverException e){}}func.element(driver,zeutEnter).sendKeys(clear);
            if (errorText == "" ){func.ResultShkilut.add(func.shkilutNumbers.get(i));}
        }if (func.ResultShkilut.isEmpty()){func.ResultShkilut.add("There is no valid value in the list");}
        for (int i = 0; i <= func.ResultShkilut.size()-1; i++){func.printC((1+i) + " ) these value are accepted  - " + func.ResultShkilut.get(i));}
        func.element(driver,zeutEnter).sendKeys("111111118");
        Test28.info("בדיקת שדה ת.ז  ");
        Test28.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
    }

    @Test(groups = "Enter")  //  Enter Button
    public void Test29() throws InterruptedException, IOException, AWTException {
        // כפתור כניסה
        func.printC("---------Test 29 - Start ---------");
        String clear = Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE);
        String errorText = null;
        try {driver.get(url);} catch (NullPointerException e) {driver.get("https://login.gov.il/nidp/saml2/sso?id=usernamePasswordSMSOtp&sid=2&option=credential&sid=2");}
        func.waitToSite(driver, 10);
        Test29.info("בדיקת מצבים בו כפתור כניסה מאפשר כניסה");
        func.waitToPresence(driver,20,zeutEnter);
        func.element(driver,zeutEnter).sendKeys(clear);
        func.element(driver,zeutEnter).sendKeys("111111118");
        func.element(driver,passEnter).sendKeys("123321");
        if (func.element(driver,enterButtonEnter).isEnabled()){func.printC("Enetr button is Enable");
            func.element(driver,enterButtonEnter).click();
            try { errorText = func.element(driver,errorMessageEnter).getText();
            }catch (WebDriverException e){}if (errorText != null){func.printC("Error Text - " +  errorText);}
            func.printC("----- Test 29 = OK -----");
            Test29.pass("כפתור כניסה מגיב תקין ");
            Test29.pass(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        }else {func.printC("----- Test 29 = Failed -----");
            Test29.fail("כפתור כניסה לא תקין  ");
            Test29.fail(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
        func.printC("---------Test 29 - END ---------");func.printC(" ");}

    @Test(groups = "Enter")  //  Enter Button
    public void Test30() throws InterruptedException, IOException, AWTException {
        // בדיקת ערכים בשדה לוגין
        func.printC("---------Test 29 - Start ---------");
        String v = "null";
        String shkilut;
        String value = "null";
        String clear = Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE);
        try {driver.get(url);} catch (NullPointerException e) {driver.get("https://login.gov.il/nidp/saml2/sso?id=usernamePasswordSMSOtp&sid=2&option=credential&sid=2");}func.waitToSite(driver, 10);


        func.printC("-----------בדיקת ערכים בשדה לוגין-----------");
        Test30.info("בדיקת ערכים בשדה לוגין");
        for (int i = 0; i <= func.shkilut.size()-1; i++){
            func.waitToPresence(driver,20,zeutEnter);
            func.element(driver,zeutEnter).sendKeys(func.shkilut.get(i));
            func.element(driver,passEnter).sendKeys(func.shkilut.get(i));
            shkilut = func.shkilut.get(i);
            value = func.takeEverythingExceptUnderscore(func.element(driver,zeutEnter).getAttribute("value"));
            boolean areEqual = func.compareStrings(shkilut,value);
            if (func.element(driver,zeutEnter).getAttribute("value") != null){
                try {v=func.element(driver,zeutEnterError).getText();}
                catch (WebDriverException e){}}
            if (func.element(driver,enterButtonEnter).isEnabled()){
                func.printC((i+1) + " = Enter Test | button is Enabled " + " | shkilut  = " + func.shkilut.get(i) + " | appears in the field = " + value + "| match  = " + areEqual);
                Test30.info((i+1) + " = Enter Test | button is Enabled " + " | shkilut  = " + func.shkilut.get(i) + " | appears in the field = " + value + "| match  = " + areEqual);
                Test30.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
            }else {func.printC((i+1) + " = Enter Test | button is not Enabled " + " | Error Text = " + v + " | shkilut  = " + func.shkilut.get(i) + " | appears in the field = " + value + "| match  = " + areEqual);
                Test30.info((i+1) + " = Enter Test | button is not Enabled " + " | Error Text = " + v + " | shkilut  = " + func.shkilut.get(i) + " | appears in the field = " + value + "| match  = " + areEqual);
                Test30.info(MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());}
            func.element(driver,zeutEnter).sendKeys(clear);
            func.element(driver,passEnter).sendKeys(clear);}

    }

    @AfterGroups(groups = "Enter")
    static public void afterGroupsEnter() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("____");
        System.out.println("Done");
        driver.quit();
        //Extent imports
        extent.flush();
        pjf.label8.setText("Group Test Enter - Done ");
        func.GamailSendReport(func.StringCheckEmail(pjf.textField.getText()));}









}

