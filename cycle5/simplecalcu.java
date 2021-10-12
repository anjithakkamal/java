private void button1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
int a ,b, add;
a=Integer.parseInt(textField1.getText());
b=Integer.parseInt(textField2.getText());
add =a+b;
textField3.setText(""+add);        // TODO add your handling code here:
    }                                       

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
int a ,b, SUB;
a=Integer.parseInt(textField1.getText());
b=Integer.parseInt(textField2.getText());
SUB =a-b;
textField3.setText(""+SUB);        // TODO add your handling code here:
    }                                       

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
int a ,b, MUL;
a=Integer.parseInt(textField1.getText());
b=Integer.parseInt(textField2.getText());
MUL =a*b;
textField3.setText(""+MUL);        // TODO add your handling code here:
    }                                       

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
    int a ,b, DIV;
a=Integer.parseInt(textField1.getText());
b=Integer.parseInt(textField2.getText());
DIV =a/b;
textField3.setText(""+DIV);    // TODO add your handling code here:
    }                                       
