package Arrays;
//leetcode 836
/*An axis-aligned rectangle is represented as a list [x1, y1, x2, y2], 
 * where (x1, y1) is the coordinate of its bottom-left corner, and (x2, y2) is the coordinate of its top-right corner. Its top and bottom edges are parallel to the X-axis, and its left and right edges are parallel to the Y-axis.

Two rectangles overlap if the area of their intersection is positive. 
To be clear, two rectangles that only touch at the corner or edges do not overlap.

Given two axis-aligned rectangles rec1 and rec2, return true if they overlap, otherwise return false.
 * 
 * for logic draw rectanle in all for dirctions
 * 
 */
public class overlaping_rectangle {
	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
	    
        boolean c1=rec1[2]<=rec2[0];//rectangle one is at left of rectangle
        boolean c2=rec1[0]>=rec2[2];//rectangle one is at right of rectangle 2
        boolean c3=rec1[1]>=rec2[3];//rectangle one is at top of rectangle 2
        boolean c4=rec1[3]<=rec2[1];//r1 is at bottom of r2
        
        return !(c1||c2||c3||c4);
        
    }

}
