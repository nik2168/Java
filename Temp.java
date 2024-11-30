
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Temp{
    public static void main(String[] args) {
      List<String> s = Arrays.asList("Sam", "William");
      List<String> ans = s.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());

      System.out.println(ans);

    }
}