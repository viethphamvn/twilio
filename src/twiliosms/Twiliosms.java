/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twiliosms;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import java.util.Scanner;
import com.twilio.Twilio;

/**
 *
 * @author Viet H. Pham
 */
public class Twiliosms {

    /**
     * @param args the command line arguments
     */
    public static final String ACCOUNT_SID = "AC3ad02addbb2dd7256b9908346c60342b";
    public static final String AUTH_TOKEN = "33a3ad74b00a6c682dfda83751974733";
    public static final String Number = "+16692949869";
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("You are sending message to " + Number);
        Scanner s = new Scanner(System.in);
        
        System.out.println("What is your message?");
        String input = "";
        input = s.nextLine();
        
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(Number),
                new com.twilio.type.PhoneNumber("+18317045687"),
                input)
            .create();

        System.out.println(message.getSid());
    }
    
}