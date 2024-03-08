package com.mustafa.utility;

import com.mustafa.exceptions.IslemException;

public class StaticDegerler {
    public static int getSabitDeger(int tip) {
        if(tip==1){
            return 10;
        } else if (tip>1) {
            return 20;
        }else
            throw new IslemException("Böyle  bir Tip yoktur");
    }
}
