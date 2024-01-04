package com.github.toolslib;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class ToolsLib extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.GREEN+"插件已加载！作者:3cxc");
        getLogger().info(ChatColor.GREEN+"依赖库版本: 1.0");
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.GREEN+"插件已关闭！");
    }
}
