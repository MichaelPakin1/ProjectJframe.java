package ProjectAutoMichaelPakin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ProjectPOM {

    // תוצעות חיפוס GOOGLE
    @FindBy(how = How.XPATH,using = "/html/body//a/h3")
    static List<WebElement> googleR;

    // ליסת של שפות
    @FindBy(how = How.XPATH,using = "//*[@id='navList_LangMenu']/li")
    static List<WebElement> safaAll;

    // ליסת תוצעוצ חיפוס
    @FindBy(how = How.XPATH,using = "/html/body/article/section/div/div[2]/div/div[2]/div[2]/div/div/h2/a")
    static List<WebElement> result;

    @FindBy(how = How.XPATH,using = "//b")
    static List<WebElement> b;

    @FindBy(how = How.XPATH,using = "/html/body/article/section/div/div[2]/div/div[2]/div[2]/div/div/div[1]")
    static List<WebElement> textResul;

    //סינון
    @FindBy(how = How.XPATH,using = "/html/body/article/section/div/div[2]/div/div[2]/div[1]/ul/li/label")
    static List<WebElement> sinunClick;

    @FindBy(how = How.XPATH,using = "/html/body/article/section/div/div[2]/div/div[2]/div[1]/ul/li/input")
    static List<WebElement> sinunLabel;

    @FindBy(how = How.XPATH,using = "/html/body/article/section/div/div[2]/div/div[2]/div[1]/ul/li")
    static List<WebElement> sinun;
    // ----------------------------------------------navigator--------------------------------------

//    @FindBy(how = How.XPATH,using = "/html/body/div/article/div/nav//li/a") /html/body/div/article/div/nav//li
    @FindBy(how = How.XPATH,using = "/html/body/div/article/div/nav//li")
    static List<WebElement> navigator;

    @FindBy(how = How.XPATH,using = "//h2")
    static List<WebElement> navigatorTag;

    @FindBy(how = How.XPATH,using = "/html/body/div/article/div/div[4]/div[2]/div[1]/div/div//a")
    static List<WebElement> hadashot;
    @FindBy(how = How.XPATH,using = "/html/body/div/article/div/div[5]/div[2]/div[1]/div//a")
    static List<WebElement> stripContainerContainer;
    @FindBy(how = How.XPATH,using = "/html/body/div/article/div/div[6]/div[2]/div/div//a")
    static List<WebElement> services;
//    @FindBy(how = How.XPATH,using = "/html/body/div/article/div/div[7]/div[2]/div/div//a")
    @FindBy(how = How.XPATH,using = "/html/body/div/article/div/div[7]/div[2]/div/div/div/div/div/a")
    static List<WebElement> tems;
    @FindBy(how = How.XPATH,using = "/html/body/div/article/div/div[9]/div[2]/div[1]/div//a")
    static List<WebElement> information;
    @FindBy(how = How.XPATH,using = "/html/body/div/article/div/div[10]/div[2]/div/div[2]/div/div[2]//a")
    static List<WebElement> AboutOffice;
    @FindBy(how = How.XPATH,using = "/html/body/div/article/div/div[12]/div[2]/div/div[2]/div/div[2]/a")
    static List<WebElement> compiledInformation;
    @FindBy(how = How.XPATH,using = "/html/body/div/article/div/div[11]/div[2]/div[1]/div/div/a")
    static List<WebElement> singularity;

    // ----------------------------------------------navigator--------------------------------------

    @FindBy(how = How.XPATH,using = "/html/body/header/div/div[2]/div/div[2]/nav//li/a")
    static List<WebElement> shiruts;
    @FindBy(how = How.XPATH,using = "/html/body/div/article/div/div[2]/div/div/div[1]/div/div[1]/a/div/div/img")
    static List<WebElement> pirsum;
    @FindBy(how = How.XPATH,using = "/html/body/div/article/div/div[2]/div/div/div[2]/div/button")
    static List<WebElement> butpirsum;
    @FindBy(how = How.XPATH,using = "/html/body/div/article/div/div[3]/ul/li/a")
    static List<WebElement> externalLinks;

    @FindBy(how = How.XPATH,using = "/html/body/my-gov-root/div/my-gov-header/div/div[2]/div/p-menu/div/ul/li")
    static List<WebElement> langIn;

    @FindBy(how = How.XPATH,using = "//*[@id='pr_id_1']/div/div/div/div/div")
    static List<WebElement> banerInEzor;

    @FindBy(how = How.XPATH,using = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/a")
    static List<WebElement> loglan4;

    @FindBy(how = How.XPATH,using = "/html/body//content/section/form/div[1]/div/div[5]/div[3]/div/div/div[2]/div[1]/div[2]/div[1]/ul/li")
    static List<WebElement> mc1;

    @FindBy(how = How.XPATH,using = "/html/body//content/section/form/div[1]/div/div[5]/div[3]/div/div/div[3]/div[1]/div[2]/div[1]/ul/li/a")
    static List<WebElement> mc2;

//    @FindBy(how = How.XPATH,using = "/html/body/div[2]/div/div/div[2]/div/div/div[4]/div")
@FindBy(how = How.XPATH,using = "/html/body/div[2]/div/div/div[3]/div/div/div/div[2]/div/div[3]/form/div[2]/div[6]/div[2]/div")
static List<WebElement> tabList;
    @FindBy(how = How.XPATH,using = "/html/body//content/section/form/div[1]/div/div[5]/div[3]/div/div/div[3]/div[1]/div[2]/div[2]/div[6]/div[1]/div[1]/ul//li/a//span[1]")
    static List<WebElement> tobSecretQuestion1;

    @FindBy(how = How.XPATH,using = "/html/body//content/section/form/div[1]/div/div[5]/div[3]/div/div/div[3]/div[1]/div[2]/div[2]/div[6]/div[3]/div[1]/ul//li/a//span[1]")
    static List<WebElement> tobSecretQuestion2;

//



}
