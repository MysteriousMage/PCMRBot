package me.jewsofhazzard.pcmrbot.Commands;

import me.jewsofhazzard.pcmrbot.twitch.TwitchUtilities;
import me.jewsofhazzard.pcmrbot.util.CommandLevel;

public class Game implements Command {

	private CommandLevel level=CommandLevel.Mod;

	@Override
	public CommandLevel getCommandLevel() {
		return level;
	}
	
	@Override
	public String getCommandText() {
		return "game";
	}
	
	@Override
	public String execute(String channel, String sender, String...parameters) {
		if (TwitchUtilities.updateGame(channel.substring(1),
				parameters[0])) {
			return "Successfully changed the stream game to \""
							+ parameters[0] + "\"!";
		} else {
			return "I am not authorized to do that visit http://pcmrbot.no-ip.info/authorize to allow me to do this and so much more!";
		}
	}

}
