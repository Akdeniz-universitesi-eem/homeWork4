public class Question5 {
    
    public static void main(String[] args) {

      int a=sumFactors(12);
      System.out.println(a);
    }

    public static int sumFactors(int i){

        int cansum =0;
        for(int a=1;a<i;a++){
        if(i%a==0){
            cansum =cansum+ a;
            
        }
       }
       if(i==1){
        return 1;
       }
       else{
        return cansum;
       }
       
    }
    
}
