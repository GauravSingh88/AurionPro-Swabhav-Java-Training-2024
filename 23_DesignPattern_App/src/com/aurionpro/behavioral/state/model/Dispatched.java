package com.aurionpro.behavioral.state.model;

public class Dispatched implements IPacketState {

	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		packet.setPacketState(new Delivered());
		System.out.println("packet is moved to delivered state");
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet is in dispatched state");
		
		
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		packet.setPacketState(new Ordered());
		System.out.println("packet is moved to ordered state");
		
	}

}
