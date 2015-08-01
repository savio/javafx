package teste;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.stage.Stage;

public class LineBounds extends Application {
  public static void main(String[] args) { launch(args); }
  @Override public void start(Stage stage) throws Exception {
    double startX = 10;
    double startY = 10;
    double length = 10;

    Line lineSpanningPixelsSquareEnd = new Line(startX, startY, startX + length, startY);
    System.out.println("lineSpanningPixels (square) bounding box: " + lineSpanningPixelsSquareEnd.getBoundsInLocal());

    startX = 10;
    startY = 20;
    length = 10;

    Line lineSpanningPixelsButtEnd = new Line(startX, startY, startX + length, startY);
    lineSpanningPixelsButtEnd.setStrokeLineCap(StrokeLineCap.BUTT);
    System.out.println("lineSpanningPixels (butt) bounding box:   " + lineSpanningPixelsButtEnd.getBoundsInLocal());

    startX = 10;
    startY = 29.5;
    length = 10;

    Line lineOnPixelsSquareEnd = new Line(startX, startY, startX + length, startY);
    System.out.println("lineOnPixels (square) bounding box:       " + lineOnPixelsSquareEnd.getBoundsInLocal());

    startX = 10;
    startY = 39.5;
    length = 10;

    Line lineOnPixelsButtEnd = new Line(startX, startY, startX + length, startY);
    lineOnPixelsButtEnd.setStrokeLineCap(StrokeLineCap.BUTT);
    System.out.println("lineOnPixels (butt) bounding box:         " + lineOnPixelsButtEnd.getBoundsInLocal());

    stage.setScene(
      new Scene(
        new Group(
          lineSpanningPixelsSquareEnd, lineSpanningPixelsButtEnd, lineOnPixelsSquareEnd, lineOnPixelsButtEnd
        ), 100, 100
      )
    );
    stage.show();
  }
}