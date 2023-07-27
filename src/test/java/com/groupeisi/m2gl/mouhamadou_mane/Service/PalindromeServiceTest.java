package com.groupeisi.m2gl.mouhamadou_mane.Service;

import com.groupeisi.m2gl.mouhamadou_mane.request.PalindromeRequest;
import com.groupeisi.m2gl.mouhamadou_mane.service.PalindromeService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeServiceTest {
    private PalindromeService palindromeService = new PalindromeService();

    @Test
    public void testOkPalindrome(){
        assertTrue(palindromeService.checkPalindrome(new PalindromeRequest("kayak")).getIsPalindrome());
    }

    @Test
    public void testNOkPalindrome(){
        assertFalse(palindromeService.checkPalindrome(new PalindromeRequest("kayaka")).getIsPalindrome());
    }
}
