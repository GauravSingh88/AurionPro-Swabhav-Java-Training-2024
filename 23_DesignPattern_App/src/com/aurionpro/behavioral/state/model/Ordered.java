package com.aurionpro.behavioral.state.model;

public class Ordered implements IPacketState  {

	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		packet.setPacketState(new Dispatched());
		System.out.println("packet is moved to dispatched state");
		
		
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("packet is in ordered state");
		
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet is in first state");
		
	}

}
