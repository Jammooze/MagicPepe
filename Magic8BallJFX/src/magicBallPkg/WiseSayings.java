/**
*  @author [Group 6]
*          Nguyen James
*          Jonathan Cortes 
*          Yongkang Liu
*          
*          CS 2012-03
*          GUI - Magic 8 Ball
*          WiseSayings.java
*/

package magicBallPkg;

import java.util.Random;

public class WiseSayings {
	
	// Declaring private String[] Array
	private String[] wiseSayings = {
	        "As I see it, yes.",
	        "Ask again later.",
	        "Better not tell you now.",
	        "Cannot predict now.",
	        "Concentrate and\nask again.",
	        "Don't count on it.",
	        "It is certain.",
	        "It is decididly so.",
	        "Most Likely",
	        "My reply is no.",
	        "My sources say no.",
	        "Outlook not so good.",
	        "Outlook good.",
	        "Reply hazy, try again.",
	        "Signs point to yes.",
	        "Very doubtful.",
	        "Without a doubt.",
	        "Yes.",
	        "Yes - definitely.",
	        "You may rely on it.",
	    };

	// getRandomSaying() Method returns random String
	public String getRandomSaying() {
        Random random = new Random();
        int index = random.nextInt(wiseSayings.length);
        return wiseSayings[index];
    }

}
