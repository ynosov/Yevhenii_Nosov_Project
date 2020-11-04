package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class HomePage {

    public static String PAGE_URL = "http://book.theautomatedtester.co.uk/";

    public void open() {
        Selenide.open(PAGE_URL);
    }

    public void navigateToChapter(int chapterNumber) {
        $(By.linkText("Chapter" + chapterNumber)).click();
    }
}