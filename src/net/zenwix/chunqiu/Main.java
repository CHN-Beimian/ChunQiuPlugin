package net.zenwix.chunqiu;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import net.zenwix.chunqiu.Listener.PlayerJoinListener;

public class Main
extends PluginBase
{
	private static Main INSTANCE;

	@Override
	public void onLoad() {//onLoad״̬��һ���Ƿ���������Ԥ��ʱ��״̬
		getLogger().info(TextFormat.RED+"���ڹ���HelloWorld���");

	}

	@Override
	public void onEnable() {//onEnable״̬��һ����������Ĺ���
		INSTANCE = this;
		getLogger().info(TextFormat.GREEN+"��ӭʹ��HelloWorld���");
		getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
		saveDefaultConfig();
	}

	@Override
	public void onDisable() {//�������ر�״̬�������ر�״̬
		getLogger().info(TextFormat.WHITE+"HelloWorld�����Ϣ��");
	}
	 public static Main getInstance()
	  {
	    return INSTANCE;
	  }
}
