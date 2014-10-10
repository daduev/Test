package com.home;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Date;

public class Main01 {

	public static void main(String[] args) {
		System.out.println("Main01");
		RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
		System.out.println("-----------------------uptime " + new Date(bean.getUptime()));
	}

}
