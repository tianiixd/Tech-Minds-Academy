package HCI.Tech_Minds_Academy_MiniSystem;


import com.formdev.flatlaf.*;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static HCI.Tech_Minds_Academy_MiniSystem.SignUpPage.signUpAcc;

public class Main {
    public static void main(String[] args) {


        //FlatLightLaf.setup();
        //FlatIntelliJLaf.setup();
        FlatMacLightLaf.setup();
        //FlatDarkLaf.setup();

        //EmailAndPassword accounts = new EmailAndPassword();





        new LoginPage(signUpAcc);
    }
}
