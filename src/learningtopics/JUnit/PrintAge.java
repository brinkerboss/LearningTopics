package learningtopics.JUnit;

/**
 *
 * @author jbrinkerhoff
 */
public class PrintAge {
    public String print(int age)
	{
		if(age > 50)
			return "You're old!";
		else if(age > 30)
			return "You're young";
		else if(age > 10)
			return "You're just a child";
		else
			return "You must be a baby!";
	}
}
