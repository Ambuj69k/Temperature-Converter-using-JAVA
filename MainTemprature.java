package TemperatureConverter;

import javax.swing.JFrame;

public class MainTemprature {
public static void main(String[] args) {
   Temperature jf =new Temperature("Temperature Converter");
   jf.setComp();
   jf.setSize(400, 500);
   jf.setVisible(true);
   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }
}
