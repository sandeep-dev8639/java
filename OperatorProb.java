public class OperatorProb {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        System.out.println("sum of a and b="+(a+b));
        if(a>=0){
            System.out.println("a is positive");
        }
        if((a>=0) || (a%2==0)){
            System.out.println("a is positive and also an even number");
        }
        else{
            System.out.println();
        }
        a*=b;
        System.out.println("a value is="+a);
        a++;
        System.out.println("a value is="+a);



        boolean bool = ((a>0)||(a%2==0));
        System.out.println(bool);
    }
}
