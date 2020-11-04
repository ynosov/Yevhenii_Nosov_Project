package tests;

import pages.HomePage;
import pages.Chapter1Page;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChapterNavigation {

    @Test
    public void navigationFromHomePageToChapterAndBack() {
        HomePage homePage = new HomePage();
        Chapter1Page chapter1Page = new Chapter1Page();

        homePage.open();
        homePage.navigateToChapter(1);
        chapter1Page.checkThatTextIsVisible(Chapter1Page.chapterText);
        chapter1Page.navigateToHomePage();
        Assert.assertEquals(WebDriverRunner.url(), HomePage.PAGE_URL);
    }
}
