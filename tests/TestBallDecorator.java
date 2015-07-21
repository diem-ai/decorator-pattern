package tests;

import models.BallDecorator;
import models.UndecoratedBranch;
import specifications.BranchOfTreeSpecification;

public class TestBallDecorator {
	
	public static void main (String [] args) throws IllegalAccessException{
	
	BranchOfTreeSpecification plainBranch = new UndecoratedBranch();
	BranchOfTreeSpecification decoratedBranch = new BallDecorator( plainBranch);
	BranchOfTreeSpecification reDecoratedBranch = new BallDecorator( new BallDecorator( plainBranch));
	//adding stardecorator
//	BranchOfTreeSpecification starsDecorator = new StarsDecorator( plainBranch);
	//ball and star
	
	System.out.println("plainBranch.getDecorations() ="+plainBranch.getDecorations());
	System.out.println("decoratedBranch.getDecorations() ="+decoratedBranch.getDecorations());
	System.out.println("reDecoratedBranch.getDecorations() ="
			            +reDecoratedBranch.getDecorations());
	
	plainBranch.animate();
	System.out.println("plainBranch.animate.getDecorations() ="+plainBranch.getDecorations());
	
	decoratedBranch.animate();
	System.out.println("decoratedBranch.animate.getDecorations() ="+decoratedBranch.getDecorations());
	
	reDecoratedBranch.animate();
	System.out.println("reDecoratedBranch.animate.getDecorations() ="
			            +reDecoratedBranch.getDecorations());
	
//	starsDecorator.animate();
//	System.out.println("starsDecoratedBranch.animate.getDecorations() ="
//            +starsDecorator.getDecorations());
	
	}
	
	

}
