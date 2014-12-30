package org.v66.examples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import util.Native2AsciiUtils;

public class Ascii2Native {

	public static void ascii2nativedemo() {
		try {
			String content = FileUtils.readFileToString(new File("ascuni.txt"), "ISO-8859-1");
			System.out.println("ascii: "+content);
			String ntive = Native2AsciiUtils.ascii2Native(content);
			System.out.println("native: "+ntive);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void native2asciidemo() {
		try {
			String ntive = FileUtils.readFileToString(new File("gbknative.txt"), "GBK");
			System.out.println("native: "+ntive);
			String content = Native2AsciiUtils.native2Ascii(ntive);
			System.out.println("ascii: "+content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ascii2nativedemo();
		native2asciidemo();
	}

}
