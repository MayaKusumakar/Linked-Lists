import java.io.*;
import java.util.*;

public class ListTester
{
   public static void main(String[] args)
   {
      //Change this list to a MyLinkedList Object
      //output should be the same, except for the
      //formatting of the toString Method
      //LinkedList<String> list = new LinkedList<String>();
      MyLinkedList list = new MyLinkedList();
      list.add("Hunter");
      list.add("Adam");
      list.add("Alex");
      list.addFirst("Maya");
      list.addLast("Lucas");
      list.add(0,"Nick");
      list.add(2,"Saaketh");
      list.add(6,"Cole");
      System.out.println(list);
      System.out.println(list.size());
      System.out.println(list.indexOf("Arnav"));
      System.out.println(list.indexOf("Alex"));
      System.out.println(list.remove());
      System.out.println(list.contains("Hunter"));
      System.out.println(list.contains("Caleb"));
      System.out.println(list.remove(4));
      System.out.println(list.removeLast());
      System.out.println(list.remove("Maya"));
      System.out.println(list.remove("Matthew"));
      System.out.println(list);
      System.out.println(list.remove("Dylan"));
      System.out.println(list);
      list.add("Olivia");
      list.set(1,"Payton");
      list.add("Hemanth");
      System.out.println(list);
      System.out.println(list.lastIndexOf("Andrew"));
      System.out.println(list.lastIndexOf("Adam"));
   }
}