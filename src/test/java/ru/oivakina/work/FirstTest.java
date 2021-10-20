package ru.oivakina.work;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FirstTest extends WebDriverSettings{

    @Test
    public void firstTest() {
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google"));
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("ivi" + Keys.ENTER);
        String title1 = driver.getTitle();
        Assert.assertTrue(title1.equals("ivi - Поиск в Google"));
        driver.findElement(By.linkText("Картинки")).click();

        driver.findElement(By.cssSelector("div.PNyWAd.ZXJQ7c")).click();
        driver.findElement(By.cssSelector("div.xFo9P.r9PaP")).click();
        driver.findElement(By.linkText("Большой")).click();

    }
    @Test
    public void secondTest() {
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google"));
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("ivi" + Keys.ENTER);
        String title1 = driver.getTitle();
        Assert.assertTrue(title1.equals("ivi - Поиск в Google"));

        WebElement x = driver.findElement(By.cssSelector("div#search"));
        List<WebElement> elements = driver.findElements(By.cssSelector("div.yuRUbf a"));
        for (WebElement row : elements) {
            if (row.getAttribute("href").equals("https://play.google.com/store/apps/details?id=ru.ivi.client&hl=ru&gl=US")) {
                row.click();
                break;
            }
        }
        String title2 = driver.getTitle();
        Assert.assertTrue(title2.equals("Приложения в Google Play – IVI: сериалы, фильмы, мультики"));
    }
}
