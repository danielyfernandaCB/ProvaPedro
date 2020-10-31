package checkboxtest;

import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CheckBoxFrame extends JFrame {
    
    private JTextField textField;
    private JCheckBox boldJCheckBox;
    private JCheckBox italicJCheckBox;
    private JCheckBox corCheckBox;
    
    
    public CheckBoxFrame(){
        
        super("Escreva seu texto :");
        setLayout(new FlowLayout());
        
        JLabel X = new JLabel("ESCREVA SEU TEXTO :");
  add(X);

        
        textField = new JTextField("Conte algo...", 20);
        textField.setFont(new Font("Serif", Font.PLAIN , 14));
        add(textField);
        
        boldJCheckBox = new JCheckBox("Negrito");
        italicJCheckBox = new JCheckBox("Itálico");
        corCheckBox = new JCheckBox ("Fundo colorido");
        add(corCheckBox); 
        add(boldJCheckBox);
        add(italicJCheckBox);
        
        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckBox.addItemListener(handler);
        italicJCheckBox.addItemListener(handler);
        corCheckBox.addItemListener(handler);
        
        JButton login = new JButton("Enviar");
        login.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == login)
     
      JOptionPane.showMessageDialog(null, "Você enviou parabéns !!!!!");
     
    
   }
   }
  );
  add(login);

        
    }
    private class CheckBoxHandler implements ItemListener{
        public void itemStateChanged(ItemEvent event){
            Font font = null;
            Color cor = null;

            if(boldJCheckBox.isSelected()&& italicJCheckBox.isSelected() && corCheckBox.isSelected() ){
               font = new Font("Serif", Font.BOLD + Font.ITALIC, 14); 
               cor = (Color.CYAN);
               
            }else if(boldJCheckBox.isSelected()&& corCheckBox.isSelected()){
                 font = new Font("Serif", Font.BOLD, 14);
                 cor = (Color.CYAN);
                
            }else if(italicJCheckBox.isSelected() && corCheckBox.isSelected()){  
                font = new Font("Serif", Font.ITALIC, 14);
                cor = (Color.CYAN);
                
            }else if (boldJCheckBox.isSelected()&& italicJCheckBox.isSelected()){
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14); 

               
            }else if(boldJCheckBox.isSelected()){
                 font = new Font("Serif", Font.BOLD, 14);

            }else if(italicJCheckBox.isSelected()){
                font = new Font("Serif", Font.ITALIC, 14);
                
            }else if (corCheckBox.isSelected()){
                 cor = (Color.CYAN);
                 
            }else{
                font = new Font ("Serif", Font.PLAIN, 14);
            }
            textField.setFont(font);
            textField.setBackground(cor);
            
        }
    }
    
}
