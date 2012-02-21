package com.hamaluik.fuzzbasic.managers;

import java.util.HashMap;
import java.lang.annotation.Annotation;

import com.hamaluik.fuzzbasic.functions.*;
import com.hamaluik.fuzzbasic.util.Function;
import com.hamaluik.fuzzbasic.util.FunctionInfo;

public class FunctionManager {
	private HashMap<String, Function> functions = new HashMap<String, Function>();

	private FunctionManager() {
		// register functions..
		registerFunction(new FunctionComment());
	}

	private void registerFunction(Function function) {
		// get the class
		Class<? extends Function> cls = function.getClass();

		// now get it's annotations
		Annotation[] annotations = cls.getAnnotations();
		// and find ours
		for(int i = 0; i < annotations.length; i++) {
			if(annotations[i] instanceof FunctionInfo) {
				// we found it!
				FunctionInfo fi = (FunctionInfo)annotations[i];
				functions.put(fi.name(), function);
				break;
			}
		}
	}
}
