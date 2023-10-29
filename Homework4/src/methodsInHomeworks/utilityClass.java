package methodsInHomeworks;


public class utilityClass {
   
    

    public static String prime(int i){ // asal sayı

        int c=0;
        if(i<0)
            return "Not Prime";
        
        for(int m=2;m<i;m++){
            if(i==(i/m)*m){
                c++;
            }    
        }
        if(i==1){
            return "Not Prime";
        }
        if(c==0){
            return "Prime"; 
        }
        else{
            return "Not Prime";
        }
        
    }

    public static int digitNumberSum(int i){ //345   > 300 40 5  > 3 4 5 (345/100=3 3<10 )
      
        int c=0;
        int n=1;
        for(int m=1;m<i;m*=10){ // herhangi bir basamak değerinde yazılabileceği için maksimum basamaktan bölmeye başlaması için for döngüsü
            if(i/m>10){
                n=n*10;
            }
            
        }

        for(int a = n ; a<i;a/=10){ //  maksimum basamaktan başlayıp her basamaktaki sayıyı c ile toplayacak şekilde işlem yapması için for döngüsü
           
            c= c + (i/a);
            i= i - (i/a)*a;
        }
        if(i<10){
            c=c+i;
        }
        return c; 
    }

    public static Boolean isXPrime(int i){


        int c =0;
        
        for(int b = digitNumberSum(i);b>=2; b = digitNumberSum(i)){ // değerin basamakları toplamı 2  veya 2'den büyük olması durumunda
            if(prime(i)=="Prime"){    // asal mı diye kontrol et. Asal ise, digitnumber ile yine basamaklarını topla ve yukarı dön
                System.out.println(i);
                int y = digitNumberSum(i);
                i=y;
                if(i==2 || i==3 || i==5|| i==7){
                    System.out.println(i);
                    i=0;
                }                      
            }
            else{    //  değişen sayılar asal değilse c ye 1 ekle
                System.out.println(i);
                c++;
                i=1;
            }            

        }
            if(c!=0){   // ilk döngüden çıkınca c değerine  göre return et
            return false;
            }
            else{
            return true;
            }        

        
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

    public static int canDivide(int i){

       int candivide = 0;
       for(int a=1;a<i;a++){
        if(i%a==0){
            candivide = a;
            System.out.println(a);
        }
       }
        
        return 0;
    }

    public static int sumFactors(int i){

        int cansum =0;
        for(int a=1;a<i;a++){
        if(i%a==0){
            cansum =cansum+ a;
            
        }
       }
       return cansum;

    }

    public static int factorial(int i){

        int total =1;
        for(int a=1; a<=i;a++){
            total=total*a;
        }
        if(i==0){
            return 1;
        }
        else{
            return total;
        }

    }
}

