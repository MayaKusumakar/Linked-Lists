import java.io.*;
import java.util.*;

public class ListNode{
   
   private Comparable val;
   private ListNode next;
   
   public ListNode(){
      val = null;
      next = null;
   }
   
   public ListNode(Comparable c){
      val = c;
      next = null;
      
   }
   
   public ListNode(Comparable c,  ListNode nx){
      val = c;
      next = nx;
   }
   
   public Comparable getVal(){
      return val;
   }
   
   public ListNode getNext(){
      return next;
   }
   
   public void setValue(int v){
      val = v;
   }
   
   public void setNext(ListNode n){
      next = n;
   }
   
   public String toString(){
      return val + "";
   }
}
