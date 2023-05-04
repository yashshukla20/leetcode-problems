import java.awt.*;
import javax.swing.*;

public class Coursereg {
    public static void main(String args[]) {

        JFrame frame = new JFrame();
        frame.setTitle("Course Registration");
        frame.setVisible(true);
        frame.setBounds(500, 100, 500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        JLabel message = new JLabel("Register Courses");
        message.setFont(new Font("Courier", Font.BOLD, 20));
        frame.add(message);
        JLabel nameLabel = new JLabel("Email");
        JLabel course = new JLabel("Courses");
        JCheckBox cb1 = new JCheckBox("Java   4 credits");
        cb1.setBounds(130, 360, 150, 20);
        JCheckBox cb2 = new JCheckBox("DBMS   3 credits");
        cb2.setBounds(130, 410, 150, 20);
        JCheckBox cb3 = new JCheckBox("Python   4 credits");
        cb3.setBounds(130, 460, 150, 20);
        JCheckBox cb4 = new JCheckBox("softskills   3 credits");
        cb4.setBounds(130, 510, 150, 20);

        JTextField nameField = new JTextField();
        frame.add(nameLabel);
        frame.add(nameField);
        JLabel genderLabel = new JLabel("Gender");
        JRadioButton genderMale = new JRadioButton("Male", true);
        JRadioButton genderFemale = new JRadioButton("Female");
        frame.add(genderLabel);
        frame.add(genderMale);
        frame.add(genderFemale);
        frame.add(course);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);
        JLabel mobileNoLabel = new JLabel("Name");
        JTextField mobileNoField = new JTextField();
        frame.add(mobileNoField);
        frame.add(mobileNoLabel);
        frame.add(cb1);
        frame.add(cb2);
        frame.add(cb3);
        frame.add(cb4);
        // JLabel programLabel = new JLabel("Courses");

        JButton registerButton = new JButton("Register");
        frame.add(registerButton);
        message.setBounds(50, 10, 600, 30);
        nameLabel.setBounds(50, 60, 100, 30);
        nameField.setBounds(130, 60, 200, 30);

        mobileNoLabel.setBounds(50, 160, 100, 30);
        mobileNoField.setBounds(130, 160, 200, 30);
        registerButton.setBounds(130, 550, 200, 30);
        genderLabel.setBounds(50, 260, 100, 30);
        genderMale.setBounds(130, 260, 100, 30);
        genderFemale.setBounds(240, 260, 100, 30);
        course.setBounds(50, 360, 100, 30);
    }
}