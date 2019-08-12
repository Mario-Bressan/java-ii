package com.bressan.ocp.annotation;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class Validator {
    public static <T> boolean validate(T object) {
        Class<?> clazz = object.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(MinimumAge.class)) {
                MinimumAge minimumAge = field.getAnnotation(MinimumAge.class);
                try {
                    field.setAccessible(true);
                    LocalDate dateOfBirth = (LocalDate) field.get(object);
                    return Period.between(dateOfBirth, LocalDate.now()).getYears() >= minimumAge.value();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
