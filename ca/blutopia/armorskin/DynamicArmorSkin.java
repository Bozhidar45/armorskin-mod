package ca.blutopia.armorskin;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_310;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1304;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_746;
import ca.blutopia.armorskin.config.ArmorType;
import ca.blutopia.armorskin.config.ModConfig;

public class DynamicArmorSkin {
    private Map<ArmorMaterial, Integer> armorPoints = new HashMap<>();
    private ArmorMaterial current;
    private class_310 client;
    private ModConfig modConfig;
    
    public enum ArmorMaterial {
        NONE,
        LEATHER,
        CHAINMAIL,
        IRON,
        GOLD,
        DIAMOND,
        NETHERITE,
        TURTLE,
        COPPER,
        LEATHER_CHAIN,
        LEATHER_IRON,
        LEATHER_GOLD,
        LEATHER_DIAMOND,
        LEATHER_NETHERITE,
        LEATHER_HALF,
        LEATHER_TURTLE,
        LEATHER_COPPER,
        CHAIN_LEATHER,
        CHAIN_IRON,
        CHAIN_GOLD,
        CHAIN_DIAMOND,
        CHAIN_NETHERITE,
        CHAIN_HALF,
        CHAIN_TURTLE,
        CHAIN_COPPER,
        IRON_LEATHER,
        IRON_CHAIN,
        IRON_GOLD,
        IRON_DIAMOND,
        IRON_NETHERITE,
        IRON_HALF,
        IRON_TURTLE,
        IRON_COPPER,
        GOLD_LEATHER,
        GOLD_CHAIN,
        GOLD_IRON,
        GOLD_DIAMOND,
        GOLD_NETHERITE,
        GOLD_HALF,
        GOLD_TURTLE,
        GOLD_COPPER,
        DIAMOND_LEATHER,
        DIAMOND_CHAIN,
        DIAMOND_IRON,
        DIAMOND_GOLD,
        DIAMOND_NETHERITE,
        DIAMOND_HALF,
        DIAMOND_TURTLE,
        DIAMOND_COPPER,
        NETHERITE_LEATHER,
        NETHERITE_CHAIN,
        NETHERITE_IRON,
        NETHERITE_GOLD,
        NETHERITE_DIAMOND,
        NETHERITE_HALF,
        NETHERITE_TURTLE,
        NETHERITE_COPPER,
        TURTLE_LEATHER,
        TURTLE_CHAIN,
        TURTLE_IRON,
        TURTLE_GOLD,
        TURTLE_DIAMOND,
        TURTLE_NETHERITE,
        TURTLE_HALF,
        TURTLE_COPPER,
        COPPER_LEATHER,
        COPPER_CHAIN,
        COPPER_IRON,
        COPPER_GOLD,
        COPPER_DIAMOND,
        COPPER_NETHERITE,
        COPPER_HALF,
        COPPER_TURTLE
    }
    
    public DynamicArmorSkin(class_310 client) {
        this.client = client;
        this.modConfig = ca.blutopia.armorskin.ArmorSkin.ConfigInstance;
        this.storeArmorValues();
    }
    
