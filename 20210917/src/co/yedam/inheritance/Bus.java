package co.yedam.inheritance;

import co.yedam.inherit.Vehicle;

public class Bus extends Vehicle {

	public Bus() {
		super("msg");
	}

	@Override
	protected void run() {
		System.out.println("������ �޸��ϴ�.");
	}

	@Override
	public void stop() {
		super.stop();
	}

}
