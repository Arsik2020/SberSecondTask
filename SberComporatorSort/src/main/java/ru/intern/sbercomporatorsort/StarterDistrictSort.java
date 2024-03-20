package ru.intern.sbercomporatorsort;

import ru.intern.sberutils.ProcessCity;
import ru.intern.sberutils.Utils;

public class StarterDistrictSort {

    public static void main(String[] args) {
        if (Utils.validate(args)) {
            ProcessCity process = new SberCoporatorDistrictSort();
            process.doAction(args[0]);
        }
    }
}
