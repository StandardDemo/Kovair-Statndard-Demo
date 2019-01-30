package com.mavenproject.javafiles;

import java.util.ArrayList;
import java.util.List;

public class ListSearchPage {

	public static List<String> main(String[] args) {
		// TODO Auto-generated method stub
		// Commit for 871
		ArrayList<String> ans = new ArrayList();
        int n = 0;
		if (n == 0) {
            ans.add("");
        } else {
            String left = null;
			String right = null;
			for (int c = 0; c < n; ++c)
         
                        ans.add("(" + left + ")" + right );
        }
        return ans;// modification
	}

	private static Object generateParenthesis(int c) {
		// TODO Auto-generated method stub
		return null;
	}

}
