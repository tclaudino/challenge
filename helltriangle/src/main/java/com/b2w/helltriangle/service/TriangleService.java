package com.b2w.helltriangle.service;

import com.b2w.helltriangle.exception.TriagleStructureException;

/**
 * This class solve the Hell Triangle Challenge.
 * @author Thiago Claudino
 *
 */
public class TriangleService {

	/**
	 * Sums the triangle elements using the rules of hell triangle challenge.
	 * @param triangle
	 * @return The maximum sum of closest triangle elements 
	 * @throws TriagleStructureException 
	 */
	public int sumElements(int[][] triangle) throws TriagleStructureException{
		
		//Throws a exception when the triangle argument is null
		if(triangle == null){
			throw new IllegalArgumentException("The triangle can not be null");
		}

		//Current number position
		int currentNumberPosition = 0;
		
		//First triangle number
		int topTriangleNum = triangle[currentNumberPosition][currentNumberPosition];
		
		//Sets the number (first line) into the sum variable
		int sum = topTriangleNum;
		
		
		//Iterate from the second triangle line
		for (int i = 1; i < triangle.length; i++) {
			
			//Validates the line length
			validateTriangleLine(i, triangle[i]);

			//Gets the two close numbers
			int firstCloseNum = triangle[i][currentNumberPosition];
			int secondCloseNum = triangle[i][currentNumberPosition+1];
			
			if(firstCloseNum > secondCloseNum){
				sum += firstCloseNum; 
			
			} else {
				sum += secondCloseNum;
				currentNumberPosition += 1;
				
			}
		}
	
		return sum;

	}
	
	/**
	 * Validates the length of the triangle line.
	 * @param linePosition
	 * @param line
	 * @throws TriagleStructureException
	 */
	private void validateTriangleLine(int linePosition, int[] line) throws TriagleStructureException{
		//The correct length is the line position + 1 
		final int lineCorretLength = linePosition +1;
		
		if(line.length != lineCorretLength){
			throw new TriagleStructureException(
					String.format("It expected %d elements on the line %d but there are %d", 
							lineCorretLength, linePosition+1, line.length));
		}
	}
	
}


