package com.animcogn.sonicScrewdriverMod.events;

import java.util.Timer;
import java.util.TimerTask;

import net.minecraftforge.fml.common.FMLCommonHandler;

public class CountDown {

	static Timer timer;
	static Timer interval;
	
	public static void startTimer() {
		timer = new Timer();
		timer.schedule(new DisplayCountdown(), 0, 1000);
	}
	
	public static void startInterval() {
		interval = new Timer();
		interval.schedule(new DisplayInterval(), 0, 1000);
	}
	
	static class DisplayCountdown extends TimerTask {
		
		private int seconds = 10;
		
		public void run() {
			if (seconds > 0) {
//				System.out.println("wait seconds:" + seconds); //Dubug junk yard wars! Just do it! MAKE A NEW TV SHOW! DON'T LET YOUR DREAMS JUST BE DREAMS! JUST MAKE AN AWESOME NEW TV SHOW!!!!!!! AWWWW YEAHHHHH!!!!! #debugJunkYardWars!!!!!!!!! OH BABY!
				seconds--;
				AttackCountdown.healthy = false;
			
			} 
			else {
//				System.out.println("Countdown finished"); // Debug junk
				AttackCountdown.healthy = true;
				cancel();
			}
		}
	}
	
	public static class DisplayInterval extends TimerTask {
		
		private int seconds = 5;
		public static boolean absorbtionInterval = false;
		
		public void run() {
			if (seconds > 0) {
//				System.out.println(seconds); //More debug junk
				seconds--;
				absorbtionInterval = true;
			} 
			else {
//				System.out.println("Interval done"); //I'm way to lazy to take this off
				absorbtionInterval = false;
				cancel();
			}
		}
	}
}

