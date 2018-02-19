package Lab1_2;
import java.io.*;

public class Averages {
  public static void main(String[] args) {
    String input1;
    String[] nums ;

    try {

      int countLines = 0;
      FileReader fileReader = new FileReader(System.getProperty("user.dir")+"/src/Lab1_2/numbers.text");
      BufferedReader bufferedReader = new BufferedReader(fileReader);
       while ((input1 = bufferedReader.readLine()) != null){
            nums = input1.split(" ");
            double sum=0.0;
            countLines++;
            StringBuilder ints = new StringBuilder();
        for (int i = 1; i < nums.length; i++) {
          sum+=Integer.parseInt(nums[i]);
          ints.append(nums[i]).append(" ");
        }
        System.out.println(String.format("The average of the %d integers %sis ", nums.length-1, ints.toString()) + sum/(nums.length-1) );
      }
      System.out.println(countLines+" sets of numbers processed");
    } catch ( IOException e) {
      e.printStackTrace();
    }

  }
}

