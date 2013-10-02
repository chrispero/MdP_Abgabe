import java.util.*;

public class JunitDemo implements IMdpJunitDemo {
	
	public boolean isEmpty(String s){
		if (s == "")
			return true;
		else
			return false;
	}
	
    /**
     * Returns a copy of str with the first character converted to uppercase and
     * the remainder to lowercase.
     * 
     * <pre>
     * "hello".capitalize    #=> "Hello"
     * "HELLO".capitalize    #=> "Hello"
     * "123ABC".capitalize   #=> "123abc"
     * </pre>
     * 
     * @param s
     *            string to capitalize
     * @return capitalized string
     */
    public String capitalize(String s){
    	if (s.isEmpty()) {
    		return "";
    	}
    	else {
    		String myString = s.toLowerCase();
    		String firstChar  = myString.substring(0,1);
    		firstChar = firstChar.toUpperCase();
    		myString = firstChar+ myString.substring(1,myString.length());
    		return myString;
    	}
    }

    /**
     * Reverses the given String character by character. E.g.
     * <code>"Test Hsz"</code> becomes <code>"zsH tseT"</code>
     * 
     * @param s
     *            string to reverse
     * @return reversed string
     * @throws NullPointerException
     *             when given argument is null
     */
    public String reverse(String s) throws NullPointerException {
    	String myString = "";
    	if (s.isEmpty()) {
    		return myString;
    	}
    	else {
    		for(int i=s.length()-1;i>=0;i--) {
    			if (i==s.length()-1)
    				myString = s.substring(i);
    			else
    				myString = myString + s.substring(i,i+1);
    		}
    		return myString;
    	}
    }
    
    /**
     * Joins the given strings to one string. Each given string is separated by
     * a whitespace, but there will be no trailing whitespaces.
     * 
     * E.g. <code>join("a","b","c")<code> will result in 
     * <code>"a b c"<code>.
     * 
     * @param strings
     *            strings to join
     * @return the concatenated string
     */
    public String join(String... strings){
    	String myString = "";
    	if (strings.length == 0) {
    		return myString;
    	}
    	else {
    		for(int i=0;i<strings.length;i++){
    			if (i==0)
    				myString = strings[i];
    			else
    				myString = myString + " " + strings[i];
    		}
    		return myString;
    	}
    }
    
}
