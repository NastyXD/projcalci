import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class calculator implements ActionListener {

    JLabel display;
    JButton one, two, three, four, five, six, seven, eight, nine, zero;
    JButton plus, sub, mul, division, equal, decimal, clear;
    boolean isOPclicked ,isOPclickedplus,isOPclickedsub,isOPclickedmul,isOPclickeddivision=false;
    String oldvalue,newvalue;
    float oldvalueF, newvalueF, resultaddF,resultsubF,resultmulF,resultdivisionF;


    public calculator() {

        JFrame frame = new JFrame("Calculator");
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JLabel();
        display.setBounds(10, 5, 550, 70);
        display.setBackground(Color.LIGHT_GRAY);
        display.setOpaque(true);
        display.setHorizontalAlignment(4);  //SwingConstants.RIGHT kku podalam argument laa
        frame.add(display);

        seven = new JButton("7");
        seven.setBounds(10, 80, 100, 100);
        seven.addActionListener(this);
        frame.add(seven);

        eight = new JButton("8");
        eight.setBounds(120, 80, 100, 100);
        eight.addActionListener(this);
        frame.add(eight);

        nine = new JButton("9");
        nine.setBounds(230, 80, 100, 100);
        nine.addActionListener(this);
        frame.add(nine);

        four = new JButton("4");
        four.setBounds(10, 190, 100, 100);
        four.addActionListener(this);
        frame.add(four);

        five = new JButton("5");
        five.setBounds(120, 190, 100, 100);
        five.addActionListener(this);
        frame.add(five);

        six = new JButton("6");
        six.setBounds(230, 190, 100, 100);
        six.addActionListener(this);
        frame.add(six);

        one = new JButton("1");
        one.setBounds(10, 300, 100, 100);
        one.addActionListener(this);
        frame.add(one);

        two = new JButton("2");
        two.setBounds(120, 300, 100, 100);
        two.addActionListener(this);
        frame.add(two);

        three = new JButton("3");
        three.setBounds(230, 300, 100, 100);
        three.addActionListener(this);
        frame.add(three);

        zero = new JButton("0");
        zero.setBounds(10, 410, 210, 100);
        zero.addActionListener(this);
        frame.add(zero);

        decimal = new JButton(".");
        decimal.setBounds(230, 410, 100, 100);
        decimal.addActionListener(this);
        frame.add(decimal);

        plus = new JButton("+");
        plus.setBounds(340, 80, 100, 133);
        plus.addActionListener(this);
        frame.add(plus);

        sub = new JButton("-");
        sub.setBounds(340, 233, 100, 133);
        sub.addActionListener(this);
        frame.add(sub);

        equal = new JButton("=");
        equal.setBounds(340, 376, 100, 133);
        equal.addActionListener(this);
        frame.add(equal);

        mul = new JButton("X");
        mul.setBounds(450, 80, 100, 133);
        mul.addActionListener(this);
        frame.add(mul);

        division = new JButton("/");
        division.setBounds(450, 233, 100, 133);
        division.addActionListener(this);
        frame.add(division);

        clear = new JButton("CLR");
        clear.setBounds(450, 376, 100, 133);
        clear.addActionListener(this);
        frame.add(clear);

    }

    public static void main(String[] args) {

        new calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == seven) {
            if (isOPclicked) {
                display.setText("7");
                isOPclicked = false;
            }
            else {
                display.setText(display.getText() + "7");
            }

        }
        else if (e.getSource() == eight) {
            if (isOPclicked) {
                display.setText("8");
                isOPclicked = false;
            }
            else {
                display.setText(display.getText() + "8");
            }

        }
        else if (e.getSource() == nine) {
            if (isOPclicked) {
                display.setText("9");
                isOPclicked = false;
            }
            else {
                display.setText(display.getText() + "9");
            }

        }
        else if (e.getSource() == four) {
            if (isOPclicked) {
                display.setText("4");
                isOPclicked = false;
            }
            else {
                display.setText(display.getText() + "4");
            }

        }
        else if (e.getSource() == five) {
            if (isOPclicked) {
                display.setText("5");
                isOPclicked = false;
            }
            else {
                display.setText(display.getText() + "5");
            }

        }
        else if (e.getSource() == six) {
            if (isOPclicked) {
                display.setText("6");
                isOPclicked = false;
            }
            else {
                display.setText(display.getText() + "6");
            }

        }
        else if (e.getSource() == one) {
            if (isOPclicked) {
                display.setText("1");
                isOPclicked = false;
            }
            else {
                display.setText(display.getText() + "1");
            }

        }
        else if (e.getSource() == two) {
            if (isOPclicked) {
                display.setText("2");
                isOPclicked = false;
            }
            else {
                display.setText(display.getText() + "2");
            }

        }
        else if (e.getSource() == three) {
            if (isOPclicked) {
                display.setText("3");
                isOPclicked = false;
            } else {
                display.setText(display.getText() + "3");
            }

        }
        else if (e.getSource() == zero) {
            if (isOPclicked) {
                display.setText("0");
                isOPclicked = false;
            } else {
                display.setText(display.getText() + "0");
            }

        }
        else if (e.getSource() == plus) {
            oldvalue = display.getText();
            isOPclicked = true;
            isOPclickedplus=true;

        }
        else if (e.getSource() == sub) {
            oldvalue = display.getText();
            isOPclicked = true;
            isOPclickedsub=true;
        }
        else if (e.getSource() == mul) {
            oldvalue = display.getText();
            isOPclicked = true;
            isOPclickedmul=true;

        }
        else if (e.getSource() == division) {
            oldvalue = display.getText();
            isOPclicked = true;
            isOPclickeddivision=true;


        }
        else if (e.getSource() == decimal) {
            if(isOPclicked){
                display.setText(".");
                isOPclicked=false;
            }
            else{
                display.setText(display.getText()+".");
            }

        }
        else if (e.getSource() == equal) {

            newvalue = display.getText();
            oldvalueF = Float.parseFloat(oldvalue);
            newvalueF = Float.parseFloat(newvalue);

            if(isOPclickedplus){
                resultaddF=oldvalueF+newvalueF;
                display.setText(String.valueOf(resultaddF));
                isOPclickedplus=false;
            }
            else  if(isOPclickedsub){
                resultsubF=oldvalueF-newvalueF;
                display.setText(String.valueOf(resultsubF));
                isOPclickedsub=true;
            }
            else if(isOPclickedmul){
                resultmulF=oldvalueF*newvalueF;
                display.setText(String.valueOf(resultmulF));
                isOPclickedmul=true;
            }
            else if(isOPclickeddivision){
                resultdivisionF=oldvalueF/newvalueF;
                display.setText(String.valueOf(resultdivisionF));
                isOPclickeddivision=false;
            }

        }
        else {
            display.setText("");
        }
    }
}