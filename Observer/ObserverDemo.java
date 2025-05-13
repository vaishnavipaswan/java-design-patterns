package Observer;

public class ObserverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YoutubeChannel yt=new YoutubeChannel();
		Subscriber s1=new Subscriber("Vaishnavi");
		Subscriber s2=new Subscriber("Sahas");
		yt.subscribe(s1);
		yt.subscribe(s2);
		yt.notifyChanges();
	}

}
