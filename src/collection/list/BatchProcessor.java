package collection.list;

public class BatchProcessor {

  private final MyList<Integer> list;

  public BatchProcessor(MyList<Integer> list) {
    this.list = list;
  }

  public void logic(int size) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      list.add(0, i); // Add to the front
    }
    long endTime = System.currentTimeMillis();
    System.out.println("Size: " + size + ", Execution time: " + (endTime - startTime) + "ms");
  }
}
