package Observer;

import java.util.ArrayList;

public class YoutubeChannel implements Subject{
	ArrayList<Observer> subscribers=new ArrayList<>();
	@Override
	public void subscribe(Observer ob) {
		// TODO Auto-generated method stub
		subscribers.add(ob);
	}

	@Override
	public void unsubscribe(Observer ob) {
		// TODO Auto-generated method stub
		subscribers.remove(ob);
	}

	@Override
	public void notifyChanges() {
		// TODO Auto-generated method stub
		for(Observer ob: subscribers) {
			ob.notified();
		}
	}

}
