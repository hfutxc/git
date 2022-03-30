import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("hello world");
        JFrame test = new JFrame("test");
        test.setBounds(100,100,400,300);
        JButton b = new JButton("test");
        test.add(b);

        test.setVisible(true);
        test.setAlwaysOnTop(true);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
