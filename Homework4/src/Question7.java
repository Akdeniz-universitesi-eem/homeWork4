import methodsInHomeworks.utilityClass;

public class Question7 {

    public static void main(String[] args) {

       int x=1;
       for(;;){
        if(isPerfect(x)){

            System.out.println(x);   // 4 basamaklı sadece 1 tane mükemmel sayı varsa bu şekilde bir döngü ile direk bulabilirim 
            
        }
          x++;
        }
       }
       
        
        
    

    public static boolean isPerfect(int a){

        int canDivide = 0;
        for(int i=1; i<a;i++){
            if(a%i==0){
                canDivide = canDivide+i;
            }
        }
        if(canDivide==a){
            return true;
        }
        else{
            return false;
        }
       
    }
    
}
