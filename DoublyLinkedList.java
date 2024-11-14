
public class DoublyLinkedList {
    Node head;

    // Insert a new node at the end
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Delete the first node with the given value
    void delete(int value) {
        Node temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Element not found.");
            return;
        }
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp == head) head = temp.next;
        System.out.println("Deleted: " + value);
    }

    // Display all elements
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test the doubly linked list
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.insert(1);
        list.insert(2);
        list.insert(3);
        
        System.out.println("List before deletion:");
        list.display();
        
        list.delete(2);
        
        System.out.println("List after deletion:");
        list.display();
    }
}
