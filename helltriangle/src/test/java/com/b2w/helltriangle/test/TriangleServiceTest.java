package com.b2w.helltriangle.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.b2w.helltriangle.exception.TriagleStructureException;
import com.b2w.helltriangle.service.TriangleService;

/**
 * Unit test class to the Hell Triangle Challenge 
 * @author Thiago Claudino
 *
 */
public class TriangleServiceTest {
	
	/**
	 * The triangle service.
	 */
	private TriangleService triangleService;

	@Before
	public void setUp() throws Exception {
		triangleService = new TriangleService();
	}

	/**
	 * Tests the correct value returned from the service.
	 */
	@Test
	public void testFirstCorrectValue() {
		final int[][] triangle = {{6}, {3,5}, {9,7,1}, {4,6,8,4}};
		final int result = triangleService.sumElements(triangle); 

		assertEquals(26, result);
		
	}

	/**
	 * Tests the correct value returned from the service.
	 */
	@Test
	public void testSecondCorrectValue() {
		final int[][] triangle = {{9}, {3,1}, {5,7,2}, {2,8,9,6}, {4,1,3,5,2}};
		final int result = triangleService.sumElements(triangle); 

		assertEquals(33, result);
		
	}

	
	/**
	 * Tests the incorrect value returned from the service.
	 */
	@Test
	public void testIncorrectValue(){
		final int[][] triangle = {{6}, {3,5}, {9,7,1}, {4,6,8,4}};
		final int result = triangleService.sumElements(triangle); 

		assertNotSame(30, result);

	}
	
	/**
	 * Tests the result of a null triangle.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testNullTriangle(){
		final int[][] triangle = null;
		triangleService.sumElements(triangle); 

	}

	/**
	 * Tests the result of an incorrect triangle structure.
	 */
	@Test(expected=TriagleStructureException.class)
	public void testIncorrectTriangleStructure(){
		final int[][] triangle = {{6}, {3,5}, {9,7}, {4,6,}};
		triangleService.sumElements(triangle);  

	}
	
}
