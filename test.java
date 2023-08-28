/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_ds.a;

/**
 *
 * @author khali
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       LinkListst ap = new LinkListst ();
       ap.insertAtEnd("my name is muhammad khalil ashraf engineering");
       ap.insertAtEnd("khalilashraf28@gmail.com");
       ap.insertAtEnd("doing computer engineering");
//ap.search("engineering");
System.out.println(ap.toString());
ap.removeLoc("khalilashraf28@gmail.com");
System.out.println(ap.toString());
    }
    
}
