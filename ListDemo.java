import java.awt.*;
import javax.swing.*;
public class ListDemo extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame("List Demo");
        ListDemo s = new ListDemo();
        JPanel p = new JPanel();
        JLabel lb = new JLabel("Select Day");
        String week[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        JList l = new JList(week);
        l.setSelectedIndex(0);
        p.add(l);
        f.add(p);
        f.setSize(300, 300);
        f.show();
    }
}