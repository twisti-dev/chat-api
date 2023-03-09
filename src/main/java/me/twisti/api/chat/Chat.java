package me.twisti.api.chat;

import net.kyori.adventure.text.Component;

public class Chat {
  private static Component prefix = Component.empty();

  public Chat(Component prefix){
    Chat.prefix = prefix;
  }

  public static Component getPrefix() {
    return prefix;
  }
}
