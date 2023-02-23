import javax.swing.Jframe;
import java.awt.FLowLayout;
import java.awt.event.ActionListener;
import java.awt.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

    public class TextFieldFrame extends JFrame{

        private JTextField textField1;
        private JTextField textField2;
        private JTextField textField3;
        private JPasswordField passwordField;


        public TextFieldFrame(){
            super("Testing JTextField and JpasswordField");
            setLayout(new FLowLayout());
            textField1 = new JTextField(10);
            add(textField1);

            textField2 = new JTextField("Digite o texto aqui");
            add(textField2);

            textField3 = new JTextField("uneditable text field",21);
            textField3.setEditable(false);
            add(textField3);

            passwordField = new JPasswordField("hidden text:");
            add(passwordField);

            TextFieldHandler handler = new TextFieldFrame();
            textField1.addActionListener(handler);
            textField2.addActionListener(handler);
            textField3.addActionListener(handler);
            passwordField.addActionListener(handler);
        }
        private class TextFieldHandler implements ActionListener{
            public void actionPerfomed(java.awt.event.ActionEvent event){
                String string = "";

                if(event.getSource() == textField1)
                string = String.format("textField1: %s",event.getActionCommand());

                else if(event.getSource() == textField2)
                string = String.format("textField2: %s",event.getActionCommand());

                else if(event.getSource() == textField3)
                string = String.format("textField3: %s",event.getActionCommand());

                else if(event.getSource()==passwordField)
                string = String.format("passwordField: %s", event.getActionCommand());

                JOptionPane.showMessageDialog(null,string);
            }
        }
     }
