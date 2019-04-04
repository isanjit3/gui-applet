package applet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{

    private TextPanel textPanel;
    private Toolbar toolbar;
    private JButton btn;

    public MainFrame() {
        super("Hello World");

        setLayout(new BorderLayout());

        textPanel = new TextPanel();
        toolbar = new Toolbar();
        btn = new JButton("Click Me!");

        toolbar.setTextPanel(textPanel);


        btn.addActionListener(new ActionListener() { //Init action for the button
            public void actionPerformed(ActionEvent e) { //Method is run every time button is clicked
                textPanel.appendText("Hello");
            }
        });

        add(textPanel, BorderLayout.CENTER);
        add(toolbar, BorderLayout.NORTH);
        add(btn, BorderLayout.SOUTH);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
