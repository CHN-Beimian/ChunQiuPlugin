package net.zenwix.chunqiu;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import net.zenwix.chunqiu.Listener.PlayerJoinListener;

public class Main
extends PluginBase
{
	private static Main INSTANCE;

	@Override
	public void onLoad() {//onLoad状态，一般是服务器启动预备时的状态
		getLogger().info(TextFormat.RED+"正在挂载HelloWorld插件");

	}

	@Override
	public void onEnable() {//onEnable状态，一般启动插件的功能
		INSTANCE = this;
		getLogger().info(TextFormat.GREEN+"欢迎使用HelloWorld插件");
		getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
		saveDefaultConfig();
	}

	@Override
	public void onDisable() {//服务器关闭状态，或插件关闭状态
		getLogger().info(TextFormat.WHITE+"HelloWorld插件休息了");
	}
	 public static Main getInstance()
	  {
	    return INSTANCE;
	  }
}
