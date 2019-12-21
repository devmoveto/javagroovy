package Initialiser

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class DriverManager {

    WebDriver driver = new ChromeDriver()

    void goTo(String url) {
        if (url.contains("https://")) {
            driver.get(url)
        } else {
            driver.get("https://www." + url)
        }
    }

    void endSession() {
        driver.quit()
    }

    void sleep(long ms) {
        WebDriver.sleep(ms)
    }
}