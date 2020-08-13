/**
 * Locker Puzzle : A school has 100 lockers and 100 students. All lockers are closed on the first day of school.
 * As the students enter, the first student, denoted as S1, opens every locker. Then the second student, S2,
 * begins with the second locker, denoted as L2, and closes every other locker. Student S3 begins with the third locker
 * and changes every third locker (closes if it was open and open if it was close). Student S4 begins with locker L4,
 * and change every fourth locker and so on, until student S100 changes L100.
 * After all the students have passed thru the building, and changed the lockers, which lockers are open?
 * Display all open locker number, separated by 1 space.
 * @author Ivy P.
 * @version 7 Jul 20
 */

public class LockerPuzzle {

    public static void main(String[] args) {
    // declare number of students
    final int NUM_OF_STUDENTS = 100;
    //declare an array to represent the lockers. by default all boolean = false -> Locker_Door_isOpen = false
    boolean[] lockers = new boolean[NUM_OF_STUDENTS];

    //each student will change the current status of the lockers
     for (int s = 1; s < NUM_OF_STUDENTS; s++) {
         for (int l = s - 1; l < NUM_OF_STUDENTS; l += s) {
             lockers[l] = !lockers[l];
         }
     }
     // Print out the list of Lockers which are open
     System.out.println("Open Lockers are: ");
     for (int i = 0; i < NUM_OF_STUDENTS; i++) {
         if (lockers[i])
             System.out.print((i + 1) + " ");
     }

    }// end of main method
}// end of class




