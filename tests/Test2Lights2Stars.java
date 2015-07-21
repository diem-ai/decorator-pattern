package tests;

import models.LightsDecorator;
import models.StarsDecorator;
import models.UndecoratedBranch;
import specifications.BranchOfTreeSpecification;

/**
 * 
 * @author btdiem
 * Tree with Lights and 2 Balls
 */
public class Test2Lights2Stars {

	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub

		//2 lights
		BranchOfTreeSpecification plainBranch = new UndecoratedBranch();
		BranchOfTreeSpecification lightBranch = new LightsDecorator( plainBranch);
		BranchOfTreeSpecification reLightBranch = new LightsDecorator( new LightsDecorator( plainBranch));
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
		
		


	}

}
