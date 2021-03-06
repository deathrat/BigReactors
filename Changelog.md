Big Reactors Changelog
======================

Next Release (Anticipated Version: 0.3.0A)
------------------------------------------

Current Release (0.2.7A2)
--------------------------------
- Bugfix: Fixing a crash that can occur when using EnderIO power conduits with reactor power taps

Older Releases
--------------
### Release 0.2.7A
- Feature: Reactor interiors can now have iron, gold and diamond blocks put inside them. These perform better than water, in general.
- Feature: Reactor interiors can now have TE's redstone, glowstone, ender, pyrotheum and cryotheum fluids placed inside them. These perform better than water and iron, in general.
- UI: Stored-energy meters now visually match Thermal Expansion
- UI: Reactor controller now have visual meters for fueling and heat
- UI: Some tooltips have been improved, e.g. the cyanite reprocessor's fluid tank
- UI: Added red/green outlines to cyanite reprocessor to clarify how the inventory exposure stuff works
- Bugfix: Fixed crash on resizing the screen with the cyanite reprocessor's GUI open
- Bugfix: Fixed all GUIs having their controls show up twice when the screen is resized while they're open
- Bugfix: Computer Ports were not allowing per-control-rod queries or most "set" methods, due to a data type mixup. Fixed them.
- Bugfix: Fixed a crash that happened when putting single-size chests next to outlet ports or cyanite reprocessors

### Release 0.2.6A
- Feature: Reactor Computer Ports added. Control your reactor with a ComputerCraft computer!
- Feature: RedNet and Redstone ports now have an output option to read how full the reactor's internal energy buffer is, as a percentile (0-100) value.
- UI: Reactor Controller now shows how full the reactor is with fuel and waste. Mouse-over for an absolute value in the tooltip.
- Bugfix: Fixed a crash that occured when connecting UE pipes to a cyanite reprocessor
- Bugfix: Fixed a crash that could occur when opening the cyanite reprocessor's UI on Java 1.7

### Release 0.2.5A2
- Bugfix: Prevent server crashes due to inclusion of GUI methods when creating redstone ports

### Release 0.2.5A
- Feature: Redstone Ports, which can accept input and provide output via regular old redstone and anything compatible with it.
- Performance: RedNet ports no longer send updates every tick. They now send updates every 20 ticks, by default. This rate can be controlled via the ticksPerRedstoneUpdate config value and also applies to redstone ports.
- Bugfix: Cyanite reprocessor GUI's icons for exposing inventories & fluid tanks are now proper icons, not just colors.

### Release 0.2.4A
- Bugfix: Blutonium can again be added to reactor access ports via automation (e.g. itemducts)
- Bugfix: Energy output number displayed for ludicrously-huge reactors was inaccurate. This is fixed.
- Bugfix: Cyanite reprocessors were starting with 5000 free RF inside themselves. This has been removed.
- BeefCore: Client-side data is now properly calculated on world load. Internal fix only, no visible effects.

### Release 0.2.3A
- Bugfix: Tooltips now work in the RedNet port UI
- Optimization: Fuel rods now use a MUCH more efficient rendering method. Large reactors should be much less laggy to look at.
- KNOWN ISSUE: Control rods are sometimes lit improperly

### Release 0.2.2A
- UI: Reactors now show estimated fuel consumption. Not very accurate for small reactors!
- UI: Reactors now show fuel richness as a percentage. This is the percent of stuff inside the reactor that's fuel (as opposed to waste).
- Feature: Cyanite reprocessors and access ports will now emit products into chests and other adjacent inventories, such as TE machines
- Rebalance: Heat & radiation mechanics overhauled and simplified. Base RF output is up, overheating penalties are higher, efficiencies available via water and fuel fertilization are also higher. Should no longer have cryogenic fuel rods.
- Optimization: Heat transfer in tall reactors should now be much, much less expensive on the CPU, at the cost of a small degree of accuracy
- Bugfix: TE pulverizer and induction smelter recipes work again

