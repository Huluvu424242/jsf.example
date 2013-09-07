package gh.funthomas424242.jsfexample.log;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

@ManagedBean(name = "messageModel")
@SessionScoped
public class MessageModel implements ValueChangeListener {

	String oldValue;
	String newValue;

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	@Override
	public void processValueChange(ValueChangeEvent e)
			throws AbortProcessingException {
		this.oldValue = e.getOldValue().toString();
		this.newValue = e.getNewValue().toString();
		System.out.println("old value was: " + oldValue);
		System.out.println("new value is: " + newValue);

	}

}