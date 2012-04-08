/*
 * The MIT License
 *
 * Copyright (c) <2012> <Bruno P. Kinoshita>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.eti.kinoshita.fuzzylogic_sanbox;

import net.sourceforge.jFuzzyLogic.FIS;

/**
 * From http://jfuzzylogic.sourceforge.net/html/example_java.html
 * 
 * @author Bruno P. Kinoshita - http://www.kinoshita.eti.br
 * @since 0.1
 */
public class TestTipper {

	public static void main(String[] args) throws Exception {
		String fileName = "fcl/tipper.fcl";
		FIS fis = FIS.load(fileName);
		if(fis == null) {
			System.err.println("Couldn't load FCL file " + fileName);
			System.exit(1);
		}
		fis.chart();
		
		fis.setVariable("service", 3);
		fis.setVariable("food", 7);
		
		fis.evaluate();
		
		fis.getVariable("tip").chartDefuzzifier(true);
		
		System.out.println(fis);
	}
	
}
