import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverteR
{
    public static void main(String[] args) throws Exception 
    {
        //UI Design Starts

        JFrame frame = new JFrame();

        //adds headline [app name]
        JLabel label = new JLabel("Currency Converter");
        label.setBounds(120,50,320,80);
        label.setFont(new Font("Serif",Font.BOLD,30));
        label.setForeground(new Color(135,206,235));
        frame.add(label);

        String currencylist[] = {"Select Currency",
        "Indian Rupee [ INR ] ",
        "US Dollar [ USD ] ",
        "Canadian Dollar [ CAD ]",
        "Japanese Yen [ JPY ]",
        "Chinese Yuan [ CNY ]",
        "EURO [ EUR ]",
        "Indonesian Rupiah [ IDR ]",
        "Pakistani Rupee [ PKR ]"};

        //adds label named source currency
        JLabel l1 = new JLabel("Source Currency");
        l1.setBounds(50,160,140,30);
        l1.setFont(new Font("Serif",Font.BOLD,18));
        l1.setForeground(new Color(135,206,235));
        frame.add(l1);

        //adds a dropdown box for list of countries
        JComboBox<String> source = new JComboBox<>(currencylist);
        source.setBounds(50,200,180,40);
        source.setBackground(new Color(204, 204, 255));
        frame.add(source);

        //adds label named target currency
        JLabel l2 = new JLabel("Target Currency");
        l2.setBounds(270,160,140,30);
        l2.setFont(new Font("Serif",Font.BOLD,18));
        l2.setForeground(new Color(135,206,235));
        frame.add(l2);

        //adds a dropdown box for list of countries
        JComboBox<String> target = new JComboBox<>(currencylist);
        target.setBounds(270,200,180,40);
        target.setBackground(new Color(204, 204, 255));
        frame.add(target);

        //adds a text box for getting amount
        JTextField getAmt = new JTextField();
        getAmt.setBounds(50,270,180,40);
        getAmt.setFont(new Font("Serif",Font.BOLD,20));
        getAmt.setBackground(new Color(204, 204, 255));
        frame.add(getAmt);


        //adds a text box for displaying amount
        JTextField showAmt = new JTextField();
        showAmt.setBounds(270,270,180,40);
        showAmt.setFont(new Font("Serif",Font.BOLD,20));
        showAmt.setBackground(new Color(204, 204, 255));
        frame.add(showAmt);

        //convert button
        JButton convertbtn = new JButton("Convert");
        convertbtn.setBounds(210,350,80,40);
        convertbtn.setBackground(new Color(0, 255, 0));
        frame.add(convertbtn);

        //adds a label for error message
        JLabel errormsg = new JLabel();
        errormsg.setBounds(130,500,320,40);
        errormsg.setFont(new Font("Serif",Font.ITALIC,20));
        errormsg.setForeground(new Color(255, 0, 0));
        frame.add(errormsg);

        //UI Design Ends

        //Code to convert the currencies.
        convertbtn.addActionListener((ActionListener) new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                //Type conversion to convert the object value into string for comparision and Calculations.
                String src = (String) source.getSelectedItem();
                String tgt = (String) target.getSelectedItem();
                double amt = Double.parseDouble(getAmt.getText());

                if(src == tgt) 
                //Checks whether the From and To selection is same or not
                {
                    errormsg.setText("You've selected same currency.");
                    errormsg.setVisible(true);
                }
                else if(src == "Select Currency" || tgt =="Select Currency")
                 //Checks whether both currencies are selected or not
                {
                    errormsg.setText("Please select currency.");
                    errormsg.setVisible(true);
                }
                else
                {
                    errormsg.setVisible(false); 
                    //Removes error message [if displayed] 
                    if(src == currencylist[1])  
                    {   //FROM INDIAN RUPEES
                        if(tgt == currencylist[2])
                            {   //TO US DOLLAR
                                double newAmt = amt*0.012;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[3])
                            {   //TO CANADIAN DOLLAR
                                double newAmt = amt*0.016;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[4])
                            {   //TO JAPANESE YEN
                                double newAmt = amt*1.77;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[5])
                            {   //TO CHINESE YUAN
                                double newAmt = amt*0.088;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[6])
                            {   //TO EURO
                                double newAmt = amt*0.011;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[7])
                            {   //TO INDONESIAN RUPIAH
                                double newAmt = amt*185.32;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[8])
                            {   //TO PAKISTANI RUPEE
                                double newAmt = amt*3.63;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                    }
                    else if(src == currencylist[2])  
                    {   //FROM US DOLLAR 
                        if(tgt == currencylist[1])
                            {   //TO INDIAN RUPEES
                                double newAmt = amt*82.55;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[3])
                            {   //TO CANADIAN DOLLAR
                                double newAmt = amt*1.36;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[4])
                            {   //TO JAPANESE YEN
                                double newAmt = amt*146.44;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[5])
                            {   //TO CHINESE YUAN
                                double newAmt = amt*7.29;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[6])
                            {   //TO EURO
                                double newAmt = amt*0.93;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[7])
                            {   //TO INDONESIAN RUPIAH
                                double newAmt = amt*15298.00;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[8])
                            {   //TO PAKISTANI RUPEE
                                double newAmt = amt*303.18;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                    }
                    else if(src == currencylist[3])  
                    {   //FROM CANADIAN DOLLAR 
                        if(tgt == currencylist[1])
                            {   //TO INDIAN RUPEES
                                double newAmt = amt*60.65;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[2])
                            {   //TO US DOLLAR
                                double newAmt = amt*0.73;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[4])
                            {   //TO JAPANESE YEN
                                double newAmt = amt*107.59;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[5])
                            {   //TO CHINESE YUAN
                                double newAmt = amt*5.36;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[6])
                            {   //TO EURO
                                double newAmt = amt*0.68;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[7])
                            {   //TO INDONESIAN RUPIAH
                                double newAmt = amt*11239.85;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[8])
                            {   //TO PAKISTANI RUPEE
                                double newAmt = amt*222.76;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                    }
                    else if(src == currencylist[4])  
                    {   //FROM JAPANESE YEN 
                        if(tgt == currencylist[1])
                            {   //TO INDIAN RUPEES
                                double newAmt = amt*0.56;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[2])
                            {   //TO US DOLLAR
                                double newAmt = amt*0.0068;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[3])
                            {   //TO CANADIAN DOLLAR
                                double newAmt = amt*0.0093;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[5])
                            {   //TO CHINESE YUAN
                                double newAmt = amt*0.050;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[6])
                            {   //TO EURO
                                double newAmt = amt*0.0063;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[7])
                            {   //TO INDONESIAN RUPIAH
                                double newAmt = amt*104.47;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[8])
                            {   //TO PAKISTANI RUPEE
                                double newAmt = amt*2.07;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                    }
                    else if(src == currencylist[5])  
                    {   //FROM CHINESE YUAN
                        if(tgt == currencylist[1])
                            {   //TO INDIAN RUPEES
                                double newAmt = amt*11.32;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[2])
                            {   //TO US DOLLAR
                                double newAmt = amt*0.14;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[3])
                            {   //TO CANADIAN DOLLAR
                                double newAmt = amt*0.19;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[4])
                            {   //TO JAPANESE YEN 
                                double newAmt = amt*20.09;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[6])
                            {   //TO EURO
                                double newAmt = amt*0.13;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[7])
                            {   //TO INDONESIAN RUPIAH
                                double newAmt = amt*2098.72;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[8])
                            {   //TO PAKISTANI RUPEE
                                double newAmt = amt*41.59;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                    }
                    else if(src == currencylist[6])  
                    {   //FROM EURO 
                        if(tgt == currencylist[1])
                            {   //TO INDIAN RUPEES
                                double newAmt = amt*89.11;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[2])
                            {   //TO US DOLLAR
                                double newAmt = amt*1.08;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[3])
                            {   //TO CANADIAN DOLLAR
                                double newAmt = amt*1.47;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[4])
                            {   //TO JAPANESE YEN 
                                double newAmt = amt*158.09;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[5])
                            {   //TO CHINESE YUAN
                                double newAmt = amt*7.87;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[7])
                            {   //TO INDONESIAN RUPIAH
                                double newAmt = amt*16514.96;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[8])
                            {   //TO PAKISTANI RUPEE
                                double newAmt = amt*327.30;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                    }
                    else if(src == currencylist[7])  
                    {   //FROM INDONESIAN RUPIAH 
                        if(tgt == currencylist[1])
                            {   //TO INDIAN RUPEES
                                double newAmt = amt*0.0054;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[2])
                            {   //TO US DOLLAR
                                double newAmt = amt*0.000065;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[3])
                            {   //TO CANADIAN DOLLAR
                                double newAmt = amt*0.000089;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[4])
                            {   //TO JAPANESE YEN 
                                double newAmt = amt*0.0096;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[5])
                            {   //TO CHINESE YUAN
                                double newAmt = amt*0.00048;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[6])
                            {   //TO EURO
                                double newAmt = amt*0.000061;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[8])
                            {   //TO PAKISTANI RUPEE
                                double newAmt = amt*0.020;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                    }
                    else if(src == currencylist[8])  
                    {   //FROM PAKISTANI RUPEE
                        if(tgt == currencylist[1])
                            {   //TO INDIAN RUPEES
                                double newAmt = amt*0.27;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[2])
                            {   //TO US DOLLAR
                                double newAmt = amt*0.0033;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[3])
                            {   //TO CANADIAN DOLLAR
                                double newAmt = amt*0.0045;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[4])
                            {   //TO JAPANESE YEN 
                                double newAmt = amt*0.49;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[5])
                            {   //TO CHINESE YUAN
                                double newAmt = amt*0.024;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[6])
                            {   //TO EURO
                                double newAmt = amt*0.0031;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                        else if(tgt == currencylist[7])
                            {   //TO INDONESIAN RUPIAH
                                double newAmt = amt*50.46;
                                showAmt.setText(String.valueOf(newAmt));
                            }
                    }
                }
            }
        });

        //display panel
        frame.getRootPane().setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.CYAN)); //adds Border to App
        frame.setSize(500,580);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);
    }
}
