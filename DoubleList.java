public class DoubleList{
   private DoubleNode front;
   private DoubleNode back;
   private int size;
   
   public DoubleList(){
      front = back = null;
      size = 0;
   }
   
   public boolean add(Comparable c){
      if(front == null){
         DoubleNode newNode = new DoubleNode(c, null);
         back = front = newNode;
         return true;
         
      }
      
      back.setNext(new DoubleNode(c));
      back.getNext().setPrev(back);
      back = back.getNext();
      
      return true;

   }
}