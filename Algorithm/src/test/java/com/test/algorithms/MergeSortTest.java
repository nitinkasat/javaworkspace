package com.test.algorithms;

import java.util.Arrays;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MergeSortTest extends TestCase {

	private MergeSort mergeSort;

	@Override
	protected void setUp() throws Exception {
		mergeSort = new MergeSort();
	}

	public MergeSortTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(MergeSortTest.class);
	}

	public void testSort() {
		Assert.assertTrue(Arrays.equals(new int[] { 5, 8, 14, 15 },
				mergeSort.sort(new int[] { 15, 14, 5, 8 })));

		Assert.assertTrue(Arrays.equals(new int[] { 0, 0, 13, 80, 150 },
				mergeSort.sort(new int[] { 150, 0, 0, 13, 80 })));
	}

	@Override
	protected void tearDown() throws Exception {
		mergeSort = null;
	}
}
