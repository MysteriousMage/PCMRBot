/*	  It's a Twitch bot, because we can.
 *    Copyright (C) 2015  Logan Saso, James Wolff, Kyle Nabinger
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package me.jewsofhazard.pcmrbot.tests;

import me.jewsofhazard.pcmrbot.commands.CommandParser;
import me.jewsofhazard.pcmrbot.customcommands.CustomCommandParser;
import me.jewsofhazard.pcmrbot.database.Database;

import org.junit.Test;

/**
 * Tests for {@link CommandParser}
 */
public class CommandParserTests {

	@Test
	public static void test(String pass) {
		Database.initDBConnection(pass);
		String result = CustomCommandParser.parse("welcome", "donald10101", "#donald10101", "joe");
		System.out.println(result);
	}
}
