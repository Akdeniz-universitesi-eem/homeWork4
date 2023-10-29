import methodsInHomeworks.utilityClass;

public class Question6 {
    public static void main(String[] args) throws Exception {
        
       boolean i = areFriends(220, 284);
        System.out.println(i);
   
        
        
}
    public static boolean areFriends(int i,int j){

        int canDivide1 =0;
        int canDivide2 =0;
        
        for(int a=1;a<i;a++){
            if(i%a==0){
                canDivide1=canDivide1+a;
            }
        }
        for(int a=1;a<j;a++){
            if(j%a==0){
                canDivide2=canDivide2+a;
            }
        }
        if(canDivide1==j && canDivide2==i){
           return true;
        }
        else{
           return false;
        }
       
    

    }


}