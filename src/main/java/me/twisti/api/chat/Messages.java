package me.twisti.api.chat;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import io.papermc.paper.adventure.PaperAdventure;
import net.kyori.adventure.text.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.world.entity.player.Player;
import org.bukkit.entity.HumanEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Messages {
  private static final Component PREFIX = Chat.getPrefix();

  public static<Source extends CommandSourceStack> void sendSuccess(@NotNull Source source, @NotNull Component message){
    source.sendSuccess(PaperAdventure.asVanilla(PREFIX.append(message.colorIfAbsent(Colors.SUCCESS))), false);
  }

  public static<Source extends CommandSourceStack> void sendSuccess(@NotNull Source source, @NotNull String message){
    sendSuccess(source, Component.text(message));
  }

  public static<Source extends CommandSourceStack> void sendSuccess(@NotNull Source source, @Nullable Component messageIfPlayer, @Nullable Component messageIfOther) throws CommandSyntaxException {
    if (source.isPlayer()){
      if (messageIfPlayer == null) return;
      source.getPlayerOrException().getBukkitEntity().sendMessage(PREFIX.append(messageIfPlayer.colorIfAbsent(Colors.SUCCESS)));
    }else {
      if (messageIfOther == null) return;
      source.sendSuccess(PaperAdventure.asVanilla(PREFIX.append(messageIfOther.colorIfAbsent(Colors.SUCCESS))), false);
    }
  }

  public static<Source extends CommandSourceStack> void sendSuccess(@NotNull Source source, @Nullable String messageIfPlayer, @Nullable String messageIfOther) throws CommandSyntaxException {
    sendSuccess(source, (messageIfPlayer == null) ? null : Component.text(messageIfPlayer), (messageIfOther == null) ? null : Component.text(messageIfOther));
  }

  public static<P extends HumanEntity> void sendSuccess(@NotNull P player, @NotNull Component message){
    player.sendMessage(PREFIX.append(message.colorIfAbsent(Colors.SUCCESS)));
  }

  public static<P extends HumanEntity> void sendSuccess(@NotNull P player, @NotNull String message){
    sendSuccess(player, Component.text(message));
  }

  public static<M extends net.minecraft.world.entity.player.Player> void sendSuccess(@NotNull M player, @NotNull Component message){
    sendSuccess(player.getBukkitEntity(), message);
  }

  public static<M extends Player> void sendSuccess(@NotNull M player, @NotNull String message){
    sendSuccess(player, Component.text(message));
  }





  public static<Source extends CommandSourceStack> void sendInfo(@NotNull Source source, @NotNull Component message){
    source.sendSystemMessage(PaperAdventure.asVanilla(PREFIX.append(message.colorIfAbsent(Colors.INFO))));
  }

  public static<Source extends CommandSourceStack> void sendInfo(@NotNull Source source, @NotNull String message){
    sendInfo(source, Component.text(message));
  }

  public static<Source extends CommandSourceStack> void sendInfo(@NotNull Source source, @Nullable Component messageIfPlayer, @Nullable Component messageIfOther) throws CommandSyntaxException {
    if (source.isPlayer()){
      if (messageIfPlayer == null) return;
      source.getPlayerOrException().getBukkitEntity().sendMessage(PREFIX.append(messageIfPlayer.colorIfAbsent(Colors.INFO)));
    }else {
      if (messageIfOther == null) return;
      source.sendSystemMessage(PaperAdventure.asVanilla(PREFIX.append(messageIfOther.colorIfAbsent(Colors.INFO))));
    }
  }

  public static<Source extends CommandSourceStack> void sendInfo(@NotNull Source source, @Nullable String messageIfPlayer, @Nullable String messageIfOther) throws CommandSyntaxException {
    sendInfo(source, (messageIfPlayer == null) ? null : Component.text(messageIfPlayer), (messageIfOther == null) ? null : Component.text(messageIfOther));
  }

  public static<P extends HumanEntity> void sendInfo(@NotNull P player, @NotNull Component message){
    player.sendMessage(PREFIX.append(message.colorIfAbsent(Colors.INFO)));
  }

  public static<P extends HumanEntity> void sendInfo(@NotNull P player, @NotNull String message){
    sendInfo(player, Component.text(message));
  }

  public static<M extends net.minecraft.world.entity.player.Player> void sendInfo(@NotNull M player, @NotNull Component message){
    sendInfo(player.getBukkitEntity(), message);
  }

  public static<M extends Player> void sendInfo(@NotNull M player, @NotNull String message){
    sendInfo(player, Component.text(message));
  }



  public static<Source extends CommandSourceStack> void sendError(@NotNull Source source, @NotNull Component message){
    source.sendSystemMessage(PaperAdventure.asVanilla(PREFIX.append(message.colorIfAbsent(Colors.ERROR))));
  }

  public static<Source extends CommandSourceStack> void sendError(@NotNull Source source, @NotNull String message){
    sendError(source, Component.text(message));
  }

  public static<Source extends CommandSourceStack> void sendError(@NotNull Source source, @Nullable Component messageIfPlayer, @Nullable Component messageIfOther) throws CommandSyntaxException {
    if (source.isPlayer()){
      if (messageIfPlayer == null) return;
      source.getPlayerOrException().getBukkitEntity().sendMessage(PREFIX.append(messageIfPlayer.colorIfAbsent(Colors.ERROR)));
    }else {
      if (messageIfOther == null) return;
      source.sendFailure(PaperAdventure.asVanilla(PREFIX.append(messageIfOther.colorIfAbsent(Colors.ERROR))), false);
    }
  }

  public static<Source extends CommandSourceStack> void sendError(@NotNull Source source, @Nullable String messageIfPlayer, @Nullable String messageIfOther) throws CommandSyntaxException {
    sendError(source, (messageIfPlayer == null) ? null : Component.text(messageIfPlayer), (messageIfOther == null) ? null : Component.text(messageIfOther));
  }

  public static<P extends HumanEntity> void sendError(@NotNull P player, @NotNull Component message){
    player.sendMessage(PREFIX.append(message.colorIfAbsent(Colors.ERROR)));
  }

  public static<P extends HumanEntity> void sendError(@NotNull P player, @NotNull String message){
    sendError(player, Component.text(message));
  }

  public static<M extends net.minecraft.world.entity.player.Player> void sendError(@NotNull M player, @NotNull Component message){
    sendError(player.getBukkitEntity(), message);
  }

  public static<M extends Player> void sendError(@NotNull M player, @NotNull String message){
    sendError(player, Component.text(message));
  }

}
