package com.edabit.challenge.youtube-video-id-extractor;

/**
 *	https://edabit.com/ challenge solved by @author davidbalsasmartin
 **/
 
 public class Challenge {
	public static String youtubeId(String link) {
		Pattern pattern = Pattern.compile("(?<=[=&/.])[^=&/.]{11}(?=[=&/.]|$)");
		Matcher matcher = pattern.matcher(link);
		String result = "";
		if (matcher.find())
			result = matcher.group();
		return result;
	}
}
