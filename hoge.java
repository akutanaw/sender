package hoge5;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class hoge extends Dialog {
 public int count = 0;
    public hoge(Frame owner) {
        super(owner);    
        Color col1 = new Color(200,0,0);
        addWindowListener ( new WindowAdapter () {
            public void windowClosing (WindowEvent we) {
                setVisible(false);
            }
        });
        Color col2 = new Color(0,0,0);
        Button button = new Button("表示");
        GridBagLayout gnt = new GridBagLayout();
        GridBagConstraints cont = new GridBagConstraints();
        
        cont.gridx = 1;
        cont.gridy = 0;
        cont.gridheight = 0;
        cont.gridwidth = 2;
        
        
        setLayout(gnt);
        gnt.setConstraints(button, cont);
        button.setPreferredSize(new Dimension(50,50));
        add(button);
        Label label = new Label();
        cont.gridx = 1;
        cont.gridy = 1;
        cont.gridheight = -5;
        cont.gridwidth = 0;
        cont.insets = new Insets(150, 170,0, 0);
        label.setPreferredSize(new Dimension(200,50));
        label.setForeground(col1);
        gnt.setConstraints(label, cont);
        label.setVisible(true);
        add(label);
        button.setVisible(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText(String.valueOf(count));
            }
        });
        setBackground(col2);
        setTitle("ぽっぷあっぷ");
        setSize(500, 500);
        setVisible(true);  
    }
    
    
}
