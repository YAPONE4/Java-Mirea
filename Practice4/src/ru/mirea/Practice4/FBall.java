package ru.mirea.Practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class FBall extends JFrame
{
    int rm = 0;
    int ac = 0;

    JLabel res = new JLabel("Result: 0 X 0");
    JLabel ls = new JLabel("Last Scorer: N/A");
    JLabel wn = new JLabel("Winner: DRAW");
    JButton realBtt = new JButton("Goal for Real Madrid!");
    JButton milanBtt = new JButton("Goal for AC Milan!");

    public void whoWins() {
        if (rm == ac) {
            wn.setText("Winner: DRAW");
        } else if (rm > ac) {
            wn.setText("Winner: Real Madrid");
        } else {
            wn.setText("Winner: AC Milan");
        }
    }

    public FBall()
    {
        realBtt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rm++;
                res.setText("Result: " + ac + " X " + rm);
                ls.setText("Last Scorer: Real Madrid");
                whoWins();
            }
        });
        milanBtt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ac++;
                res.setText("Result: " + ac + " X " + rm);
                ls.setText("Last Scorer: AC Milan");
                whoWins();
            }
        });
        setLayout(new BorderLayout());
        add(ls, BorderLayout.SOUTH);
        add(realBtt, BorderLayout.EAST);
        add(milanBtt, BorderLayout.WEST);
        add(res, BorderLayout.NORTH);
        add(wn, BorderLayout.CENTER);
        setSize(500, 500);
    }

    public static void main(String[]args) {
        new FBall().setVisible(true);
    }

}
