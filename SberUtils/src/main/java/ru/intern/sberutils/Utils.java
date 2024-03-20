package ru.intern.sberutils;

import java.io.File;

public class Utils {

    public static boolean validate(String[] args) {
        try {
            File file = new File(args[0]);
            return  file.isFile() && file.canRead() ;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}
