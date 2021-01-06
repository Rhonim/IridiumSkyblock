package com.iridium.iridiumskyblock.configs;

import com.cryptomorin.xseries.XMaterial;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Upgrades {

    public Upgrade islandSizeUpgrade = new Upgrade("size", true, 10, new HashMap<Integer, IslandUpgrade>() {{
        put(1, new IslandUpgrade(15, 0, 50));
        put(2, new IslandUpgrade(15, 0, 100));
        put(3, new IslandUpgrade(15, 0, 150));
    }}, new Inventories.Item(XMaterial.GRASS_BLOCK, 1, "&b&lIsland Size", Arrays.asList("&7Need more room to expand? Buy this", "&7upgrade to increase your island size.", "", "&b&lInformation:", "&b&l * &7Current Level: &b{sizelevel}", "&b&l * &7Current Size: &b{sizeblocks}x{sizeblocks} Blocks", "&b&l * &7Upgrade Cost: &b{sizecrystalscost} Crystals and ${sizevaultcost}", "&b&lLevels:", "&b&l * &7Level 1: &b50x50 Blocks", "&b&l * &7Level 2: &b100x100 Blocks", "&b&l * &7Level 3: &b150x150 Blocks", "", "&b&l[!] &bLeft Click to Purchase this Upgrade")));

    public Upgrade islandMemberUpgrade = new Upgrade("member", true, 12, new HashMap<Integer, IslandUpgrade>() {{
        put(1, new IslandUpgrade(15, 0, 9));
        put(2, new IslandUpgrade(15, 0, 18));
        put(3, new IslandUpgrade(15, 0, 27));
    }}, new Inventories.Item(XMaterial.ARMOR_STAND, 1, "&b&lMember Count", Arrays.asList("&7Need more members? Buy this", "&7upgrade to increase your member count.", "", "&b&lInformation:", "&b&l * &7Current Level: &b{memberlevel}", "&b&l * &7Current Members: &b{membercount} Members", "&b&l * &7Upgrade Cost: &b{membercrystalscost} Crystals and ${membervaultcost}", "&b&lLevels:", "&b&l * &7Level 1: &b9 Members", "&b&l * &7Level 2: &b18 Members", "&b&l * &7Level 3: &b27 Members", "", "&b&l[!] &bLeft Click to Purchase this Upgrade")));

    public Upgrade islandWarpUpgrade = new Upgrade("warp", true, 14, new HashMap<Integer, IslandUpgrade>() {{
        put(1, new IslandUpgrade(15, 0, 2));
        put(2, new IslandUpgrade(15, 0, 5));
        put(3, new IslandUpgrade(15, 0, 9));
    }}, new Inventories.Item(XMaterial.END_PORTAL_FRAME, 1, "&b&lIsland Warps", Arrays.asList("&7Need more island warps? Buy this", "&7upgrade to increase your warp count.", "", "&b&lInformation:", "&b&l * &7Current Level: &b{warplevel}", "&b&l * &7Current Warps: &b{warpcount} Warps", "&b&l * &7Upgrade Cost: &b{warpcrystalscost} Crystals and ${warpvaultcost}", "&b&lLevels:", "&b&l * &7Level 1: &b2 Warps", "&b&l * &7Level 2: &b5 Warps", "&b&l * &7Level 3: &b9 Warps", "", "&b&l[!] &bLeft Click to Purchase this Upgrade")));

    public Upgrade islandOresUpgrade = new Upgrade("ores", true, 16, new HashMap<Integer, IslandUpgrade>() {{
        put(1, new IslandUpgrade(15, 0, Arrays.asList("COBBLESTONE:80", "IRON_ORE:30", "COAL_ORE:30", "DIAMOND_ORE:10", "REDSTONE_ORE:30", "LAPIS_ORE:30", "GOLD_ORE:30", "EMERALD_ORE:10"), Arrays.asList("NETHERRACK:80", "GLOWSTONE:30", "NETHER_QUARTZ_ORE:30", "SOUL_SAND:30")));
        put(2, new IslandUpgrade(15, 0, Arrays.asList("COBBLESTONE:55", "IRON_ORE:30", "COAL_ORE:30", "DIAMOND_ORE:20", "REDSTONE_ORE:30", "LAPIS_ORE:30", "GOLD_ORE:30", "EMERALD_ORE:20"), Arrays.asList("NETHERRACK:50", "GLOWSTONE:30", "NETHER_QUARTZ_ORE:30", "SOUL_SAND:30")));
        put(3, new IslandUpgrade(15, 0, Arrays.asList("COBBLESTONE:30", "IRON_ORE:30", "COAL_ORE:30", "DIAMOND_ORE:30", "REDSTONE_ORE:30", "LAPIS_ORE:30", "GOLD_ORE:30", "EMERALD_ORE:30"), Arrays.asList("NETHERRACK:30", "GLOWSTONE:30", "NETHER_QUARTZ_ORE:30", "SOUL_SAND:30")));
    }}, new Inventories.Item(XMaterial.DIAMOND_ORE, 1, "&b&lIsland Generator", Arrays.asList("&7Want to improve your generator? Buy this", "&7upgrade to increase your island generator.", "", "&b&lInformation:", "&b&l * &7Current Level: &b{oreslevel}", "&b&l * &7Upgrade Cost: &b{orescrystalscost} Crystals and ${oresvaultcost}", "", "&b&l[!] &bLeft Click to Purchase this Upgrade")));

    public static class Upgrade {
        public String name;
        public boolean enabled;
        public int slot;
        public Map<Integer, IslandUpgrade> upgrades;
        public Inventories.Item item;

        public Upgrade(String name, boolean enabled, int slot, Map<Integer, IslandUpgrade> upgrades, Inventories.Item item) {
            this.name = name;
            this.enabled = enabled;
            this.slot = slot;
            this.upgrades = upgrades;
            this.item = item;
        }
    }

    public static class IslandUpgrade {
        public int crystalsCost;
        public int vaultCost;
        public Integer size;
        public List<String> ores;
        public List<String> netherores;

        public IslandUpgrade(int crystalsCost, int vaultCost, List<String> ores, List<String> netherores) {
            this.crystalsCost = crystalsCost;
            this.vaultCost = vaultCost;
            this.ores = ores;
            this.netherores = netherores;
        }

        public IslandUpgrade(int crystalsCost, int vaultCost, int size) {
            this.crystalsCost = crystalsCost;
            this.vaultCost = vaultCost;
            this.size = size;
        }
    }
}
