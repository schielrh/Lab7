import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener {
  JLabel leftlabel;
  JLabel rightLabel;

  int leftCount;
  int rightCount;

  Counter() {
    //this will create the frame
    JFrame frame = new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
    //this will set the size of the frame
    frame.setSize(200,110);

    //this will create the buttons
    JButton left = new JButton("Left");
    JButton right = new JButton("Right");

    //this sets the counts to 0
    leftCount = 0;
    rightCount = 0;

    //adds ALs to the buttons
    left.addActionListener(this);
    right.addActionListener(this);

    //adds buttons to the frame
    frame.add(left);
    frame.add(right);

    //declare and initialize labels
    JLabel leftLabel = new JLabel("Count: " + leftCount);
    JLabel rightLabel = new JLabel("Count: " + rightCount);

    //adds labels to frame
    frame.add(leftLabel);
    frame.add(rightLabel);

    //this creates, adds and sets AL to reset
    JButton reset = new JButton("Reset");
    reset.addActionListener(this);
    frame.add(reset);

    frame.setVisible(true);
  }

 public void actionPerformed(ActionEvent ae) {
  if(ae.getActionCommand().equals("Left")) {
    leftCount++;
  }
  else if(ae.getActionCommand().equals("Right")) {
    rightCount++;
  }
  else if(ae.getActionCommand().equals("Reset")) {
    leftCount = 0;
    rightCount = 0;
  }
 }
} 