package main;

public class Calculator {
	
	public static void main(String args[]) {
		if (validateNumberOfArgs(args) == -1)
			throw new IllegalArgumentException("There should be 7 command line arguments");
		
		if (!validateIntegerParameters(args)) 
			throw new IllegalArgumentException("Command line arguments 3 to 6 have to be integers");
	}

	public static boolean validateIntegerParameters(String[] args) {
		int i = 0;
		
		try {
		    i = Integer.parseInt(args[2]); // Length
		} catch (NumberFormatException e) {
		    return false;
		}
		try {
		    i = Integer.parseInt(args[3]); // Width
		} catch (NumberFormatException e) {
		    return false;
		}
		try {
		    i = Integer.parseInt(args[4]); // Weight
		} catch (NumberFormatException e) {
		    return false;
		}
		try {
		    i = Integer.parseInt(args[5]); // Height
		} catch (NumberFormatException e) {
		    return false;
		}
		
		return true;
	}

	public static int validateNumberOfArgs(String[] args) {
		int argsNb = args.length;
		if (argsNb == 7) {
			return argsNb;
		} else {
			return -1;
		}
	}
}
