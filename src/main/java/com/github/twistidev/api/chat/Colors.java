package com.github.twistidev.api.chat;

import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DefaultQualifier(NotNull.class)
public final class Colors {
    public static final @Nullable TextColor PRIMARY = TextColor.fromHexString("#3254a8");
    public static final @Nullable TextColor SECONDARY = TextColor.fromHexString("#cdab57");
    public static final @Nullable TextColor TERTIARY = TextColor.fromHexString("#f2c94c");

    public static final @Nullable TextColor ERROR = TextColor.fromHexString("#AA4344");
    public static final @Nullable TextColor SUCCESS = TextColor.fromHexString("#77dd77");
    public static final @Nullable TextColor WARNING = TextColor.fromHexString("#FDFD96");
    public static final @Nullable TextColor INFO = TextColor.fromHexString("#B5B5AC");
    public static final @Nullable TextColor DEBUG = TextColor.fromHexString("#a6c7e6");

    public static final @Nullable TextColor WHITE = TextColor.fromHexString("#f4f4f4");
    public static final @Nullable TextColor BLACK = TextColor.fromHexString("#000000");
    public static final TextColor DARK_GRAY = NamedTextColor.DARK_GRAY;
    public static final TextColor GRAY = NamedTextColor.GRAY;
    public static final TextColor DARK_RED = NamedTextColor.DARK_RED;
    public static final TextColor RED = NamedTextColor.RED;
    public static final TextColor DARK_GREEN = NamedTextColor.DARK_GREEN;
    public static final TextColor GREEN = NamedTextColor.GREEN;
    public static final TextColor DARK_AQUA = NamedTextColor.DARK_AQUA;
    public static final TextColor AQUA = NamedTextColor.AQUA;
    public static final TextColor DARK_BLUE = NamedTextColor.DARK_BLUE;
    public static final TextColor BLUE = NamedTextColor.BLUE;
    public static final TextColor DARK_PURPLE = NamedTextColor.DARK_PURPLE;
    public static final TextColor LIGHT_PURPLE = NamedTextColor.LIGHT_PURPLE;
    public static final TextColor GOLD = NamedTextColor.GOLD;
    public static final TextColor YELLOW = NamedTextColor.YELLOW;
}
