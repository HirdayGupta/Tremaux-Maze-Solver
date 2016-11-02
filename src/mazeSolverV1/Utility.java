package mazeSolverV1;

public class Utility {
	public static String switchDir(String d)
	{
		if(d.equals("UP"))
		{
			return "DOWN";
		}
		else if(d.equals("DOWN"))
		{
			return "UP";
		}
		else if(d.equals("RIGHT"))
		{
			return "LEFT";
		}
		else if(d.equals("LEFT"))
		{
			return "RIGHT";
		}
		else return null;
	}
	
	public static String getRightDir(String d){
		if(d.equals("UP"))
		{
			return "RIGHT";
		}
		else if(d.equals("DOWN"))
		{
			return "LEFT";
		}
		else if(d.equals("RIGHT"))
		{
			return "DOWN";
		}
		else if(d.equals("LEFT"))
		{
			return "UP";
		}
		else return null;
	}
}
