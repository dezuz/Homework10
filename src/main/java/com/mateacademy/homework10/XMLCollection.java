package com.mateacademy.homework10;

import org.apache.log4j.Logger;

import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class XMLCollection {
    private static final String ENCODED_FILE_NAME = "Collection.xml";
    private List<Map<List<Set<Integer>>, String>> list;
    private final Logger LOGGER = Logger.getLogger(XMLCollection.class);

    public void fillList() {
        list = new ArrayList<>();
        Integer firstLayer = -120;
        Set<Integer> secondLayer= new HashSet<>();
        List<Set<Integer>> thirdLayer = new ArrayList<>();
        Map<List<Set<Integer>>, String> fourthLayer = new HashMap<>();

        secondLayer.add(firstLayer);
        thirdLayer.add(secondLayer);
        fourthLayer.put(thirdLayer, "I am List<Set<Integer>>");
        list.add(fourthLayer);

        encodeToXML(list);
    }

    private void encodeToXML(List list) {
        try {
            XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(ENCODED_FILE_NAME));
            xmlEncoder.writeObject(list);
            xmlEncoder.close();
        } catch (FileNotFoundException e) {
            LOGGER.error("File is not found");
        }
    }

}
