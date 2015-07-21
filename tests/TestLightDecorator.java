package tests;

import models.LightsDecorator;
import models.UndecoratedBranch;
import specifications.BranchOfTreeSpecification;

public class TestLightDecorator {

	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		BranchOfTreeSpecification plainBranch = new UndecoratedBranch();
		BranchOfTreeSpecification decoratedBranch = new LightsDecorator( plainBranch);
		BranchOfTreeSpecification reDecoratedBranch = new LightsDecorator( new LightsDecorator( plainBranch));
		
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

	}

}
