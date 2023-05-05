import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


class Conversation {

  public static void main(String[] arguments) {

    Scanner input = new Scanner(System.in);
    ArrayList<String> transcript = new ArrayList<String>();
    transcript.add("TRANSCRIPT: \n ");
   
    transcript.add("How many rounds? \n ");
   System.out.println("How many rounds?");

    int rounds = input.nextInt();

    String number = Integer.toString(rounds);
    transcript.add(number);
  
    Scanner speech = new Scanner(System.in);
    transcript.add("Hi there! What's on your mind??? \n ");
    System.out.println("Hi there! What's on your mind???");

  

    for (int i=0; i<rounds; i++){
      String line = speech.nextLine();
      transcript.add(line);
      transcript.add("\n");

      String[] person = {"I","me","am","you","my","your" };
      String [] mirror = {"you", "you","are", "I", "your", "my"};

      boolean x=false;

      String[] newline = line.split(" ",0);

        for(int j=0; j<newline.length; j++){
          for (int k=0; k<person.length; k++){
        
          if (newline[j].equals(person[k])){
           
            newline[j]=mirror[k];
            x=true;
          
            break;
          }
          }
       
      }

      if (x){
        System.out.println(String.join(" ", newline) + "?");
      } 
      
      else {
        String[] responses = {"Ohh Okay", "How interesting!", "Really?", "Mmm-hm", "Oh I see!" };

        Random ran = new Random();
        int nxt = ran.nextInt(5);

        System.out.println(responses[nxt]);
        transcript.add(responses[nxt]);
        transcript.add("\n");
      }


    } 
    
    System.out.println("Thanks for chatting!"); 
    transcript.add("Thanks for chatting!");
    transcript.add("\n");
    
    for (int i=0; i<transcript.size(); i++){
      System.out.print(transcript.get(i) );
    }

    input.close();
    speech.close();
  }
}
