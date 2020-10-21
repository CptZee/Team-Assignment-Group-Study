package com.github.CptZee.Grades_Calculator;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.Component;
import java.awt.EventQueue;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class GradeCalcu implements ActionListener {

    private static JFrame gradeCalc = new JFrame();;
    private static JLabel GradeAve, GradeSystem, waiting, sad, meh, happy, yay;
    private static JSpinner Grade1, Grade2, Grade3, Grade4, Grade5, Grade6, Grade7;
    private static final JButton computeButton = new JButton("Compute"), resetButton = new JButton("Reset"), exitButton = new JButton("Exit");
    private static double averageGrade = 0.00;
    public static final SelectOnFocusGainedHandler SHARED_INSTANCE = new SelectOnFocusGainedHandler();

    public static void main(String[] args){
        Setup();
        Elements();
        new GradeCalcu();
    }
    public static void Setup(){
        BufferedImage ico = null;
        try{
            ico = ImageIO.read(ClassLoader.getSystemResource("logo.png"));
        } catch(Exception NotFound){
            NotFound.printStackTrace();
        }
        //Create
        gradeCalc.setTitle("CptZ Grades Analyzer | BSIT 1.1A - First Semester");
        gradeCalc.setSize(580, 330);
        gradeCalc.setIconImage(ico);
        gradeCalc.setResizable(false);
        gradeCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        gradeCalc.setLocation(dim.width/2-gradeCalc.getSize().width/2, dim.height/2-gradeCalc.getSize().height/2);

        donePrmt.setTitle("Done!");
        donePrmt.setIconImage(ico);
        donePrmt.setResizable(false);
        Dimension donePrmtDim = Toolkit.getDefaultToolkit().getScreenSize();
        donePrmt.setLocation(donePrmtDim.width/2-donePrmt.getSize().width/2, donePrmtDim.height/2-donePrmt.getSize().height/2);
    }
    public static void Elements() {
        JPanel panel = new JPanel();
        gradeCalc.add(panel);
        panel.setLayout(null);
        //Images
        ImageIcon waitingPic = new ImageIcon(ClassLoader.getSystemResource("waiting.gif"));
        ImageIcon sadPic = new ImageIcon(ClassLoader.getSystemResource("sad.gif"));
        ImageIcon mehPic = new ImageIcon(ClassLoader.getSystemResource("meh.gif"));
        ImageIcon happyPic = new ImageIcon(ClassLoader.getSystemResource("happy.gif"));
        ImageIcon yayPic = new ImageIcon((ClassLoader.getSystemResource("yay.gif")));

        waiting = new JLabel(waitingPic);
        sad = new JLabel(sadPic);
        meh = new JLabel(mehPic);
        happy = new JLabel(happyPic);
        yay = new JLabel(yayPic);
        JLabel subj1 = new JLabel("Introduction to Computing");
        JLabel subj2 = new JLabel("Computer Programming 1");
        JLabel subj3 = new JLabel("Euthenics 1");
        JLabel subj4 = new JLabel("Mathematics in the Modern World");
        JLabel subj5 = new JLabel("The Contemporary World");
        JLabel subj6 = new JLabel("The Entrepreneurial Mind");
        JLabel subj7 = new JLabel("Understanding Self");
        JLabel average = new JLabel("Average");
        GradeAve = new JLabel("##.##");
        JLabel TradeMark = new JLabel("<HTML><h3>Created by</h3></HTML>");
        JLabel TradeMark2 = new JLabel("<HTML><h4>CptZ</h4></HTML>");
        GradeSystem = new JLabel("<HTML><h1>Waiting...</h1></HTML>");

        GradeAve.setOpaque(true);
        GradeAve.setBackground(Color.WHITE);
        TradeMark.setForeground(Color.BLUE);
        TradeMark2.setForeground(Color.BLUE);

        GradeAve.setFont(new java.awt.Font("Arial Black", 1, 18));
        average.setFont(new java.awt.Font("Arial Black", 1, 22));

        Grade1 = new JSpinner(new SpinnerNumberModel(70.00, 70.00, 100.00, 0.25));
        Grade2 = new JSpinner(new SpinnerNumberModel(70.00, 70.00, 100.00, 0.25));
        Grade3 = new JSpinner(new SpinnerNumberModel(70.00, 70.00, 100.00, 0.25));
        Grade4 = new JSpinner(new SpinnerNumberModel(70.00, 70.00, 100.00, 0.25));
        Grade5 = new JSpinner(new SpinnerNumberModel(70.00, 70.00, 100.00, 0.25));
        Grade6 = new JSpinner(new SpinnerNumberModel(70.00, 70.00, 100.00, 0.25));
        Grade7 = new JSpinner(new SpinnerNumberModel(70.00, 70.00, 100.00, 0.25));

        GradeAve.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Grade1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Grade2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Grade3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Grade4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Grade5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Grade6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Grade7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        computeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        resetButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        exitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        computeButton.addActionListener(new GradeCalcu());
        resetButton.addActionListener(new GradeCalcu());
        exitButton.addActionListener(new GradeCalcu());

        computeButton.setBackground(Color.GREEN);
        resetButton.setBackground(Color.YELLOW);
        exitButton.setBackground(Color.RED);

        subj1.setBounds(10, 10, 225, 25);
        subj2.setBounds(10, 40, 225, 25);
        subj3.setBounds(10, 70, 225, 25);
        subj4.setBounds(10, 100, 225, 25);
        subj5.setBounds(10, 130, 225, 25);
        subj6.setBounds(10, 160, 225, 25);
        subj7.setBounds(10, 190, 225, 25);
        average.setBounds(10, 215,225, 30);
        GradeAve.setBounds(210, 220, 60, 25);
        TradeMark.setBounds(10, 232, 225, 50);
        TradeMark2.setBounds(30, 262, 225, 25);
        GradeSystem.setBounds(370, 210, 225, 30);
        waiting.setBounds(300, 20, 239, 180);
        sad.setBounds(300, 20, 239, 180);
        meh.setBounds(300, 20, 239, 180);
        happy.setBounds(300, 20, 239, 180);
        yay.setBounds(300, 20, 239, 180);

        Grade1.setBounds(210, 10, 60, 25);
        Grade2.setBounds(210, 40, 60, 25);
        Grade3.setBounds(210, 70, 60, 25);
        Grade4.setBounds(210, 100, 60, 25);
        Grade5.setBounds(210, 130, 60, 25);
        Grade6.setBounds(210, 160, 60, 25);
        Grade7.setBounds(210, 190, 60, 25);

        computeButton.setBounds(170, 250, 100, 25);
        resetButton.setBounds(300, 250, 100, 25);
        exitButton.setBounds(430, 250, 100, 25);

        JComponent gradeFormat1 = new JSpinner.NumberEditor(Grade1, "##.##");
        JComponent gradeFormat2 = new JSpinner.NumberEditor(Grade2, "##.##");
        JComponent gradeFormat3 = new JSpinner.NumberEditor(Grade3, "##.##");
        JComponent gradeFormat4 = new JSpinner.NumberEditor(Grade4, "##.##");
        JComponent gradeFormat5 = new JSpinner.NumberEditor(Grade5, "##.##");
        JComponent gradeFormat6 = new JSpinner.NumberEditor(Grade6, "##.##");
        JComponent gradeFormat7 = new JSpinner.NumberEditor(Grade7, "##.##");

        Grade1.setEditor(gradeFormat1);
        Grade2.setEditor(gradeFormat2);
        Grade3.setEditor(gradeFormat3);
        Grade4.setEditor(gradeFormat4);
        Grade5.setEditor(gradeFormat5);
        Grade6.setEditor(gradeFormat6);
        Grade7.setEditor(gradeFormat7);

        sad.setVisible(false);
        meh.setVisible(false);
        happy.setVisible(false);
        yay.setVisible(false);

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
        panel.add(GradeSystem);
        panel.add(waiting);
        panel.add(sad);
        panel.add(meh);
        panel.add(happy);
        panel.add(yay);
        panel.add(computeButton);
        panel.add(resetButton);
        panel.add(exitButton);

        gradeCalc.setVisible(true);
    }

    private static Clip victoryAudio = null, ohYeahAudio = null, mehAudio = null, sadAudio = null, supersad = null;
    public static void Grading(){
        GradeSystem.setForeground(Color.BLACK);
        waiting.setVisible(false);
        sad.setVisible(false);
        meh.setVisible(false);
        happy.setVisible(false);
        yay.setVisible(false);
        if(averageGrade <= 74.49){
            GradeSystem.setText("<HTML><h1>5.00 - Failed</h1></HTML>");
            GradeSystem.setForeground(Color.RED);
            GradeSystem.setBounds(350, 210, 225, 30);
            try {
                AudioInputStream supersadStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("supersad.wav"));
                supersad = AudioSystem.getClip();
                supersad.open(supersadStream);
                supersad.start();
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }finally {
                sad.setVisible(true);
            }
        }else if(averageGrade <= 76.49){
            GradeSystem.setText("<HTML><h1>3.00 - Fair</h1></HTML>");
            GradeSystem.setForeground(Color.RED);
            GradeSystem.setBounds(360, 210, 225, 30);
            try {
                AudioInputStream sadStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("sad.wav"));
                sadAudio = AudioSystem.getClip();
                sadAudio.open(sadStream);
                sadAudio.start();
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }finally {
                sad.setVisible(true);
            }
        }else if(averageGrade <= 79.49){
            GradeSystem.setText("<HTML><h1>2.75 - Fair</h1></HTML>");
            GradeSystem.setForeground(Color.RED);
            GradeSystem.setBounds(360, 210, 225, 30);
            try {
                AudioInputStream sadStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("sad.wav"));
                sadAudio = AudioSystem.getClip();
                sadAudio.open(sadStream);
                sadAudio.start();
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }finally {
                sad.setVisible(true);
            }
        }else if(averageGrade <= 82.49) {
            GradeSystem.setText("<HTML><h1>2.5 - Satisfactory</h1></HTML>");
            GradeSystem.setForeground(Color.BLACK);
            GradeSystem.setBounds(330, 210, 225, 30);
            try {
                AudioInputStream mehStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("meh.wav"));
                mehAudio = AudioSystem.getClip();
                mehAudio.open(mehStream);
                mehAudio.start();
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }finally {
                meh.setVisible(true);
            }
        }else if(averageGrade <= 85.49) {
            GradeSystem.setText("<HTML><h1>2.25 - Satisfactory</h1></HTML>");
            GradeSystem.setForeground(Color.BLACK);
            GradeSystem.setBounds(325, 210, 225, 30);
            try {
                AudioInputStream mehStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("meh.wav"));
                mehAudio = AudioSystem.getClip();
                mehAudio.open(mehStream);
                mehAudio.start();
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }finally {
                meh.setVisible(true);
            }
        }else if(averageGrade <= 88.49) {
            GradeSystem.setText("<HTML><h1>2 - Satisfactory</h1></HTML>");
            GradeSystem.setForeground(Color.BLACK);
            GradeSystem.setBounds(335, 210, 225, 30);
            try {
                AudioInputStream mehStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("meh.wav"));
                mehAudio = AudioSystem.getClip();
                mehAudio.open(mehStream);
                mehAudio.start();
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }finally {
                meh.setVisible(true);
            }
        }else if(averageGrade <= 91.49) {
            GradeSystem.setText("<HTML><h1>1.75 - Very Good</h1></HTML>");
            GradeSystem.setForeground(Color.GREEN);
            GradeSystem.setBounds(325, 210, 225, 30);
            try {
                AudioInputStream victoryStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("victory.wav"));
                victoryAudio = AudioSystem.getClip();
                victoryAudio.open(victoryStream);
                victoryAudio.start();
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }finally {
                happy.setVisible(true);
            }
        }else if(averageGrade <= 94.49) {
            GradeSystem.setText("<HTML><h1>1.5 - Very Good</h1></HTML>");
            GradeSystem.setForeground(Color.GREEN);
            GradeSystem.setBounds(330, 210, 225, 30);
            try {
                AudioInputStream victoryStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("victory.wav"));
                victoryAudio = AudioSystem.getClip();
                victoryAudio.open(victoryStream);
                victoryAudio.start();
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }finally {
                happy.setVisible(true);
            }
        }else if(averageGrade <= 97.49) {
            GradeSystem.setText("<HTML><h1>1.75 - Very Good</h1></HTML>");
            GradeSystem.setForeground(Color.GREEN);
            GradeSystem.setBounds(324, 210, 225, 30);
            try {
                AudioInputStream victoryStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("victory.wav"));
                victoryAudio = AudioSystem.getClip();
                victoryAudio.open(victoryStream);
                victoryAudio.start();
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }finally {
                happy.setVisible(true);
            }
        }else if(averageGrade <= 100) {
            GradeSystem.setText("<HTML><h1>1 - SANAOL</h1></HTML>");
            GradeSystem.setForeground(Color.GREEN);
            GradeSystem.setBounds(350, 210, 225, 30);
            try {
                AudioInputStream ohYeahStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("ohYeah.wav"));
                ohYeahAudio = AudioSystem.getClip();
                ohYeahAudio.open(ohYeahStream);
                ohYeahAudio.start();
            } catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }finally {
                yay.setVisible(true);
            }
        }
    }


    private static JFrame donePrmt = new JFrame();
    private static final JButton confirmButton = new JButton("Confirm");
    public static void donePrompt(){
        donePrmt.setSize(170, 100);
        JPanel prompt = new JPanel();
        prompt.setLayout(null);
        donePrmt.add(prompt);
        JLabel doneLabel = new JLabel("Done!");

        doneLabel.setFont(new java.awt.Font("Arial Black", 1, 18));
        doneLabel.setBounds(45, 10, 100, 20);
        confirmButton.setBounds(25, 35, 100, 20);
        confirmButton.addActionListener(new GradeCalcu());

        prompt.add(confirmButton);
        prompt.add(doneLabel);
        donePrmt.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(computeButton.getModel().isArmed()) {
            double sum;

            double Subj1 = (double) Grade1.getValue();
            double Subj2 = (double) Grade2.getValue();
            double Subj3 = (double) Grade3.getValue();
            double Subj4 = (double) Grade4.getValue();
            double Subj5 = (double) Grade5.getValue();
            double Subj6 = (double) Grade6.getValue();
            double Subj7 = (double) Grade7.getValue();


            if (Subj1 != 00.00f && Subj2 != 00.00f && Subj3 != 00.00f && Subj4 != 00.00f && Subj5 != 00.00f && Subj6 != 00.00f && Subj7 != 00.00f) {
                //Formula ;)
                sum = Subj1 + Subj2 + Subj3 + Subj4 + Subj5 + Subj6 + Subj7;
                averageGrade = sum / 7;
                Grading();
                GradeAve.setBounds(210, 220, 60, 25);
                if (averageGrade <= 99.99) {
                    GradeAve.setText(String.format("%.2f", averageGrade));
                    if (averageGrade >= 79.50) {
                        GradeAve.setForeground(Color.BLACK);
                        if (averageGrade >= 88.5) {
                            GradeAve.setForeground(Color.GREEN);
                        }
                    } else {
                        GradeAve.setForeground(Color.RED);
                    }
                    donePrompt();
                }else{
                    GradeAve.setText(String.format("%.2f", averageGrade));
                    GradeAve.setBounds(200, 220, 75, 25);
                    GradeAve.setForeground(Color.GREEN);
                }
            }
        }else if(confirmButton.getModel().isArmed()) {
            donePrmt.setVisible(false);
            try {
                ohYeahAudio.stop();
                victoryAudio.stop();
                mehAudio.stop();
                sadAudio.stop();
                supersad.stop();
            }catch (NullPointerException NotPlaying){
                //Ignore since we only want this to happen if the sounds are still playing anyways.
            }
        }else if(resetButton.getModel().isArmed()){
            Grade1.setValue(70.00);
            Grade2.setValue(70.00);
            Grade3.setValue(70.00);
            Grade4.setValue(70.00);
            Grade5.setValue(70.00);
            Grade6.setValue(70.00);
            Grade7.setValue(70.00);
            GradeAve.setForeground(Color.BLACK);
            GradeAve.setText("##.##");
            GradeAve.setBounds(210, 220, 60, 25);
            GradeSystem.setForeground(Color.BLACK);
            GradeSystem.setBounds(370, 210, 225, 30);
            GradeSystem.setText("<HTML><h1>Waiting...</h1></HTML>");
            sad.setVisible(false);
            meh.setVisible(false);
            happy.setVisible(false);
            yay.setVisible(false);
            waiting.setVisible(true);
            donePrompt();
        }else{
            System.exit(0);
        }
    }

    /*
    Modified Code From Stackoverflow :(
     */

    public GradeCalcu() {
        EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException ex) {
                System.out.println("A ClassNotFoundException ocured!");
            } catch (InstantiationException ex) {
                System.out.println("A InstantiationException ocured!");
            } catch (IllegalAccessException ex) {
                System.out.println("A IllegalAccessException ocured!");
            } catch (UnsupportedLookAndFeelException ex) {
                System.out.println("A UnsupportedLookAndFeelException ocured!");
            }

            installFocusListener(Grade1);
            installFocusListener(Grade2);
            installFocusListener(Grade3);
            installFocusListener(Grade4);
            installFocusListener(Grade5);
            installFocusListener(Grade6);
            installFocusListener(Grade7);
        });
    }

    public void installFocusListener(JSpinner spinner) {

        JComponent spinnerEditor = spinner.getEditor();

        if (spinnerEditor != null) {

            // This is me spending a few days trying to make this work and
            // eventually throwing a hissy fit and just grabbing all the
            // JTextComponent components contained within the editor....
            List<JTextComponent> lstChildren = findAllChildren(spinner, JTextComponent.class);
            if (lstChildren.size() > 0) {

                JTextComponent editor = lstChildren.get(0);
                editor.addFocusListener(SHARED_INSTANCE);

            }

        }

    }

    public static <T extends Component> List<T> findAllChildren(JComponent component, Class<T> clazz) {

        List<T> lstChildren = new ArrayList<>(5);
        for (Component comp : component.getComponents()) {

            if (clazz.isInstance(comp)) {

                lstChildren.add((T) comp);

            } else if (comp instanceof JComponent) {

                lstChildren.addAll(findAllChildren((JComponent) comp, clazz));

            }

        }

        return Collections.unmodifiableList(lstChildren);

    }

    public static class SelectOnFocusGainedHandler extends FocusAdapter {

        @Override
        public void focusGained(FocusEvent e) {

            Component comp = e.getComponent();
            if (comp instanceof JTextComponent) {
                final JTextComponent textComponent = (JTextComponent) comp;
                new Thread(() -> {
                    try {
                        Thread.sleep(25);
                    } catch (InterruptedException ex) {
                        System.out.println("A InterruptedException ocured!");
                    }
                    SwingUtilities.invokeLater(textComponent::selectAll);
                }).start();
            }
        }
    }
}