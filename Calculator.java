import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator{
    public static void main(String[] args){
        StringBuilder input = new StringBuilder();
        JFrame frame = new JFrame("calculator");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(375,600);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(30,30,30));

        //output screen 
        JTextField output = new JTextField("0.");
        output.setBounds(0, 30, 350, 100);
        output.setEditable(false);//cant type
        output.setBackground(new Color(43,43,43 ));
        output.setForeground(Color.WHITE);
        output.setHorizontalAlignment(JTextField.RIGHT);
        output.setFont(new Font("Arial",Font.BOLD,28));

        //button1
        JButton b1 = new JButton("1");
        b1.setBounds(0, 420, 70 ,   70);
        b1.setBackground(new Color(45,45,45));
        b1.setForeground(Color.white);
        b1.setFont(new Font("Arial",Font.BOLD,26));
        b1.addActionListener(e -> {
            input.append("1");
            output.setText(input.toString());
        });

        //button2
        JButton b2 = new JButton("2");
        b2.setBounds(70, 420, 70 ,   70);
        b2.setBackground(new Color(45,45,45));
        b2.setForeground(Color.white);
        b2.setFont(new Font("Arial",Font.BOLD,26));
        b2.addActionListener(e -> {
            input.append("2");
            output.setText(input.toString());
        });

        //button3
        JButton b3 = new JButton("3");
        b3.setBounds(140, 420, 70 ,   70);
        b3.setBackground(new Color(45,45,45));
        b3.setForeground(Color.white);
        b3.setFont(new Font("Arial",Font.BOLD,26));

        //button4
        JButton b4 = new JButton("4");
        b4.setBounds(0, 350, 70 ,   70);
        b4.setBackground(new Color(45,45,45));
        b4.setForeground(Color.white);
        b4.setFont(new Font("Arial",Font.BOLD,26));

        //button5
        JButton b5 = new JButton("5");
        b5.setBounds(70, 350, 70 ,   70);
        b5.setBackground(new Color(45,45,45));
        b5.setForeground(Color.white);
        b5.setFont(new Font("Arial",Font.BOLD,26));

        //button6
        JButton b6 = new JButton("6");
        b6.setBounds(140, 350, 70 ,   70);
        b6.setBackground(new Color(45,45,45));
        b6.setForeground(Color.white);
        b6.setFont(new Font("Arial",Font.BOLD,26));

        //button7
        JButton b7 = new JButton("7");
        b7.setBounds(0, 280, 70 ,   70);
        b7.setBackground(new Color(45,45,45));
        b7.setForeground(Color.white);
        b7.setFont(new Font("Arial",Font.BOLD,26));

        //button8
        JButton b8 = new JButton("8");
        b8.setBounds(70, 280, 70 ,   70);
        b8.setBackground(new Color(45,45,45));
        b8.setForeground(Color.white);
        b8.setFont(new Font("Arial",Font.BOLD,26));

        //button9
        JButton b9 = new JButton("9");
        b9.setBounds(140, 280, 70 ,   70);
        b9.setBackground(new Color(45,45,45));
        b9.setForeground(Color.white);
        b9.setFont(new Font("Arial",Font.BOLD,26));
        
        //botton 0
        JButton b0 = new JButton("0");
                b0.setBounds(0 , 490, 140 ,   70);
                b0.setBackground(new Color(45,45,45));
                b0.setForeground(Color.white);
                b0.setFont(new Font("Arial",Font.BOLD,27));

        //buttonDOt
        JButton dot = new JButton(".");
        dot.setBounds(140, 490, 70 ,   70);
        dot.setBackground(new Color(45,45,45));
        dot.setForeground(Color.white);
        dot.setFont(new Font("Arial",Font.BOLD,26));

        //Equals
        JButton Equals = new JButton("=");
        Equals.setBounds(210, 490, 70 ,   70);
        Equals.setBackground(new Color(0 ,120,215));
        Equals.setForeground(Color.white);
        Equals.setFont(new Font("Arial",Font.BOLD,26));

        

        // adding components to frame
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b0);
        frame.add(dot);
        frame.add(Equals);

        frame.add(output);
        frame.setVisible(true);
    }
}