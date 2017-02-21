package secondclass;

public class Estructuras {

    public static void main(String[] args) {

        int[] a = new int[100];
        //a[i]=(int) ((int) (Math.random()*(99+1))*(Math.random()*(99+1)));
        for (int i = 0; i < 50; ++i) {
            String b = null,c = null,d = null,e,f,g,h;
            a[i] = (int) (Math.random() * 99);
            b+="*";
            System.out.println(a[i]);
//           b==(a[i]>=0 && a[i]<=9) & "*":"";
            
        }
    }

}
/*
 if(a[i]>=0&&a[i]<=9){ 
                b+="*";
            }else if(a[i]>=10&&a[i]<=19){
                c+="*";
            }else if(a[i]>=20&&a[i]<=29){
                d+="*";
            }else if(a[i]>=30&&a[i]<=39){
                
            }else if(a[i]>=40&&a[i]<=49){
                
            }else if(a[i]>=50&&a[i]<=59){
                
            }else if(a[i]>=60&&a[i]<=69){
                
            }else if(a[i]>=70&&a[i]<=79){
                
            }else if(a[i]>=80&&a[i]<=89){
                
            }else if(a[i]>=90&&a[i]<=99){
                
            }
*/
//a[i]==0||a[i]==1||a[i]==2||a[i]==3||a[i]==4||a[i]==4||a[i]==5||a[i]==6||a[i]==7||a[i]==8||a[i]==9
//            for (int j = 0; j < 50; j++) {
//                if(a[i]==a[j]){
//                    a[j]=(int) (Math.random()*99+1);
//                }
//            }
