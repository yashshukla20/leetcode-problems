
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;
public class menu {
    menu(){
        JFrame f= new JFrame("menu");
        f.setLayout(new GridLayout(5,1));
        JMenuBar mb=new JMenuBar();
        f.setJMenuBar(mb);

        JMenu menufile= new JMenu("file");
        mb.add(menufile);
        JMenu menuedit= new JMenu("edit");
        mb.add(menuedit);
        JMenu menuview= new JMenu("view");
        mb.add(menuview);

        JMenuItem itemNew= new JMenuItem("new");
        JMenuItem itemopen= new JMenuItem("open");
        JMenuItem itemsave= new JMenuItem("save");
        JMenuItem itemexit= new JMenuItem("exit");
        JMenuItem itemcut= new JMenuItem("cut");
        JMenuItem itemcopy= new JMenuItem("copy");
        JMenuItem itempaste= new JMenuItem("paste");
        JMenuItem Image1= new JMenuItem(new ImageIcon("abc.png"));
        menufile.add (itemNew);
        menufile.add (itemopen);
        menufile.add (itemsave);
        menufile.add (itemexit);
        menuedit.add (itemcut);
        menuedit.add (itemcopy);
        menuedit.add (itempaste);
        menuview.add(Image1);
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String [] args)
    {
        new menu();
    }
}
