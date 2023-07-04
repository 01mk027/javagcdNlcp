import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("n1 sayisini giriniz: ");
        int n1 = input.nextInt();
        System.out.println("n2 sayisini giriniz: ");
        int n2 = input.nextInt();
        int gcp = 1; // Great Common Product
        int iteratorForGreatCommonDivisor = 1;
        if(n1 >= n2){
            iteratorForGreatCommonDivisor = n1;
        }
        else{
            iteratorForGreatCommonDivisor = n2;
        }
        while(iteratorForGreatCommonDivisor >= 1)
        {
            if(n1 % iteratorForGreatCommonDivisor == 0 && n2 % iteratorForGreatCommonDivisor == 0)
            {
                gcp = iteratorForGreatCommonDivisor;
                break;
            }
            iteratorForGreatCommonDivisor--;
        }

        for(int i=1; i<=(n1 *n2); i++)
        {
            if(i%n1 == 0 && i %n2 == 0)
            {
                System.out.println(i);
                break;
            }
        }

        int iteratorForLeastCommonProduct = 1;
        int lcp = 1; //Least Common Product
        while(iteratorForLeastCommonProduct <= (n1 * n2))
        {
            if(iteratorForLeastCommonProduct % n1 == 0 && iteratorForLeastCommonProduct % n2 == 0)
            {
                lcp = iteratorForLeastCommonProduct;
                break;
            }
            iteratorForLeastCommonProduct++;
        }

        /* 
        
        for(int i=1; i <= n1; i++)
        {
            System.out.println(i);
            if(n1 % i == 0 && n2 % i == 0)
            {
                
                ebob = i;
            }
        }
        System.out.println("===========");
        for(int k=n1; k>=1; k--)
        {
            System.out.println(k);
            if(n1 % k == 0 && n2 % k == 0)
            {
                ebob = k;
                break;
            }
        }
        */


        System.out.println(lcp + "  " + gcp);
    }
}
