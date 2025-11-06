//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	   String name = args[0].toUpperCase();
           int times = Integer.parseInt(args[1]);
           String specialLetters ="AEFHILMNORSX";
           int i;
           int j;
           for (i=0;i<name.length();i++)
           {
                char letter = name.charAt(i);
                if (specialLetters.indexOf(letter)!=-1) {
                    System.out.println("Give me an "+letter+": "+letter+"!");    
                }
                else
                System.out.println("Give me a "+letter+": "+letter+"!");
           }
           System.out.println("What does that spell?");
           for (j=0;j<times;j++)
           {
                System.out.println(name+"!!!");
           }
        }
}
