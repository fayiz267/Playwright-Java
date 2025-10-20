package org.example;


import com.microsoft.playwright.*;


public class Arattai {


    public static void main(String[] args) {

        Browser browser;
        Page page;




        browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(4000));
            page = browser.newPage();
            page.navigate("https://www.arattai.in/");
            page.locator("xpath= /html/body/header/div[3]/div/div[1]/a/img").click();

            page.locator("xpath= /html/body/header/div[3]/div/div[2]/ul/li[1]/span").click();

            page.locator("xpath= /html/body/header/div[3]/div/div[2]/ul/li[1]/ul/li[1]/a").click();
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);

            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);

            page.waitForTimeout(2000);
            page.goBack();

            page.locator("xpath= /html/body/header/div[3]/div/div[2]/ul/li[1]/span").click();
            page.locator("xpath= /html/body/header/div[3]/div/div[2]/ul/li[1]/ul/li[2]/a").click();
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);

            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.waitForTimeout(2000);
            page.goBack();

            page.locator("xpath= /html/body/header/div[3]/div/div[2]/ul/li[1]/span").click();
            page.locator("xpath= /html/body/header/div[3]/div/div[2]/ul/li[1]/ul/li[3]/a").click();
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);

            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.waitForTimeout(2000);
            page.goBack();




            page.locator("xpath= /html/body/main/div/div/section[1]/div/div/div[1]/ul/li[1]/a").click();
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, 500)");
            page.waitForTimeout(1000);

            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.evaluate("window.scrollBy(0, -500)");
            page.waitForTimeout(1000);
            page.waitForTimeout(2000);
            page.goBack();
            page.locator("xpath= /html/body/main/div/div/section[1]/div/div/div[1]/ul/li[2]/a").click();
            page.waitForTimeout(5000);

            page.locator("xpath = /html/body/div[11]/div/aside/div/div/div[1]/div[2]/input").fill("fayiz");
            page.waitForTimeout(1000);
            page.locator("xpath = /html/body/div[11]/div/aside/div/div/div[1]/div[2]/input").clear();
            page.waitForTimeout(1000);

            page.locator("xpath=/html/body/div[11]/div/aside/div/div/div[3]/div/div/div[2]/div/div/div/img ").click();
            page.waitForTimeout(1000);

            page.locator("xpath= /html/body/div[11]/div/section/div/div/div/div/div[3]/div[3]/div[1]/div[3]/div/div[1]/div[2]/div/p").fill("hloo da ");
            page.waitForTimeout(1000);
            page.locator("xpath= /html/body/div[11]/div/section/div/div/div/div/div[3]/div[3]/div[2]/div/em").click();
            page.waitForTimeout(1000);

            page.locator("xpath=/html/body/div[11]/div/aside/div/div/div[1]/div[2]/span ").click();
            page.waitForTimeout(1000);
            page.locator("xpath= /html/body/div[10]/div/div[1]/a[2]").click();
            page.waitForTimeout(1000);
            page.locator("xpath= /html/body/div[10]/div/div[1]/a[3]").click();
            page.waitForTimeout(1000);
            page.locator("xpath= /html/body/div[10]/div/div[1]/a[4]").click();
            page.waitForTimeout(1000);
            page.locator("xpath= /html/body/div[10]/div/div[1]/a[5]").click();
            page.waitForTimeout(1000);
            page.locator("xpath= /html/body/div[10]/div/div[2]/a").click();
            page.waitForTimeout(1000);
            page.locator("xpath= /html/body/div[10]/div/div[2]/div/span/div").click();
            page.waitForTimeout(1000);

            page.locator("xpath= /html/body/div[11]/div/aside/div/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div[1]").click();
            page.waitForTimeout(1000);
            page.locator("xpath= /html/body/div[11]/div/aside/div/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[1]").click();
            page.waitForTimeout(1000);
            page.locator("xpath= /html/body/div[11]/div/section/div/div/div/div[1]/div[3]/div[3]/div[1]/div[3]/div/div[1]/div[2]/div/p").fill("hloo guys");
            page.waitForTimeout(1000);
            page.locator("xpath= /html/body/div[11]/div/section/div/div/div/div[1]/div[3]/div[3]/div[2]/div/em").click();
            page.waitForTimeout(1000);









            page.waitForTimeout(2000);
            page.close();
            browser.close();




    }
}