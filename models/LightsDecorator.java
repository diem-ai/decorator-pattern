package models;


import java.lang.reflect.Field;

import specifications.BranchDecoratorSpecification;
import specifications.BranchOfTreeSpecification;

public class LightsDecorator extends BranchDecoratorSpecification{
	
	String colour;
	
	public LightsDecorator(BranchOfTreeSpecification branchOfTree) throws IllegalAccessException{
		
		super(branchOfTree);
		
		colour =  "red";
			}
	
        public String getDecorations(){
		
        	String str = decoratedBranch.getDecorations();
        	str =str+ " colour = "+colour;
		return str;
		}
        
        public void animate(){
        	
        	//decoratedBranch.animate();
        	String oldColor = colour;
        	Field fcolor = null;
        	try{
        		fcolor = this.getClass().getSuperclass().getDeclaredField("color");
        		oldColor = (String)fcolor.get(decoratedBranch.getClass().getSuperclass());
        	}catch(Exception e){
        		
        	}
        	if (oldColor.equals("red")) {
        		this.colour ="white";
        	}else if (oldColor.equals("white")){ 
        		colour ="red";
        	}

        }
}
