public class Detectcycle extends LL {
    public int cycleLength(Node head){
        Node first = head;
        Node second = head;
        while(first != null && first.next != null){
            first = first.next.next;
            second = second.next;
            if(first == second){
                int len =0;
                Node temp = slow;
                do{
                    temp = temp.next;
                    len++;
                }while(temp != first);
                return len;
            }
        }
    return 0;
}
public static void main(String[] args) {
    LL ll = new LL();
    // ll.insertFirst(25);
    // ll.insertFirst(24);
    ll.insertFirst(23);
    ll.insertLast(25);
    ll.insertLast(26);
    ll.insertLast(27);
    ll.cycle();
    // System.out.println(ll.display());
    ll.display();;
    
}

}
