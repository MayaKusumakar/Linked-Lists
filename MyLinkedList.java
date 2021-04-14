public class MyLinkedList{
   private DoubleNode front;
   private DoubleNode back;
   private int size;
   
   public MyLinkedList(){
      front = back = null;
      size = 0;
   }
   
   public DoubleNode getFront(){
      return front;
   }
   
   public DoubleNode getBack(){
      return back;
   }
   
   public int size(){
      return size;
   }
   
   public boolean add(Comparable c){
      if(front == null){
         DoubleNode newNode = new DoubleNode(null, c, null);
         back = front = newNode;
         size++;
         return true;
         
      }
      
      back.setNext(new DoubleNode(c));
      back.getNext().setPrev(back);
      back = back.getNext();
      size++;
      
      return true;

   }
   

  
   
   public boolean add(int index, Comparable c){
   
      //if adding at spot 0
      if(index > size -1)
         return false;
      if(index == 0){
         if(front == null) {
            DoubleNode newNode = new DoubleNode(c, null);
            back = front = newNode;
            size++;
         }
         else{
            DoubleNode newNode = new DoubleNode(null, c, front);
            front = newNode;
            size++;
         }
        return true;
      }
      
      if(index == size){
         add(c);
         return true;
      }
      
      DoubleNode temp = front;
      for(int i = 0; i < index-1; i++){
         temp = temp.getNext();
      }
         DoubleNode next = temp.getNext();
         temp.setNext(new DoubleNode(temp, c,next));
         temp.getNext().getNext().setPrev(temp.getNext());
         size++;
         return true;
   }
   
   public boolean addLast(Comparable c){
      add(c);
      return true;
   }
   
   public boolean addFirst(Comparable c){
      add(0,c);
      return true;
   }
   
   public String toString(){
      String out = "[";
      DoubleNode temp = front;
      
      while(temp != null){
         out = out + temp.getVal();
         
         if(temp.getNext() != null){
            out = out + ", ";
         }
         temp = temp.getNext();
      }
         out+= "]";
            
         
      return out;
   }
   
   public int indexOf(Comparable c){
      if(front == null)
         return -1;
      DoubleNode temp = front;
      int count = 0;
      while(temp != null){
         if(c.compareTo(temp.getVal()) == 0){
            return count;
         }
         count++;
         temp = temp.getNext();
      }
      
      return -1;
   }
   
   public boolean remove(Comparable c){
      if(front == null)
         return false;
         
      if(front.getVal().compareTo(c) == 0){
         remove();
         return true;
      }
      if(back.getVal().compareTo(c) == 0){
         removeLast();
         return true;
      }
         
      if(!(contains(c))){
         return false;
      }
      
      
         
      DoubleNode temp = front;
      int count = 0;
      while(temp != null){
         if(temp.getVal().compareTo(c) == 0){
            remove(count);
            size--;
            return true;
         }
         count++;
         temp = temp.getNext();
      }
      size--;
      return true;
     
         
          
     }
   
   public boolean contains(Comparable c){
      if(front == null)
         return false;
      
      DoubleNode temp = front;
      while(temp != null){
         if(temp.getVal().compareTo(c) == 0){
            return true;
         }
         temp = temp.getNext();
      }
      
      return false;
  }
  
   public Comparable remove(int index){
      Comparable value;
      if(front == null)
         return false;
         
      if(index == size-1){
         value = back.getVal();
         back = back.getPrev();
         back.setNext(null);
         size--;
         return value;
      }
         
      DoubleNode temp = front;   
      for(int i = 0; i < index-1; i++){
         temp = temp.getNext();
      }
      Comparable v = temp.getNext().getVal();
      
      temp.setNext(temp.getNext().getNext());
      temp.getNext().setPrev(temp);
      size--;
      return v;
   }
   
   public Comparable remove(){

      if(front == null)
         return false;
      Comparable val = front.getVal();
      front = front.getNext();
      front.setPrev(null);
      size--;
      return val;
   
   }
   
   public Comparable removeLast(){
      if(front == null || back == null)
         return false;
      Comparable val = back.getVal();
      back = back.getPrev();
      back.setNext(null);
      size--;
      return val;
 
   }
   
   public boolean set(int index, Comparable c){
      if(index > size-1)
         return false;
      if(index == 0){
         front.setVal(c);
      }
      
      DoubleNode temp = front;
      for(int i = 0; i < index; i++){
         temp = temp.getNext();
      }
      temp.setVal(c);
      return true;    
   }
   
   public int lastIndexOf(Comparable c){
      if(front == null)
         return -1;
      DoubleNode temp = back;
      int count = 1;
      while(temp != null){
         if(temp.getVal().compareTo(c) == 0){
            return size-count;
         }
         count++;
         temp = temp.getPrev();

         }
               
      
      
      return -1;
   }
   public static void main(String[] args){
      MyLinkedList list = new MyLinkedList();
      list.add("Hi");
      list.add("Maya");
      list.add(1,"cool");
      list.add(0, "happy");
      System.out.println(list.size());
      list.add(4, "cya");
      System.out.println(list);

      //System.out.println(list.getBack().getPrev());
      
      System.out.println(list.indexOf("Maya"));
      System.out.println(list.indexOf("cya"));
      System.out.println(list.indexOf("Raj"));
 
      
      System.out.println(list);
      list.remove("cya");
      System.out.println("last");

      System.out.println(list);
      
      System.out.println(list.contains("Maya"));
      System.out.println(list.contains("Raj"));
      System.out.println(list.contains("cya"));
      
      System.out.println(list);

      System.out.println(list.remove(2));
      
      
      

      }
      
     
}