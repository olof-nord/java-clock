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

public class Tidpunkt
{
	private int t,m;
	
	public void sätt(int tim, int min)
	{
		t=tim;
		m=min;
	}
	
	public void ticka()	//ticka fram en minut
	{
		m++;
		
		if(m==60)
		{
			m=0;
			t++;
		}
		
		if(t==24)
		{
			t=0;
		}
	}
	
	public String toString()
	{
		if(m>=0 && m<=9)
		{
			return t +":0"+m;
		}
		return t +":"+m;
	}

}
