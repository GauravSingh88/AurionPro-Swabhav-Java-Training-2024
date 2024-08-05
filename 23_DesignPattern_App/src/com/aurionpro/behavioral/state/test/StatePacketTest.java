package com.aurionpro.behavioral.state.test;

import com.aurionpro.behavioral.state.model.Ordered;
import com.aurionpro.behavioral.state.model.Packet;
import com.aurionpro.behavioral.state.model.*;

public class StatePacketTest {

	public static void main(String[] args) {
		Packet packet  = new Packet(new Ordered());
		packet.current();
		packet.goToNextState();
		packet.current();
		packet.goToNextState();
		packet.current();
		packet.goToNextState();
		packet.current();
		packet.goToPreviousState();
		packet.current();

		
		
	}
}
