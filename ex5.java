import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
         float num;
         float totalnum= 0,quant=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Bem vindo! este programa calcula as medias das notas informadas!");
       
        while( num >= 0){
            System.out.println("informe uma nota entre 0 a 10!! ");
             num = ler.nextFloat();
          
            if(num>=0 && num<=10){
               
                totalnum = totalnum+num;
                quant++ ;
                float maior = num;
                float menor = num;
                if(num>maior){
                    
                }

            }
           
            else{
                System.out.println("Informe um numero valido!!");
            }
        }
        float media = totalnum / quant ;

        System.out.println("as medias das notas é: " + media);
        }
        
    }

