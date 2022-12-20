package javaGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class InventoryDetails extends JFrame {
    Label l1,l2,l3,l4;
    JTextField t1,t2,t3;
    Choice c;
    TextArea area;
    InventoryDetails(){


        // adding labels and text fields
        l1 = new Label("Product ID");
        l1.setBounds(50,100,150,20);

        l2 = new Label("Product Name");
        l2.setBounds(50,150,150,20);

        l3 = new Label("Quantity");
        l3.setBounds(50,200,150,20);

        l4 = new Label("Location");
        l4.setBounds(50,250,150,20);

        t1 = new JTextField();
        t1.setBounds(250,100,250,30);

        t2 = new JTextField();
        t2.setBounds(250,150,250,30);

        t3 = new JTextField();
        t3.setBounds(250,200,250,30);

        c = new Choice();
        c.setBounds(250,250,250,30);
        c.setVisible(true);

        c.add("Warehouse1");
        c.add("Warehouse2");
        c.add("Warehouse3");
        c.add("Warehouse4");
        add(c);

//        t4 = new JTextField();
//        t4.setBounds(250,250,250,30);

        // adding components to the frame
        add(l1); add(l2); add(l3); add(l4);
        add(t1); add(t2); add(t3);

        // Adding button
        JButton add_button = new JButton("Add items");
        add_button.setBounds(50,325,150,30);
        add(add_button);

        // creating text area for all details
        area = new TextArea();
        area.setBounds(50,400,450,120);
        add(area);
        area.setVisible(true);

        // Action Listner
        add_button.addActionListener(new myActionListner());

        // layout of window
        setSize(800,600);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        InventoryDetails frame = new InventoryDetails();
    }
    class myActionListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            String s = "";
            s = area.getText();
            area.setText(s+"\n Product Id :"+t1.getText()+"\n"+
            "Product Name: "+t2.getText()+"\n"+
            "Quantity: "+t3.getText()+"\n"+
           "Location: "+c.getSelectedItem()+"\n");

            t1.setText("");
            t2.setText("");
            t3.setText("");

            // Creating file and  Writing in file
            if(c.getSelectedItem().equals("Warehouse1")){
                File file = new File("Warehouse1.txt");
                System.out.println("This is working + "+area.getText());
                try {
                    file.createNewFile();
                    FileWriter fw = new FileWriter("Warehouse1.txt",true);
                    fw.write(area.getText());
                    fw.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            else if (c.getSelectedItem().equals("Warehouse2")) {
                File file = new File("Warehouse2.txt");
                System.out.println("This is working + "+area.getText());
                try {
                    file.createNewFile();
                    FileWriter fw = new FileWriter("Warehouse2.txt",true);
                    fw.write(area.getText());
                    fw.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            } else if (c.getSelectedItem().equals("Warehouse3")) {
                File file = new File("Warehouse3.txt");
                System.out.println("This is working + "+area.getText());
                try {
                    file.createNewFile();
                    FileWriter fw = new FileWriter("Warehouse3.txt",true);
                    fw.write(area.getText());
                    fw.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            } else if (c.getSelectedItem().equals("Warehouse4")) {
                File file = new File("Warehouse4.txt");
                System.out.println("This is working + "+area.getText());
                try {
                    file.createNewFile();
                    FileWriter fw = new FileWriter("Warehouse4.txt",true);
                    fw.write(area.getText());
                    fw.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
