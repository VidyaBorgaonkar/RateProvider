package com.tw.RateProvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RateProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RateProviderApplication.class, args);
	}
}
//Each JVM server can have a maximum of 256 threads to run Java applications
// 32 bit JVM will default to 128kb stack size per thread.
// 64 bit JVM will default to 256kb stack size per thread.


//32-bit	 64K	32,073
//		32-bit	128K	20,549
//		32-bit	256K	11,216
//		64-bit	 64K	stack too small
//		64-bit	128K	32,072
//		64-bit	512K	32,072
//OnLinux cat /proc/sys/kernel/threads-max