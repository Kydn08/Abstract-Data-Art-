 public class TheaterRunner {
  public static void main(String[] args) {
        // Instantiate a DataScene object to play in the Theater

 DataScene scene = new DataScene();

    scene.drawScene();
    Theater.playScenes(scene);
  }
  }