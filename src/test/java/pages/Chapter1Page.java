package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byText;

public class Chapter1Page {

    public void checkThatTextIsVisible(String text) {
        $(byText(text)).shouldBe(visible);
    }

    public static String chapterText = "Assert that this text is on the page";

    public void navigateToHomePage() {
        $(By.linkText("Home Page")).click();
    }

}
