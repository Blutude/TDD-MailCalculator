package main;

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
		
		float length = getLength(args[3]);
		if (length <= 0 || length > 500)
			throw new IllegalArgumentException("Length is out of correct range");
		
		float height = getLength(args[3]);
		if (height <= 0 || height > 500)
			throw new IllegalArgumentException("Height is out of correct range");
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






























