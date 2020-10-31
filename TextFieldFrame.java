package textfieldtest;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class TextFieldFrame extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField;
    
    
public TextFieldFrame(){
    super("Olá coloque seu dados e senha :");
    setLayout( new FlowLayout());
    
     JLabel X = new JLabel("APERTE ENTER PARA CONFERIR SUAS RESPOSTAS");
  add(X);
    
        JLabel usuario = new JLabel("Nome: ");
  add(usuario);

    textField1 = new JTextField( 10 );
    add( textField1 );
    
    JLabel z = new JLabel("                ");
  add(z);

    
    textField2 = new JTextField("Seu estado :",10);
    add ( textField2 );
    
    textField3 = new JTextField("Está opção está desativada...", 21);
    textField3.setEditable( false);
    add( textField3 );
    
     JLabel senha = new JLabel("               Senha : ");
  add(senha);
    
    passwordField = new JPasswordField("",10);
    add( passwordField );
    
        JButton login = new JButton("Entrar");
        login.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == login)
     
      JOptionPane.showMessageDialog(null, "Você entrou turururu puff");
     
    
   }
   }
  );
  add(login);
    
    TextFieldHandler handler = new TextFieldHandler();
    textField1.addActionListener( handler );
    textField2.addActionListener( handler );
    textField3.addActionListener( handler );
    passwordField.addActionListener( handler );
        
}

private class TextFieldHandler implements ActionListener{
    
    @Override
    public void actionPerformed( ActionEvent event ){
        String string = "";
        
        if(event.getSource() == textField1)
            string = String.format("Seu nome é : %s", event.getActionCommand());
        else if (event.getSource()==textField2)
            string = String.format("Seu estado é : %s", event.getActionCommand());
        else if (event.getSource()== textField3)
            string = String.format ("textField3: %s", event.getActionCommand());
        else if(event.getSource()==passwordField)
            string = String.format("Sua senha é : %s", event.getActionCommand());
           
           JOptionPane.showMessageDialog(null,string);
           
               
           
    }
}
        

    
   
        
    }