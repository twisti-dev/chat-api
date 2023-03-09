package com.github.twistidev.api.chat;

import net.kyori.adventure.text.Component;

public final class ChatApi {
    private static Component prefix = Component.empty();

    public ChatApi(Component prefix){
        ChatApi.prefix = prefix;
    }

    public static Component getPrefix() {
        return prefix;
    }
}
