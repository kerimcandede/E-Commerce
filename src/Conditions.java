
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conditions {
    
    public boolean isProperUsername(String s) {
        return s.length() > 6;   
    }
    
    public boolean isProperPassword(String s) {
        return s.length() > 6 && s.length() < 12;
    }
    
    public boolean isProperEmail(String s) {
        if(s.contains("@")) {
            String[] parts = s.split("@");
            return parts.length == 2;
        }else {
            return false;
        }
    }
    
    public boolean isProperDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String oldestBirthDate = "21/08/1909";
        Date today = new Date();

        try {
            Date realDate = sdf.parse(date);
            Date oldestDate = sdf.parse(oldestBirthDate);
            return !(realDate.before(oldestDate) || realDate.after(today));
        } catch (ParseException ex) {
            Logger.getLogger(Conditions.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean isCreditCardNumber(String s) {
        for(CreditCard cc : User.creditCardInfo) {
            if(cc.getCardNumber().equals(s)) {
                return true;
                
            }
            
        }
        return false;
    }
    
    public static boolean isCheckoutName(String s,User user) {
        return s.equalsIgnoreCase(user.getName()+" "+user.getSurname());
    }
    
    public static boolean isValidThru(String s) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/yy");
        YearMonth cardDate = YearMonth.parse(s, dtf);
        YearMonth currentMonth = YearMonth.now();
        
        return !cardDate.isBefore(currentMonth);
        
        
    }
    
    public static boolean isCVC(String s,CreditCard cc) {
        return cc.getCvv().equals(s);
    }
    
     
}