    private void storeArmorValues() {
        this.armorPoints.clear();
        armorPoints.put(ArmorMaterial.LEATHER, 1);
        armorPoints.put(ArmorMaterial.CHAINMAIL, 2);
        armorPoints.put(ArmorMaterial.IRON, 3);
        armorPoints.put(ArmorMaterial.GOLD, 4);
        armorPoints.put(ArmorMaterial.DIAMOND, 5);
        armorPoints.put(ArmorMaterial.NETHERITE, 6);
        armorPoints.put(ArmorMaterial.TURTLE, 7);
        armorPoints.put(ArmorMaterial.COPPER, 8);
        armorPoints.put(ArmorMaterial.LEATHER_CHAIN, 9);
        armorPoints.put(ArmorMaterial.LEATHER_IRON, 10);
        armorPoints.put(ArmorMaterial.LEATHER_GOLD, 11);
        armorPoints.put(ArmorMaterial.LEATHER_DIAMOND, 12);
        armorPoints.put(ArmorMaterial.LEATHER_NETHERITE, 13);
        armorPoints.put(ArmorMaterial.LEATHER_HALF, 14);
        armorPoints.put(ArmorMaterial.LEATHER_TURTLE, 15);
        armorPoints.put(ArmorMaterial.LEATHER_COPPER, 16);
        armorPoints.put(ArmorMaterial.CHAIN_LEATHER, 17);
        armorPoints.put(ArmorMaterial.CHAIN_IRON, 18);
        armorPoints.put(ArmorMaterial.CHAIN_GOLD, 19);
        armorPoints.put(ArmorMaterial.CHAIN_DIAMOND, 20);
        armorPoints.put(ArmorMaterial.CHAIN_NETHERITE, 21);
        armorPoints.put(ArmorMaterial.CHAIN_HALF, 22);
        armorPoints.put(ArmorMaterial.CHAIN_TURTLE, 23);
        armorPoints.put(ArmorMaterial.CHAIN_COPPER, 24);
        armorPoints.put(ArmorMaterial.IRON_LEATHER, 25);
        armorPoints.put(ArmorMaterial.IRON_CHAIN, 26);
        armorPoints.put(ArmorMaterial.IRON_GOLD, 27);
        armorPoints.put(ArmorMaterial.IRON_DIAMOND, 28);
        armorPoints.put(ArmorMaterial.IRON_NETHERITE, 29);
        armorPoints.put(ArmorMaterial.IRON_HALF, 30);
        armorPoints.put(ArmorMaterial.IRON_TURTLE, 31);
        armorPoints.put(ArmorMaterial.IRON_COPPER, 32);
        armorPoints.put(ArmorMaterial.GOLD_LEATHER, 33);
        armorPoints.put(ArmorMaterial.GOLD_CHAIN, 34);
        armorPoints.put(ArmorMaterial.GOLD_IRON, 35);
        armorPoints.put(ArmorMaterial.GOLD_DIAMOND, 36);
        armorPoints.put(ArmorMaterial.GOLD_NETHERITE, 37);
        armorPoints.put(ArmorMaterial.GOLD_HALF, 38);
        armorPoints.put(ArmorMaterial.GOLD_TURTLE, 39);
        armorPoints.put(ArmorMaterial.GOLD_COPPER, 40);
        armorPoints.put(ArmorMaterial.DIAMOND_LEATHER, 41);
        armorPoints.put(ArmorMaterial.DIAMOND_CHAIN, 42);
        armorPoints.put(ArmorMaterial.DIAMOND_IRON, 43);
        armorPoints.put(ArmorMaterial.DIAMOND_GOLD, 44);
        armorPoints.put(ArmorMaterial.DIAMOND_NETHERITE, 45);
        armorPoints.put(ArmorMaterial.DIAMOND_HALF, 46);
        armorPoints.put(ArmorMaterial.DIAMOND_TURTLE, 47);
        armorPoints.put(ArmorMaterial.DIAMOND_COPPER, 48);
        armorPoints.put(ArmorMaterial.NETHERITE_LEATHER, 49);
        armorPoints.put(ArmorMaterial.NETHERITE_CHAIN, 50);
        armorPoints.put(ArmorMaterial.NETHERITE_IRON, 51);
        armorPoints.put(ArmorMaterial.NETHERITE_GOLD, 52);
        armorPoints.put(ArmorMaterial.NETHERITE_DIAMOND, 53);
        armorPoints.put(ArmorMaterial.NETHERITE_HALF, 54);
        armorPoints.put(ArmorMaterial.NETHERITE_TURTLE, 55);
        armorPoints.put(ArmorMaterial.NETHERITE_COPPER, 56);
        armorPoints.put(ArmorMaterial.TURTLE_LEATHER, 57);
        armorPoints.put(ArmorMaterial.TURTLE_CHAIN, 58);
        armorPoints.put(ArmorMaterial.TURTLE_IRON, 59);
        armorPoints.put(ArmorMaterial.TURTLE_GOLD, 60);
        armorPoints.put(ArmorMaterial.TURTLE_DIAMOND, 61);
        armorPoints.put(ArmorMaterial.TURTLE_NETHERITE, 62);
        armorPoints.put(ArmorMaterial.TURTLE_HALF, 63);
        armorPoints.put(ArmorMaterial.TURTLE_COPPER, 64);
        armorPoints.put(ArmorMaterial.COPPER_LEATHER, 65);
        armorPoints.put(ArmorMaterial.COPPER_CHAIN, 66);
        armorPoints.put(ArmorMaterial.COPPER_IRON, 67);
        armorPoints.put(ArmorMaterial.COPPER_GOLD, 68);
        armorPoints.put(ArmorMaterial.COPPER_DIAMOND, 69);
        armorPoints.put(ArmorMaterial.COPPER_NETHERITE, 70);
        armorPoints.put(ArmorMaterial.COPPER_HALF, 71);
        armorPoints.put(ArmorMaterial.COPPER_TURTLE, 72);
    }
    
    public ArmorMaterial getArmorMaterial(class_1799 itemStack) {
        if (itemStack == null || itemStack.method_7909() == null) {
            return ArmorMaterial.NONE;
        }
        
        class_1792 item = itemStack.method_7909();
        
        if (item == class_1802.field_8833 || item == class_1802.field_8267 || 
            item == class_1802.field_8577 || item == class_1802.field_8570) {
            return ArmorMaterial.LEATHER;
        } else if (item == class_1802.field_8370 || item == class_1802.field_8862 || 
                   item == class_1802.field_8678 || item == class_1802.field_8416) {
            return ArmorMaterial.CHAINMAIL;
        } else if (item == class_1802.field_8753 || item == class_1802.field_8283 || 
                   item == class_1802.field_8873 || item == class_1802.field_8218) {
            return ArmorMaterial.IRON;
        } else if (item == class_1802.field_8313 || item == class_1802.field_8743 || 
                   item == class_1802.field_8523 || item == class_1802.field_8396) {
            return ArmorMaterial.GOLD;
        } else if (item == class_1802.field_8660 || item == class_1802.field_8805 || 
                   item == class_1802.field_8058 || item == class_1802.field_8348) {
            return ArmorMaterial.DIAMOND;
        } else if (item == class_1802.field_8285 || item == class_1802.field_22027 || 
                   item == class_1802.field_22028 || item == class_1802.field_22029) {
            return ArmorMaterial.NETHERITE;
        } else if (item == class_1802.field_22030) {
            return ArmorMaterial.TURTLE;
        } else if (item == class_1802.field_8090) {
            return ArmorMaterial.NONE;
        }
        
        return ArmorMaterial.NONE;
    }
    
