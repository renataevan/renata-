 // figura 14.15 buttonFrame.java 
// criando jButtons.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame
{
    private JButton plainJButton;
    private JButton fancyJButton;
    
 public ButtonFrame()
 {
   super("lesting Buttons");
   setLayout( new FlowLayout());
   
  plainJButton = new JButton("plaind Button");
  add(plainJButton);
  
  Icon bug1 = new ImageIcon( getClass().getResource("bug1.gif"));
  Icon bug2 = new Imagelcon( getClass().getResource("bug2.gif"));
  fancyJButton = new JButton("Fancy BUtton", Bug1 );
  fancyJButton.setRolloverIcon(bug2);
  add(fancyJButton);
  
  ButtonHandler handler = new ButtonHandler();
 fancyJButton.addActionListener( handler );
 plainJButton.addActionListener( handler );
}

private class ButtonHandler implements ActionListener
{
    
  public void actionPerformed( ActionEvent event)
{
  JOptionPane.showMessageDialog( ButtonFrame.this,String.format(
   "you pressed: %s", event.getActionCommand() ) );
 
}