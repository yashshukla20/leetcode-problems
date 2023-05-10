import javax.swing.*;
public class tableDemo extends JFrame {
    JFrame f = new JFrame("Emp Records");
    JTable t;
    tableDemo(){
        String[] collName = {"eid", "ename", "dept"};
        String[][] data = {{"501", "Suman", "CSE"}, {"502", "Aman", "IT"}};
        t = new JTable(data, collName);
        t.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(t);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new tableDemo();
    }
}