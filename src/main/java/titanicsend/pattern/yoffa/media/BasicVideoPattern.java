package titanicsend.pattern.yoffa.media;

import heronarts.lx.LX;
import heronarts.lx.LXCategory;
import heronarts.lx.model.LXPoint;
import heronarts.lx.parameter.BooleanParameter;
import heronarts.lx.pattern.LXPattern;
import titanicsend.util.Dimensions;
//import titanicsend.model.TEPanelModel;
//import titanicsend.model.TEPanelSection;
//import titanicsend.pattern.TEPattern;

import java.io.IOException;
import java.util.List;

// Example to show how we could map a video onto our panels
// Not intended from production use
// Video clip has NOT been confirmed as licensed for re-use
@LXCategory("Video Examples")
public class BasicVideoPattern extends LXPattern {

    private static final String VID_PATH = "resources/pattern/heart.mov";

//    private final BooleanParameter edges =
//            new BooleanParameter("Edges", false);

    private final VideoPainter videoPainter;

    public BasicVideoPattern(LX lx) throws IOException {
        super(lx);
        //addParameter(edges.getLabel(), edges);
        videoPainter = new VideoPainter(VID_PATH, colors);
    }

    @Override
    public void onActive() {
        videoPainter.startVideo();
    }

    @Override
    public void run(double deltaMs) {
        videoPainter.grabFrame();
        clearColors();
        for (LXPoint p : model.points) {
                videoPainter.paint(p, Dimensions.fromPoints(model.getPoints()));
            }
//        if (edges.getValueb()) {
//            videoPainter.paint(model.getAllEdges());
//        } else {
//            videoPainter.paint(model.getPanelsBySection(TEPanelSection.STARBOARD_AFT));
//            for (TEPanelModel panel : model.getPanelsBySection(TEPanelSection.STARBOARD_FORE)) {
//                videoPainter.paint(List.of(panel));
//            }
//        }
    }

    @Override
    public void onInactive() {
        videoPainter.stopVideo();
    }

}
