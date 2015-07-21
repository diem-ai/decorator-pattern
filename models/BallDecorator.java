package models;

import java.lang.reflect.Field;

import specifications.BranchDecoratorSpecification;
import specifications.BranchOfTreeSpecification;


public class BallDecorator extends BranchDecoratorSpecification{
	
	boolean spinning;
	
	public BallDecorator(BranchOfTreeSpecification branchOfTree) throws IllegalAccessException{
		
		super(branchOfTree);
		
//		if(!DecoratorUtility.checkMaxNumOfDecoration(this.getClass())){
//			throw new IllegalAccessException("Number of Decorator could not over " + DecoratorUtility.MAX_DECORATION);
//		}
		spinning = true;
			}
	
        public String getDecorations(){
		
        	String str = decoratedBranch.getDecorations();
        	if (spinning) str = str +" Spinning";
        	str = str+ " Ball.";
		return str;
		}
        
        public void animate(){
//        	decoratedBranch.animate();
//        	spinning = !spinning;
        	boolean oldSpinning = spinning;
    		try {
    			Field fspinning = decoratedBranch.getClass().getSuperclass().getField("spinning");
    			oldSpinning = fspinning.getBoolean(decoratedBranch.getClass().getSuperclass());

    		} catch (Exception e) {
    			///e.printStackTrace();
    		}
    		spinning = !oldSpinning;
        		
       }  
}
