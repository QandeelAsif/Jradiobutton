package gui_jradiobutton;

import java.awt.*;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;


public class radioButtonClass extends JFrame {
    
    private JTextField tf;
    private JRadioButton plain_b;
    private JRadioButton bold_b;
    private JRadioButton italic_b;
    private JRadioButton bi_b;  //bold and italic button
    private ButtonGroup group;
    private Font pf; //plain font
    private Font bf;
    private Font itf; //italicfont
    private Font bif;  //bold and italic font
    
    
    public radioButtonClass()
    {
        setTitle("radioButtons");
        setLayout(new FlowLayout());
        
        tf=new JTextField("DUDE!!! WTF", 20);
        add(tf);
        
        plain_b= new JRadioButton("plain",true);  //for radio buttons one needs to be true so when they are grouped it unchecks all except one
        bold_b= new JRadioButton("bold",false);
        italic_b= new JRadioButton("italic",false);
        bi_b= new JRadioButton("bold&italic",false);
        add(plain_b);
        add(bold_b);
        add(italic_b);
        add(bi_b);
        
        //needed to create a family so that each one knows who is checked/unchecked
        group= new ButtonGroup(); 
        group.add(plain_b);  //group.add as its being added to group only
        group.add(bold_b);
        group.add(italic_b);
        group.add(bi_b);
        
        
        //to create fonts that will be passsed directly as an object to handler class
        pf= new Font("Serif",Font.PLAIN,15);
        bf= new Font("Serif",Font.BOLD,15);
        itf= new Font("Serif",Font.ITALIC,15);
        bif= new Font("Serif",Font.BOLD+Font.ITALIC,15);
        tf.setFont(pf);  //setting initial font for the text field
        
        //waits for event and directly pass object(Of font) to cnstructor 
        plain_b.addItemListener(new Handler(pf));
        bold_b.addItemListener(new Handler(bf));
        italic_b.addItemListener(new Handler(itf));
        bi_b.addItemListener(new Handler(bif));
    }
    
    private class Handler implements ItemListener{
        private Font font_var; //creates a private member of class to set incoming object equal to 
          
        //theconstructor
        public Handler(Font f)
        {
            font_var=f;   //sets font as font button selected
        }
        public void itemStateChanged(ItemEvent event)
        {
            tf.setFont(font_var);
        }
    }
  
    
}
