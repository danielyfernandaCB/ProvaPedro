
package buttontest;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ButtonFrame extends JFrame {
    
    private JButton plainJButton;
    private JButton fancyJButton;
    private JButton A;
    private JButton B;
    private JButton C;
    private JTextField p;
    
    
    

    public ButtonFrame(){
        
        super("fg");
        setLayout(new FlowLayout() );
        
        JLabel X = new JLabel("QUAL O SEU NOME ?");
  add(X);
        
       p = new JTextField( 20 );
    add( p );

        JLabel z = new JLabel("QUAL PRINCESA VOCÊ QUER SER ?           ");
  add(z);
    
        plainJButton= new JButton("ELSA");
        add(plainJButton);
        
       fancyJButton = new JButton("MOANA");
        add(fancyJButton);
        
        A = new JButton("MULAN");
        add(A);
        
       B = new JButton("TIANA");
        add(B);
        
         C = new JButton("RAPUNZEL");
        add(C);

        
        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);
        A.addActionListener(handler);
        B.addActionListener(handler);
        C.addActionListener(handler);
        
        }
  
    private class ButtonHandler implements ActionListener{
                  


        String string = null;
        public void actionPerformed(ActionEvent event){
           
            
          if ( p.getText().trim().equals("")  ){
                    JOptionPane.showMessageDialog(ButtonFrame.this, String.format("OPA !! PRECISAMOS DO SEU NOME PARA VC SER UMA PRINCESA "));
                    
                

        
          }else if (event.getSource()==A){
            string = String.format("Parabéns você agora é a ..MULAN.. IAH IAH MATAR MATAR COMER SUSHI");
            JOptionPane.showMessageDialog(null,string);
            
            
          }else if (event.getSource()==B){
            string = String.format ("Parabéns você agora é a ..TIANA.. BEIJAR SABO XUAQUI");
            JOptionPane.showMessageDialog(null,string);
            
          }else if(event.getSource()== C){
            string = String.format("Parabéns você agora é a ..RAPUNZEl.. AIN JOSÉ BEZERRA VOU DAR UMA FRIGIDEIRADA EM TU ");
            JOptionPane.showMessageDialog(null,string);
          
          }else if(event.getSource()== plainJButton){
            string = String.format("Parabéns você agora é a ..ELSA.. LERIGOU LERIGOU NEVE NEVE ");
            JOptionPane.showMessageDialog(null,string);
          }else if(event.getSource()== fancyJButton){
            string = String.format("Parabéns você agora é a ..MOANA.. VAMO PRO MAR  ");
            JOptionPane.showMessageDialog(null,string);
          }
           
           
           
          

            
                
          
            
        }}}

