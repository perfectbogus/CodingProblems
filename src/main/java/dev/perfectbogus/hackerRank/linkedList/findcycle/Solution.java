package dev.perfectbogus.hackerRank.linkedList.findcycle;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'arrayManipulation' function below.
   *
   * The function is expected to return a LONG_INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. 2D_INTEGER_ARRAY queries
   */

  public static long arrayManipulation(int n, List<List<Integer>> queries) {
    int m = queries.size();
    long[] data = new long[n];

    for (int i = 0; i < m; i++) {
      List<Integer> query = queries.get(i);
      int minor = query.get(0) - 1;
      int mayor = query.get(1) - 1;
      long toSum = query.get(2);

      data[minor] += toSum;
      data[mayor] -= toSum;
    }

    long count = 0L,max = 0L;
    for(int i =0; i<n; i++){
      count += data[i];
      if(count > max)
        max = count;
    }
    // Write your code here
    return max;
  }

}

class TaskUpdate implements Runnable {

  long[] data;
  int minor;
  int mayor;
  long toSum;
  long biggest;

  public TaskUpdate(long[] data, int minor, int mayor, long toSum){
    this.data = data;
    this.minor = minor;
    this.mayor = mayor;
    this.toSum = toSum;
    this.biggest = 0L;
  }

  public long getBiggest() {
    long big = 0L;
    for(int i = 0; i < data.length - 1; i++){

    }
    return big;
  }

  @Override
  public void run() {
    System.out.println("Before Update: " + Arrays.toString(data));
    for (int i = minor; i <= mayor; i++){
      data[i] = data[i] + toSum;
      if(data[i] > data[data.length - 1]){
        data[data.length - 1] = data[i];
      }
    }
    System.out.println("After Update: " + Arrays.toString(data));
  }
}
public class Solution {

  static int processors = Runtime.getRuntime().availableProcessors();
  static ExecutorService executor = Executors.newFixedThreadPool(processors);

  private static void processBatch(int low, int high, long[][] data) {

    for (int i = 0; i < 4; i++) {
      TaskUpdate task = new TaskUpdate(data[i], 0, 1, 100);
      executor.execute(task);
    }
    executor.shutdown();

    try {
      // Wait a while for existing tasks to terminate
      if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
        // Cancel currently executing tasks forcefully
        executor.shutdownNow();
        // Wait a while for tasks to respond to being cancelled
        if (!executor.awaitTermination(60, TimeUnit.SECONDS))
          System.err.println("Pool did not terminate");
      }
    } catch (InterruptedException ex) {
      // (Re-)Cancel if current thread also interrupted
      executor.shutdownNow();
      // Preserve interrupt status
      Thread.currentThread().interrupt();
    }

  }
  public static void main(String[] args) throws IOException {

    final Path filePath = new File("src/main/java/dev/perfectbogus/hackerRank/linkedList/findcycle/data.txt").toPath();

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(filePath)));


    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int n = Integer.parseInt(firstMultipleInput[0]);

    int m = Integer.parseInt(firstMultipleInput[1]);

    List<List<Integer>> queries = new ArrayList<>();

    IntStream.range(0, m).forEach(i -> {
      try {
        queries.add(
            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList())
        );
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    long result = Result.arrayManipulation(n, queries);

    System.out.println(result);

  }
}
