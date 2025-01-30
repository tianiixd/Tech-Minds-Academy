package HCI.Tech_Minds_Academy_MiniSystem;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


import static HCI.Tech_Minds_Academy_MiniSystem.LoginPage.username;


public class StudentsPage extends javax.swing.JFrame {
    ImageIcon updateIcon = new ImageIcon("pen.png");
    ImageIcon infoIcon = new ImageIcon("information.png");
    ImageIcon successIcon = new ImageIcon("check.png");
    ImageIcon successIcon2 = new ImageIcon("checked.png");
    ImageIcon errorIcon = new ImageIcon("removeRedBig.png");
    ImageIcon addIcon = new ImageIcon("addBlack.png");
    ImageIcon removeIcon = new ImageIcon("binBlack.png");
    ImageIcon frameIcon = new ImageIcon("gradcap.png");
    ImageIcon homeIcon = new ImageIcon("home.png");
    ImageIcon logoutIcon = new ImageIcon("logout.png");
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private Queue<Student> studentData;
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Header;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    public com.toedter.calendar.JDateChooser birthChooser;
    public javax.swing.JLabel birthDateLabel;
    private javax.swing.JTextField conNumField;
    private javax.swing.JLabel contactNumLabel;
    private javax.swing.JComboBox<String> courseBox;

    private JTextField fNameField;
    public javax.swing.JRadioButton femaleButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JPanel formPanel;
    private javax.swing.JSeparator headerSeparator;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private DefaultTableModel tableModel;
    private javax.swing.JTextField lNameField;
    private javax.swing.JLabel lastNameLabel1;
    public javax.swing.JRadioButton maleButton;
    public javax.swing.JLabel signOutLabel;
    private javax.swing.JLabel studNameLabel1;
    private javax.swing.JLabel studRegForm;



