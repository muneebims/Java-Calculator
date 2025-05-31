import java.awt.Color;
import java.awt.Font;
import java.security.cert.CertPath;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;


public class Calculator{
    public static void main(String[] args){
        StringBuilder input = new StringBuilder();
        JFrame frame = new JFrame("calculator");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(305,600);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(30,30,30));

        //output screen 
        JTextField output = new JTextField("0.");
        output.setBounds(0, 30, 280, 100);
        output.setEditable(false);//cant type
        output.setBackground(new Color(43,43,43 ));
        output.setForeground(Color.WHITE);
        output.setHorizontalAlignment(JTextField.RIGHT);
        output.setFont(new Font("Arial",Font.BOLD,28));
        output.setBorder(null);

        //button1
        JButton b1 = new JButton("1");
        b1.setBounds(0, 420, 70 ,   70);
        b1.setBackground(new Color(45,45,45));
        b1.setForeground(Color.white);
        b1.setFont(new Font("Arial",Font.BOLD,26));
        b1.setBorder(null);
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
        b2.setBorder(null);
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
        b3.setBorder(null);
        b3.addActionListener(e -> {
            input.append("3");
            output.setText(input.toString());
        });
        
        //button4
        JButton b4 = new JButton("4");
        b4.setBounds(0, 350, 70 ,   70);
        b4.setBackground(new Color(45,45,45));
        b4.setForeground(Color.white);
        b4.setFont(new Font("Arial",Font.BOLD,26));
        b4.setBorder(null);
        b4.addActionListener(e -> {
            input.append("4");
            output.setText(input.toString());
        });
        
        //button5
        JButton b5 = new JButton("5");
        b5.setBounds(70, 350, 70 ,   70);
        b5.setBackground(new Color(45,45,45));
        b5.setForeground(Color.white);
        b5.setFont(new Font("Arial",Font.BOLD,26));
        b5.setBorder(null);
        b5.addActionListener(e -> {
            input.append("5");
            output.setText(input.toString());
        });
        
        //button6
        JButton b6 = new JButton("6");
        b6.setBounds(140, 350, 70 ,   70);
        b6.setBackground(new Color(45,45,45));
        b6.setForeground(Color.white);
        b6.setFont(new Font("Arial",Font.BOLD,26));
        b6.setBorder(null);
        b6.addActionListener(e -> {
            input.append("6");
            output.setText(input.toString());
        });
        
        //button7
        JButton b7 = new JButton("7");
        b7.setBounds(0, 280, 70 ,   70);
        b7.setBackground(new Color(45,45,45));
        b7.setForeground(Color.white);
        b7.setFont(new Font("Arial",Font.BOLD,26));
        b7.setBorder(null);
        b7.addActionListener(e -> {
            input.append("7");
            output.setText(input.toString());
        });
        
        //button8
        JButton b8 = new JButton("8");
        b8.setBounds(70, 280, 70 ,   70);
        b8.setBackground(new Color(45,45,45));
        b8.setForeground(Color.white);
        b8.setFont(new Font("Arial",Font.BOLD,26));
        b8.setBorder(null);
        b8.addActionListener(e -> {
            input.append("8");
            output.setText(input.toString());
        });
        
        //button9
        JButton b9 = new JButton("9");
        b9.setBounds(140, 280, 70 ,   70);
        b9.setBackground(new Color(45,45,45));
        b9.setForeground(Color.white);
        b9.setFont(new Font("Arial",Font.BOLD,26));
        b9.setBorder(null);
        b9.addActionListener(e -> {
            input.append("9");
            output.setText(input.toString());
        });
        
        //botton 0
        JButton b0 = new JButton("0");
        b0.setBounds(0 , 490, 140 ,   70);
        b0.setBackground(new Color(45,45,45));
        b0.setForeground(Color.white);
        b0.setFont(new Font("Arial",Font.BOLD,27));
        b0.setBorder(null);
        b0.addActionListener(e -> {
            input.append("0");
            output.setText(input.toString());
        });
        
        //buttonDOt
        JButton dot = new JButton(".");
        dot.setBounds(140, 490, 70 ,   70);
        dot.setBackground(new Color(45,45,45));
        dot.setForeground(Color.white);
        dot.setFont(new Font("Arial",Font.BOLD,26));
        dot.addActionListener(e -> {
            input.append(".");
            output.setText(input.toString());
        });
        
        //Equals
        JButton Equals = new JButton("=");
        Equals.setBounds(210, 490, 70 ,   70);
        Equals.setBackground(new Color(0 ,120,215));
        Equals.setForeground(Color.white);
        Equals.setFont(new Font("Arial",Font.BOLD,26));
        Equals.addActionListener(e->{
            try{
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaSxript");
                Object result =  engine.eval(input.toString());
                input.setLength(0);
                }catch(Exception ex){
                    output.setText("Error");
                }
        });        

        //add button
        JButton add = new JButton("+");
        add.setBounds(210,420,70,70);
        add.setBackground(Color.orange);
        add.setFont(new Font("Arial",Font.BOLD,28));
        add.setForeground(Color.white);
        add.addActionListener(e->{
            
        });

        //sub button
        JButton Sub = new JButton("-");
        Sub.setBounds(210,350,70,70);
        Sub.setBackground(Color.RED);
        Sub.setFont(new Font("Arial",Font.BOLD,28));
        Sub.setForeground(Color.white);
        Sub.addActionListener(e->{
            
        });


        //product button
        JButton Pr = new JButton("*");
        Pr.setBounds(210,280,70,70);
        Pr.setBackground(Color.DARK_GRAY);
        Pr.setFont(new Font("Arial",Font.BOLD,28));
        Pr.setForeground(Color.RED);
        Pr.addActionListener(e->{
            
        });


        //div button
        JButton Div = new JButton("/");
        Div.setBounds(70,210,70,70);
        Div.setBackground(Color.RED);
        Div.setFont(new Font("Arial",Font.BOLD,28));
        Div.setForeground(Color.white);
        Div.addActionListener(e->{
            
        });
        
        // Clear Button
        JButton C = new JButton("C");
        C.setBounds(140,210,70,70);
        C.setBackground(Color.RED);
        C.setFont(new Font("Arial",Font.BOLD,28));
        C.setForeground(Color.white);
        C.addActionListener(e->{
            
        });

        //remove button
        JButton re = new JButton("<-");
        re.setBounds(210,210,70,70);
        re.setBackground(Color.RED);
        re.setFont(new Font("Arial",Font.BOLD,28));
        re.setForeground(Color.white);
        re.addActionListener(e->{
            
        });

        //button percentage
        JButton prc = new JButton("%");
        prc.setBackground(Color.DARK_GRAY);
        prc.setForeground(Color.white);
        prc.setBounds(0,210,70,70);
        prc.setFont(new Font("Arial",Font.BOLD,26));
        prc.setBorder(null);
        prc.addActionListener(e->{
            input.append("%");
            output.setText(input.toString());
        });





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
        frame.add(add);
        frame.add(Sub);
        frame.add(Div);
        frame.add(Pr);
        frame.add(C);
        frame.add(re);
        frame.add(prc);

        frame.add(output);
        frame.setVisible(true);
    }
}
