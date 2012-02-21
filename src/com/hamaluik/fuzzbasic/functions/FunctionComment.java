package com.hamaluik.fuzzbasic.functions;

import com.hamalukk.fuzzbasic.util.Function;
import com.hamalukk.fuzzbasic.util.FunctionInfo;

@FunctionInfo(name = "#")
public class FunctionComment implements Function {
	public boolean handle(String cmd, ArrayList<String> args) {
		return true;
	}
}
