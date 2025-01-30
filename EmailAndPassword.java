package HCI.Tech_Minds_Academy_MiniSystem;

import java.util.HashMap;

import static HCI.Tech_Minds_Academy_MiniSystem.SignUpPage.*;

public class EmailAndPassword {
    HashMap<String,String> emailAndPassword = new HashMap<String,String>();

    public EmailAndPassword(){
        emailAndPassword.put("admin","admin");
        emailAndPassword.put("123","123");

    }

    protected HashMap getAccount(){
        return emailAndPassword;
    }

}
