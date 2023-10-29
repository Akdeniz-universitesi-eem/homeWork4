import javax.swing.JOptionPane;

public class Question3 {

    public static void main(String[] args) {
     
        for(int ctrl = 1;ctrl<2;ctrl++){

        String password=JOptionPane.showInputDialog(null,"pasword : ");
        if(password.length()<8){
            ctrl=0;
            JOptionPane.showMessageDialog(null, "Should be at least 8 character");
        }
        if(password.length()>95){
             ctrl=0;
            JOptionPane.showMessageDialog(null, "Should be less than 95 character");
        }
        if(password.endsWith(" ") || password.startsWith(" ")){
             ctrl=0;
            JOptionPane.showMessageDialog(null, "cannot have leading or trailing spaces");
        }
        int intctrl =0;
        for (int i=0; i<=9;i++){
            String n =String.valueOf(i);
            
            if(password.contains(n)){
                intctrl++;
            }

        }
        if(intctrl==0){
            ctrl=0; 
            JOptionPane.showMessageDialog(null, "Must contain at least one number");
        }

        if(!password.contains("a") && !password.contains("b") && !password.contains("c") && !password.contains("d")&& !password.contains("e") && !password.contains("f") && !password.contains("g") && !password.contains("h") && !password.contains("i") && !password.contains("j") && !password.contains("k") && !password.contains("l") && !password.contains("m") && !password.contains("n")&&  !password.contains("o")&& !password.contains("p")&& !password.contains("r")&& !password.contains("s")&& !password.contains("t")&& !password.contains("u")&& !password.contains("w")&& !password.contains("x")&& !password.contains("v")&& !password.contains("y")&& !password.contains("z")&&!password.contains("A") && !password.contains("B") && !password.contains("C") && !password.contains("D")&& !password.contains("E") && !password.contains("F") && !password.contains("G") && !password.contains("H") && !password.contains("I") && !password.contains("J") && !password.contains("K") && !password.contains("L") && !password.contains("M") && !password.contains("N")&&  !password.contains("O")&& !password.contains("P")&& !password.contains("R")&& !password.contains("S")&& !password.contains("T")&& !password.contains("U")&& !password.contains("W")&& !password.contains("X")&& !password.contains("V")&& !password.contains("Y")&& !password.contains("Z")){
             
            ctrl=0;
           JOptionPane.showMessageDialog(null, "Must contain at least one letter");
        }
        
        if(!password.contains("!") && !password.contains("@") && !password.contains("#") && !password.contains("$")&& !password.contains("%") && !password.contains("^") && !password.contains("*") && !password.contains("(") && !password.contains(")") && !password.contains("~") && !password.contains("'") && !password.contains("{") && !password.contains("}") && !password.contains("[")&&  !password.contains("]")&& !password.contains("|")&& !password.contains("/")&& !password.contains("&")&& !password.contains("_")&& !password.contains(".")&& !password.contains("+")){
             ctrl=0;
            JOptionPane.showMessageDialog(null, "  Must contain at least one special character");
        }

      }

      JOptionPane.showMessageDialog(null, "Your password has been saved");

       
}
}