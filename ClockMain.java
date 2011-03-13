/*
Copyright (C) 2010 Olof Nord

This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation; 
either version 2 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with this program; 
if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package files;

import java.awt.*;
import javax.swing.*;

import java.util.*;
import java.awt.event.*;

import static java.util.Calendar.*;
import static java.awt.Color.*;

public class ClockMain
{
	public static void main(String[] args)
	{
		DisplayTime clock = new DisplayTime();
	}
}

class DisplayTime extends JFrame implements ActionListener
{
	private Tick nextminute = new Tick();
	private JLabel clockwindow;
	private static final Color almostgrey = new Color(232,232,232);

	public DisplayTime()
	{
		javax.swing.Timer tim = new javax.swing.Timer(60000,this);
		tim.start();
		Calendar c = getInstance();
		
		nextminute.set(c.get(HOUR_OF_DAY), c.get(MINUTE));
		
		clockwindow = new JLabel(nextminute.toString(), JLabel.CENTER);
		add(clockwindow);
		
		clockwindow.setBackground(almostgrey);
		clockwindow.setForeground(LIGHT_GRAY);
		clockwindow.setFont(new Font("Segoe UI", Font.BOLD , 250));
		
		//setSize(850, 350);
		
		setExtendedState(Frame.MAXIMIZED_BOTH);
		//setUndecorated(true);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		nextminute.tick();
		clockwindow.setText(nextminute.toString());
	}
}
