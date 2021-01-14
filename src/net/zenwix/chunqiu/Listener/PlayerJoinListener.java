package net.zenwix.chunqiu.Listener;



import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import net.zenwix.chunqiu.Main;

public class PlayerJoinListener implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		final Player p = e.getPlayer();
		e.setJoinMessage(Main.getInstance().getConfig().getString("JoinMessage").replace("%player%",
				p.getDisplayName()));

		Main.getInstance().getServer().getScheduler().scheduleDelayedTask(Main.getInstance(),
				new Runnable() {
					public void run() {
						p.sendTitle(Main.getInstance().getConfig().getString("JoinTitle").replace("%player%", p.getDisplayName()));
					}
				}, Main.getInstance().getConfig().getInt("JoinTitleTime") * 20);

	}
}
