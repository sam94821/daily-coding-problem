package com.dcp.array.oneD.h_Index;

import java.util.Arrays;

/**
 * 
 *  File : H_Index.java 
 *  -----------------------------------------------------------------------------------------------------
 *  Problem Description:  In academia, the h-index is a metric used to calculate the impact
 *                                        of a researcher's papers. It is calculated as follows:
 *                                        
 *                                        A researcher has index h if at least h of her N papers have h citations
 *                                        each. If there are multiple h satisfying this formula, the maximum is chosen.
 *                                        
 *                                        For example, suppose N = 5, and the respective citations of each paper are [4, 3, 0, 1, 5].
 *                                        Then the h-index would be 3, since the researcher has 3 papers with at least 3 citations. 
 *   
 *  --------------------------------------------------------------------------------------------------------
 *   Problem Statement : Given a list of paper citations of a researcher, calculate their h-index.
 *   -------------------------------------------------------------------------------------------------------
 *   @see 
 *   
 * @author Sam
 *  ---------------------------------------------------------------------------------------------------------
 *  
 *  [4, 3, 0, 1, 5]. 
 * Step 1. take the firstEntry as H-index number.  //4
 * Step 2.  is secondNumber <= H-index. Continue with H-index. Else assign sec 
 *  
 *  
 */
public class H_Index {

	protected static int calculateIndex(int[] totalPapers) {
		
		Arrays.sort(totalPapers);
		
		int h_Index=0;
		
		for(int count=totalPapers.length-1;count>=0;count--) {
				
				int citation_count =0;
				if(count==0 && totalPapers[count]!=1)
				{
					citation_count= 0;
				}
				else
					{
					citation_count=totalPapers.length-count;
					}
				
				if(totalPapers[count]>=citation_count) {
					h_Index = citation_count;
				}
				else {
					break;
				}
		}
		return h_Index;
	}
}
