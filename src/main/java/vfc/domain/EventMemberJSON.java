package vfc.domain;

public class EventMemberJSON {

	int eventid;
	int memberid;
	String member_status;

	int approval;
	
	public int getEventid() {
		return eventid;
	}
	public void setEventid(int eventid) {
		this.eventid = eventid;
	}
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public int getApproval() {
		return approval;
	}
	public void setApproval(int approval) {
		this.approval = approval;
	}
	
	public void setMember_status(String member_status) {
		this.member_status = member_status;
	}
	public String getMember_status() {
		return member_status;
	}
}
