package com.isolator.cases;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ValidationUtils {

    public static boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }
}
