package PractiseQuiz;

import java.util.Scanner;

public class Quiz {
    private Question q1 = new Question("What is the currency of Nepal?", new String[]{"Dollar", "Rupee", "Pound"},"Rupee" );
    private Question q2 = new Question("What is 2+8",new String[]{"10","13","8"},"10" );
    private Question q3 = new Question("What is the longest river?",new String[]{"Bagmati","Nile","Karnali"},"Nile" );
    private Question q4 = new Question("Where is birthplace of Buddha?",new String[]{"Nepal","Japan","China"},"Nepal" );
    private Question q5 = new Question("What is the currency of Nepal?",new String[]{"Dollar","Rupee","Pound"},"Rupee" );
    private Question[] questionSet;
    private int point;
    public Quiz() {
        this.questionSet= new Question[]{q1,q2,q3,q4,q5};
        this.point = 0;
    }
    public void playQuiz(){
        for(int i=0; i<questionSet.length; i++){
            System.out.println(questionSet[i].getQuestion());
            for(int j=0; j<questionSet[i].getOptions().length; j++){
                System.out.print(questionSet[i].getOptions()[j]+"   ");
            }
            System.out.println();
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            if (answer.equals(questionSet[i].getAnswer())){
                System.out.println("Correct!");
                point++;
            }

        }
    }

    public int getPoint() {
        return point;
    }
}
