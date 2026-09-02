package me.shiny.matesignal;

import net.neoforged.neoforge.common.ModConfigSpec;
import java.util.List;

public final class Config {
    public static final ModConfigSpec SPEC;
    public static final ModConfigSpec.IntValue RADIUS;
    public static final ModConfigSpec.ConfigValue<List<? extends String>> MOBS;
    public static final ModConfigSpec.BooleanValue DAY_MESSAGE;
    public static final ModConfigSpec.BooleanValue NIGHT_MESSAGE;
    public static final ModConfigSpec.BooleanValue LOW_HEALTH_MESSAGE;
    public static final ModConfigSpec.BooleanValue LOW_HUNGER_MESSAGE;
    public static final ModConfigSpec.BooleanValue DEATH_MESSAGE;
    public static final ModConfigSpec.BooleanValue RAIN_START_MESSAGE;
    public static final ModConfigSpec.BooleanValue DROWNING_HALF_MESSAGE;
    public static final ModConfigSpec.BooleanValue SLEEP_MESSAGE;
    public static final ModConfigSpec.BooleanValue CRAFTING_MESSAGE;

    static {
        ModConfigSpec.Builder b = new ModConfigSpec.Builder();
        RADIUS = b.defineInRange("radius", 10, 3, 64);
        MOBS = b.defineListAllowEmpty(
                "mobs",
                () -> List.of("minecraft:creeper","minecraft:zombie"),
                () -> "minecraft:creeper",
                o -> o instanceof String s && !s.isBlank()
        );
        DAY_MESSAGE = b.define("dayMessage", true);
        NIGHT_MESSAGE = b.define("nightMessage", true);
        LOW_HEALTH_MESSAGE = b.define("lowHealthMessage", true);
        LOW_HUNGER_MESSAGE = b.define("lowHungerMessage", true);
        DEATH_MESSAGE = b.define("deathMessage", true);
        RAIN_START_MESSAGE = b.define("rainStartMessage", true);
        DROWNING_HALF_MESSAGE = b.define("drowningHalfMessage", true);
        SLEEP_MESSAGE = b.define("sleepMessage", true);
        CRAFTING_MESSAGE = b.define("craftingMessage", true);
        SPEC = b.build();
    }

    private Config() {}
}
