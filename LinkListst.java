/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_ds.a;

/**
 *
 * @author khali
 */
public class LinkListst {

    /**
     * This is the only field of the class. It holds the head of the list
     */
    Nodest head;

    /**
     * Length of the linked list.
     */
    private int length;

    /**
     * This class has a default constructor:
     */
    public LinkListst() {
        length = 0;
    }

    public void insertAtEnd(String data) {
        Nodest node = new Nodest(data);
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Nodest temp;
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            //     node=new ListNode(data);
            temp.next = node;

        }

        length++;
    }

    @Override
    public String toString() {
        String result = "";
        if (head == null) {
            result = "";
            return result;
        }
        result = result + head.data;
        Nodest temp = head.next;
        while (temp != null) {
            result = result + ";\n" + temp.data;
            temp = temp.next;
        }
        return result;
    }

    public void removeLoc(String key) {
        // fix position
        int position = search(key);
        if (position < 0) {
            position = 0;
        }

        if (position >= length) {
            position = length - 1;
        }

        // if nothing in the list, do nothing
        if (head != null) {

            // if removing the head element...
            if (position == 0) {
                head = head.next;
            } // else advance to the correct position and remove
            else {
                Nodest temp = head;
                for (int i = 1; i < position; i += 1) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
            // reduce the length of the list
            length -= 1;
        }
    }

int search( String key) {
    Nodest current = head;
    int i=0;
    while (current != null) {
      if (current.data.contains(key))
      current = current.next;
      i++;
      return i;
    }
    return i;
  }
}
