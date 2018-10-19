public class Game {

	public static boolean isRunning;
	public static boolean isPaused;

	public static void main(String[] args) {
	
		while (isRunning) {
			Update();
			
			Render();
		}
	}
	
	private static void Update() {
	
	}
	
	public static void Render() {
	
	}
}
