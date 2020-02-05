package com.kodilla.patterns2.adapter.bookclassifier;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedian() {
        //given
        com.kodilla.patterns2.adapter.bookclassifier.librarya.Book book1 = new com.kodilla.patterns2.adapter.bookclassifier.librarya.Book("John", "Smith", 2008, "24125322");
        com.kodilla.patterns2.adapter.bookclassifier.librarya.Book book2 = new com.kodilla.patterns2.adapter.bookclassifier.librarya.Book("John1", "Smith2", 2002, "31232113");
        com.kodilla.patterns2.adapter.bookclassifier.librarya.Book book3 = new com.kodilla.patterns2.adapter.bookclassifier.librarya.Book("John3", "Smith3", 2010, "23131345");
        Set<com.kodilla.patterns2.adapter.bookclassifier.librarya.Book> books = new HashSet<>(Arrays.asList(book1, book2, book3));
        MedianAdapter medianAdapter = new MedianAdapter();
        //when
        int median = medianAdapter.publicationYearMedian(books);
        //then
        assertEquals(2008, median);
    }
}
