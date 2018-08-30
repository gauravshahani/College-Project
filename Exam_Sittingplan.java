import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam_Sittingplan implements ActionListener {
    Exam_Sittingplan()
    {
        gui();
    }
    public void actionPerformed(ActionEvent e) {
        gui2();




    }
    public static void main(String... s)
    {
        new Exam_Sittingplan();
    }
    void gui()
    {
        JFrame f1=new JFrame("Exam Sitting plan");
        f1.setSize(500,500);
        f1.setVisible(true);
        JMenuBar mb=new JMenuBar();
        JMenu menu=new JMenu("Room");
        JMenuItem i1=new JMenuItem("Add Room");
        JMenuItem i2=new JMenuItem("View Room");
        JMenu menu2=new JMenu("Lecturer");
        JMenuItem i3=new JMenuItem("Add Lecturer");
        JMenuItem i4=new JMenuItem("View Lecturer");
        JMenu menu3=new JMenu("Plan");
        JMenuItem i5=new JMenuItem("Create Seat plan");
        JMenuItem i6=new JMenuItem("View Seat plan");
        menu.add(i1);
        menu.add(i2);
        menu2.add(i3);
        menu2.add(i4);
        menu3.add(i5);
        menu3.add(i6);
        mb.add(menu);
        mb.add(menu2);
        mb.add(menu3);
        i1.addActionListener(this);
        f1.setLayout(null);
        f1.setJMenuBar(mb);
    }
void gui2()
{
    JFrame room = new JFrame();
    room.setSize(500,500);
    Font font = new Font("Courier", Font.BOLD, 15);
    JTextField textfield = new JTextField(20);
    textfield.setSize(80, 30);
    textfield.setLocation(220, 70);
    JTextField textfield2 = new JTextField(20);
    textfield2.setSize(80, 30);
    textfield2.setLocation(220, 121);
    JTextField textfield3 = new JTextField(20);
    textfield3.setSize(80, 30);
    textfield3.setLocation(220, 178);
    JLabel label1 = new JLabel("Enter Room Number");
    label1.setLocation(30, 30);
    label1.setSize(400, 100);
    label1.setFont(font);
    JLabel label2 = new JLabel("Enter The Seat Rows");
    label2.setLocation(30, 85);
    label2.setSize(400, 100);
    label2.setFont(font);
    JLabel label3= new JLabel("Enter The Seat Columns");
    label3.setLocation(30, 110);
    label3.setSize(400, 170);
    label3.setFont(font);
    JButton b1=new JButton("Submit");
    b1.setBounds(220,250,95,30);
    room.add(label1);
    room.add(label2);
    room.add(label3);
    room.add(textfield);
    room.add(textfield2);
    room.add(textfield3);
    room.add(b1);
    room.setLayout(null);
    room.setVisible(true);
}
}
