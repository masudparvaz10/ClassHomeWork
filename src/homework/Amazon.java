package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
    public static WebDriver myDriver;

    public static void main(String[] args) {
        Amazon.pillPack();
        Amazon.address();
        Amazon.logo();
        Amazon.amazonBasics();
        Amazon.foundItOnAmazon();
        Amazon.searchBox();
        Amazon.searchBoxNegative();
        Amazon.bestSellers();
        Amazon.blog();
        Amazon.careers();
        Amazon.eastDane();
        Amazon.fabric();
        Amazon.iMDB();
        Amazon.investorRelations();
        Amazon.pressCenter();
        Amazon.ring();
        Amazon.sellOnAmazon();
        Amazon.shopbop();
        Amazon.woot();
        Amazon.zappos();
        Amazon.aboutAmazon();
        Amazon.aCX();
        Amazon.alexa();
        Amazon.amazonDevices();
        Amazon.amazonDrive();
        Amazon.amazonFresh();
        Amazon.amazonMusic();
        Amazon.amazonPhotos();
        Amazon.amazonTours();
        Amazon.amazonWebServices();
        Amazon.addToCart();
        Amazon.amazonPrime();
        Amazon.selectCologne();
        Amazon.account();
        Amazon.flag();
        Amazon.orders();
        Amazon.tryPrime();
        Amazon.cart();
        Amazon.coupons();
        Amazon.customerService();
        Amazon.findAGift();
        Amazon.freeShipping();
        Amazon.giftCards();
        Amazon.menu();
        Amazon.newReleases();
        Amazon.registry();
        Amazon.sell();
        Amazon.sellOnAmazon();
        Amazon.shopperToolkit();
        Amazon.todayDeals();
        Amazon.wholeFoods();


    }

    // Test case :1
    public static void careers() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select Careers on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")).click();

    }

    // Test case :2
    public static void blog() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select Blog on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[2]/a")).click();
    }

    // Test case :3
    public static void aboutAmazon() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select aboutAmazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[3]/a")).click();
    }

    // Test case :4
    public static void pressCenter() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select pressCenter on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[4]/a")).click();
    }

    // Test case :5
    public static void investorRelations() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select investorRelations on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[5]/a")).click();
    }

    // Test case :6
    public static void amazonDevices() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select amazonDevices on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[6]/a")).click();
    }

    // Test case :7
    public static void amazonTours() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select amazonTours on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[7]/a")).click();
    }

    // Test case :8
    public static void amazonMusic() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select amazonMusic on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[1]/a")).click();
    }

    // Test case :9
    public static void sellOnAmazon() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sellOnAmazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[3]/td[1]/a")).click();
    }

    // Test case :10
    public static void amazonWebServices() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select amazonWebServices on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[5]/td[1]/a")).click();
    }

    // Test case :11
    public static void eastDane() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select eastDane on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[7]/td[1]/a")).click();
    }

    // Test case :12
    public static void amazonPhotos() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select amazonPhotos on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[1]/a")).click();
    }

    // Test case :13
    public static void ring() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select ring on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[11]/td[1]/a")).click();
    }

    // Test case :14
    public static void fabric() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select fabric on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[7]/td[3]/a")).click();
    }

    // Test case :15
    public static void amazonDrive() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select amazonDrive on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[5]/a")).click();
    }

    // Test case :16
    public static void amazonFresh() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select amazonFresh on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[3]/td[5]/a")).click();
    }

    // Test case :17
    public static void shopbop() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select shopbop on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[5]/a")).click();
    }

    // Test case :18
    public static void iMDB() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select iMDB on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[7]/td[7]/a")).click();
    }

    // Test case :19
    public static void aCX() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select aCX on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[11]/a")).click();
    }

    // Test case :20
    public static void alexa() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select alexa on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[13]/a")).click();
    }

    // Test case :21
    public static void zappos() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select zappos on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[13]/a")).click();
    }

    // Test case :22
    public static void woot() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select Woot on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[11]/a")).click();
    }

    // Test case :23
    public static void searchBox() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select SearchBox on click
        myDriver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("watch");
        //Search product on SearchField
        myDriver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
    }

    // Test case :24
    public static void searchBoxNegative() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select SearchBox on click
        myDriver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("vodka and ram");
        //Search product on SearchField
        myDriver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
    }

    // Test case :25
    public static void bestSellers() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select BestSellers on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
    }

    //  Test case :26
    public static void selectCologne() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        myDriver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("colognes for men");
        myDriver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        myDriver.findElement(By.cssSelector("#b6988f18-132d-4b2f-988f-18132ddb2f5e > div > div.sb_2vdjSJEF > div.sb_Azvq332I.sb_ji55L-0S.sb_1-64HM9_ > div > div > a:nth-child(1) > span > span")).click();
    }

    //  Test case :27
    public static void amazonPrime() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        myDriver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[2]")).click();
    }

    // Test case :28
    public static void addToCart() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        myDriver.manage().window().maximize();
        myDriver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("colognes for men");
        myDriver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        myDriver.findElement(By.xpath("//*[@id=\"8921dbd2-0f9e-468b-a1db-d20f9ec68b96\"]/div/div[2]/div[2]/div/div/a[1]/span/span")).click();
        myDriver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
    }

    // Test case :29
    public static void flag() {
        //set property with browser driver name and path of the driver
        //for chrome browser
        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select flag on click
        myDriver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[1]/span")).click();
    }

    // Test case :30
    public static void account() {
        //set property with browser driver name and path of the driver
        //for chrome browser
        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select account on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
    }

    // Test case :31
    public static void orders() {
        //set property with browser driver name and path of the driver
        //for chrome browser
        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select Orders on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[1]")).click();
    }

    // Test case :32
    public static void tryPrime() {
        //set property with browser driver name and path of the driver
        //for chrome browser
        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select TryPrime on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-link-prime\"]/span")).click();
    }

    // Test case :33
    public static void cart() {
        //set property with browser driver name and path of the driver
        //for chrome browser
        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select Cart on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[3]")).click();
    }

    // Test case :34
    public static void customerService() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select  customerService on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
    }

    //Test case :35
    public static void newReleases() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Search on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
    }

    //Test case :36
    public static void findAGift() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Search on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
    }

    //Test case :37
    public static void todayDeals() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Search on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
    }

    //Test case :38
    public static void wholeFoods() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select wholeFoods on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
    }

    //Test case :39
    public static void giftCards() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select giftCards on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]")).click();
    }

    //Test case :40
    public static void registry() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Search on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).click();
    }

    //Test case :41
    public static void amazonBasics() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select amazonBasics on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[9]")).click();
    }

    //Test case :42
    public static void sell() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Search on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[10]")).click();
    }

    //Test case :43
    public static void coupons() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select coupons on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[11]")).click();
    }

    //Test case :44
    public static void foundItOnAmazon() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select foundItOnAmazon on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[12]")).click();
    }

    //Test case :45
    public static void freeShipping() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Search on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[13]")).click();
    }

    //Test case :46
    public static void shopperToolkit() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Search on click
        myDriver.findElement(By.xpath(" //*[@id=\"nav-xshop\"]/a[14]")).click();
    }

    //Test case :47
    public static void menu() {
        //set property with browser driver name and path of the driver
        //for chrome browser
        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select menu on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
    }

    //Test case :48
    public static void logo() {
        //set property with browser driver name and path of the driver
        //for chrome browser
        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select menu on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[1]/span[1]")).click();
    }

    //Test case :49
    public static void address() {
        //set property with browser driver name and path of the driver
        //for chrome browser
        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select address on click
        myDriver.findElement(By.xpath("//*[@id=\"glow-ingress-line2\"]")).click();
        //enter zip code
        myDriver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]")).sendKeys("11210");
        //Select apply on click
        myDriver.findElement(By.xpath("//*[@id=\"GLUXZipUpdate\"]/span/input")).click();
        //Select Done on click
        myDriver.findElement(By.xpath("//*[@id=\"a-popover-3\"]/div/div[2]/span/span/span/button")).click();
    }

    //Test case :50
    public static void pillPack() {
        //set property with browser driver name and path of the driver
        //for chrome browser
        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select PillPack on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[11]/td[9]/a")).click();
    }

}