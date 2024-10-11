package Hasing;
import java.util.*;

public class set {
    public static void main(String args[]){
      HashSet<String> hs=new HashSet<>();
      hs.add("Deepak");
      hs.add("Amrit");
      hs.add("Olie");
      hs.add("Alok");
      System.out.println(hs.contains("Amrit"));
      hs.remove("Amrit");
      System.out.println(hs.contains("Amrit"));
    }
}
