public class DoubleNode
{
   private Comparable val;
   private DoubleNode next;
   private DoubleNode prev;
   
   public DoubleNode(){
      next = prev = null;
   }
   
   public DoubleNode(Comparable v){
      val = v;
      next = null;
      prev = null;
   }
   
   public DoubleNode(Comparable v, DoubleNode nx){
      val = v;
      next = nx;
      prev = null;
   }
   
   public DoubleNode(DoubleNode pre, Comparable v, DoubleNode nx){
      val = v;
      next = nx;
      prev = pre;
   }
   
   public DoubleNode getNext(){
      return next;
   }
   
   public Comparable getVal(){
      return val;
   }
   
   public DoubleNode getPrev(){
      return prev;
   }
   
   public void setNext(DoubleNode n){
      next = n;
   }
   public void setPrev(DoubleNode p){
      prev = p;
   }
   public void setVal(Comparable v){
      val = v;
   }
   
   public String toString(){
      return val + "";
   }
}
