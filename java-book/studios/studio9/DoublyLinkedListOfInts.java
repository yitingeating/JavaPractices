package studio9;
import studio9.List;
public class DoublyLinkedListOfInts implements List <Integer>{
	private ListNode head;
	private ListNode tail;
	public DoublyLinkedListOfInts() {
		tail=new ListNode();
		head=new ListNode();
		head.next=tail;
	}

	private int size;

	@Override
	public void addFirst(Integer x) {
		ListNode p=new ListNode(x);
		p.next=head.next;
		head.next=p;
		size++;
	}

	@Override
	public void addLast(Integer x) {
		ListNode p=new ListNode(x);
		ListNode q=head.next;
		while(q.next!=null){
		  q=q.next;	
		}
		q=p;
		tail=q.next;
		size++;
		System.out.println(size);
	}

	@Override
	public boolean remove(Integer x) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer get(int i) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Integer indexOf(int i){
		return null;
	}

}
