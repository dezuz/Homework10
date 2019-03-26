package com.mateacademy.homework10;

import org.junit.Before;
import org.junit.Test;

public class XMLCollectionTest {
    private XMLCollection xmlCollection;

    @Before
    public void init() {
        xmlCollection = new XMLCollection();
    }

    @Test
    public void testFillListMethodToFillTheListAndEncodeToXML() {
        xmlCollection.fillList();
    }

}