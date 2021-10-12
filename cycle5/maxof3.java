
public class frame2 extends javax.swing.JFrame {

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
     int n1,n2,n3;
                n1 = Integer.parseInt(textField1.getText());
                n2 = Integer.parseInt(textField2.getText());
                n3 = Integer.parseInt(textField3.getText());
                if(n1 > n2 && n1> n3)
                {
                   textField4 .setText(""+n1);
                }
                else if (n2 > n1 && n2> n3)
                {
                    textField4 .setText(""+n2);
                }
                else
                {
                    textField4.setText(""+n3);
                
    }                
