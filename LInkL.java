public class LInkL {
    private  Node head ;
	private  Node tail;
	public  void addLast(int value) {
		Node curr = new Node(value);
	      if(head == null) {
	    	  head = curr;
              tail = curr;
	      }
	     tail.next = curr;
         tail = curr;
	} 
	public   void printLL() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val+" -->");
			temp = temp.next;
		}
	}
	
	
	public static class Node{
		int val;
		Node next;
		public Node(int val) {
			   this.val= val;
		   }
	}
	
	
	public static void main(String [] args ) {
		LInkL l = new LInkL();
        l.addLast(0);
		l.addLast(20);
        l.printLL();
	}
   

}
