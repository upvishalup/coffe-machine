package com.game.machine;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.game.machine.breverage.input.Machine;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        String inputPath = "data/input/coffee-machine.json";

        ObjectMapper objectMapper = new ObjectMapper().
                configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        ObjectReader inputReader = objectMapper.readerFor(Machine.class);
        try {
            Machine input = inputReader.readValue(new File(inputPath));
            System.out.println("Read File");

        }catch (IOException e) {
            System.err.println("Error while reading input file from location");
        }


    }
}
