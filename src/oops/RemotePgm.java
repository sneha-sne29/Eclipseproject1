package oops;

interface TvRemote
{
	public void volup();
	public void voldwn();
	public void chanlup();
	public void chanldwn();
}

interface SmartTv extends TvRemote
{
	public void bluetooth();
	public void games();
	public void webbrowse();
	@Override
	default void volup() {
		System.out.println("volume up button increases volume");
		
	}
	@Override
	default void voldwn() {
		System.out.println("volume down button decreases volume");
		
	}
	@Override
	default void chanlup() {
		System.out.println("channel up button");
		
	}
	@Override
	default void chanldwn() {
		System.out.println("channel down button");
		
	}
	
	
}

class Tv implements SmartTv
{

	@Override
	public void bluetooth() {
		System.out.println("smart tv has bluetooth functionality");
		
	}

	@Override
	public void games() {
		System.out.println("smart tv has games section");
		
	}

	@Override
	public void webbrowse() {
		System.out.println("smart tv has browsing functionality");
	}
	
}

public class RemotePgm {

	public static void main(String[] args) {
		Tv ob=new Tv();
		ob.volup();
		ob.voldwn();
		ob.chanlup();
		ob.chanldwn();
		
		ob.bluetooth();
		ob.games();
		ob.webbrowse();

	}

}
