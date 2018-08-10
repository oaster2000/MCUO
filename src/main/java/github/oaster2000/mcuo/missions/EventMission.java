package github.oaster2000.mcuo.missions;

public class EventMission extends MissionBase{

	public EventMission(int id, String title, String filler, int xp) {
		super(id, EnumRequirementType.EVENT, title, filler, xp);
	}
	
	public void setComplete(boolean complete) {
		this.completed = complete;
	}

}
