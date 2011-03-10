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

public class Tick
{
	private int h,m;
	
	public void set(int hour, int min)
	{
		h=hour;
		m=min;
	}
	
	public void tick()	//tick one minute
	{
		m++;
		
		if(m==60)
		{
			m=0;
			h++;
		}
		
		if(h==24)
		{
			h=0;
		}
	}
	
	public String toString()
	{
		if(m>=0 && m<=9)
		{
			return h +":0"+m;
		}
		return h +":"+m;
	}

}
