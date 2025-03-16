package collection.deque.test.stack;

public class BrowserHistoryTest {

  public static void main(String[] args) {
    BrowserHistory browser = new BrowserHistory();

    // User visits web pages
    browser.visitPage("youtube.com");
    browser.visitPage("google.com");
    browser.visitPage("facebook.com");

    System.out.println("browser = " + browser.toString());

    // User navigates back
    String currentPage1 = browser.goBack();
    System.out.println("currentPage1 = " + currentPage1);

    String currentPage2 = browser.goBack();
    System.out.println("currentPage2 = " + currentPage2);
  }
}
