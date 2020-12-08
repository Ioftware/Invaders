package engine;

import screen.Screen;
import screen.TitleScreen;

import java.awt.event.KeyEvent;

import static org.junit.jupiter.api.Assertions.*;

class DrawManagerTest {
    private static Frame frame;
    private static Screen screen;

    public class TestScreen extends Screen {

        /** Milliseconds between changes in user selection. */
        private static final int SELECTION_TIME = 200;

        /** Time between changes in user selection. */
        private Cooldown selectionCooldown;

        public TestScreen(final int width, final int height, final int fps) {
            super(width, height, fps);

            // Defaults to play.
            this.returnCode = 2;
            this.selectionCooldown = Core.getCooldown(SELECTION_TIME);
            this.selectionCooldown.reset();
        }

        /**
         * Starts the action.
         *
         * @return Next screen code.
         */
        public final int run() {
            super.run();

            return this.returnCode;
        }

        /**
         * Updates the elements on screen and checks for events.
         */
        protected final void update() {
            super.update();

            draw();
            if (this.selectionCooldown.checkFinished()
                    && this.inputDelay.checkFinished()) {
                if (inputManager.isKeyDown(KeyEvent.VK_UP)
                        || inputManager.isKeyDown(KeyEvent.VK_W)) {
                    previousMenuItem();
                    this.selectionCooldown.reset();
                }
                if (inputManager.isKeyDown(KeyEvent.VK_DOWN)
                        || inputManager.isKeyDown(KeyEvent.VK_S)) {
                    nextMenuItem();
                    this.selectionCooldown.reset();
                }
                if (inputManager.isKeyDown(KeyEvent.VK_SPACE))
                    this.isRunning = false;
            }
        }

        /**
         * Shifts the focus to the next menu item.
         */
        private void nextMenuItem() {
            if (this.returnCode == 3)
                this.returnCode = 0;
            else if (this.returnCode == 0)
                this.returnCode = 2;
            else
                this.returnCode++;
        }

        /**
         * Shifts the focus to the previous menu item.
         */
        private void previousMenuItem() {
            if (this.returnCode == 0)
                this.returnCode = 3;
            else if (this.returnCode == 2)
                this.returnCode = 0;
            else
                this.returnCode--;
        }

        /**
         * Draws the elements associated with the screen.
         */
        private void draw() {
            drawManager.initDrawing(this);

            drawManager.drawPreGame(this, 4);
            drawManager.drawPreGameMenu(this, 2);

            drawManager.completeDrawing(this);
        }
    }

    @org.junit.jupiter.api.Test
    void shouldDrawPreGame() {
        screen = new TestScreen(448, 520,60);
        frame = new Frame(448, 520);
        DrawManager.getInstance().setFrame(frame);
        frame.setScreen(screen);

    }
}