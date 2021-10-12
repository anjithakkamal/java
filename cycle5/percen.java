 private void button1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
    float s1,s2,s3,s4,s5,sum,avg;
   s1=Integer.parseInt(textField1.getText());
   s2=Integer.parseInt(textField2.getText());
   s3=Integer.parseInt(textField3.getText());
   s4=Integer.parseInt(textField4.getText());
   s5=Integer.parseInt(textField5.getText());
   sum=(s1+s2+s3+s4+s5)/500;
   avg=sum*100;
   textField6.setText(""+avg);
   ImageIcon image1;
   if(avg>50)
   {
       image1 = new ImageIcon("C:\\Users\\student.MCALAB\\Desktop\\happy.png");
   }
   else
   {
     image1 = new ImageIcon("C:\\Users\\student.MCALAB\\Downloads\\sad.png");  
   }
   jLabel1.setIcon(image1);

    }                                       
