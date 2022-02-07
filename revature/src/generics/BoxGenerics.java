package generics;

public class BoxGenerics<T> {
	private T length;
	private T width;
	private T height;
	private String boxColor;
	
	public BoxGenerics() {
		super();
		// TODO Auto-generated constructor stub

	}

	public BoxGenerics(T length, T width, T height, String boxColor) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.boxColor = boxColor;
	}
	public T getLength() {
		return length;
	}
	public void setLength(T length) {
		this.length = length;
	}
	public T getWidth() {
		return width;
	}
	public void setWidth(T width) {
		this.width = width;
	}
	public T getHeight() {
		return height;
	}
	public void setHeight(T height) {
		this.height = height;
	}
	public String getBoxColor() {
		return boxColor;
	}
	public void setBoxColor(String boxColor) {
		this.boxColor = boxColor;
	}
}