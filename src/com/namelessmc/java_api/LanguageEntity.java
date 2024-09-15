package com.namelessmc.java_api;
import javax.annotation.Nullable;
import org.jetbrains.annotations.NotNull;

public interface LanguageEntity {

    String getLanguage() throws NamelessException;

    String getLanguagePosix() throws NamelessException;
}
