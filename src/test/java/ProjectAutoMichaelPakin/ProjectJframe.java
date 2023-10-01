package ProjectAutoMichaelPakin;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectJframe {

    static JLabel labelEmail = new JLabel();
    static JTextField textField = new JTextField("Email");
    static String eMail = null;
    static JLabel labelCB = new JLabel();
    static JComboBox<String> comboBox = new JComboBox<>();
    static JLabel label1 = new JLabel();
    static JLabel label2 = new JLabel();
    static JLabel label3 = new JLabel();
    static JLabel label4 = new JLabel();
    static JLabel label5 = new JLabel();
    static JLabel label6 = new JLabel();
    static JLabel label7 = new JLabel();
    static JLabel label8 = new JLabel();



    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");

        frame.setSize(300,800);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//"Select Browser"
        labelCB.setBounds(75,110,200,100);
        frame.add(labelCB);
        labelCB.setText("Select Browser");

        comboBox.addItem("Google Chrome");
        comboBox.addItem("Edge");
        comboBox.setBounds(75,175,175,40);
        frame.add(comboBox);

//"Select Email"
        labelEmail.setBounds(75,35,200,100);
        frame.add(labelEmail);
        labelEmail.setText("Enter Email");

        textField.setBounds(75,100,175,40);
        frame.add(textField);

        label1.setBounds(100,190,200,100);
        frame.add(label1);
        label1.setText("Group Test Site");

        JButton btn1 = new JButton("Test - Site");
        btn1.setBounds(100,250,120,40);
        frame.add(btn1);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    TestListenerAdapter tla = new TestListenerAdapter();
                    TestNG testng = new TestNG();
                    testng.setTestClasses(new Class[] { ProjectRun.class });
                    testng.setGroups("Site");
                    testng.addListener(tla);
                    testng.run();
                } catch (Exception e) {
                    label1.setText("Group Test Site - fail");}}});


        label2.setBounds(100,255,200,100);
        frame.add(label2);
        label2.setText("Group Test Language");

        JButton btn2 = new JButton("Test - Language");
        btn2.setBounds(100,315,120,40);
        frame.add(btn2);

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {TestListenerAdapter tla = new TestListenerAdapter();
                    TestNG testng = new TestNG();
                    testng.setTestClasses(new Class[] { ProjectRun.class });
                    testng.setGroups("Language");
                    testng.addListener(tla);
                    testng.run();
                } catch (Exception e) {
                    label2.setText("Group Test Language - fail");}}});

        JLabel label3 = new JLabel();
        label3.setBounds(100,320,200,100);
        frame.add(label3);
        label3.setText("Group Test SearchTest");

        JButton btn3 = new JButton("Test - SearchTest");
        btn3.setBounds(100,380,120,40);
        frame.add(btn3);

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {TestListenerAdapter tla = new TestListenerAdapter();
                    TestNG testng = new TestNG();
                    testng.setTestClasses(new Class[] { ProjectRun.class });
                    testng.setGroups("SearchTest");
                    testng.addListener(tla);
                    testng.run();
                } catch (Exception e) {
                    label3.setText("Group Test SearchTest - fail");}}});

        JLabel label4 = new JLabel();
        label4.setBounds(100,385,200,100);
        frame.add(label4);
        label4.setText("Group Test navigator");

        JButton btn4 = new JButton("Test - navigator");
        btn4.setBounds(100,445,120,40);
        frame.add(btn4);

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {TestListenerAdapter tla = new TestListenerAdapter();
                    TestNG testng = new TestNG();
                    testng.setTestClasses(new Class[] { ProjectRun.class });
                    testng.setGroups("navigator");
                    testng.addListener(tla);
                    testng.run();
                } catch (Exception e) {
                    label4.setText("Group Test navigator - fail");}}});

        JLabel label5 = new JLabel();
        label5.setBounds(100,450,200,100);
        frame.add(label5);
        label5.setText("Group Test Links");

        JButton btn5 = new JButton("Test - Links");
        btn5.setBounds(100,510,120,40);
        frame.add(btn5);

        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {TestListenerAdapter tla = new TestListenerAdapter();
                    TestNG testng = new TestNG();
                    testng.setTestClasses(new Class[] { ProjectRun.class });
                    testng.setGroups("Links");
                    testng.addListener(tla);
                    testng.run();
                } catch (Exception e) {
                    label5.setText("Group Test Links - fail");}}});

        JLabel label6 = new JLabel();
        label6.setBounds(100,515,200,100);
        frame.add(label6);
        label6.setText("Group Test banner");

        JButton btn6 = new JButton("Test - banner");
        btn6.setBounds(100,575,120,40);
        frame.add(btn6);

        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {TestListenerAdapter tla = new TestListenerAdapter();
                    TestNG testng = new TestNG();
                    testng.setTestClasses(new Class[] { ProjectRun.class });
                    testng.setGroups("banner");
                    testng.addListener(tla);
                    testng.run();
                } catch (Exception e) {
                    label6.setText("Group Test banner - fail");}}});

        JLabel label7 = new JLabel();
        label7.setBounds(100,580,200,100);
        frame.add(label7);
        label7.setText("Group Test login");

        JButton btn7 = new JButton("Test - login");
        btn7.setBounds(100,640,120,40);
        frame.add(btn7);

        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {TestListenerAdapter tla = new TestListenerAdapter();
                    TestNG testng = new TestNG();
                    testng.setTestClasses(new Class[] { ProjectRun.class });
                    testng.setGroups("login");
                    testng.addListener(tla);
                    testng.run();
                } catch (Exception e) {
                    label7.setText("Group Test login - fail");}}});

        JLabel label8 = new JLabel();
        label8.setBounds(100,645,200,100);
        frame.add(label8);
        label8.setText("Group Test Enter");

        JButton btn8 = new JButton("Test - Enter");
        btn8.setBounds(100,705,120,40);
        frame.add(btn8);

        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {TestListenerAdapter tla = new TestListenerAdapter();
                    TestNG testng = new TestNG();
                    testng.setTestClasses(new Class[] { ProjectRun.class });
                    testng.setGroups("Enter");
                    testng.addListener(tla);
                    testng.run();
                } catch (Exception e) {
                    label8.setText("Group Test Enter - fail");}}});










    }
}
