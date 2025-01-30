package HCI.Tech_Minds_Academy_MiniSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

import static HCI.Tech_Minds_Academy_MiniSystem.LoginPage.icon;

public class SignUpPage extends javax.swing.JFrame implements ActionListener,MouseListener, KeyListener {


    static HashMap <String,String> signUpAcc = new HashMap<>();

    private javax.swing.JButton registerButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel haveAccLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField registerPass;
    private javax.swing.JTextField registerUser;
    private javax.swing.JPanel left;
    private javax.swing.JPanel right;
    ImageIcon frameIcon;
    ImageIcon logoIcon;
    ImageIcon successIcon;
    static String username;
    static String password;



    public SignUpPage(){

        jPanel1 = new javax.swing.JPanel();
        left = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        registerUser = new JTextField();
        jLabel5 = new javax.swing.JLabel();
        registerPass = new JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        haveAccLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        frameIcon = new ImageIcon("gradcap.png");
        logoIcon = new ImageIcon("Tech Minds Academy.png");
        successIcon = new ImageIcon("check.png");



        jPanel1.setLayout(null);

        left.setBackground(new java.awt.Color(33, 58, 88));
        left.setPreferredSize(new java.awt.Dimension(400, 500));
        left.setRequestFocusEnabled(false);

        jLabel3.setFont(new java.awt.Font("Nunito", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SIGNUP");

        jLabel4.setFont(new java.awt.Font("Nunito Sans 10pt", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        registerUser.setBackground(new java.awt.Color(0, 0, 0));
        registerUser.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        registerUser.setForeground(new java.awt.Color(0, 255, 0));
        registerUser.setCaretColor(new java.awt.Color(255, 255, 255));
        registerUser.addKeyListener(this);

        jLabel5.setFont(new java.awt.Font("Nunito Sans 10pt", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");

        registerPass.setBackground(new java.awt.Color(0, 0, 0));
        registerPass.setForeground(new java.awt.Color(0, 255, 0));
        registerPass.addKeyListener(this);

        jCheckBox1.setFont(new java.awt.Font("Nunito Sans 10pt", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Remember me");

        haveAccLabel.setFont(new java.awt.Font("Nunito Sans 10pt", 0, 12)); // NOI18N
        haveAccLabel.setForeground(new java.awt.Color(255, 255, 255));
        haveAccLabel.setText("Already have an account?");
        haveAccLabel.addMouseListener(this);

        registerButton.setBackground(new java.awt.Color(0, 204, 51));
        registerButton.setFont(new java.awt.Font("Nunito", 1, 12)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.addActionListener(this);

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
                leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(registerUser, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftLayout.createSequentialGroup()
                                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(haveAccLabel))
                                                .addComponent(registerPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftLayout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(104, 104, 104))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftLayout.createSequentialGroup()
                                                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(90, 90, 90))))
        );
        leftLayout.setVerticalGroup(
                leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel3)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel4)
                                .addGap(0, 0, 0)
                                .addComponent(registerUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel5)
                                .addGap(0, 0, 0)
                                .addComponent(registerPass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCheckBox1)
                                        .addComponent(haveAccLabel))
                                .addGap(59, 59, 59)
                                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
        );

        jPanel1.add(left);
        left.setBounds(400, 0, 400, 500);

        right.setBackground(new java.awt.Color(18, 32, 35));
        right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setIcon(logoIcon);

        jLabel2.setFont(new java.awt.Font("Nunito", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("© 2024 Tech Minds Academy. All rights reserved.");

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
                rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(62, 62, 62))
        );
        rightLayout.setVerticalGroup(
                rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
        );

        jPanel1.add(right);
        right.setBounds(0, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        this.setIconImage(frameIcon.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("SignUp");
        this.setPreferredSize(new Dimension(800, 500));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == registerButton) {
            signUpAcc.put(registerUser.getText(), registerPass.getText());
            JOptionPane.showMessageDialog(null,"Registered Successfully!","Success",JOptionPane.INFORMATION_MESSAGE,successIcon);


        }
    }
    private void registerForm() {

        username = registerUser.getText();
        password = registerPass.getText();
        //  password = new String(JPasswordField.getPassword());
        //or kasi sabi sa yt outdated na daw ang getText(); method sa jPasswordField or deprecated or may not work


    }



    @Override
    public void mouseClicked(MouseEvent e) {
        EmailAndPassword accounts = new EmailAndPassword();
        new LoginPage(signUpAcc);
        this.dispose();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        haveAccLabel.setFont(new java.awt.Font("Nunito Sans 10pt", Font.ITALIC, 12));
        haveAccLabel.setForeground(new Color(200, 200, 255));
        Font font = haveAccLabel.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        haveAccLabel.setFont(font.deriveFont(attributes));

    }

    @Override
    public void mouseExited(MouseEvent e) {

        haveAccLabel.setText("Already have an account?");
        haveAccLabel.setFont(new java.awt.Font("Nunito Sans 10pt", Font.PLAIN, 12));
        haveAccLabel.setForeground(Color.WHITE);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            signUpAcc.put(registerUser.getText(), registerPass.getText());
            JOptionPane.showMessageDialog(null,"Registered Successfully!","Success",JOptionPane.INFORMATION_MESSAGE,successIcon);


        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