    public int getArmorValue(class_1799 itemStack) {
        ArmorMaterial material = this.getArmorMaterial(itemStack);
        
        if (material == ArmorMaterial.NONE || !this.armorPoints.containsKey(material)) {
            return 0;
        }
        
        Integer value = this.armorPoints.get(material);
        return value != null ? value : 0;
    }
    
    private boolean isElytraEquipped() {
        if (this.client == null) return false;
        class_746 player = this.client.field_1724;
        if (player == null) return false;
        
        class_1799 chestStack = player.method_6118(class_1304.field_6166);
        if (chestStack == null || chestStack.method_7909() == null) return false;
        
        return chestStack.method_7909() == class_1802.field_8090;
    }
    
    public ArmorType getArmorTypeForIcon(int iconIndex) {
        if (this.client == null || this.client.field_1724 == null) {
            return ArmorType.EMPTY;
        }
        
        class_1657 player = this.client.field_1724;
        
        class_1799 boots = player.method_6118(class_1304.field_6172);
        class_1799 leggings = player.method_6118(class_1304.field_6174);
        class_1799 chestplate = player.method_6118(class_1304.field_6169);
        class_1799 helmet = player.method_6118(class_1304.field_6166);
        
        ArmorMaterial bootsMaterial = boots != null ? this.getArmorMaterial(boots) : ArmorMaterial.NONE;
        ArmorMaterial leggingsMaterial = leggings != null ? this.getArmorMaterial(leggings) : ArmorMaterial.NONE;
        ArmorMaterial chestplateMaterial = chestplate != null ? this.getArmorMaterial(chestplate) : ArmorMaterial.NONE;
        ArmorMaterial helmetMaterial = helmet != null ? this.getArmorMaterial(helmet) : ArmorMaterial.NONE;
        
        boolean isMixed = false;
        ArmorMaterial lastNonNone = ArmorMaterial.NONE;
        
        for (ArmorMaterial mat : new ArmorMaterial[]{bootsMaterial, leggingsMaterial, chestplateMaterial, helmetMaterial}) {
            if (mat != ArmorMaterial.NONE) {
                if (lastNonNone == ArmorMaterial.NONE) {
                    lastNonNone = mat;
                } else if (mat != lastNonNone) {
                    isMixed = true;
                    break;
                }
            }
        }
        
        switch (iconIndex) {
            case 0: return this.getArmorType(bootsMaterial, isMixed);
            case 1: return this.getArmorType(leggingsMaterial, isMixed);
            case 2: return this.getArmorType(chestplateMaterial, isMixed);
            case 3: return this.getArmorType(helmetMaterial, isMixed);
            default: return ArmorType.EMPTY;
        }
    }
    
    private ArmorType getArmorType(ArmorMaterial primary, boolean isMixed) {
        if (primary == ArmorMaterial.NONE) {
            return ArmorType.EMPTY;
        }
        
        if (!this.armorPoints.containsKey(primary)) {
            return ArmorType.EMPTY;
        }
        
        Integer valueObj = this.armorPoints.get(primary);
        if (valueObj == null) {
            return ArmorType.EMPTY;
        }
        int value = valueObj;
        
        // Complete mapping for all 72 possible values
        if (value <= 8) {
            switch (value) {
                case 1: return ArmorType.LEATHER;
                case 2: return ArmorType.CHAIN;
                case 3: return ArmorType.IRON;
                case 4: return ArmorType.GOLD;
                case 5: return ArmorType.DIAMOND;
                case 6: return ArmorType.NETHERITE;
                case 7: return ArmorType.TURTLE;
                case 8: return ArmorType.COPPER;
            }
        } else if (value <= 16) {
            return ArmorType.LEATHER; // Mixed with leather as primary
        } else if (value <= 24) {
            return ArmorType.CHAIN; // Mixed with chain as primary
        } else if (value <= 32) {
            return ArmorType.IRON; // Mixed with iron as primary
        } else if (value <= 40) {
            return ArmorType.GOLD; // Mixed with gold as primary
        } else if (value <= 48) {
            return ArmorType.DIAMOND; // Mixed with diamond as primary
        } else if (value <= 56) {
            return ArmorType.NETHERITE; // Mixed with netherite as primary
        } else if (value <= 64) {
            return ArmorType.TURTLE; // Mixed with turtle as primary
        } else if (value <= 72) {
            return ArmorType.COPPER; // Mixed with copper as primary
        }
        
        return ArmorType.EMPTY;
    }
}
