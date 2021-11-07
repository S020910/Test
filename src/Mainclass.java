import javax.swing.*;

public class Mainclass {
    public static void main(String[] args){

        JFrame frame = new JFrame();

        frame.add(new MyPanel());
        frame.setBounds(0,0,800,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
