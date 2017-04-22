package com.leetcode.google;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilePathCounter {

	public static void main(String[] args) {
		String fileStructure = 
						"/root\n"+
						"	/dir1\n"+
						"	image1.png\n"+
						"	/dir2\n"+
						"		/dir3\n"+
						"	/dir4\n"+
						"		/dir5\n"+
						"			image2.gif\n"+
						"	/dir6\n"+
						"	imagehwllo.jpg\n"+
						"	/dir7\n"+
						"		/dir8\n"+
						"			/dir9\n"+
						"				hello.txt\n"+
						"				image3.png\n";



		/*System.out.println(calculateSpaces("			hello	"));
		System.out.println(trimPath("/root/dir1/dir2/dir3/dir4", 1));
		System.out.println(trimPath("/root/dir1/dir2/dir3/dir4", 2));
		System.out.println(trimPath("/root/dir1/dir2/dir3/dir4", 3));
		System.out.println(trimPath("/root/dir1/dir2/dir3/dir4", 4));
		*/
		List<String> output = getImagePathsHelper(fileStructure);
		
	}

	public static List<String> getImagePathsHelper(String input){
		String[] tokens = input.split("\n");
		
		List<String> output = new ArrayList<String>();
		
		output = getImagePaths(tokens, 0, "", -1, output);
		return output;
	}

	public static int calculateSpaces(String line){
		int count = 0;
		Pattern filePattern = Pattern.compile("\t");
		Matcher matcher = filePattern.matcher(line);
		while(matcher.find())
			count++;
		return count;
	}

	public static String trimPath(String path, int levels){
		for (int i = 0; i < levels; i++) {
			path = path.substring(0, path.lastIndexOf('/'));
		}
		return path;
	}

	public static List<String> getImagePaths(String[] lines, int index, String parentFolder, int prevSpaces, List<String> output){
		if(index == lines.length)
			return output;

		//Resolve the currentParent
		int spaces = calculateSpaces(lines[index]);
		
		String currentLine = lines[index].replaceAll("\t", "");
		if(!currentLine.startsWith("/"))
			currentLine = "/"+currentLine;
		
		if(spaces <= prevSpaces){
			parentFolder = trimPath(parentFolder, prevSpaces - spaces + 1);
		}
		parentFolder+=currentLine;
		

		if(currentLine.endsWith(".png") || currentLine.endsWith(".gif") || currentLine.endsWith(".jpg")){
			output.add(parentFolder);
			System.out.println(parentFolder);
		}

		return getImagePaths(lines, index+1, parentFolder, spaces, output);
	}
}
