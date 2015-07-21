package tests;

import models.BallDecorator;
import models.UndecoratedBranch;
import specifications.BranchOfTreeSpecification;

public class TestMaxNumberDecorator {

	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub

		BranchOfTreeSpecification plainBranch = new UndecoratedBranch();
		BranchOfTreeSpecification decoratedBranch = new BallDecorator( plainBranch);
		BranchOfTreeSpecification reDecoratedBranch = new BallDecorator( new BallDecorator( plainBranch));
		plainBranch.animate();
		System.out.println("plainBranch.animate.getDecorations() ="+plainBranch.getDecorations());
		
		decoratedBranch.animate();
		System.out.println("decoratedBranch.animate.getDecorations() ="+decoratedBranch.getDecorations());
		
		reDecoratedBranch.animate();
		System.out.println("reDecoratedBranch.animate.getDecorations() ="
				            +reDecoratedBranch.getDecorations());
		
		BranchOfTreeSpecification _8DecoratedBranch = new BallDecorator( 
														new BallDecorator( 
														new BallDecorator(
																new BallDecorator(new BallDecorator(new BallDecorator(new BallDecorator(new BallDecorator(plainBranch))))))));
		


	}

}
