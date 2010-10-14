package net.sourceforge.javaocr.filter;

import net.sourceforge.javaocr.Image;

/**
 * abstract base class for filters operating on single pixels
 */
public abstract class AbstractSinglePixelFilter extends AbstractBaseFilter {
    public void process(Image image) {
        final int height = image.getHeight();
        for (int i = 0; i < height; i++) {
            for (image.iterateH(i); image.hasNext();) {
                  processPixel(image);
            }
        }
    }

    protected abstract void processPixel(Image iterator);
}
