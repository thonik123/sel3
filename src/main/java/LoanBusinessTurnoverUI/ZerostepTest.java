package LoanBusinessTurnoverUI;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class ZerostepTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void zerostep() throws InterruptedException {
        //Zero
        Actions actions = new Actions(driver);
        driver.get("http://test-swarm.atb.su/sme-crm-external-requests/loan-business-turnover/");
        driver.manage().window().setSize(new Dimension(1526, 1012));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id(":r0:")).click();
        driver.findElement(By.id(":r0:")).sendKeys("Антон Ф.");
        driver.findElement(By.id(":r1:")).click();
        driver.findElement(By.id(":r1:")).sendKeys("921 314-62-20");
        driver.findElement(By.id(":r2:")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(6)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(8)")).click();
        driver.findElement(By.id(":r3:")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiBackdrop-root"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(2)")).click();
        driver.findElement(By.id(":r5:")).click();
        driver.findElement(By.id(":r6:")).click();
        driver.findElement(By.id(":r4:")).click();
        driver.findElement(By.id(":r7:")).sendKeys("7777");
        driver.findElement(By.id(":r8:")).click();
        //First
        driver.findElement(By.id(":r9:")).sendKeys("2721204808");
        driver.findElement(By.cssSelector(".FormGridItem_item__GQDPH:nth-child(1) .SliderInput_input__epvrE > .SliderInput_label__N-6LP:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".FormGridItem_item__GQDPH:nth-child(1) .SliderInput_input__epvrE > .SliderInput_label__N-6LP:nth-child(1)")).sendKeys("20 000 000");
        driver.findElement(By.cssSelector(".FormGridItem_item__GQDPH:nth-child(2) .SliderInput_input__epvrE > .SliderInput_label__N-6LP:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".FormGridItem_item__GQDPH:nth-child(2) .SliderInput_input__epvrE > .SliderInput_label__N-6LP:nth-child(1)")).sendKeys("36");
        driver.findElement(By.id(":ra:")).click();
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.cssSelector(".MuiMenuItem-root")).click();
        driver.findElement(By.id(":rb:")).click();
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        driver.findElement(By.id(":rb:")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.id(":rb:")).sendKeys("1132721007121");
        driver.findElement(By.id(":rc:")).click();
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("ООО МЕДИЦИНСКИЙ ЦЕНТР \"ЭКСПЕРТ\"").perform();
/*        driver.findElement(By.id(":rc:")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.id(":rc:")).sendKeys("ООО МЕДИЦИНСКИЙ ЦЕНТР \"ЭКСПЕРТ\"");*/
        driver.findElement(By.id(":rd:")).click();
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("Танхаев Сергей Юрьевич").perform();
//        driver.findElement(By.id(":rd:")).sendKeys("Танхаев Сергей Юрьевич");
        driver.findElement(By.id(":re:")).click();
        driver.findElement(By.id(":re:")).sendKeys("644100, Омская обл, г Омск, пр-кт Королева, д 1А к 1");
        driver.findElement(By.id(":re:-option-0")).click();
        driver.findElement(By.id(":ri:")).click();
        driver.findElement(By.id(":ri:")).sendKeys("644009, Омская обл, г Омск, ул Лермонтова, д 179А к 4");
        driver.findElement(By.id(":ri:-option-0")).click();
        driver.findElement(By.id(":rl:")).sendKeys("45.32");
        driver.findElement(By.id(":rn:")).sendKeys("49.31.2");
        driver.findElement(By.id(":ro:")).sendKeys("17");
        driver.findElement(By.id(":rq:")).click();
        driver.findElement(By.id(":rq:")).sendKeys("+7 (921) 314-62-20");
        driver.findElement(By.id(":rs:")).click();
        driver.findElement(By.id(":rs:")).sendKeys("Руководитель");
        driver.findElement(By.id(":ru:")).click();
        driver.findElement(By.id(":ru:")).sendKeys("thonik1@yandex.ru");
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiButton-root"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".MuiButton-root")).click();
        driver.findElement(By.id(":rv:")).click();
        //Second
        driver.findElement(By.id(":r10:")).click();
        driver.findElement(By.cssSelector(".MuiMenuItem-root:nth-child(2)")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".FormGridLine_line__Qpouf:nth-child(5) > .MuiButtonBase-root"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".FormGridLine_line__Qpouf:nth-child(5) > .MuiButtonBase-root")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.id(":r12:")).click();
        driver.findElement(By.id(":r12:")).sendKeys("ООО \"Оптима\"");
        driver.findElement(By.id(":r13:")).sendKeys("47.61");
        driver.findElement(By.id(":r14:")).sendKeys("08.10.2009");
        driver.findElement(By.id(":r15:")).sendKeys("7536102600");
        driver.findElement(By.id(":r16:")).sendKeys("100");
        driver.findElement(By.id(":r11:")).click();
        driver.findElement(By.id(":r17:")).click();
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("Танхаев").perform();
//        driver.findElement(By.id(":r17:")).sendKeys("Танхаев");
        driver.findElement(By.id(":r18:")).click();
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("Сергей").perform();
        //driver.findElement(By.id(":r18:")).sendKeys("Сергей");
        driver.findElement(By.id(":r19:")).click();
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("Юрьевич").perform();
        driver.findElement(By.id(":r1a:")).sendKeys("624253352063");
        driver.findElement(By.id(":r1b:")).sendKeys("8104");
        driver.findElement(By.id(":r1c:")).sendKeys("924894");
        driver.findElement(By.id(":r1d:")).sendKeys("07.02.2013");
        driver.findElement(By.id(":r1e:")).sendKeys("032-014");
        driver.findElement(By.id(":r1f:")).sendKeys("Отделом УФМС по г Кяхта");
        driver.findElement(By.id(":r1g:")).sendKeys("10.03.1982");
        driver.findElement(By.id(":r1h:")).sendKeys("СССР БУРЯТСКОЙ АССР Г УЛАН-УДЭ");
        driver.findElement(By.id(":r1i:")).sendKeys("РФ");
        driver.findElement(By.id(":r1j:")).click();
        driver.findElement(By.id(":r1j:")).sendKeys("671840, Респ Бурятия, Кяхтинский р-н, г Кяхта, ул Цыбиктарова, д 9");
        driver.findElement(By.id(":r1j:-option-0")).click();
        driver.findElement(By.id(":r1n:")).click();
        driver.findElement(By.id(":r1n:")).sendKeys("671840, Респ Бурятия, Кяхтинский р-н, г Кяхта, ул Цыбиктарова, д 9");
        driver.findElement(By.id(":r1n:-option-0")).click();
        driver.findElement(By.cssSelector(".FormGridLine_line__Qpouf:nth-child(5) > .MuiButtonBase-root")).click();
        //Third
        driver.findElement(By.id(":r1r:")).click();
        driver.findElement(By.id(":r1r:")).sendKeys("Танхаев");
        driver.findElement(By.id(":r1s:")).sendKeys("Сергей");
        driver.findElement(By.id(":r1t:")).sendKeys("Юрьевич");
        driver.findElement(By.id(":r1u:")).sendKeys("031203620089");
        driver.findElement(By.id(":r1v:")).sendKeys("8104");
        driver.findElement(By.id(":r20:")).sendKeys("924894");
        driver.findElement(By.id(":r21:")).sendKeys("02.07.2013");
        driver.findElement(By.id(":r22:")).sendKeys("032-014");
        driver.findElement(By.id(":r23:")).sendKeys("Отделом УФМС по г Кяхта");
        driver.findElement(By.id(":r24:")).sendKeys("03.10.1982");
        driver.findElement(By.id(":r25:")).sendKeys("СССР БУРЯТСКОЙ АССР Г УЛАН-УДЭ");
        driver.findElement(By.id(":r26:")).sendKeys("РФ");
        driver.findElement(By.id(":r27:")).click();
        driver.findElement(By.id(":r27:")).sendKeys("671840, КЯХТИНСКИЙ Р-ОН, Г. КЯХТА, УЛ. ЦЫБИКТАРОВА, Д. 9");
        driver.findElement(By.id(":r27:-option-0")).click();
        driver.findElement(By.id(":r2b:")).click();
        driver.findElement(By.id(":r2b:")).sendKeys("671840, КЯХТИНСКИЙ Р-ОН, Г. КЯХТА, УЛ. ЦЫБИКТАРОВА, Д. 9");
        driver.findElement(By.id(":r2b:-option-0")).click();
        driver.findElement(By.id(":r2e:")).click();
        driver.findElement(By.id(":r2e:")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.id(":r2e:")).sendKeys(Keys.CLEAR);
        driver.findElement(By.id(":r2e:")).sendKeys(Keys.DELETE);
        driver.findElement(By.id(":r2e:")).clear();
        driver.findElement(By.id(":r2e:")).sendKeys("100");
        {
            WebElement element = driver.findElement(By.id(":r1q:"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.id(":r1q:")).click();
        //Fourth
        js.executeScript("window.scrollTo(0,0)");
        driver.findElement(By.id(":r2f:")).click();
        driver.findElement(By.id(":r2f:")).sendKeys("10 000 000");
        driver.findElement(By.id(":r2g:")).click();
        driver.findElement(By.id(":r2g:")).sendKeys("8 000 000");
        driver.findElement(By.id(":r2k:")).click();
        driver.findElement(By.id(":r2l:")).click();
        {
            WebElement element = driver.findElement(By.id(":r2l:"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.id(":r2n:")).click();
        js.executeScript("window.scrollTo(0,389)");
        driver.findElement(By.id(":r2o:")).click();
        {
            WebElement element = driver.findElement(By.id(":r2p:"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.id(":r2o:")).sendKeys("7777");
        driver.findElement(By.id(":r2p:")).click();
        Thread.sleep(100000);
    }
}
