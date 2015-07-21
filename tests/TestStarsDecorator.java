package tests;

import models.StarsDecorator;
import models.UndecoratedBranch;
import specifications.BranchOfTreeSpecification;

public class TestStarsDecorator {

	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		BranchOfTreeSpecification plainBranch = new UndecoratedBranch();
		BranchOfTreeSpecification decoratedBranch = new StarsDecorator( plainBranch);
		BranchOfTreeSpecification reDecoratedBranch = new StarsDecorator( new StarsDecorator( plainBranch));
		
		plainBranch.animate();
		System.out.println("plainBranch.animate.getDecorations() ="+plainBranch.getDecorations());
		
		decoratedBranch.animate();
		System.out.println("decoratedBranch.animate.getDecorations() ="+decoratedBranch.getDecorations());
		
		reDecoratedBranch.animate();
		System.out.println("reDecoratedBranch.animate.getDecorations() ="
				            +reDecoratedBranch.getDecorations());
		

	}

}
