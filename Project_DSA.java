/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_ds.a;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author khali
 */
public class Project_DSA {

    public static String name, email, Data, phoneno, depart;
    public static int inter, test, aggregate;
    static LinkListst data = new LinkListst();
    static LinkListst te = new LinkListst();
    static LinkListst ce = new LinkListst();
    static LinkListst ee = new LinkListst();
    static LinkListst cv = new LinkListst();
    static LinkListst se = new LinkListst();
    static LinkListst cs = new LinkListst();
    static LinkListst bm = new LinkListst();
    static LinkListst arch = new LinkListst();
    static LinkListst cse = new LinkListst();

    public void form() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Email: ");
        email = sc.nextLine();
        System.out.println("Phone #: ");
        phoneno = sc.nextLine();
        System.out.println("Intermediate percentage: ");
        inter = sc.nextInt();
        System.out.println("Entry Test Result: ");
        test = sc.nextInt();
        aggregate = (inter + test) / 2;

    }

    public void Engineering() {
        if (aggregate >= 60 && aggregate < 70) {
            te.insertAtEnd("Name: " + name + " - Email: " + email + " - Phoneno: " + phoneno + " - Intermediate%: " + inter + " - Entry Test result: " + test + " - Total Aggregate: " + aggregate);
            depart = "You got admission in Telecommunication Engineering\n";
        } else if (aggregate >= 70 && aggregate < 80) {
            depart = "You got admission in Computer Engineering\n";
            ce.insertAtEnd("Name: " + name + " - Email: " + email + " - Phoneno: " + phoneno + " - Intermediate%: " + inter + " - Entry Test result: " + test + " - Total Aggregate: " + aggregate);
        } else if (aggregate >= 80 && aggregate <= 85) {
            depart = "You got admission in Electrical Engineering\n";
            ee.insertAtEnd("Name: " + name + " - Email: " + email + " - Phoneno: " + phoneno + " - Intermediate%: " + inter + " - Entry Test result: " + test + " - Total Aggregate: " + aggregate);
        } else if (aggregate > 85) {
            depart = "You got admission in Civil Engineering\n";
            cv.insertAtEnd("Name: " + name + " - Email: " + email + " - Phoneno: " + phoneno + " - Intermediate%: " + inter + " - Entry Test result: " + test + " - Total Aggregate: " + aggregate);
        }
        Data = (depart + "Name: " + name + " - Email: " + email + " - Phoneno: " + phoneno + " - Intermediate%: " + inter + " - Entry Test result: " + test + " - Total Aggregate: " + aggregate);
        data.insertAtEnd(Data);
    }

    public void NonEngineering() {
        if (aggregate >= 55 && aggregate < 65) {
            depart = "You got admission in BioMedical\n";
            bm.insertAtEnd("Name: " + name + " - Email: " + email + " - Phoneno: " + phoneno + " - Intermediate%: " + inter + " - Entry Test result: " + test + " - Total Aggregate: " + aggregate);
        } else if (aggregate >= 65 && aggregate < 75) {
            depart = "You got admission in Architecture\n";
            arch.insertAtEnd("Name: " + name + " - Email: " + email + " - Phoneno: " + phoneno + " - Intermediate%: " + inter + " - Entry Test result: " + test + " - Total Aggregate: " + aggregate);
        } else if (aggregate >= 75 && aggregate <= 85) {
            depart = "You got admission in Computer Science\n";
            cs.insertAtEnd("Name: " + name + " - Email: " + email + " - Phoneno: " + phoneno + " - Intermediate%: " + inter + " - Entry Test result: " + test + " - Total Aggregate: " + aggregate);
        } else if (aggregate > 85) {
            depart = "You got admission in Software Engineering\n";
            se.insertAtEnd("Name: " + name + " - Email: " + email + " - Phoneno: " + phoneno + " - Intermediate%: " + inter + " - Entry Test result: " + test + " - Total Aggregate: " + aggregate);
        } else if (aggregate < 55) {
            depart = "You got admission in Cyber Security\n";
            cse.insertAtEnd("Name: " + name + " - Email: " + email + " - Phoneno: " + phoneno + " - Intermediate%: " + inter + " - Entry Test result: " + test + " - Total Aggregate: " + aggregate);
        }
        Data = (depart + "Name: " + name + " - Email: " + email + " - Phoneno: " + phoneno + " - Intermediate%: " + inter + " - Entry Test result: " + test + " - Total Aggregate: " + aggregate);
        data.insertAtEnd(Data);
    }

    public void checkEngineering() {
        Scanner sc = new Scanner(System.in);
        if (aggregate >= 60) {
            System.out.println("You are eligible for both Engineering and Non-Engineering");
            System.out.println("1)Engineering\n2)Non-Engineering");
            int select = sc.nextInt();
            switch (select) {
                case 1: {
                    Engineering();
                    break;
                }
                case 2: {
                    NonEngineering();
                    break;
                }
            }

        } else if (aggregate < 60) {
            NonEngineering();
        }
    }

    public void write(String name, String data) {
        try {
            File file = new File(name);

            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter myfilewriter = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(myfilewriter);
            bw.write(data);
            bw.close();
        } catch (IOException ex) {
            System.out.println("some problem occur :(");
        }

    }

    public void read(String name) {
        File fi = new File(name);
        try {
            Scanner sc = new Scanner(fi);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Some problem occur :(");
        }
    }

    public void delete(String name) {
        File fi = new File(name);
        if (fi.delete()) {
            System.out.println(fi.getName()+" succefully deleted :)");
        } else {
            System.out.println(fi.getName()+" have some problem occur :(");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Project_DSA da = new Project_DSA();
        Scanner sc = new Scanner(System.in);
        System.out.println("***************************************************\nUniversity Admission on the basis of students marks\n***************************************************");
        while (true) {
            System.out.println("1)Registration\n2)List Data\n3)Printing data\n4)Delete data form list\n5)Delete files\n6)Exit");
            int menu = sc.nextInt();
            if (menu == 1) {
                da.form();
                da.checkEngineering();

                System.out.println(name.toUpperCase() + " " + depart);
            } else if (menu == 3) {
                System.out.println("Select Which type of saved data do you want to check\n0)All Registration\n1)Civil Engineering\n2)Computer Engineering\n3)Electrical Engineering\n4)Telecommunication Engineering\n5)Software Engineering\n6)Computer Science\n7)Biomedical Science\n8)Architecture\n9)Cyber Security");
                int i = sc.nextInt();
                if (i == 0) {
                    da.read("Registration.doc");
                } else if (i == 1) {
                    da.read("Civil.doc");
                } else if (i == 2) {
                    da.read("ComputerEng.doc");
                } else if (i == 3) {
                    da.read("Electrical.doc");
                } else if (i == 4) {
                    da.read("telecome.doc");
                } else if (i == 5) {
                    da.read("software.doc");
                } else if (i == 6) {
                    da.read("computerscience.doc");
                } else if (i == 7) {
                    da.read("Biomedical.doc");
                } else if (i == 8) {
                    da.read("architecture.doc");
                } else if (i == 9) {
                    da.read("cybersecurity.doc");
                }
            } else if (menu == 2) {
                System.out.println("Check current data in linkedlist\n0)All Registration\n1)Civil Engineering\n2)Computer Engineering\n3)Electrical Engineering\n4)Telecommunication Engineering\n5)Software Engineering\n6)Computer Science\n7)Biomedical Science\n8)Architecture\n9)Cyber Security");
                int i = sc.nextInt();
                if (i == 0) {
                    System.out.println(data.toString());
                } else if (i == 1) {
                    System.out.println(cv.toString());
                } else if (i == 2) {
                    System.out.println(ce.toString());
                } else if (i == 3) {
                    System.out.println(ee.toString());
                } else if (i == 4) {
                    System.out.println(te.toString());
                } else if (i == 5) {
                    System.out.println(se.toString());
                } else if (i == 6) {
                    System.out.println(cs.toString());
                } else if (i == 7) {
                    System.out.println(bm.toString());
                } else if (i == 8) {
                    System.out.println(arch.toString());
                } else if (i == 9) {
                    System.out.println(cse.toString());
                }
            } else if (menu == 4) {
                System.out.println("Enter email or phone no:");
                String m = sc.next();
                data.removeLoc(m);
                se.removeLoc(m);
                ce.removeLoc(m);
                ee.removeLoc(m);
                cv.removeLoc(m);
                te.removeLoc(m);
                cs.removeLoc(m);
                arch.removeLoc(m);
                bm.removeLoc(m);
                cse.removeLoc(m);

            }else if (menu == 5){
                da.delete("Registration.doc");
                da.delete("computerscience.doc");
                da.delete("cybersecurity.doc");
                da.delete("Biomedical.doc");
                da.delete("architecture.doc");
                da.delete("Civil.doc");
                da.delete("ComputerEng.doc");
                da.delete("Electrical.doc");
                da.delete("telecome.doc");
                da.delete("SoftwareEng.doc");
            } 
            else if (menu == 6) {
                break;
            }

//            System.out.println("Data\n" + Data);
//            System.out.println("if you want to menu again press any key except y");
//            k = sc.next();
//            if (k.equals("y")) {
//                break;
        }
//        }
        System.out.println("Do want to save data press y");
        String j = sc.next();
        if (j.equals("y")) {
            da.write("Registration.doc", data.toString() + "\n");
            da.write("SoftwareEng.doc", se.toString() + "\n");
            da.write("computerscience.doc", cs.toString() + "\n");
            da.write("cybersecurity.doc", cse.toString() + "\n");
            da.write("Biomedical.doc", bm.toString() + "\n");
            da.write("architecture.doc", arch.toString() + "\n");
            da.write("Civil.doc", cv.toString() + "\n");
            da.write("ComputerEng.doc", ce.toString() + "\n");
            da.write("Electrical.doc", ee.toString() + "\n");
            da.write("telecome.doc", te.toString() + "\n");
        }
//        data.search(head, j)
    }
}
