package HCI.Tech_Minds_Academy_MiniSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame implements ActionListener {
    ImageIcon iconFrame = new ImageIcon("gradcap.png");

    ImageIcon settingsIcon = new ImageIcon("settings.png");
    ImageIcon enrollIcon = new ImageIcon("IconEnroll.png");
    ImageIcon backGroundIcon = new ImageIcon("backGroundImg.png");
    private javax.swing.JPanel Header;
    private javax.swing.JPanel backPanel;
    private javax.swing.JLabel backgroundImg;
    private javax.swing.JButton enrollBtn;
    private javax.swing.JButton enrollBtn1;
    private javax.swing.JLabel headerTitle;
    private javax.swing.JLabel jLabel1;

    public HomePage() {

        Header = new javax.swing.JPanel();
        headerTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backPanel = new javax.swing.JPanel();
        enrollBtn = new javax.swing.JButton();
        enrollBtn1 = new javax.swing.JButton();
        backgroundImg = new javax.swing.JLabel();



        Header.setBackground(new java.awt.Color(33, 58, 88));
        Header.setLayout(null);

        headerTitle.setFont(new java.awt.Font("Roboto Serif", 1, 14)); // NOI18N
        headerTitle.setForeground(new java.awt.Color(255, 255, 255));
        headerTitle.setText("Tech Minds Academy");
        Header.add(headerTitle);
        headerTitle.setBounds(60, 20, 160, 17);

        jLabel1.setIcon(settingsIcon);
        Header.add(jLabel1);
        jLabel1.setBounds(20, 10, 90, 32);

        getContentPane().add(Header);
        Header.setBounds(0, 0, 600, 55);

        backPanel.setLayout(null);

        /*
        enrollBtn.setBackground(new java.awt.Color(136, 194, 115));
        enrollBtn.setFont(new java.awt.Font("Roboto Serif", 1, 12)); // NOI18N
        enrollBtn.setForeground(new java.awt.Color(255, 255, 255));
        enrollBtn.setText("VIEW LIST");
        enrollBtn.setFocusable(false);
        enrollBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        enrollBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollBtnActionPerformed(evt);
            }
        });
        backPanel.add(enrollBtn);
        enrollBtn.setBounds(170, 390, 250, 40); // viewListButton eto nakakatamad ayusin identifier
        */

        enrollBtn1.setBackground(new java.awt.Color(136, 194, 115));
        enrollBtn1.setFont(new java.awt.Font("Roboto Serif", 1, 12)); // NOI18N
        enrollBtn1.setForeground(new java.awt.Color(255, 255, 255));
        enrollBtn1.setIcon(enrollIcon);
        enrollBtn1.setText("ENROLL STUDENT");
        enrollBtn1.setFocusable(false);

        enrollBtn1.addActionListener(this);
        backPanel.add(enrollBtn1);
        enrollBtn1.setBounds(170, 330, 250, 50); //enroll button eto nakakatamad ayusin identifier

        backgroundImg.setIcon(backGroundIcon);
        backgroundImg.setText("jLabel2");
        backPanel.add(backgroundImg);
        backgroundImg.setBounds(0, 0, 600, 500);

        getContentPane().add(backPanel);
        backPanel.setBounds(0, 50, 600, 500);

        pack();
        this.setIconImage(iconFrame.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tech Minds Academy");
        this.setSize(600,500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void enrollBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void enrollBtn1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        EmailAndPassword accounts = new EmailAndPassword();
        new EnrollPage();
        this.dispose();
    }
}
