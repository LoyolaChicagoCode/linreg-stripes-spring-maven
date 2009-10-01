package points.stripes;

import net.sourceforge.stripes.action.ForwardResolution;

public class Constants {

	private Constants() { }

	public final static ForwardResolution VIEW_LIST = new ForwardResolution("/WEB-INF/jsp/list.jspx");
	public final static ForwardResolution VIEW_ADD  = new ForwardResolution("/WEB-INF/jsp/add.jspx");
	public final static ForwardResolution VIEW_EDIT = new ForwardResolution("/WEB-INF/jsp/edit.jspx");

	public final static ForwardResolution EVENT_LIST   = new ForwardResolution(ListActionBean.class);

	public static final String ATTRIBUTE_MESSAGE_KEY = "messageKey";
}
