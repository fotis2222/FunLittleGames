import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        try {
           ArrayList<String> names = new ArrayList<String>();
           names.add("rick astley");
           names.add("jack grealish");
           for (String i : names) {
               System.out.println(i);
           }
       }
        catch(Exception e) {
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("finished");
        }
    }
}