package ProjectAutoMichaelPakin;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import static ProjectAutoMichaelPakin.ProjectExtentReports.reportDate;

public class ProjectFun {
    private WebDriver driver;
//    Actions actions = new Actions(driver);
    static ProjectPOM pom = new ProjectPOM();
    static ProjectJframe pjf = new ProjectJframe();

    public ProjectFun(WebDriver driver) {this.driver = driver;}

    public WebElement element (WebDriver driver, By by) {return driver.findElement(by);}

//   -------------------------------------- //

    public static void printC (String whatPrint){
        System.out.println(whatPrint);
    } // במקום System.out.println
    //-------------------------------- ???????? -----------------------------------
    public static void checkURL (WebDriver driver, String url){
        String openURL = driver.getCurrentUrl();
        if (openURL.equals(url)){printC("Url is true");}else {driver.get(url);}
    }

    public static void waitToAtribute(WebDriver driver, int sec1,WebElement element, String attribute, String value ) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec1));
        wait.until(ExpectedConditions.attributeContains(element, attribute, value));}

    public static void waitToAtributeNotNULL(WebDriver driver, int sec1,WebElement element, String attribute) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec1));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(element, attribute));
    }
    //-------------------------------- ???????? -----------------------------------

    public static void waitToSite(WebDriver driver, int sec1) throws InterruptedException {driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec1));} // המתנה לאתר

    public static void waitToClick(WebDriver driver, int sec1, By by) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec1));
        wait.until(ExpectedConditions.elementToBeClickable(by));}

    public static void waitToWebClick(WebDriver driver, int sec1, WebElement element) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec1));
        wait.until(ExpectedConditions.elementToBeClickable(element));}

    public static void waitToPresence(WebDriver driver, int sec1, By by) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec1));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));}



    public static void waitToVisibility(WebDriver driver, int sec1, By by) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));}

//------------------------ not --------------------------
    public static void waitToVisibilityScreen(WebDriver driver,int sec1,WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec1));
        wait.until(ExpectedConditions.visibilityOf(element));}

    public static void waitToTextToBePresentInElement(WebDriver driver,int sec1,WebElement element,String string1){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec1));
        wait.until(ExpectedConditions.textToBePresentInElement(element, string1));
    }
    //------------------------ not -------------------------- elementToBeMoved

