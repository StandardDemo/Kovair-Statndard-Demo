package com.javademocba.proj;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class CBAmodule{
	public static void main (String srgs[])
	{
		Solution a = new Solution();
		List<String> qa= a.generateParenthesis(5);
		System.out.println(qa);
	}
}
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; ++c)
                for (String left: generateParenthesis(c))
                    for (String right: generateParenthesis(n-1-c))
                        ans.add("(" + left + ")" + right );
        }
        return ans;
    }
}
//This is updated on 08102018 by mayukhnandy