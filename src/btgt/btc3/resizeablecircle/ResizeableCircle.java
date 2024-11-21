package btgt.btc3.resizeablecircle;

public class ResizeableCircle extends Circle implements Resizeable {

	
	public ResizeableCircle(double radius) {
		super(radius);
	}
	
	@Override
	public void resize(int percent) {
		
		this.radius=this.radius*((double)percent/100);
	}

}
