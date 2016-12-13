package Model;

import Utility.ImageUtility;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class ATKItem extends Item {

	public ATKItem(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(GraphicsContext gc, int x, int y) {
		gc.setFill(Color.RED);
		gc.fillRoundRect(x - WIDTH / 2, y - HEIGHT / 2, WIDTH, HEIGHT, ARCWIDTH, ARCHEIGHT);
		gc.setStroke(Color.WHITE);
		gc.setLineWidth(1);
		gc.strokeRoundRect(x - WIDTH / 2, y - HEIGHT / 2, WIDTH, HEIGHT, ARCWIDTH, ARCHEIGHT);
		Image image = ImageUtility.getATKIconImage();
		gc.drawImage(image, x - WIDTH / 2, y - HEIGHT / 2);
	}

	@Override
	protected void increasePlayerStatus(Player player) {
		player.increaseATK(1);
	}
}