### Release 0.2.1A
- Bugfix: Fixed a startup crash that prevented SMP servers from running

### Release 0.2.0A
- FORGE: Big Reactors now requires Forge 916 for Minecraft 1.6.4
- Feature: RedNet connection block added. Read data from, and send commands to, your reactors via MFR's RedNet.
- Feature: Control Rods can now be named via their UI
- Compatibility: Support for Thermal Expansion 3's Redstone Flux (RF) added.
- Compatibility: Support for Thermal Expansion 3's Item Conduits added.
- Compatibility: BuildCraft MJ power is no longer supported.
- Compatibility: Universal Electricity Joules are no longer supported. As of 1.6.4 versions, UE now supports TE's Redstone Flux.
- Optimization: Small reductions in network traffic due to minor internal refactoring
- Settings: userWorldGenVersion. If you want to re-run world regeneration, increment this number in your settings file.

### Release 0.1.14A
- Bugfix: Fixed a rare crash that occurs in long-running, very large reactors

### Release 0.1.13A
- BeefCore: Fixed a SMP server load crash that happened when chunkloaders were used in conjunction with reactors (#16)
- BeefCore: Fixed several issues that caused reactors to corrupt and crash related to breaking/re-assembling reactors (#18)
- BeefCore: Multiblocks on client now properly fission and reconnect when a reactor is broken/assembled (#19)
- BeefCore: Fixed a memory clean in singleplayer; reactors were not being cleaned up from the registry
- Bugfix: Mekanism combiners no longer provide free yellorium doubling
- Bugfix: Power taps now work on all 4 faces, not just east/west. Derp. (#15)

### Release 0.1.12A
- Feature: Global reactor output can now be modified with the floating-point "powerOutputMultiplier" config setting. Defaults to 1.0.
- Bugfix: Reactors no longer cause crashes if you replace power taps with non-power-tap blocks
- Bugfix: Reactors now reconnect to wires properly when a world reloads
- Bugfix: Can now insert non-BR fuels (e.g. UE uranium) into access ports via pipes/automation
- Bugfix: Can now insert non-BR wastes & fuels (e.g. UE uranium) into the cyanite reprocessor via pipes/automation
- Bugfix: Mekanism's crusher can no longer refine graphite dust into blutonium dust, but it can properly crush blutonium ingots.

### Release 0.1.11A
- (BeefCore) Fixed many bugs related to chunks loading/unloading as you move about the world
- (BeefCore) Fixing UI jitter caused by improper tick updates
- (BeefCore) Fixes some bugs where machines wouldn't re-assemble properly
- (BeefCore) Eliminated a lot of chunk-thrashing when blocks load or get removed on chunk boundaries

### Release 0.1.10A
- Added: Optional new recipes to craft graphite bars from 2 gravel and 1 coal or charcoal, for compatibility with UE mods. They default to off.
- Added: Four new config options, which control the recipes for creating graphite bars, two for smelting and two for crafting.
- Bugfix: Reactors can no longer be built without yellorium fuel rods inside
- Bugfix: Reactors that were built without yellorium fuel rods no longer crash the client

### Release 0.1.9A
- Bugfix: Fixed a crash in BeefCore that occasionally happens when players log out from SMP servers
- Bugfix: Mekanism 5.5.6.63 + BigReactors 0.1.8A would crash when BR added TE pulverizer recipes. This is fixed.
- Bugfix: Mekanism enrichment chamber recipe was not producing 2 dusts per yellorite ore. This is fixed.

### Release 0.1.8A
- Bugfix: Blutonium ingots no longer show up as blutonium dusts
- Bugfix: Grinders no longer convert yellorite ore into 2 blutonium dusts
- Bugfix: AE's grindstone now properly doubles yellorite ore into 2 yellorite dusts instead of 1


### Release 0.1.7A
- Bugfix: Applied Energistics grindstone recipes now work, if you're using AE v.11b or above
- Bugfix: Reactors now only tick once per world tick. Significant CPU usage reduction, fixes many strange bugs.
- Bugfix: Reprocessor textures now show up as on/off at the appropriate times.
- Due to above, reactors needed a rebalance, as they were actually only producing at least 1/3 of their observed output, maybe less.
- Rebalance: Reactor designs with water are mildly nerfed, waterless reactors are considerably worse.
- Feature: Reactors now show their average power production per tick in their main UI
- Feature: Mekanism machines now recognize BR ores and ingots, can produce dusts. Mekanism 5.5.4+.


### Release 0.1.6A
- Fixed: Some very large reactors would bug out, eat all their fuel and produces infinite power. They have been taught to behave.
- Fixed: Automation objects (pipes, ME buses) on the top/bottom sides of a cyanite reprocessor now work.
- Dusts for yellorium, cyanite, blutonium and graphite now exist.
- All dusts can be smelted into ingots in any smelter.
- Dusts can also be smelted in TE Induction Smelters.
- Yellorite ore can be ground into 2 Yellorium Dusts
- All ingots can be ground into dusts (1:1 ratio).
- Dusts can only be obtained with other mods' grinders (e.g. TE Pulverizer)
- Known Bug: Ores, ingots cannot be crushed with AE's Grindstone as of AE rv 10.n.

### Release 0.1.5A
- Fixed: SMP servers no longer crash on opening a Big Reactors GUI

### Release 0.1.4A
- Cyanite reprocessors are now craftable. Oops.

### Release 0.1.3A
- First public alpha!
- (BeefCore) Maximum dimension checks added
- Maximum valid reactor dimensions can now be controlled via config, defaults to 32 blocks horizontal, 48 blocks vertical.
- Fixed: Recipes use ore dictionary properly.
- Changed: Recipes use much less yellorium in general, much more graphite, as originally intended.

### Release 0.1.2A
- (BeefCore) Fixed a rare crash on load
- Fixed: Reactors no longer become "corrupted" if you activate them with an empty fuel rod inside
- Fixed: Fuel rods no longer go into negative heat due to floating point error, causing reactor corruption
- Fixed: Reprocessors no longer give you 100x the energy you actually input
- NOTE: Due to the above fix, any existing reprocessors in your worlds will have bad data in them. Break and re-place them.
- Fixed pipes connecting to the wrong inventories when inventories should not have been exposed
- Fixed pipes not connecting/disconnecting when liquid tanks become exposed or unexposed
- This was an internal playtest version, no public release.

### Release 0.1.1A
- Balance: Reactor heat loss minimum changed to 1% or 1C/sec instead of 1% or 1C/tick
- Fixed crash bug when connecting liquid pipes to cyanite reprocessors
- Fixed liquid pipe connectivity in general
- Fixed inventory item slots accepting the wrong item type on shift-click
- Fixed inventory item slots duplicating items
- Fixed reactors generating 1 free MJ/t for no reason whatsoever
- Fixed liquiduct crashes
- This was an internal playtest version, no public release

### Release 0.1.0A
- Control rods now have an actual control rod to extend/retract, and it affects the radiation simulation
- Lots of internal refactoring. Tall fuel columns are now markedly more efficient in both messaging and rendering.
- Heat/Radiation simulation rewritten to be more comprehensible than the original. Fuel = radiation. Radiation = heat & more radiation. Most power comes from heat, but some from radiation in certain coolants (e.g. water).
- A basic cyanite reprocessor now exists. Cyanite + Water + Power = Blutonium. This is neither final nor balanced.
- Blutonium is now usable as reactor fuel. At the moment, it is identical to yellorium aside from the item's appearance.
- Yellorite generation is now controllable via config, in the WorldGen section
- Several new or reworked textures
- This was an internal playtest version, no public release

### Release 0.0.2-playtest
- First-pass optimization of BeefCore. Truly large reactors (16x16x16 at least) are now possible.
- Access ports marked as outlets (blue arrows) now auto-emit waste if there are pipes attached

### Release 0.0.1-playtest
- Initial release
