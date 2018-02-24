package com.techlabs.array;

import java.util.UUID;

public class Uuid {

	public static void main(String[] args) {
		UUID uuid = UUID.randomUUID();
		String randomUUIDString = uuid.toString();

		System.out.println("Random UUID String = " + randomUUIDString);
		System.out.println("UUID version       = " + uuid.version());
		System.out.println("UUID variant       = " + uuid.variant());
	}

}
