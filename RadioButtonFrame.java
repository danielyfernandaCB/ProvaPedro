
package radiobuttontest;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class RadioButtonFrame extends JFrame{
    private JTextField textField;
    private Font plainFont;
    private Font boldFont;
    private Font italicFont;
    private Font boldItalicFont;
    private JRadioButton plainJRadioButton;
    private JRadioButton boldJRadioButton;
    private JRadioButton italicJRadioButton;
    private JRadioButton boldItalicJRadioButton;
    private ButtonGroup radioGroup;
    
    public RadioButtonFrame(){
        
        super("Envie uma mensagem:");
        setLayout (new FlowLayout());
        
       

        
       textField = new JTextField("Digite...", 20);
        textField.setFont(new Font("Serif", Font.PLAIN , 14));
        add(textField);
        
               textField.setForeground(Color.WHITE);
               textField.setBackground(Color.BLACK);

        
        plainJRadioButton = new JRadioButton("Simples",true);
        boldJRadioButton= new JRadioButton ("Negrito", false);
        italicJRadioButton= new JRadioButton("italico",false);
        boldItalicJRadioButton= new JRadioButton("Negrito/italico",false);
        add(plainJRadioButton);
        add(boldJRadioButton);
        add(italicJRadioButton);
        add(boldItalicJRadioButton);
        
        JButton login = new JButton("Enviar");
        login.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == login)
     
      JOptionPane.showMessageDialog(null, "MENSAGEM ENVIADA!!!!!");
     
    
   }
   }
  );
  add(login);
        
        radioGroup= new ButtonGroup();
        radioGroup.add(plainJRadioButton);
        radioGroup.add(boldJRadioButton);
        radioGroup.add(italicJRadioButton);
        radioGroup.add(boldItalicJRadioButton);
        
        plainFont = new Font("Serif", Font.PLAIN, 14);
        boldFont = new Font("Serif", Font.BOLD, 14);
        italicFont = new Font("Serif", Font.ITALIC, 14);
        boldItalicFont= new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        textField.setFont(plainFont);
        
        plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
        boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
        italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
        boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
    }
     private class RadioButtonHandler implements ItemListener{
        private  Font font;
        
        public RadioButtonHandler(Font F){
            font = F;
        }
        
        @Override
        public void itemStateChanged(ItemEvent event){
            textField.setFont(font);
      
           }
           
        }
    }
    

