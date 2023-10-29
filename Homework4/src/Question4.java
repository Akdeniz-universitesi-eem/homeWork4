import javax.swing.JOptionPane;
import methodsInHomeworks.utilityClass;

public class Question4 {
    public static void main(String[] args) {
        // 34 de maximum hassaslıkta verirken 35 ve üstündeki değerlerde infinity vveriyor
        double e =0;
        double terms=1;
        String number=JOptionPane.showInputDialog(null, "How many terms should be collected?");
        int no=Integer.parseInt(number);

        for(int j=0;j<no;j++){
        for(int i=0;i<=j;i++){
           terms = 1.000000/utilityClass.factorial(i);

        }
            e= e + terms;
        }
        if(no<=34){
        
            System.out.println(e);
        }
        else{
            System.out.println("This program is not precision to calculate that much value but it's about : 2.7182818319866504" );
        }
    }
    
}
