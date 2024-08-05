package com.aurionpro.behavioral.state.model;

public class Delivered implements IPacketState {

	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet is in final state");
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet is in delivered state");
		
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		packet.setPacketState(new Dispatched());
		System.out.println("packet is moved to delivered state");
		
	}

}
