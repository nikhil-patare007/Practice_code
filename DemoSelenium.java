package Selenium;

import java.io.IOException;

public class DemoSelenium {

    public static void main(String[] args) throws IOException {

       /* WebDriver driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Open website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //WebDriver wait
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement userName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdown_id")));

        //fluent wait
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        fluentWait.until(element -> element.findElement(By.xpath("//span[text()='Dashboard']")));

        //send Keys
        userName.sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

        //click login
        driver.findElement(By.tagName("button")).click();

        //Mouse Actions
        Actions actions = new Actions(driver);
        WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text(),'My info']")));
        actions.moveToElement(menu).perform();

        //context Click
        actions.moveToElement(menu).contextClick();
        actions.moveToElement(menu).clickAndHold();
        actions.sendKeys(Keys.ENTER);
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        //navigate
        driver.navigate().back();
        driver.navigate().refresh();

        //drag and drop
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(source, target).perform();

        //Handling dropdown
        WebElement dropdown = driver.findElement(By.id("dropdown_id"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option1");
        select.selectByIndex(2);
        select.selectByValue("india");

        //Taking screenshots
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("screenshot.png"));

        //scroll
        WebElement footer = driver.findElement(By.tagName("footer"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", footer);
        js.executeScript("window.scrollBy(0, 300)");


        //Alert Handling
        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.dismiss();

        //Switch frame
        driver.switchTo().frame("frameName");
        driver.switchTo().defaultContent();

        //switch between tabs
        String mainWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for(String window : windows) {
            if(!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);

        //delete cookies
        driver.manage().deleteAllCookies();

        //shadow dom
        WebElement shadowHost = driver.findElement(By.cssSelector("shadow-host-selector")); // Replace this
        SearchContext shadowRoot = (SearchContext) ((JavascriptExecutor) driver)
                .executeScript("return arguments[0].shadowRoot", shadowHost);
        WebElement shadowElement = shadowRoot.findElement(By.cssSelector("button.shadow-button"));
        shadowElement.click();

        //quit
        driver.quit();*/
    }
}
