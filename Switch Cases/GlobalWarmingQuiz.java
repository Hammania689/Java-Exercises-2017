import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by hameed 함 on 3/22/2017.
 */
public class GlobalWarmingQuiz
{
    static int correctAnswer = 0;

    public static void main(String[] arg)
    {
        for(int currentQuestion = 1; currentQuestion < 5; currentQuestion++)
        {
            QuizPrompt(currentQuestion);
        }
        QuizResult();
    }

    static void QuizPrompt(int questionNumber)
    {

        switch (questionNumber)
        {

            case 1 :
                Scanner answerChoice;
                char answer;

                answerChoice = new Scanner(System.in);
                out.println("How can the changing of climate and weather affect human health? \n");
                out.println("A. Increase frequency or severity of existing health risks\n" +
                             "B. Introduce health risks to geographic regions where they have not previously occurred\n" +
                             "C. Shift the timing of seasonal health risks\n" +
                             "D. All of the above");

                answer = answerChoice.next().charAt(0);

                switch(Character.toUpperCase(answer))
                {
                    case 'D' : correctAnswer += 1;
                        break;
                }
                break;
            //============================================================================
            case 2 :
                answerChoice = new Scanner(System.in);
                out.println("Which illness does NOT increase in frequency along with higher temperatures? \n"
                        + "a. Dehydration\n" +
                        "b. Arthritis \n" +
                        "c. Kidney stones\n" +
                        "d. Legionnaires’ disease\n");
                answer = answerChoice.next().charAt(0);
                // Question Response
                switch(Character.toUpperCase(answer))
                {
                    case 'B' : correctAnswer += 1;
                        break;
                }
                break;
            //============================================================================
            case 3 :
                answerChoice = new Scanner(System.in);
                out.println("Which list arranges climate change-related extreme weather events in the United States\n"
                        +"in order from most to least dangerous (based on a 10-year average of resulting deaths)?\n" +
                        "a. Hurricanes, floods, heat waves\n" +
                        "b. Floods, heat waves, hurricanes\n" +
                        "c. Heat waves, hurricanes, floods \n" +
                        "d. Floods, hurricanes, heat waves");
                answer = answerChoice.next().charAt(0);
                // Question Response
                switch(Character.toUpperCase(answer))
                {
                    case 'C' : correctAnswer += 1;
                        break;
                }
                break;
            //============================================================================
            case 4 :
                answerChoice = new Scanner(System.in);
                out.println("Increasing temperatures from climate change are causing ticks that carry Lyme disease to\n"
                        +"become active earlier in the year and expand their distribution north. How many cases of Lyme disease\n"
                        +" per year are reported in the United States on average?\n" +
                        "a. 50\n" +
                        "b. 3,500\n" +
                        "c. 30,500 \n" +
                        "d. 300,500");
                answer = answerChoice.next().charAt(0);
                // Question Response
                switch(Character.toUpperCase(answer))
                {
                    case 'C' : correctAnswer += 1;
                        break;
                }
                break;
            //============================================================================
            case 5 :
                answerChoice = new Scanner(System.in);
                out.println("How can climate change affect the frequency of West Nile virus infections?\n" +
                        "a. Changing weather conditions alter mosquito habitat\n" +
                        "b. Changing weather conditions alter bird habitat\n" +
                        "c. Changes in mosquito hatching and survival rates\n" +
                        "d. Both A and C\n" +
                        "e. All of the above");
                answer = answerChoice.next().charAt(0);
                // Question Response
                switch(Character.toUpperCase(answer))
                {
                    case 'D' : correctAnswer += 1;
                        break;
                }
                break;
        }

    }

    static void QuizResult()
    {
        out.println("\n\n"+"You answered " + correctAnswer + " questions correctly.\n");

        switch (correctAnswer)
        {
            case 5 : out.println("Excellent\n");
                break;
            case 4 : out.println("Very good \n");
                break;
            default: out.println("Time to brush up on your knowledge of global warming \n");
        }
    }
}
