package com.namelessmc.java_api;
import javax.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.NonNull;

public interface LanguageEntity {

    String getLanguage() throws NamelessException;

    String getLanguagePosix() throws NamelessException;
}
