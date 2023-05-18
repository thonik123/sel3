package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // Установка пути к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anton\\Downloads\\selenium-java-4.9.0\\chromedriver.exe");

        // Создание экземпляра ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Открытие страницы в браузере
        driver.get("https://www.example.com");

        // Закрытие браузера
        driver.quit();
    }
}