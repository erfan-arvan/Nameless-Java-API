package com.namelessmc.java_api.integrations;
import javax.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.NonNull;

public class DiscordIntegrationData extends IntegrationData {

    private final long id;

    public DiscordIntegrationData(final long id, final String username) {
        super(StandardIntegrationTypes.DISCORD, String.valueOf(id), username);
        this.id = id;
    }

    public long getIdLong() {
        return this.id;
    }
}
