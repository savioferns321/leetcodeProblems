package com.leetcode.google;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.sound.sampled.SourceDataLine;

public class FileStructure2 {


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



		String input2 = "dir1\n dir11\n dir12\n  picture.jpeg\n  dir121\n  file1.txt\ndir2\n file2.gif";
		/*System.out.println(calculateSpaces("			hello	"));
		System.out.println(trimPath("/root/dir1/dir2/dir3/dir4", 1));
		System.out.println(trimPath("/root/dir1/dir2/dir3/dir4", 2));
		System.out.println(trimPath("/root/dir1/dir2/dir3/dir4", 3));
		System.out.println(trimPath("/root/dir1/dir2/dir3/dir4", 4));
		*/
		int output = solution(input2);
		System.out.println(output);
	}
	

    public static int solution(String S) {
		 // write your code in Java SE 8
        String[] lines = S.split("\n");
        int maxLength = Integer.MIN_VALUE;
        return  getImagePaths(lines, 0, "", -1,maxLength);
	
    }
    
    public static int calculateSpaces(String line){
		int count = 0;
		Pattern filePattern = Pattern.compile(" ");
		Matcher matcher = filePattern.matcher(line);
		while(matcher.find())
			count++;
		return count;
	}
    
    public static String trimPath(String path, int levels){
        for(int i=0; i < levels; i++)
            path = path.substring(0, path.lastIndexOf("/"));
            
        return path;
    }
    
    public static int getImagePaths(String[] lines, int index, String parentFolder, int prevSpaces, int maxLength){
        if(index == lines.length)
            return maxLength;
            
        int spaces = calculateSpaces(lines[index]);
        
        String currentLine = lines[index].replaceAll(" ","");
        
        if(!currentLine.startsWith("/"))
            currentLine = "/"+currentLine;
        
        if(spaces <= prevSpaces){
            parentFolder = trimPath(parentFolder, prevSpaces - spaces + 1);
        }
        parentFolder += currentLine;
        
        if(currentLine.endsWith(".gif") || currentLine.endsWith(".jpeg") || currentLine.endsWith(".png")){
        	System.out.println(maxLength);
        	System.out.println(parentFolder);
        	maxLength = Math.max(maxLength, parentFolder.lastIndexOf("/"));
            
        }
        return getImagePaths(lines, index + 1, parentFolder, spaces, maxLength);
    }

	


}
