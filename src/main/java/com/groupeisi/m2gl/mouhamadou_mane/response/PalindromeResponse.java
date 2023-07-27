package com.groupeisi.m2gl.mouhamadou_mane.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PalindromeResponse {

    @JsonProperty("isPalindrome")
    private boolean isPalindrome;

    public  PalindromeResponse(){

    }

    public  PalindromeResponse(boolean isPalindrome){
        this.isPalindrome = isPalindrome;
    }


    public boolean getIsPalindrome() {
        return isPalindrome;
    }

    public void setIsPalindrome(boolean isPalindrome) {
        this.isPalindrome = isPalindrome;
    }
}
