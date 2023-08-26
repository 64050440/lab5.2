/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livescorebean;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LiveScoreBean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreLine obj = new ScoreLine();
        Subscriber obj1 = new Subscriber();
        Subscriber obj2 = new Subscriber();
        obj.addPropertyChangeListener(obj1);
        obj.addPropertyChangeListener(obj2);
        Scanner inp = new Scanner(System.in);
       String scoreLine;
       System.out.print("Enter Score ");
       scoreLine = inp.nextLine();
       while(!scoreLine.equals("")) {
           obj.setSetSomeData(scoreLine);
           System.out.print("Enter Score ");
           scoreLine = inp.nextLine();
       }
    }
}
