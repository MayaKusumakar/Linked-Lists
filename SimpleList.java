public class SimpleList
{   
   private ListNode front;
   private ListNode back;
   
   public SimpleList(){
      back = front = null;
   }
   
   public boolean add(Comparable val){
      if(front == null){
      
         ListNode newNode = new ListNode(val, null);
         back = front = newNode;
         return true;
         
      }
      
      
      back.setNext(new ListNode(val)); 
      back = back.getNext();
      //ListNode temp = front;
      
      // while(temp.getNext() != null){
//          temp = temp.getNext();
//       }
//       
//       temp.setNext(new ListNode(val));
//       
      return true;
      
      
   } 
   
   public boolean addFront(Comparable val){
      front = new ListNode(val, front);
      
      if(back == null)
         back = front;
      return true;
   }
   
   public String toString(){
      String out = "";
      ListNode temp = front;
      
      while(temp != null){
         out = out + temp.getVal();
         
         if(temp.getNext() != null){
            out = out + " -> ";
         }
         temp = temp.getNext();
      }
         out+= " \\";
            
         
      return out;
   }
   
   public void clear(){
      front = null;
   }
   
   public int size(){
      int count = 0;
      ListNode temp = front;
      
      while(temp != null){
         count++;
         temp = temp.getNext();
      }
      
      return count;
   }
   
   public Comparable remove(int index){
      if(front == null)
         return null;
         
      if(index >= this.size()){
         return null;
      }
      
      if(index == 0){
         Comparable val = front.getVal();
         front = front.getNext();
         return val;
      }
      
      
      
   
      ListNode temp = front;
      
      for(int i = 0; i < index-1; i++){
      
         temp = temp.getNext();
      }
      
      Comparable c = temp.getNext().getVal();
      if(temp.getNext() == back)
         back = temp;
      temp.setNext(temp.getNext().getNext());
      
      return c;
      
      
   }
   
   public boolean remove(Comparable val){
   
      if(front == null)
         return false;
      if(front.getVal().compareTo(val) == 0)
         front = front.getNext();
       
      ListNode temp = front;
      ListNode prev = null;
       while(temp != null && temp.getVal().compareTo(val) != 0){
        prev = temp;
        temp = temp.getNext();
      }
      
      if(temp == null)
         return false;
      prev.setNext(temp.getNext());
        
        return true;
   }
   public static void main(String[] args){
      SimpleList list = new SimpleList();
      list.add("Alex");
      list.add("Hemanth");
      list.add("Saaketh");
      list.add("NickyG");
      list.addFront("Zito");
      list.addFront("Dylan");
      System.out.println(list);
      System.out.println(list.remove("Alex"));
      System.out.println(list.remove("NickyG"));
      System.out.println(list.remove("Saaketh"));
      System.out.println(list.remove("Maya"));


      System.out.println(list);
     
            
      
      
      System.out.println(list);
      System.out.println(list.size());
    }
      
   }
