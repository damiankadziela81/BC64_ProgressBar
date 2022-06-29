import javax.swing.*;
import java.awt.*;

public class ProgressBar {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,5);

    ProgressBar() throws InterruptedException {

        bar.setValue(23);
        bar.setBounds(0,0,500,50); // we need this since we don't use layout manager for frame
        bar.setStringPainted(true); //adds % to progress bar
        bar.setFont(new Font("Arial",Font.BOLD,30));
        bar.setForeground(Color.RED);
        bar.setBackground(new Color(0xffa070));


        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() throws InterruptedException {
        int counter = 5;
        while(counter>=0){
            bar.setValue(counter);
            bar.setString("Time till the bomb goes off: "+counter+" s");
            Thread.sleep(1000);
            counter-=1;

        }
        bar.setString("BOOM!");
    }
}
