package main;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Calculator {
	
	public static void main(String args[]) {
		if (validationIntegerParametersType(args))
			throw new IllegalArgumentException("Parameters 3 to 6 must be numbers");
		
		float weight = getWeight(args[4]);
		if (weight <= 0 || weight > 30)
			throw new IllegalArgumentException("Weight is out of correct range");
		
		float width = getWidth(args[3]);
		if (width <= 0 || width > 500)
			throw new IllegalArgumentException("Width is out of correct range");
		
		float length = getLength(args[2]);
		if (length <= 0 || length > 500)
			throw new IllegalArgumentException("Length is out of correct range");
		
		float height = getLength(args[5]);
		if (height <= 0 || height > 500)
			throw new IllegalArgumentException("Height is out of correct range");
		
		boolean validPostalCode = isPostalCode(args[0]) && isPostalCode(args[1]);
		if (!validPostalCode)
			throw new IllegalArgumentException("Postal code is in a wrong format");
		
		boolean validProductType = isValidProductType(args[6]);
		if (!validProductType)
			throw new IllegalArgumentException("Product Type must be regular, xpress or priority");
	}
	
	public static boolean isValidProductType(String s) {
		if (s.toLowerCase().equals("regular"))
			return true;
		if (s.toLowerCase().equals("xpress"))
			return true;
		if (s.toLowerCase().equals("priority"))
			return true;
		return false;
	}

	public static boolean isPostalCode(String s) {
		Pattern r = Pattern.compile("[a-zA-Z]\\d[a-zA-Z] ?\\d[a-zA-Z]\\d");
	    if (r.matcher(s).find( ))
	    		return true;
	    	return false;
	}
	
	public static float getHeight(String s) {
		return Float.parseFloat(s);
	}

	public static float getLength(String s) {
		return Float.parseFloat(s);
	}
	
	public static float getWidth(String s) {
		return Float.parseFloat(s);
	}

	public static int validateNumberOfArgs(String[] args) {
		int argsNb = args.length;
		if (argsNb == 7) {
			return argsNb;
		} else {
			return -1;
		}
	}
	
	public static boolean validationIntegerParametersType(String[] args) {
		float i = 0;
		
		try {
		    i = Float.parseFloat(args[2]); // Length
		} catch (NumberFormatException e) {
		    return false;
		}
		try {
		    i = Float.parseFloat(args[3]); // Width
		} catch (NumberFormatException e) {
		    return false;
		}
		try {
		    i = Float.parseFloat(args[4]); // Weight
		} catch (NumberFormatException e) {
		    return false;
		}
		try {
		    i = Float.parseFloat(args[5]); // Height
		} catch (NumberFormatException e) {
		    return false;
		}
		
		return true;
	}

	public static float getWeight(String s) {
		return Float.parseFloat(s);
	}
	
	public static double createRate(float weight, String processType) {
		if (weight < 100 && processType.equals("regular")) {
			return 1.8;
		} else if ((weight >= 100 && weight <= 400) && processType.equals("regular")) {
			return 2.0;
		}
		 else if ((weight > 400 && weight <= 500) && processType.equals("regular")) {
			return 2.2;
		} else if (weight < 100 && processType.equals("express")) {
			return 2.0;
		} else if ((weight >= 100 && weight <= 400) && processType.equals("express")) {
			return 2.5;
		}
		 else if ((weight > 400 && weight <= 500) && processType.equals("express")) {
			return 2.8;
		} else if (weight < 100 && processType.equals("priority")) {
			return 2.5;
		} else if ((weight >= 100 && weight <= 400) && processType.equals("priority")) {
			return 3.0;
		}
		 else if ((weight > 400 && weight <= 500) && processType.equals("priority")) {
			return 3.5;
		}
		
		return 0;
	}


}






























