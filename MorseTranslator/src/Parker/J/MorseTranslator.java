package Parker.J;

import java.util.Scanner;

public class MorseTranslator {

    public static void main(String[] args){

        System.out.println("Morse code translator");

        Scanner input = new Scanner(System.in);
        //Arrays for morse and character alphabet
        char [] alpha = {'a','b','c','d','e','f','g','h','i','j','k',
                'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ',
                '0','1','2','3','4','5','6','7','8','9',};


        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
                ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-",
                "-.--","--..","   ",".----","..---","...--","....-",".....","-....","--...",
                "---..","----.","-----"};

//While loop starting the translator
// loops until user enters -1 to exit

        boolean keepGoing = true;
        while (keepGoing){

            System.out.print("\n Enter a sentence to translate,"
                    + " or enter -1 to exit");

            String userString = input.nextLine().trim().toLowerCase();

            if ("-1".equals(userString)){
                System.out.println("GoodBye!!!");
                keepGoing = false;
                continue;
            }




            /*Eng to morse*/
            if(userString.matches("[\\w\\s]+")){
                System.out.println("Detected Language: English");

                /*split user input*/
                /* into a char[]*/
                char [] userChars = userString.toCharArray();


                /*loop through comparing*/
                /* input to aplha []*/
                /*when it finds a match
                 * it prints out the corresponding
                 * index in the morse[]
                 */
                for (int x = 0; x<userChars.length; x++){
                    		for(int y = 0; y<alpha.length; y++){
                        					if (userChars[x] == alpha[y]){

                            System.out.print(morse[y]+ " ");

                        }
                    }
                }
            }

            /*Morse to Eng*/
            else if(userString.matches("[\\s . -]+")){
                System.out.println("Detected Language: Morse code");

                /*morse input split
                 * to words*/
                String [] inputSplit = userString.split("   ");

                for (int z = 0; z<inputSplit.length; z++){
                    /*loops through breaking
                     * morse words into morse*/
                    /* letters*/
                    String [] split = inputSplit[z].split(" ");



                    /*loops comparing user input*/
                    /* chars to the morse alpabet*/
                    /* when they match it prints the
                     *corresponding index from the alpha char[]*/
                    for (int x = 0; x<split.length; x++){

                        for (int y = 0; y<morse.length; y++){
                            if (split[x].equals(morse[y])){
                             System.out.print(alpha[y]);

                            }
                        }
                    } System.out.print(" ");
                }
            }
        }
        input.close();

    }
}
