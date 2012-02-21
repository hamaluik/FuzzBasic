package com.hamaluik.fuzzbasic.functions;

import java.util.ArrayList;

import com.hamaluik.fuzzbasic.util.Function;
import com.hamaluik.fuzzbasic.util.FunctionInfo;

@FunctionInfo(name = "#")
public class FunctionComment implements Function {
	public boolean handle(String cmd, ArrayList<String> args) {
		return true;
	}
}
