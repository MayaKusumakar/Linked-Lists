public class ListNodePlay{
   public static void main(String[] args){
      ListNode node = new ListNode("Dragon");
      ListNode other = new ListNode("Funny");
      
      node.setNext(other);
      
      ListNode third = new ListNode("Valentine");
      
      other.setNext(third);
      
      
      third.setNext(new ListNode("Sand"));
      
      //System.out.println(node); // or System.out.prinln(node.getValue());
      
      //System.out.println(other); // or System.out.println(node.getNext().getValue());
      
      System.out.println(node.getNext().getNext().getNext().getNext());
      
      //third.setNext(null);
   }
}