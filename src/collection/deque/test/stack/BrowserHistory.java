package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

  private Deque<String> history = new ArrayDeque<>();
  private String currentPage = null;

  public void visitPage(String url) {
    if (currentPage != null) {
      history.push(currentPage);
    }
    currentPage = url;
    System.out.println("Visit page " + url);
  }

  public String goBack() {
    if (history.isEmpty()) {
      return null;
    }
    String back = history.pop();
    System.out.println("back: " + back);
    return back;
  }

  @Override
  public String toString() {
    return "BrowserHistory{" +
        "history=" + history +
        ", currentPage='" + currentPage + '\'' +
        '}';
  }
}