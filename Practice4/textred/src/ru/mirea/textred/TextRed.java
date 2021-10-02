package ru.mirea.textred;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.io.IOException;

public class TextRed extends JFrame implements ActionListener {

    JPanel pan = new JPanel();

    JTextArea txtArea = new JTextArea(40,40);

    JFileChooser fc = null;

    JMenu menu;
    JMenuItem isave, iopen;

    public TextRed() {
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("File");
        isave = new JMenuItem("Save File");
        iopen = new JMenuItem("Open File");
        isave.addActionListener(this);
        iopen.addActionListener(this);
        mb.add(menu);
        menu.add(isave);
        menu.add(iopen);
        setJMenuBar(mb);
        setLayout(new BorderLayout());
        setSize(500,500);
        add(txtArea, BorderLayout.NORTH);
        add(new JScrollPane(txtArea), BorderLayout.CENTER);
    }

    public String getTxt() {
        return txtArea.getText();
    }

    public void setTxt(String txt) {
        txtArea.setText(txt);
    }

    public void actionPerformed(ActionEvent e) {
        fc = new JFileChooser();
        if (e.getSource() == isave) {
            fc.setDialogTitle("Сохранение файла");
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int result = fc.showSaveDialog(TextRed.this);
            String path;
            if (result == JFileChooser.APPROVE_OPTION ) {
                path = fc.getSelectedFile().getAbsolutePath();
                try {
                    File f = new File(path);
                    f.createNewFile();
                } catch (IOException a) {}
                try {
                    FileWriter fw = new FileWriter(path);
                    fw.write(getTxt());
                    fw.flush();
                } catch (IOException b) {}
                JOptionPane.showMessageDialog(TextRed.this,
                        "Файл '" + fc.getSelectedFile() +
                                " сохранен");
            }
        }
        if (e.getSource() == iopen) {
            fc.setDialogTitle("Выбор директории");
            fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int result = fc.showOpenDialog(TextRed.this);
            String path;
            String text = "";
            int i;
            if (result == JFileChooser.APPROVE_OPTION ) {
                path = fc.getSelectedFile().getAbsolutePath();
                JOptionPane.showMessageDialog(TextRed.this,
                        fc.getSelectedFile());
                try{
                    FileReader fr = new FileReader(path);
                    while((i = fr.read()) != -1)
                        text += ((char) i);
                } catch (IOException c) {}
                setTxt(text);
            }
        }
    }

    public static void main(String[] args) {
        JFrame mainwindow = new TextRed();
        mainwindow.setVisible(true);
        mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
