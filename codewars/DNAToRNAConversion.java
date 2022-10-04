package com.codewars.dna-to-rna-conversion;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/

public class Bio {
    public String dnaToRna(String dna) {
        return dna.replaceAll("T", "U");
    } 
}