    public StudentsPage() {

        studentData = new LinkedList<>();
        javax.swing.ButtonGroup buttonGroup1 = new javax.swing.ButtonGroup();
        Container = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        signOutLabel = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        headerSeparator = new javax.swing.JSeparator();
        formPanel = new javax.swing.JPanel();
        conNumField = new javax.swing.JTextField();
        studNameLabel1 = new javax.swing.JLabel();
        fNameField = new JTextField();
        ageLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        jTable1 = new javax.swing.JTable();
        tableModel = (DefaultTableModel) jTable1.getModel();
        firstNameLabel = new javax.swing.JLabel();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        birthDateLabel = new javax.swing.JLabel();
        contactNumLabel = new javax.swing.JLabel();
        birthChooser = new com.toedter.calendar.JDateChooser();
        studRegForm = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        lNameField = new javax.swing.JTextField();
        lastNameLabel1 = new javax.swing.JLabel();
        ageField = new JTextField();
        courseBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();


        buttonGroup1.add(maleButton);
        buttonGroup1.add(femaleButton);


        Container.setBackground(new java.awt.Color(255, 255, 255));
        Container.setLayout(null);

        Header.setBackground(new java.awt.Color(39, 60, 117));
        Header.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Roboto Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ENROLL STUDENTS");
        Header.add(jLabel2);
        jLabel2.setBounds(415, 25, 382, 43);

        signOutLabel.setFont(new java.awt.Font("Nunito Black", 1, 25)); // NOI18N
        signOutLabel.setForeground(new java.awt.Color(255, 255, 255));
        signOutLabel.setIcon(logoutIcon);
        signOutLabel.setText("Sign Out");
        signOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signOutLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signOutLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signOutLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signOutLabelMousePressed(evt);
            }
        });
        Header.add(signOutLabel);
        signOutLabel.setBounds(1001, 25, 160, 35);

        homeLabel.setFont(new java.awt.Font("Nunito Black", 1, 25)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setIcon(homeIcon);
        homeLabel.setText("Home");
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLabelMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
        });
        Header.add(homeLabel);
        homeLabel.setBounds(50, 30, 111, 35);

        headerSeparator.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, null, null));
        Header.add(headerSeparator);
        headerSeparator.setBounds(0, 87, 1200, 3);

        Container.add(Header);
        Header.setBounds(0, 0, 1200, 90);

        formPanel.setBackground(new java.awt.Color(33, 58, 88));
        formPanel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        formPanel.setMaximumSize(new java.awt.Dimension(800, 620));
        formPanel.setMinimumSize(new java.awt.Dimension(800, 620));
        formPanel.setLayout(null);

        conNumField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        conNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conNumFieldActionPerformed(evt);
            }
        });
        formPanel.add(conNumField);
        conNumField.setBounds(30, 360, 180, 25);

        studNameLabel1.setFont(new java.awt.Font("Nunito", 1, 14)); // NOI18N
        studNameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        studNameLabel1.setText("Sex");
        formPanel.add(studNameLabel1);
        studNameLabel1.setBounds(30, 470, 140, 19);

        fNameField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        fNameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameFieldActionPerformed(evt);
            }
        });
        formPanel.add(fNameField);
        fNameField.setBounds(30, 90, 180, 25);

        ageLabel.setFont(new java.awt.Font("Nunito", 1, 14)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageLabel.setText("Age");
        ageLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        formPanel.add(ageLabel);
        ageLabel.setBounds(30, 280, 90, 19);

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black));
        jTable1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "First Name", "Last Name", "Birth Date", "Age", "Contact No.", "Sex", "Course", "School Year"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });


        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setShowGrid(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int selectedRow = jTable1.getSelectedRow();
                if (selectedRow >= 0) {

                    fNameField.setText((String) jTable1.getValueAt(selectedRow, 0));
                    lNameField.setText((String) jTable1.getValueAt(selectedRow, 1));
                    try {
                        birthChooser.setDate(dateFormat.parse((String) jTable1.getValueAt(selectedRow, 2)));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Invalid date format in table!", "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                    ageField.setText((String) jTable1.getValueAt(selectedRow, 3));
                    conNumField.setText((String) jTable1.getValueAt(selectedRow, 4));
                    String selectedSex = (String) jTable1.getValueAt(selectedRow, 5);
                    if ("Male".equalsIgnoreCase(selectedSex)) {
                        maleButton.setSelected(true);
                    } else {
                        femaleButton.setSelected(true);
                    }
                    courseBox.setSelectedItem(jTable1.getValueAt(selectedRow, 6));
                }
            }
        });

        formPanel.add(jScrollPane1);
        jScrollPane1.setBounds(270, 50, 930, 610);

        firstNameLabel.setFont(new java.awt.Font("Nunito", 1, 14)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name");
        firstNameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        formPanel.add(firstNameLabel);
        firstNameLabel.setBounds(30, 70, 140, 19);

        maleButton.setBackground(new java.awt.Color(33, 58, 88));
        maleButton.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        maleButton.setForeground(new java.awt.Color(255, 255, 255));
        maleButton.setSelected(true);
        maleButton.setText("Male");
        maleButton.setFocusable(false);
        formPanel.add(maleButton);
        maleButton.setBounds(30, 490, 70, 24);

        femaleButton.setBackground(new java.awt.Color(33, 58, 88));
        femaleButton.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        femaleButton.setForeground(new java.awt.Color(255, 255, 255));
        femaleButton.setText("Female");
        femaleButton.setFocusable(false);
        formPanel.add(femaleButton);
        femaleButton.setBounds(100, 490, 90, 24);

        birthDateLabel.setFont(new java.awt.Font("Nunito", 1, 14)); // NOI18N
        birthDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        birthDateLabel.setText("Date Of Birth ");
        formPanel.add(birthDateLabel);
        birthDateLabel.setBounds(30, 210, 140, 19);

        contactNumLabel.setFont(new java.awt.Font("Nunito", 1, 14)); // NOI18N
        contactNumLabel.setForeground(new java.awt.Color(255, 255, 255));
        contactNumLabel.setText("Contact No.");
        formPanel.add(contactNumLabel);
        contactNumLabel.setBounds(30, 340, 140, 19);

        birthChooser.setBorder(null);
        birthChooser.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        formPanel.add(birthChooser);
        birthChooser.setBounds(33, 230, 175, 27);

        studRegForm.setFont(new java.awt.Font("Nunito ExtraBold", 1, 18)); // NOI18N
        studRegForm.setForeground(new java.awt.Color(255, 255, 255));
        studRegForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studRegForm.setText("Student Registration Form");
        formPanel.add(studRegForm);
        studRegForm.setBounds(-20, 0, 320, 60);

        updateBtn.setBackground(new java.awt.Color(63, 114, 175));
        updateBtn.setFont(new java.awt.Font("Nunito Sans 10pt", 1, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setIcon(updateIcon);
        updateBtn.setText("UPDATE");
        updateBtn.setFocusable(false);
        updateBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        updateBtn.setIconTextGap(6);
        updateBtn.setMargin(new java.awt.Insets(5, 14, 5, 14));
        updateBtn.setRolloverEnabled(false);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        formPanel.add(updateBtn);
        updateBtn.setBounds(50, 570, 160, 35);

        deleteBtn.setBackground(new java.awt.Color(176, 0, 32));
        deleteBtn.setFont(new java.awt.Font("Nunito Sans 10pt", 1, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setIcon(removeIcon);
        deleteBtn.setFocusable(false);
        deleteBtn.setIconTextGap(3);
        deleteBtn.setText(" DELETE");
        deleteBtn.setMargin(new java.awt.Insets(5, 14, 5, 18));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        formPanel.add(deleteBtn);
        deleteBtn.setBounds(50, 610, 160, 35);

        lNameField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameFieldActionPerformed(evt);
            }
        });
        formPanel.add(lNameField);
        lNameField.setBounds(30, 160, 180, 25);

        lastNameLabel1.setFont(new java.awt.Font("Nunito", 1, 14)); // NOI18N
        lastNameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel1.setText("Last Name");
        lastNameLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        formPanel.add(lastNameLabel1);
        lastNameLabel1.setBounds(30, 140, 140, 19);

        ageField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });
        formPanel.add(ageField);
        ageField.setBounds(30, 300, 180, 25);


        courseBox.setFocusable(true);
        courseBox.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        courseBox.setMaximumRowCount(3);
        courseBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSA", "BSBA", "BSCPE", "BSCS", "BSCM", "BSHM", "BSIS", "BSIT", "BSMA", "BSTM"}));
        courseBox.setBorder(null);
        courseBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseBoxActionPerformed(evt);
            }
        });
        formPanel.add(courseBox);
        courseBox.setBounds(33, 420, 175, 27);

        jLabel1.setFont(new java.awt.Font("Nunito", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Course");
        formPanel.add(jLabel1);
        jLabel1.setBounds(30, 400, 60, 20);

        jLabel3.setFont(new java.awt.Font("Nunito Sans 10pt Light", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Student's Information");
        formPanel.add(jLabel3);
        jLabel3.setBounds(610, 10, 230, 30);

        addBtn.setBackground(new java.awt.Color(0, 204, 51));
        addBtn.setFont(new java.awt.Font("Nunito Sans 10pt", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setIcon(addIcon);
        addBtn.setText("ADD");
        addBtn.setFocusable(false);
        addBtn.setIconTextGap(5);
        addBtn.setMargin(new java.awt.Insets(5, 14, 3, 35));
        addBtn.setRolloverEnabled(false);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        formPanel.add(addBtn);
        addBtn.setBounds(50, 530, 160, 35);

        Container.add(formPanel);
        formPanel.setBounds(0, 90, 1200, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        this.setIconImage(frameIcon.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tech Minds Academy");
        this.setPreferredSize(new Dimension(1000, 750));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }


    private void homeLabelMouseExited(MouseEvent evt) {
        homeLabel.setText("Home");
        homeLabel.setFont(new java.awt.Font("Nunito Black", 1, 25));
        homeLabel.setForeground(Color.WHITE);
    }

    private void homeLabelMouseEntered(MouseEvent evt) {
        homeLabel.setFont(new java.awt.Font("Nunito Black", Font.ITALIC, 25));
        homeLabel.setText("<html><u>Home</u></html>");
        homeLabel.setForeground(new Color(200, 200, 255));
    }

    private void signOutLabelMouseExited(MouseEvent evt) {
        signOutLabel.setText("Sign Out");
        signOutLabel.setFont(new java.awt.Font("Nunito Black", 1, 25));
        signOutLabel.setForeground(Color.WHITE);
    }

    private void signOutLabelMouseEntered(MouseEvent evt) {
        signOutLabel.setFont(new java.awt.Font("Nunito Black", Font.ITALIC, 25));
        signOutLabel.setText("<html><u>Sign Out</u></html>");
        signOutLabel.setForeground(new Color(200, 200, 255));
    }

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {

        new HomePage();
        this.dispose();
    }

    private void courseBoxActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void lNameFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {
        removeData();

    }

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {
        if(fNameField.getText().isEmpty() || lNameField.getText().isEmpty() ||  birthChooser.getDate() == null || ageField.getText().isEmpty() || conNumField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter All The Data!", "Empty!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            if (!validateInput()) {

                return;
            }
            isDuplicate(fNameField.getText(), lNameField.getText(), birthChooser.getDate(), ageField.getText(), conNumField.getText(), courseBox.getSelectedItem().toString());

            addData();

            removeInput();

            JOptionPane.showMessageDialog(this,"Data Added SuccessFully!","Success!",JOptionPane.INFORMATION_MESSAGE,successIcon);

        }
    }


    private void updateBtnActionPerformed(ActionEvent evt) {
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow >= 0) {

            String fName = fNameField.getText().trim();
            fName = fName.substring(0, 1).toUpperCase() + fName.substring(1).toLowerCase();

            String lName = lNameField.getText().trim();
            lName = lName.substring(0, 1).toUpperCase() + lName.substring(1).toLowerCase();

            Date birthDate = birthChooser.getDate();
            String birthDateString = birthDate != null ? dateFormat.format(birthDate) : null;

            String age = ageField.getText();
            String contactNum = conNumField.getText();
            String sex = maleButton.isSelected() ? "Male" : "Female";
            String course = courseBox.getSelectedItem().toString();


            if (!validateInput()) {
                return;
            }


            for (int row = 0; row < jTable1.getRowCount(); row++) {
                if (row != selectedRow) {
                    String tableFName = (String) jTable1.getValueAt(row, 0);
                    String tableLName = (String) jTable1.getValueAt(row, 1);
                    String tableBirthDate = (String) jTable1.getValueAt(row, 2);

                    if (tableFName.equalsIgnoreCase(fName) &&
                            tableLName.equalsIgnoreCase(lName) &&
                            tableBirthDate.equals(birthDateString)) {
                        JOptionPane.showMessageDialog(this, "Duplicate entry on row you have selected!", "Duplicate Entry", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }


            jTable1.setValueAt(fName, selectedRow, 0);
            jTable1.setValueAt(lName, selectedRow, 1);
            jTable1.setValueAt(birthDateString, selectedRow, 2);
            jTable1.setValueAt(age, selectedRow, 3);
            jTable1.setValueAt(contactNum, selectedRow, 4);
            jTable1.setValueAt(sex, selectedRow, 5);
            jTable1.setValueAt(course, selectedRow, 6);


            updateStudentData(selectedRow, fName, lName, birthDateString, age, contactNum, sex, course);

            JOptionPane.showMessageDialog(this, "Data Updated Successfully!", "Success!", JOptionPane.INFORMATION_MESSAGE,successIcon);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to update!", "No Selection", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateStudentData(int rowIndex, String fName, String lName, String birthDate, String age, String contactNum, String sex, String course) {
        int currentIndex = 0;
        for (Student student : studentData) {
            if (currentIndex == rowIndex) {
                student.setFirstName(fName);
                student.setLastName(lName);
                student.setBirthDate(birthDate);
                student.setAge(age);
                student.setContactNumber(contactNum);
                student.setGender(sex);
                student.setCourse(course);
                break;
            }
            currentIndex++;
        }
    }

    private boolean isDuplicate(String fName, String lName, Date birthDate, String age, String contactNum, String courseYear) {
        String birthDateString = birthDate != null ? dateFormat.format(birthDate) : null;

        for (int row = 0; row < jTable1.getRowCount(); row++) {

            String tableFName = (String) jTable1.getValueAt(row, 0);
            String tableLName = (String) jTable1.getValueAt(row, 1);
            String tableBirthDate = (String) jTable1.getValueAt(row, 2);
            String tableAge = (String) jTable1.getValueAt(row, 3);
            String tableContactNum = (String) jTable1.getValueAt(row, 4);
            String tableCourseYear = (String) jTable1.getValueAt(row, 6);


            if (tableFName.equalsIgnoreCase(fName) &&
                    tableLName.equalsIgnoreCase(lName) &&
                    tableBirthDate.equals(birthDateString) &&
                    tableAge.equals(age) &&
                    tableContactNum.equals(contactNum)&&
                            tableCourseYear.equals(courseYear))

            {
                return true;
            }
        }

        return false;
    }

    private boolean validateInput() {
        String fName = fNameField.getText();
        String lName = lNameField.getText();
        String age = ageField.getText();
        String contactNum = conNumField.getText();
        Date birthDate = birthChooser.getDate();
        Date currentDate = new Date();

        String namePattern = "^[a-zA-Z ]+$";

        String agePattern = "^[0-9]+$";

        String contactNumPattern = "^[0-9]+$";

        if (!fName.matches(namePattern)) {
            JOptionPane.showMessageDialog(this, "First name can only contain letters!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return false;
        }


        if (!lName.matches(namePattern)) {
            JOptionPane.showMessageDialog(this, "Last name can only contain letters!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (birthDate != null) {
            if (birthDate.after(currentDate)) {
                JOptionPane.showMessageDialog(this, "Birthdate must be before current date!", "Invalid Date", JOptionPane.ERROR_MESSAGE);
                return false;
            } else if (isSameDay(birthDate, currentDate)) {
                JOptionPane.showMessageDialog(this, "Birthdate is the same as the current date.", "Invalid Date", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        if (!age.matches(agePattern)) {
            JOptionPane.showMessageDialog(this, "Age must be a number!", "Invalid Age", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if(!contactNum.matches(contactNumPattern)){
            JOptionPane.showMessageDialog(this, "Contact number must be a number!", "Invalid Contact Number", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String course = String.valueOf(courseBox.getSelectedItem());
        if (isDuplicate(fName, lName, birthDate, age, contactNum, course)) {
            JOptionPane.showMessageDialog(this, "Duplicate entry for the same First Name, Last Name, and Birthdate", "Duplicate Entry!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;

    }

    private boolean isSameDay(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2.setTime(date2);
        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR);
    }

    private void addData() {
        tableModel = (DefaultTableModel) jTable1.getModel();
        String fName = fNameField.getText().trim();
        fName = fName.substring(0, 1).toUpperCase() + fName.substring(1).toLowerCase();

        String lName = lNameField.getText().trim();
        lName = lName.substring(0, 1).toUpperCase() + lName.substring(1).toLowerCase();

        String birthDate = dateFormat.format(birthChooser.getDate());

        String age = ageField.getText();

        String contactNum = conNumField.getText();

        String sex = maleButton.isSelected() ? "Male" : "Female";

        String course = String.valueOf(courseBox.getSelectedItem());

        String year = "2024-2025";

        String[] studInfo = {fName, lName, birthDate, age, contactNum, sex, course, year};

        tableModel.addRow(studInfo);
        studentData.offer(new Student(fNameField.getText(), lNameField.getText(), birthDate, ageField.getText(), conNumField.getText(), sex, course, year));

        for (Student student : studentData) {
            System.out.println(student);
        }

        System.out.println(studentData);

    }

    private void removeInput(){

        fNameField.setText("");
        lNameField.setText("");
        birthChooser.setDate(null);
        ageField.setText("");
        conNumField.setText("");
        maleButton.setSelected(true);
        courseBox.setSelectedIndex(0);

    }

    private void removeData() {
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow >= 0) {

            tableModel.removeRow(selectedRow);

            Iterator<Student> iterator = studentData.iterator();
            int currentIndex = 0;

            while (iterator.hasNext()) {
                iterator.next();
                if (currentIndex == selectedRow) {
                    iterator.remove();
                    break;
                }
                currentIndex++;
            }

        } else if (jTable1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Table Is Empty!", "Failed! Empty!", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Select A Single Row For Delete!", "Please Select!", JOptionPane.ERROR_MESSAGE);
        }
        removeInput();
    }

    private void fNameFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void conNumFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void signOutLabelMouseClicked(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Sign out Successful!", "Success!", JOptionPane.INFORMATION_MESSAGE, successIcon);
        EmailAndPassword emailAndPassword = new EmailAndPassword();
        new LoginPage(emailAndPassword.getAccount());
        this.dispose();
    }

    private void signOutLabelMousePressed(java.awt.event.MouseEvent evt) {

    }

}
