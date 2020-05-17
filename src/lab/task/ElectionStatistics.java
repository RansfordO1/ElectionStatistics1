package lab.task;

import java.util.Scanner;

public class ElectionStatistics {

    public static void main(String[] args){

        int vote1, vote2, vote3;
        String party1, party2, party3;
        int total;

        double pct1, pct2, pct3;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter name for First party :");

        party1 = input.nextLine();

        System.out.println("Enter votes recieved >>");
        vote1 = input.nextInt();

        input.nextLine();

        System.out.println("Enter name for Second party : ");

        party2 = input.nextLine();

        System.out.println(" Enter votes recieved >>");
        vote2  = input.nextInt();

        input.nextLine();

        System.out.println("Enter name for Third party :");

        party3 = input.nextLine();

        System.out.println("Enter votes recieved >>");
        vote3 = input.nextInt();

        total = vote1 + vote2 + vote3;

        pct1 = (vote1*100)/total;
        pct2 = (vote2*100)/total;
        pct3 = (vote3*100)/total;

        System.out.println(" The first party "+ party1 +" had "+ pct1 +" % "+" Votes "+" \n "+ " The Second party "+ party2 +" had "+pct2+" % "+" Votes "+" \n "+
                " The Third party "+party3+" had "+pct3+" % "+"Votes");

    }
}
