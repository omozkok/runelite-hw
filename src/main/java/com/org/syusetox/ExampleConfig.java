package com.org.syusetox;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface ExampleConfig extends Config
{
	@ConfigItem(
		keyName = "timeTick",
		name = "Time Ticks",
		description = "Check to time tick"
	)
	default boolean timeTick()
	{
		return false;
	}
}
