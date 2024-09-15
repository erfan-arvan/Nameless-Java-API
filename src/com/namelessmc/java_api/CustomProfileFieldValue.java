package com.namelessmc.java_api;
import javax.annotation.Nullable;
import org.jetbrains.annotations.NotNull;

public class CustomProfileFieldValue {

    private final CustomProfileField field;

    private final String value;

    CustomProfileFieldValue(CustomProfileField field, String value) {
        this.field = field;
        this.value = value;
    }

    public CustomProfileField getField() {
        return this.field;
    }

    public String getValue() {
        return value;
    }
}
