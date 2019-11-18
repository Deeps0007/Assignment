package com.raghavx.navigation;

public class DemoNavigation {

	public static void main(String[] args) {
		DemoMap map = new DemoMap();
		map.navigate(Direction.North);
		map.navigate(Direction.South);
		map.navigate(Direction.North_West);
		map.navigate(Direction.South_East);
	}

}
