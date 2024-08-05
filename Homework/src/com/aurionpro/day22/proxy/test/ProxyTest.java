package com.aurionpro.day22.proxy.test;

import com.aurionpro.day22.proxy.model.ProxyStructuralDesign;

public class ProxyTest {
	
	 public static void main(String[] args) {
	        ProxyStructuralDesign proxy = new ProxyStructuralDesign();

	        proxy.performAnalysis();
	        
	        proxy.performAnalysis();
	        
	        proxy.setAccess(false);
	        
	        proxy.performAnalysis();
	        
	        proxy.setAccess(true);
	        proxy.performAnalysis();
	    }

}
