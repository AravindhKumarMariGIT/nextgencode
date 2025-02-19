.time package:
Here is an example of how you can use the java.time package to manipulate dates:
```
import java.time.*;

public class DateTimeExample {
    public static void main(String[] args) {
        DateTime date1 = DateTime.now();
        DateTime date2 = date1.plusDays(2);
        DateTime date3 = date2.minusDays(2);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
}
```
This code will output the current date and time. You can also manipulate dates by adding, subtracting or comparing dates