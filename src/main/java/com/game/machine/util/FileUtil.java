package com.game.machine.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class FileUtil {

    public static void writeFile(String path, String content) {
        try{
            FileWriter fw=new FileWriter(path);
            fw.write(content);
            fw.close();
        }catch(IOException e) {
            System.err.println("Error while writing file at path "+path);
            e.printStackTrace();
        }
        System.out.println("Success written file to "+ path);
    }


    public static byte[] readFile(String path) {
        try {
            File file = new File(path);
            return Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            System.err.println("Error while writing file at path "+path);
            e.printStackTrace();
        }
        return new byte[0];
    }

}
