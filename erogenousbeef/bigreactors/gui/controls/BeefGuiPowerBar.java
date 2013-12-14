package erogenousbeef.bigreactors.gui.controls;

import net.minecraftforge.common.ForgeDirection;
import cofh.api.energy.IEnergyHandler;
import erogenousbeef.bigreactors.client.gui.BeefGuiBase;
import erogenousbeef.bigreactors.gui.IBeefTooltipControl;

public class BeefGuiPowerBar extends BeefGuiTextureProgressBar implements
		IBeefTooltipControl {

	IEnergyHandler _entity;
	
	public BeefGuiPowerBar(BeefGuiBase container, int x, int y, IEnergyHandler entity) {
		super(container, x, y);
		_entity = entity;
	}
	
	@Override
	protected String getBackgroundTexture() { return "controls/Energy.png"; }
	
	@Override
	protected float getProgress() {
		return Math.min(1f, Math.max(0f, (float)_entity.getEnergyStored(ForgeDirection.UNKNOWN) / (float)_entity.getMaxEnergyStored(ForgeDirection.UNKNOWN)));
	}

	@Override
	public String[] getTooltip() {
		int energyStored = _entity.getEnergyStored(ForgeDirection.UNKNOWN);
		int energyMax = _entity.getMaxEnergyStored(ForgeDirection.UNKNOWN);
		float fullness = (float)energyStored / (float)energyMax * 100f;
		return new String[] { "Energy Buffer", 
				String.format("%d / %d RF", energyStored, energyMax),
				String.format("%2.1f%% full", fullness)
		};
	}
}