//waitPresentInElement
    public static void waitPresentInElement(WebDriver driver, int sec1, WebElement element,String string1  ) throws InterruptedException { // poprobui dati znacheniya stringy iz whatTransleit
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec1));
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(element, string1)));
        assert string1 != element.getText();}

    public static void funCheckClearFilter(WebElement element){ // בדיקת כפתור נקה הכל
        if (element.getAttribute("class").contains("ng-hide")){}else {element.click();}}

    public static void isSelectClick(WebElement element){ // בדיקת CHECKBOX ולחיצה במיךה ולא לחוץ
       boolean isSelect = element.isSelected();if (isSelect == false){element.click();}}




    public static String CheckListResult(String string1, List <WebElement> list) { // חיפוס STRING ב - בweblist
        String r = null;
        for (int i = 0; i <= list.size()-1; i++) {
            if (list.get(i).getText().contains(string1)) {
                return r = list.get(i).getText();}}
        return r;}




    public static boolean compareStrings(String string1, String string2) { // השווה בין STRING
        if (string1.length() != string2.length()) {
            return false;
        }

        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static String StringCheckEmail (String eMail){
        boolean isValidEmail = eMail.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
        if (!isValidEmail){
            System.err.println("Email address is invalid. Report was not sent");
            pjf.labelEmail.setText("Email address is invalid");
            eMail = null;} else {pjf.labelEmail.setText("Reports sending by Email");
            printC("Reports sending by this Email : " + eMail);}
        return eMail;}

    static public boolean ariaExpanded(WebElement elem){ // בדיקה אם הרשימה פתוחה
        if (elem.getAttribute("aria-expanded").equals("false")){
            return false;}else {return true;}}
    static public void MoveToOpen(WebDriver driver, WebElement element, Actions actions){ // פותח רשימה
    if (element.getAttribute("aria-expanded").equals("false")){
        actions.moveToElement(element).perform();}return ;}

    static public void MoveAndClick(WebDriver driver,Actions actions,WebElement element){
        actions.moveToElement(element).click().perform();
    }

    static public String titlePage(WebDriver driver,String string1, WebElement element){ // בדיקה אם STRING ריק והוספת ערך מאלימנת
        if (string1 == null){
            string1 = element.getText();
        }return string1;
    }

    static public String cutWithSpace(String string1){ // חיתוך עד הרווח
        string1 = string1.substring(0, string1.indexOf(" "));return string1;}

    static public int onlyNumbers(String strin1){ // משאיר רק מספרים
        String text = strin1;String[] split = text.split("\\D+");
        int numbers = Integer.parseInt(String.join("", split));return numbers;}

    public static String takeEverythingExceptUnderscore(String string) {
        Pattern pattern = Pattern.compile("_");
        return pattern.matcher(string).replaceAll("");}

    static public void inputStringToElement(String string1,WebElement element) throws InterruptedException { // ניקוי שדה + כתיבת ערך
        element.clear();
        element.sendKeys(string1);}




    public static String Checkshkilut (String string1, WebElement element1, String string2, WebElement  element2, int i,List<String>list){ // בודקת תוצאות חיפוש ומושיפה למערך
        String result;
            if (compareStrings(string2,element2.getText()) == true){result = (i+1) + ") Search values - " + "[ " + list.get(i) + " ]" + " | Number of results = No results" ;
            }else {result = (i+1) + ") Search values - " + "[ " + list.get(i) + " ]" + " | Number of results = " + element1.getText() + " | Results Text = " + "[ " + element2.getText() + " ]";
            if (element2.getText().contains("מצטערים")){}else {ResultShkilut.add(list.get(i));}
            }return result;}
    public static int lookingSpecificWords(String stringPhrase, String stringLooking) { // כמות פעמים מופיע STRING
        int i = 0;
        String[] words = stringPhrase.split(" ");
        String[] lookingwords = stringLooking.split("");
        if (lookingwords.length <= 2) {
            for (String word : words) {
                for (String targetWord : lookingwords) {
                    if (word.contains(targetWord)) {
                        i++;}
                }
            }
        } else {
            for (String word : words) {
                if (word.contains(stringLooking)) {
                    i++;}
            }
        }return i;}



    public static String nivutUrl (int nivut) throws InterruptedException {
        String url = null;
        Random randomGenerator = new Random();
        int randomNumber;
        pom.navigator.get(nivut).click();
        String navigatorHref = pom.navigator.get(nivut).getText();
        switch (navigatorHref){
            case "חדשות" : randomNumber = randomGenerator.nextInt(0,pom.hadashot.size());
                waitToAtributeNotNULL(ProjectRun.driver,20,pom.hadashot.get(randomNumber),"href");
                url = pom.hadashot.get(randomNumber).getAttribute("href"); break;
            case "פרסומים ומידע נוסף" : randomNumber = randomGenerator.nextInt(0,pom.stripContainerContainer.size());
                waitToAtributeNotNULL(ProjectRun.driver,20,pom.stripContainerContainer.get(randomNumber),"href");
                url = pom.stripContainerContainer.get(randomNumber).getAttribute("href"); break;
            case "שירותים" : randomNumber = randomGenerator.nextInt(0,pom.services.size());
                waitToAtributeNotNULL(ProjectRun.driver,20,pom.services.get(randomNumber),"href");
                url = pom.services.get(randomNumber).getAttribute("href"); break;
            case "נושאים" : randomNumber = randomGenerator.nextInt(0,pom.tems.size());
                waitToAtributeNotNULL(ProjectRun.driver,20,pom.tems.get(randomNumber),"href");
                url = pom.tems.get(randomNumber).getAttribute("href"); break;
            case "מידע שימושי" : randomNumber = randomGenerator.nextInt(0,pom.information.size());
                waitToAtributeNotNULL(ProjectRun.driver,20,pom.information.get(randomNumber),"href");
            url = pom.information.get(randomNumber).getAttribute("href"); break;
            case "אודות המשרד" : randomNumber = randomGenerator.nextInt(0,pom.AboutOffice.size());
                waitToAtributeNotNULL(ProjectRun.driver,20,pom.AboutOffice.get(randomNumber),"href");
                url = pom.AboutOffice.get(randomNumber).getAttribute("href"); break;
            case "ריכזנו את המידע עבורכם" : randomNumber = randomGenerator.nextInt(0,pom.compiledInformation.size());
                waitToAtributeNotNULL(ProjectRun.driver,20,pom.compiledInformation.get(randomNumber),"href");
                url = pom.compiledInformation.get(randomNumber).getAttribute("href"); break;
            case "יחידות" : randomNumber = randomGenerator.nextInt(0,pom.singularity.size());
                waitToAtributeNotNULL(ProjectRun.driver,20,pom.singularity.get(randomNumber),"href");
                url = pom.singularity.get(randomNumber).getAttribute("href"); break;
        }return url;}

    public static String openHrefLink (WebDriver driver,WebElement element) throws InterruptedException {
        String ResLink = " All Done - " + element.getText();
        String href = element.getAttribute("href");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1)).manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        try {driver.get(href);} catch (TimeoutException ignore) {ResLink ="Link Don't Work" + element.getText() + " href = " + href;}
        waitToSite(driver, 10);driver.close();driver.switchTo().window(tabs.get(0));
        return ResLink;}

    public static String checkActiveBanner (){
        String activeBanner = "Banner 2";
        if (pom.butpirsum.get(0).getAttribute("class").contains("src_dot_button__fqz66 src_dot_button_active__IIimp xh-highlight")){
            activeBanner = "Banner 1";}
//        else {activeBanner = "Banner 2";} src_dot_button__fqz66 src_dot_button_active__IIimp xh-highlight ||| src_dot_button__2NZX1 src_dot_button_active__hU4t1
        return activeBanner;}

    public static double elapsedTime (Duration elapsedTime){
        String sd = elapsedTime.toString();
        String ssd = sd.replaceAll("[a-zA-Z]", "");
        ssd = ssd.substring(0,ssd.indexOf('.')+2);
        double stopwatch = Double.parseDouble(ssd);
        return stopwatch;}

    public static String ButtonChanged (JavascriptExecutor js, WebElement element){
        String buttonChanged = null;
        String fButtonChanged = (String) js.executeScript("return arguments[0].getAttribute('style');", element);
        if (fButtonChanged.equals("background: rgb(182, 192, 204);")){buttonChanged = "no";
        }else {buttonChanged = "yes";}
        return buttonChanged;}

    public static String ButtonChangedF (WebElement element){
        String buttonChanged;
        String fButtonChanged = element.getAttribute("value");
        switch (fButtonChanged){
            case "SMS": buttonChanged =  "button selected SMS";break;
            case "VOICE": buttonChanged = "button selected VOICE";break;
            default: buttonChanged = "button not selected";break;
        }
        return buttonChanged;}

    public static String checkbox (JavascriptExecutor js,WebDriver driver,WebElement element ){ // בדיקת CheckBox
        boolean isChecked;
        String checked1;
        String checked2;
        String checked;
        isChecked = (Boolean) js.executeScript("return arguments[0].checked", element);
        if (isChecked) {checked1 = "input";} else {checked1 = "output";}
        js.executeScript("arguments[0].click();", element);
        isChecked = (Boolean) js.executeScript("return arguments[0].checked", element);
        if (isChecked) {checked2 = "input";} else {checked2 = "output";}
        if (checked1 != checked2){checked = "work";}else {checked = "Don't work ";}
        return checked;}


    public static List<String> FuncCheckingTextFields (WebDriver driver,List<String> list, WebElement element1, WebElement elementError) throws InterruptedException { // בודקת אם יש ערך ERROR
        String errorText = "";
        for (int i = 0; i <= list.size()-1;i++){
            inputStringToElement(list.get(i) + Keys.ENTER,element1);
           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
            waitToSite(ProjectRun.driver,10);
            errorText = elementError.getText();
            if (errorText == "" ){ResultShkilut.add(list.get(i));}
        }if (ResultShkilut.isEmpty()){ResultShkilut.add("There is no valid value in the list");}
        return ResultShkilut;
    }






    public static List<String> ResultShkilut = new ArrayList<>();


    public static List<String> shkilut = new ArrayList<>(); {
        shkilut.add("קורונה");
        shkilut.add(" " + " ");
        shkilut.add("ק ו ר ו נ ה");
        shkilut.add("!@#$%");
        shkilut.add("קורונה!");
        shkilut.add("קורונה1");
        shkilut.add("123456789");
        shkilut.add("4580161501590004");
        shkilut.add("ק");
        shkilut.add("קו");
        shkilut.add("קורונה COVID");
        shkilut.add("COVID");
        shkilut.add("1234567890זשסדבגקרכהנעאטימצחוןלתץךםפף");
        shkilut.add("COVID 1");
        shkilut.add("mp123@tor.net");
        shkilut.add("@123.co.il");
        shkilut.add("www.com");
        shkilut.add("COVID@COvid");
        shkilut.add("111111118");

    }
    public static List<String> shkilutNumbers = new ArrayList<>(); {
        shkilutNumbers.add("0522310055");
        shkilutNumbers.add("12");
        shkilutNumbers.add("123456789987456321");
        shkilutNumbers.add("51344");
        shkilutNumbers.add("089281088");
        shkilutNumbers.add("1");
    }

    public static List<String> shkilutData = new ArrayList<>(); {
        shkilutData.add("00-00-0000");
        shkilutData.add("01-01-0001");
        shkilutData.add("16-09-2000");
        shkilutData.add("39-10-2000");
        shkilutData.add("05-15-2023");
        shkilutData.add("10-10-5000");
    }



    public static void GamailSendReport(String mail){

        String[] multi_addressee={"mikepakin2.0@gmail.com",mail};

        String mailFrom = "mikepakin1@gmail.com";
        String subject = "Test Gamail send michael";
        String BodyText = "Log from testing zone ";
//        String file_path = "C:\\Users\\97250\\Desktop\\Automatic_QA\\TReport\\test.txt";
        // send raport - text
        String file_path = "C:\\Users\\97250\\Desktop\\Automatic_QA\\java\\ProjectAutoTestMichaelPakin\\ProjectAutoReports\\"+reportDate+"\\exReport.html";
        String file_path2 = "C:\\Users\\97250\\Desktop\\Automatic_QA\\java\\ProjectAutoTestMichaelPakin\\Logs\\Log.txt";
        //- test    "C:\Users\97250\Desktop\Automatic_QA\java\ProjectAutoTestMichaelPakin\Logs\Log.txt"
        String userName = "mikepakin1@gmail.com";
        String password = "oggheiveaxyvlcpx";


        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(userName,password);
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(mailFrom));

            InternetAddress[] addressTo = new InternetAddress[multi_addressee.length];
            for (int i = 0; i < multi_addressee.length; i++)
            {
                message.addRecipient(Message.RecipientType.TO,new
                        InternetAddress(multi_addressee[i]));}



            message.setSubject(subject);
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(BodyText);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            messageBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(file_path);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(file_path);
            multipart.addBodyPart(messageBodyPart);




            message.setContent(multipart);
            Transport.send(message);

            System.out.println("message sent successfully");


        } catch (MessagingException e){
            System.err.println("message sent fails");

        }

    }






    }
