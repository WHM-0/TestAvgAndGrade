import java.util.*;
class TestAvgAndGrade
{
    //Aleeh Almassabi
    //A11 - ch5
    public static void main(String[] args)
  {
        // create a Scanner object
        Scanner sc = new Scanner(System.in);
      
        int[] score = new int[5];
      //s = sum
        int x; double s = 0;
        for(x=0;x<5;x++)
        {
            System.out.println("Enter the test score for student " + (x + 1) );
            //Red from user
            score[x] = sc.nextInt(); s += (double)score[x];
        }
        System.out.println("\nThe letter grades are as follows:");
      // loop from 0-5
        for(x=0;x<5;x++)
        {
    System.out.print("Student " + (x + 1) + " : " );
          
            if(score[x] >= 90)  System.out.println("A");
            else if(score[x] >= 80)  System.out.println("B");
            else if(score[x] >= 70)   System.out.println("C");
            else if(score[x] >= 60) System.out.println("D");
            else  System.out.println("F");
        }
        //clucalit the averge
        double avg = s / (double)5;
       System.out.println("\nAverage Score : " + avg); } }