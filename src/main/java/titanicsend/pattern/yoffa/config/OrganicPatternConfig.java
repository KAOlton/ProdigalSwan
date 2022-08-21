package titanicsend.pattern.yoffa.config;

import heronarts.lx.LX;
import heronarts.lx.LXCategory;
import titanicsend.pattern.will.shaders.*;
import titanicsend.pattern.yoffa.effect.*;
import titanicsend.pattern.yoffa.effect.shaders.*;
import titanicsend.pattern.yoffa.framework.ConstructedPattern;
import titanicsend.pattern.yoffa.framework.PatternEffect;
import titanicsend.pattern.yoffa.framework.PatternTarget;
import titanicsend.pattern.yoffa.effect.shaders.OutrunGridShader;
import titanicsend.pattern.yoffa.media.BasicVideoPatternEffect;

import java.util.List;

@SuppressWarnings("unused")
public class OrganicPatternConfig {

    public static Class[] getPatterns() {
        return OrganicPatternConfig.class.getDeclaredClasses();
    }

    @LXCategory("Shaders")
    public static class StarryOutrun extends ConstructedPattern {
        public StarryOutrun(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(
                    new OutrunGridShader(PatternTarget.allPointsAsCanvas(this)),
                    new AlternatingDotsEffect(PatternTarget.allPointsAsCanvas(this))
                            .setHorizon(OutrunGridShader.HORIZON_Y)
                            .setShouldBlend(true)
            );
        }
    }

    @LXCategory("Shaders")
    public static class SwirlPanels extends ConstructedPattern {
        public SwirlPanels(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new RainbowSwirlShader(PatternTarget.allPointsAsCanvas(this)));
        }
    }

    @LXCategory("Shaders")
    public static class RainbowSwirlEdges extends ConstructedPattern {
        public RainbowSwirlEdges(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new RainbowSwirlShader(PatternTarget.allPointsAsCanvas(this)));
        }
    }

    @LXCategory("Shaders")
    public static class NeonBarsPanels extends ConstructedPattern {
        public NeonBarsPanels(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new NeonBarsShader(PatternTarget.allPointsAsCanvas(this)));
        }
    }

    @LXCategory("Shaders")
    public static class NeonBarsEdges extends ConstructedPattern {
        public NeonBarsEdges(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new NeonBarsShader(PatternTarget.allPointsAsCanvas(this)));
        }
    }

    @LXCategory("Shaders")
    public static class NeonCellsLegacy extends ConstructedPattern {
        public NeonCellsLegacy(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new NeonCellsShader(PatternTarget.allPointsAsCanvas(this)));
        }
    }

//    @LXCategory("Yoffa Edge Shader")
//    public static class BasicElectricEdges extends ConstructedPattern {
//        public BasicElectricEdges(LX lx) {
//            super(lx);
//        }
//        @Override
//        protected List<PatternEffect> createEffects() {
//            return List.of(new ElectricShader(PatternTarget.allEdgesAsCanvas(this)));
//        }
//    }

    @LXCategory("Shaders")
    public static class WaterPanels extends ConstructedPattern {
        public WaterPanels(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new WaterShader(PatternTarget.allPanelsAsCanvas(this)));
        }
    }

    @LXCategory("Shaders")
    public static class WaterEdges extends ConstructedPattern {
        public WaterEdges(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new WaterShader(PatternTarget.allPointsAsCanvas(this)));
        }
    }

    @LXCategory("Shaders")
    public static class WavyPanels extends ConstructedPattern {
        public WavyPanels(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new WavyShader(PatternTarget.allPointsAsCanvas(this)));
        }
    }

    @LXCategory("Shaders")
    public static class NeonSnake extends ConstructedPattern {
        public NeonSnake(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new NeonSnakeShader(PatternTarget.allPanelsAsCanvas(this)));
        }
    }

    @LXCategory("Shaders")
    public static class WavyEdges extends ConstructedPattern {
        public WavyEdges(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new WavyShader(PatternTarget.allPointsAsCanvas(this)));
        }
    }

    @LXCategory("Shaders")
    public static class PulseCenter extends ConstructedPattern {
        public PulseCenter(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new PulseEffect(PatternTarget.allPanelsAsCanvas(this)));
        }
    }

    @LXCategory("Shaders")
    public static class PulseSide extends ConstructedPattern {
        public PulseSide(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new PulseEffect(PatternTarget.allPanelsAsCanvas(this)).setOrigin(0, 0, 0));
        }
    }

    @LXCategory("Shaders")
    public static class AlternatingDots extends ConstructedPattern {
        public AlternatingDots(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new AlternatingDotsEffect(PatternTarget.allPanelsAsCanvas(this)));
        }
    }

    @LXCategory("Shaders")
    public static class BreathingDots extends ConstructedPattern {
        public BreathingDots(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new BreathingDotsEffect(PatternTarget.allPanelsAsCanvas(this)));
        }
    }

    @LXCategory("Shaders")
    public static class PowerGrid extends ConstructedPattern {
        public PowerGrid(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new ShimmeringEffect(PatternTarget.allPointsAsCanvas(this)));
        }
    }

    @LXCategory("Video Patterns")
    public static class BasicVideoPattern extends ConstructedPattern {
        public BasicVideoPattern(LX lx) {
            super(lx);
        }

        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new BasicVideoPatternEffect(PatternTarget.allPointsAsCanvas(this)));
        }
    }

    //below patterns for on the fly testing
    @LXCategory("Video Patterns")
    public static class FullscreenVideoA extends ConstructedPattern {
        public FullscreenVideoA(LX lx) {
            super(lx);
        }

        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new BasicVideoPatternEffect(PatternTarget.allPanelsAsCanvas(this),
                    "resources/pattern/test_vid_a.mp4"));
        }
    }

    @LXCategory("Video Patterns")
    public static class FullscreenVideoB extends ConstructedPattern {
        public FullscreenVideoB(LX lx) {
            super(lx);
        }

        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new BasicVideoPatternEffect(PatternTarget.allPanelsAsCanvas(this),
                    "resources/pattern/test_vid_b.mp4"));
        }
    }

    @LXCategory("Shaders")
    public static class RhythmicFlashStatic extends ConstructedPattern {
        public RhythmicFlashStatic(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {
            return List.of(new RhythmicFlashingStatic(PatternTarget.allPanelsAsCanvas(this)));
        }
    }

    @LXCategory("Shaders")
    public static class MatrixScroller extends ConstructedPattern {
        public MatrixScroller(LX lx) {
            super(lx);
        }
        @Override
        protected List<PatternEffect> createEffects() {

            return List.of(new MatrixScrolling(PatternTarget.allPanelsAsCanvas(this)));
        }
    }

}
