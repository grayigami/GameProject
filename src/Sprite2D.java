public class Sprite2D {

	private int spriteID;
	private int sprPosX;
	private int sprPosY;
	private int sprWidth;
	private int sprHeight;
	private int[][] sprite
	
	public Sprite2D() {
		
		spriteID = 0;
		sprPosX = 0;
		sprPosY = 0;
		sprWidth = 1;
		sprHeight = 1;
		sprite = new int[sprWidth][sprHeight];
		
	}
	
	public int getPosX() 
		return sprPosX;
	
	public int getPosY() 
		return sprPosY;
	
	public int getHeight() 
		return sprHeight;
	
	public int getWidth() 
		return sprWidth;
	
	public int getPixel(int x, int y)
		return sprite[x][y];
	
}
