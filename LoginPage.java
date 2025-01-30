package HCI.Tech_Minds_Academy_MiniSystem;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

import static HCI.Tech_Minds_Academy_MiniSystem.SignUpPage.signUpAcc;

public class LoginPage extends JFrame implements ActionListener, KeyListener, MouseListener {

    HashMap <String,String>emailPassInfo = new HashMap<>();
    JPanel Left;
    JPanel Right;
    JLabel loginLabel;
    JLabel emailLabel;
    JLabel passwordLabel;
    JLabel schoolLabel;
    JLabel welcomeLabel;
    JLabel footerLabel;
    JLabel noAccLabel;
    JPanel jPanel1;
    JTextField usernameLogin;
    JPasswordField passwordLogin;
    JButton loginButton;
    JButton clearButton;
    JButton jButton3;
    JCheckBox jCheckBox1;
    static String username;
    String password;


    ImageIcon successIcon = new ImageIcon("check.png");
    static ImageIcon icon = new ImageIcon("gradcap.png");
    ImageIcon schoolIcon = new ImageIcon("Tech Minds Academy.png");
    ImageIcon loginIcon = new ImageIcon("unlock.png");
    ImageIcon clearIcon = new ImageIcon("removeRed.png");
    ImageIcon errorIcon = new ImageIcon("removeRedBig.png");

    public LoginPage(HashMap <String,String>emailPassInfo){
        this.emailPassInfo = emailPassInfo;
        jPanel1 = new JPanel();
        Right = new JPanel();
        Left = new JPanel();
        welcomeLabel = new JLabel();
        loginLabel = new JLabel();
        emailLabel = new JLabel();
        usernameLogin = new JTextField();
        passwordLabel = new JLabel();
        passwordLogin = new JPasswordField();
        loginButton = new JButton();
        clearButton = new JButton();
        jButton3 = new JButton();
        jCheckBox1 = new JCheckBox();
        schoolLabel = new JLabel();
        footerLabel = new JLabel();
        schoolLabel.setIcon(schoolIcon);
        noAccLabel = new JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(18, 32, 35));
        Right.setMinimumSize(new java.awt.Dimension(400, 500));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        schoolLabel.setIcon(schoolIcon);

