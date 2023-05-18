import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class treeDemo2 {
    JFrame f;

    treeDemo2() {
        f = new JFrame();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode left = new DefaultMutableTreeNode("Left");
        DefaultMutableTreeNode right = new DefaultMutableTreeNode("Right");
        root.add(left);
        root.add(right);
        JTree tree = new JTree(root);
        f.add(tree);
        f.setSize(200, 200);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new treeDemo2();
    }
}