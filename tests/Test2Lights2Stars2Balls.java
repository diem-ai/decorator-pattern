package tests;

import models.BallDecorator;
import models.LightsDecorator;
import models.StarsDecorator;
import models.UndecoratedBranch;
import specifications.BranchOfTreeSpecification;

public class Test2Lights2Stars2Balls {

	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub

		BranchOfTreeSpecification plainBranch = new UndecoratedBranch();
		//2 lights
		BranchOfTreeSpecification lightBranch = new LightsDecorator( plainBranch);
		BranchOfTreeSpecification reLightBranch = new LightsDecorator(new LightsDecorator( plainBranch));
		lightBranch.animate();
		System.out.println("lightBranch.animate.getDecorations() =" + lightBranch.getDecorations());
		reLightBranch.animate();
		System.out.println("reLightBranch.animate.getDecorations() =" + reLightBranch.getDecorations());	
		
		//2 stars
		BranchOfTreeSpecification starsBranch = new StarsDecorator( plainBranch);
		BranchOfTreeSpecification reStarsBranch = new StarsDecorator( new StarsDecorator( plainBranch));
		starsBranch.animate();
		System.out.println("starsBranch.animate.getDecorations() =" + starsBranch.getDecorations());		
		reStarsBranch.animate();
		System.out.println("reStarsBranch.animate.getDecorations() =" + reStarsBranch.getDecorations());
		
		//2 balls
		BranchOfTreeSpecification ballBranch = new BallDecorator( plainBranch);
		BranchOfTreeSpecification reBallranch = new BallDecorator( new BallDecorator( plainBranch));
		ballBranch.animate();
		System.out.println("ballBranch.animate.getDecorations() =" + ballBranch.getDecorations());		
		reBallranch.animate();
		System.out.println("reBallranch.animate.getDecorations() =" + reBallranch.getDecorations());

	}

}
