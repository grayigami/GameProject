public class Screen {

	private int[][] pixels;
	
	public Screen(int x, int y) {
	
		pixels = new int[x][y];
		
		for (int xx = 0; xx < x; xx++) {
			
			for (int yy = 0; yy < y; yy++) {
				pixels[xx][yy] = 0;
			}
		}
	}
	
	public void Add(Sprite spr) {
		
		for (int xx = 0; xx < spr.getWidth(); xx++) {
			
			for (int yy = 0; yy < spr.getHeight(); yy++) {
				pixels[ (xx + spr.getPosX()) ][ (yy + spr.getPosX()) ] = spr.getPixel(xx, yy);
			}
		}
	}
}
