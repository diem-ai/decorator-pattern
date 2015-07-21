package models;

import java.lang.reflect.Field;

import specifications.BranchDecoratorSpecification;
import specifications.BranchOfTreeSpecification;

public class StarsDecorator extends BranchDecoratorSpecification {

	protected String mode;
	
	public StarsDecorator(BranchOfTreeSpecification branchToDecorate) throws IllegalAccessException {
		super(branchToDecorate);
		// TODO Auto-generated constructor stub
		mode = "on";
	}

	@Override
	public String getDecorations() {
		// TODO Auto-generated method stub
    	String str = decoratedBranch.getDecorations();
    	str =str+ " mode = " + mode;
    	return str;
	}
	
    public void animate(){
    	
//    	System.out.println("* mode * " + mode);
    	//decoratedBranch.animate();
    	String oldMode = mode;
		try {
			Field fmode = decoratedBranch.getClass().getSuperclass().getField("mode");
	    	oldMode = (String)fmode.get(decoratedBranch.getClass().getSuperclass());

		} catch (Exception e) {
			///e.printStackTrace();
		}
	   	if (oldMode.equals("on")) {
    		mode = "off";
    	}else if (oldMode.equals("off")) {
    		mode = "on";
    	}
		
 
    }  

	
}
