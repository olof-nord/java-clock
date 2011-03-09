package files;
/*
Copyright (C) 2010 Olof Nord

This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation; 
either version 2 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with this program; 
if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

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
		KlockVisare clock = new KlockVisare();
	}
}

class KlockVisare extends JFrame implements ActionListener
{
	private Tidpunkt tp = new Tidpunkt();
	private JLabel window1;
	private static final Color litegrå = new Color(232,232,232);
	
	public KlockVisare()
	{
		javax.swing.Timer tim = new javax.swing.Timer(60000,this);
		tim.start();
		Calendar c = getInstance();
		
		tp.sätt(c.get(HOUR_OF_DAY), c.get(MINUTE));
		
		window1 = new JLabel(tp.toString(), JLabel.CENTER);
		add(window1);
		
		//UNDER DEVELOPMENT\\
		//String fonts[] = {"ett", "två", "tre", "fyra"};
		//JComboBox fontList = new JComboBox(fonts);
		//fontList.setVisible(true);
		//fontList.setSelectedIndex(4);
        //fontList.addActionListener(this);
		//window1.add(fontList);
		
		
		window1.setBackground(litegrå);
		window1.setForeground(LIGHT_GRAY);
		window1.setFont(new Font("Segoe UI", Font.BOLD , 250));
		
		setSize(850, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		tp.ticka();
		window1.setText(tp.toString());
	}
}
