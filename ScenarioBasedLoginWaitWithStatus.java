package Selenium;

public class ScenarioBasedLoginWaitWithStatus {


        /*static WebDriver driver;

        @BeforeClass
        public static void setup() {
                driver = new ChromeDriver();
                driver.get("https://myurl.com");
        }

        @Test
        public void verifyLoginStatusWithColor() {

                driver.findElement(By.id("username")).sendKeys("username");
                driver.findElement(By.id("password")).sendKeys("password");
                driver.findElement(By.id("submit")).sendKeys("submit");

                By statusLocator = By.id("status");
                By refreshLocator = By.id("refresh");

                verifyStatusAndLocatorColor(statusLocator, refreshLocator, "Pending", "rgba(255, 0, 0, 1)");
                verifyStatusAndLocatorColor(statusLocator, refreshLocator, "In Progress", "rgba(255, 255, 0, 1)");
                verifyStatusAndLocatorColor(statusLocator, refreshLocator, "Completed", "rgba(0, 128, 0, 1)");
        }

        public void verifyStatusAndLocatorColor(By statusLocator, By refreshLocator, String expectedStaus, String expectedColor) {

                FluentWait<WebDriver> wait = new FluentWait<>(driver)
                        .withTimeout(Duration.ofSeconds(120))
                        .pollingEvery(Duration.ofSeconds(5))
                        .ignoring(NoSuchElementException.class);

                boolean isFound = wait.until(new Function<WebDriver, Boolean>() {
                        public Boolean apply(WebDriver driver){
                                driver.findElement(refreshLocator).click();
                                WebElement statusElement = driver.findElement(statusLocator);
                                String currentStatus = statusElement.getText();
                                String currentColor = statusElement.getCssValue("color");

                                System.out.println("Cuurent sttaus" + currentStatus+ "with color" + currentColor);
                                if(currentStatus.equals(expectedStaus)) {

                                        Assert.assertEquals(currentColor,expectedColor);
                                        return true;

                                }
                                return false;
                        }
                });
                Assert.assertTrue("Expected status '" + expectedStaus + "' not found in time.", isFound);
        }*/

}
