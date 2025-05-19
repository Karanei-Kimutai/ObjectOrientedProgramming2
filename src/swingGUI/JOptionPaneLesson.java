package swingGUI;

import javax.swing.*;

public class JOptionPaneLesson {
    //JOptionPane is used to create standard dialog boxes for user interaction
    //These dialog boxes can display messages, request input, or ask for confirmation
    public static void main(String[] args){
        //Message dialog boxes
        JOptionPane.showMessageDialog(null,"Bing Chilling","Karanei",JOptionPane.INFORMATION_MESSAGE);
        //Confirm dialog boxes
        int result=JOptionPane.showConfirmDialog(null,"Are you old enough to vote?","Confirm",JOptionPane.YES_NO_OPTION);
        if(result==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Apply for your voter's card");
        }
        else{
            JOptionPane.showMessageDialog(null,"You are not eligible to vote");
        }

        //Input dialog boxes
        String input=JOptionPane.showInputDialog(null,"Enter your name:");
        JOptionPane.showMessageDialog(null,"Your name is: "+input);

        //Example
        int firstNumber=Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        int secondNumber=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
        JOptionPane.showMessageDialog(null,"The product of "+firstNumber+" and "+secondNumber+" is:"+firstNumber*secondNumber);

    }
}
