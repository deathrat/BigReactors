package erogenousbeef.bigreactors.common;

import erogenousbeef.bigreactors.api.IRadiationPulse;

public class RadiationPulse implements IRadiationPulse {

	float fast;
	float slow;
	int ttl;
	float power;
	
	public RadiationPulse() { 
		fast = slow = 0;
		ttl = 1;
		power = 0.0f;
	}
	
	public RadiationPulse(float fast, float slow, int timeToLive, float power) {
		this.fast = fast;
		this.slow = slow;
		this.ttl = timeToLive;
		this.power = power;
	}
	
	@Override
	public float getFastRadiation() {
		return fast;
	}

	@Override
	public float getSlowRadiation() {
		return slow;
	}

	@Override
	public int getTimeToLive() {
		return ttl;
	}

	@Override
	public void setFastRadiation(float newValue) {
		fast = newValue;
	}

	@Override
	public void setSlowRadiation(float newValue) {
		slow = newValue;
	}

	@Override
	public void setTimeToLive(int newTTL) {
		this.ttl = newTTL;
	}
	
	@Override
	public void changeTTL(int difference) {
		this.ttl += difference;
	}

	@Override
	public float getPowerProduced() {
		return power;
	}

	@Override
	public void addPower(float additionalPower) {
		power += additionalPower;
	}
}
