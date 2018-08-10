package github.oaster2000.mcuo.missions;

public class MissionBase {

	boolean completed = false;
	
	enum EnumRequirementType {
		EVENT, KILL
	}

	int id;
	EnumRequirementType type;
	String title;
	String fillerText;
	int xpReward;

	public MissionBase(int id, EnumRequirementType reqType, String title, String fillerText, int xp) {
		this.id = id;
		this.type = reqType;
		this.title = title;
		this.fillerText = fillerText;
		xpReward = xp;
	}

	public void isMissionComplete() {}

	public String getTitle() {
		return title;
	}
	
	public boolean isComplete(){
		return completed;
	}
	
	public String getFillerText() {
		return fillerText;
	}
	
	public int getXPReward() {
		return xpReward;
	}
	
}
