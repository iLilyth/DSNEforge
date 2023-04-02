package com.lilyth;

import com.lilyth.modules.commands.vigilance.ExampleCommand;
import com.lilyth.config.Config;
import com.lilyth.modules.features.copychat.AutoCopyChat;
import com.lilyth.modules.features.hud.ToggleSprint;
import com.lilyth.modules.features.notifiers.RareDropNotifier;
import com.lilyth.modules.features.random.DragonSpawn;
import com.lilyth.modules.features.utils.DamageFormatting;
import com.lilyth.modules.features.utils.EndermanWaypoints;
import com.lilyth.modules.listeners.PlayerListener;
import com.lilyth.modules.features.copychat.CopyChat;
import com.lilyth.modules.features.hud.FPScounter;
import com.lilyth.modules.features.hud.PingCounter;
import com.lilyth.modules.features.notifiers.DivineSuperior;
import com.lilyth.modules.listeners.RenderListener;
import com.lilyth.modules.trackers.EyesDropped;
import com.lilyth.modules.trackers.FirstLoad;
import com.lilyth.modules.utils.InventoryUtils;
import com.lilyth.modules.features.random.PingPong;
import com.lilyth.modules.utils.JSON;
import com.lilyth.modules.utils.NumberFormatter;
import com.lilyth.modules.utils.Utils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.*;

@Mod(
        modid = DSNEforge.MODID,
        name = DSNEforge.MOD_NAME,
        version = DSNEforge.VERSION,
        clientSideOnly = true,
        acceptedMinecraftVersions = DSNEforge.MC_VERSION
)
public class DSNEforge {
    public static final String MODID = "dsne";
    public static final String MOD_NAME = "DSNEforge";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "1.8.9";
    public static DSNEforge instance;

    public static Config config;
    public final InventoryUtils inventoryUtils;
    public final NumberFormatter numberFormatter;
    public final Utils utils;
    public final CopyChat copychat;
    public final AutoCopyChat autoCopyChat;
    public final FPScounter fpscounter;
    public final PingCounter pingCounter;
    public final ToggleSprint toggleSprint;
    public final DivineSuperior divineSuperior;
    public final RareDropNotifier rareDropNotifier;
    public final DragonSpawn dragonSpawn;
    public final PingPong pingPong;
    public final DamageFormatting damageFormatting;
    public final EndermanWaypoints endermanWaypoints;
    public final PlayerListener playerListener;
    public final RenderListener renderListener;
    public final EyesDropped eyesDropped;
    public final FirstLoad firstLoad;

    /////
    public DSNEforge() {
        instance=this;
        config = new Config();
        this.playerListener = new PlayerListener();
        this.renderListener = new RenderListener();
        this.autoCopyChat = new AutoCopyChat();
        this.copychat = new CopyChat();
        this.fpscounter = new FPScounter();
        this.pingCounter = new PingCounter();
        this.toggleSprint = new ToggleSprint();
        this.divineSuperior = new DivineSuperior();
        this.rareDropNotifier = new RareDropNotifier();
        this.dragonSpawn = new DragonSpawn();
        this.pingPong = new PingPong();
        this.damageFormatting = new DamageFormatting();
        this.endermanWaypoints = new EndermanWaypoints();
        this.eyesDropped = new EyesDropped();
        this.firstLoad = new FirstLoad();
        this.inventoryUtils = new InventoryUtils();
        this.numberFormatter = new NumberFormatter();
        this.utils = new Utils();
    }

    /////

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Initialize and preload modules
        config.preload();
        JSON.loadEyes();
        new ExampleCommand("dsnf").register();
        MinecraftForge.EVENT_BUS.register(this.playerListener);
        MinecraftForge.EVENT_BUS.register(this.renderListener);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        System.out.println("DSNE successfully Initialized!");
    }
    /////

    public static DSNEforge getInstance() {
        return instance;
    }
    public static Config getConfig() {
        return config;
    }
    public AutoCopyChat getAutoCopyChat() {
        return autoCopyChat;
    }
    public CopyChat getCopyChat() {
        return copychat;
    }
    public FPScounter getFpscounter() {
        return fpscounter;
    }
    public PingCounter getPingCounter() {
        return pingCounter;
    }
    public ToggleSprint getToggleSprint(){
        return toggleSprint;
    }
    public DivineSuperior getDivineSuperior() {
        return divineSuperior;
    }

    public RareDropNotifier getRareDropNotifier() {
        return rareDropNotifier;
    }

    public DragonSpawn getDragonSpawn() {
        return dragonSpawn;
    }
    public PingPong getPingPong() {
        return pingPong;
    }

    public DamageFormatting getDamageFormatting() {
        return damageFormatting;
    }
    public EndermanWaypoints getEndermanWaypoints() {
        return endermanWaypoints;
    }
    public PlayerListener getPlayerListener() {
        return playerListener;
    }
    public RenderListener getRenderListener() {
        return renderListener;
    }
    public EyesDropped getEyesDropped() {
        return eyesDropped;
    }
    public FirstLoad getFirstLoad() {
        return firstLoad;
    }
    public InventoryUtils getInventoryUtils() {
        return inventoryUtils;
    }

    public NumberFormatter getNumberFormatter() {
        return numberFormatter;
    }

    public Utils getUtils() {
        return utils;
    }
}
