package com.NKLoveLetterApp.service;

import com.NKLoveLetterApp.model.Letter;

import java.util.List;

public interface LetterService {
    // add letters
    Letter addLetter(Letter letter);
    // get all letters
    List<Letter> getAllLetters();
    // get single letter
    Letter getSingleLetterById(Long id);
    // update letters
    Letter updateLetter(Long id,Letter letter);
    // delete Letter
    void deleteLetter(Long id);
}
