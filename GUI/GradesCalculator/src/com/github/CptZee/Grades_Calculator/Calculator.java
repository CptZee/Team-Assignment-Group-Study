package com.github.CptZee.Grades_Calculator;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Calculator implements ActionListener {

    private static JFrame gradeCalc;
    private static JLabel GradeAve;
    private static JFormattedTextField  Grade1;
    private static JFormattedTextField  Grade2;
    private static JFormattedTextField  Grade3;
    private static JFormattedTextField  Grade4;
    private static JFormattedTextField  Grade5;
    private static JFormattedTextField  Grade6;
    private static JFormattedTextField  Grade7;
    private static JButton  ComputeButton;

    public static void main(String[] args) throws ParseException {
        Setup();
        Elements();
    }
    public static void Setup(){
        gradeCalc = new JFrame(); //Create
        gradeCalc.setTitle("Grade Calculator");
        gradeCalc.setSize(280, 320);
        gradeCalc.setResizable(false);
        gradeCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void Elements() throws ParseException {
        JPanel panel = new JPanel();
        gradeCalc.add(panel);
        panel.setLayout(null);

        JLabel subj1 = new JLabel("Computer Programing 1");
        JLabel subj2 = new JLabel("Euthenics 1");
        JLabel subj3 = new JLabel("Introduction to Computing");
        JLabel subj4 = new JLabel("Mathematics in the Modern World");
        JLabel subj5 = new JLabel("The Contemporary World");
        JLabel subj6 = new JLabel("The Entrepreneurial Mind");
        JLabel subj7 = new JLabel("Understanding Self");
        JLabel average = new JLabel("<HTML><h1>Total</h1></HTML>");
        GradeAve = new JLabel("<HTML><h1>##.##</h1></HTML>");
        JLabel TradeMark = new JLabel("<HTML><h3>Created by</h3></HTML>");
        JLabel TradeMark2 = new JLabel("<HTML><h4>CptZ</h4></HTML>");

        TradeMark.setForeground(Color.BLUE);
        TradeMark2.setForeground(Color.BLUE);

        MaskFormatter gradeFormat = new MaskFormatter("##.##");

        Grade1 = new JFormattedTextField (gradeFormat);
        Grade2 = new JFormattedTextField (gradeFormat);
        Grade3 = new JFormattedTextField (gradeFormat);
        Grade4 = new JFormattedTextField (gradeFormat);
        Grade5 = new JFormattedTextField (gradeFormat);
        Grade6 = new JFormattedTextField (gradeFormat);
        Grade7 = new JFormattedTextField (gradeFormat);

        ComputeButton = new JButton("Compute");

        ComputeButton.addActionListener(new Calculator());

        subj1.setBounds(10, 10, 225, 25);
        subj2.setBounds(10, 40, 225, 25);
        subj3.setBounds(10, 70, 225, 25);
        subj4.setBounds(10, 100, 225, 25);
        subj5.setBounds(10, 130, 225, 25);
        subj6.setBounds(10, 160, 225, 25);
        subj7.setBounds(10, 190, 225, 25);
        average.setBounds(10, 220,225, 25);
        GradeAve.setBounds(200, 220, 60, 25);
        TradeMark.setBounds(10, 230, 225, 50);
        TradeMark2.setBounds(30, 260, 225, 25);

        Grade1.setBounds(210, 10, 40, 25);
        Grade2.setBounds(210, 40, 40, 25);
        Grade3.setBounds(210, 70, 40, 25);
        Grade4.setBounds(210, 100, 40, 25);
        Grade5.setBounds(210, 130, 40, 25);
        Grade6.setBounds(210, 160, 40, 25);
        Grade7.setBounds(210, 190, 40, 25);

        ComputeButton.setBounds(170, 250, 100, 25);

        panel.add(subj1);
        panel.add(subj2);
        panel.add(subj3);
        panel.add(subj4);
        panel.add(subj5);
        panel.add(subj6);
        panel.add(subj7);
        panel.add(average);
        panel.add(GradeAve);
        panel.add(TradeMark);
        panel.add(TradeMark2);
        panel.add(Grade1);
        panel.add(Grade2);
        panel.add(Grade3);
        panel.add(Grade4);
        panel.add(Grade5);
        panel.add(Grade6);
        panel.add(Grade7);
        panel.add(ComputeButton);

        gradeCalc.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        float sum;
        float averageGrade;

        float Subj1 = Float.parseFloat(Grade1.getText());
        float Subj2 = Float.parseFloat(Grade2.getText());
        float Subj3 = Float.parseFloat(Grade3.getText());
        float Subj4 = Float.parseFloat(Grade4.getText());
        float Subj5 = Float.parseFloat(Grade5.getText());
        float Subj6 = Float.parseFloat(Grade6.getText());
        float Subj7 = Float.parseFloat(Grade7.getText());

        if(Subj1 != 00.00f && Subj2 != 00.00f && Subj3 != 00.00f && Subj4 != 00.00f && Subj5 != 00.00f && Subj6 != 00.00f && Subj7 != 00.00f) {
            //Formulla ;)
            sum = Subj1 + Subj2 + Subj3 + Subj4 + Subj5 + Subj6 + Subj7;
            averageGrade = sum / 7;

            GradeAve.setText("<HTML><h1>" + averageGrade + "/h1></HTML>");
            if (averageGrade >= 75) {
                GradeAve.setForeground(Color.GREEN);
            } else {
                GradeAve.setForeground(Color.RED);
            }
        }

    }
}