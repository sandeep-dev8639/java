import java.util.*;
public class Movie {    
    static void back(){
        Scanner a = new Scanner(System.in);
        System.out.println("movie name :");
        String movieName = a.nextLine();
        System.out.println("ticket price :");
        int ticketPrice = a.nextInt();
        System.out.println("number of seats :");
        int seat = a.nextInt();
        if((seat!=0)&&(ticketPrice!=0)){
            int total=ticketPrice*seat;
            System.out.println("total amount :"+total);
        }
        else{
            System.out.println("enter valid ticket price and seat.");
            back();
        }
    }
    public static void main(String[] args) {
        back();
    }    
}

