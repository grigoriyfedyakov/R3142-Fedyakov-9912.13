
public interface Thinker {
	public void think(String how);
	public void notThink(String how, String what);
	public void finishedThink(String how, String what);
	public void thinkDeliver(String what, String where);
	public void thinkLaunch(String what, String where);
}
