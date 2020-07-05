package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	String array[]= {"b!tch","b00bs","b17ch","b1tch","babeland",
			"baby batter","baby juice","ball gag","ball gravy","ball kicking",
			"ball licking","ball sack","ball sucking","ballbag","balls",
			"ballsack","bampot","bang (one's) box","bangbros","bareback",
			"barely legal","barenaked","barf","bastard","bastardo"};
	public boolean checkBlog(Blog blog) {
		if((checkBlogTitle(blog))||(checkBlogDescription(blog))) {
			return false;
		}
		return true;
	}
	
	
	
	public boolean checkBlogTitle(Blog blog) {
		
		String title=blog.getBlogTitle();
		for(int i=0;i<25;i++) {
			if(title.equalsIgnoreCase(array[i])) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkBlogDescription(Blog blog) {
		String description=blog.getBlogDescription();
		for(int i=0;i<25;i++)
		{
			if(description.equalsIgnoreCase(array[i]))
				return true;
		}
		return false;
	}
	
	
	
}