        footerLabel.setFont(new java.awt.Font("Nunito", 1, 12)); // NOI18N
        footerLabel.setForeground(new java.awt.Color(255, 255, 255));
        footerLabel.setText("© 2024 Tech Minds Academy. All rights reserved.");
        footerLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
                RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(schoolLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                                .addContainerGap(62, Short.MAX_VALUE)
                                .addComponent(footerLabel)
                                .addGap(62, 62, 62))
        );
        RightLayout.setVerticalGroup(
                RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                                .addContainerGap(84, Short.MAX_VALUE)
                                .addComponent(schoolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(footerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(33, 58, 88));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        loginLabel.setBackground(new java.awt.Color(166, 255, 152));
        loginLabel.setFont(new java.awt.Font("Nunito", 1, 48)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginLabel.setText("LOGIN");

        emailLabel.setFont(new java.awt.Font("Nunito Sans 10pt", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");

        usernameLogin.setBackground(new java.awt.Color(0, 0, 0));
        usernameLogin.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        usernameLogin.setForeground(new java.awt.Color(0, 255, 0));
        usernameLogin.setCaretColor(new java.awt.Color(255, 255, 255));
        usernameLogin.addKeyListener(this);

        passwordLabel.setFont(new java.awt.Font("Nunito Sans 10pt", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");

        passwordLogin.setBackground(new java.awt.Color(0, 0, 0));
        passwordLogin.setForeground(new java.awt.Color(0, 255, 0));
        passwordLogin.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordLogin.setPreferredSize(new java.awt.Dimension(64, 24));
        passwordLogin.addKeyListener(this);

        loginButton.setBackground(new java.awt.Color(0, 204, 51));
        loginButton.setFont(new java.awt.Font("Nunito Sans 10pt", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setIcon(loginIcon);
        loginButton.setText("Login");
        loginButton.setName(""); // NOI18N
        loginButton.addActionListener(this);

        jCheckBox1.setBackground(new java.awt.Color(33, 58, 88));
        jCheckBox1.setFont(new java.awt.Font("Nunito Sans 10pt", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Remember me");
        jCheckBox1.setActionCommand("Remember me");
        jCheckBox1.setFocusable(false);
        jCheckBox1.addActionListener(this);
        jCheckBox1.addKeyListener(this);

        noAccLabel.setFont(new java.awt.Font("Nunito Sans 10pt", 0, 12)); // NOI18N
        noAccLabel.setForeground(new java.awt.Color(255, 255, 255));
        noAccLabel.setText("Don't have an account?");
        noAccLabel.addMouseListener(this);

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LeftLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passwordLabel)
                                        .addComponent(emailLabel)
                                        .addComponent(usernameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(passwordLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(LeftLayout.createSequentialGroup()
                                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(noAccLabel))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                                .addContainerGap(90, Short.MAX_VALUE)
                                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                                                .addComponent(loginLabel)
                                                .addGap(125, 125, 125))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(90, 90, 90))))
        );
        LeftLayout.setVerticalGroup(
                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LeftLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(loginLabel)
                                .addGap(41, 41, 41)
                                .addComponent(emailLabel)
                                .addGap(0, 0, 0)
                                .addComponent(usernameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(passwordLabel)
                                .addGap(0, 0, 0)
                                .addComponent(passwordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCheckBox1)
                                        .addComponent(noAccLabel))
                                .addGap(58, 58, 58)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 400, 500);

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

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();

        this.setIconImage(icon.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tech Minds Academy");
        this.setPreferredSize(new Dimension(800, 500));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()== loginButton) {
            loginForm();

            if (emailPassInfo.containsKey(usernameLogin.getText())) {
                String storedUser = emailPassInfo.get(usernameLogin.getText());
                if (storedUser.equals(passwordLogin.getText())) {
                    JOptionPane.showMessageDialog(null, "Login Successful!", "Success!", JOptionPane.INFORMATION_MESSAGE,successIcon);
                    new HomePage();
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Password!", "Error!", JOptionPane.ERROR_MESSAGE);
                }

            }
            else {
                JOptionPane.showMessageDialog(null, "Email Not Found!", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == clearButton) {

            usernameLogin.setText("");
            passwordLogin.setText("");

        }
    }
    private void loginForm() {
        username = usernameLogin.getText();
        password = passwordLogin.getText();
        //  password = new String(JPasswordField.getPassword());
        //or kasi sabi sa yt outdated na daw ang getText(); method sa jPasswordField or deprecated or may not work

        System.out.println("Username: " + username + ", Password: " + password);

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            loginForm();

            if (emailPassInfo.containsKey(username)) {
                if (emailPassInfo.get(username).equals(password)) {
                    JOptionPane.showMessageDialog(null, "Login Successful", "Success!", JOptionPane.INFORMATION_MESSAGE, successIcon);
                    new HomePage();
                    this.dispose();

                }
                else {
                    JOptionPane.showMessageDialog(null, "Wrong Password!", "Error!", JOptionPane.ERROR_MESSAGE);
                }

            }
            else {
                JOptionPane.showMessageDialog(null, "Email Not Found", "Error!", JOptionPane.ERROR_MESSAGE);
            }

        }
    }
    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
                new SignUpPage();
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
        noAccLabel.setFont(new java.awt.Font("Nunito Sans 10pt", Font.ITALIC, 12));
        noAccLabel.setForeground(new Color(200, 200, 255));
        Font font = noAccLabel.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        noAccLabel.setFont(font.deriveFont(attributes));


    }

    @Override
    public void mouseExited(MouseEvent e) {
        noAccLabel.setText("Don't have an account?");
        noAccLabel.setFont(new java.awt.Font("Nunito Sans 10pt", Font.PLAIN, 12));
        noAccLabel.setForeground(Color.WHITE);

    }
}
